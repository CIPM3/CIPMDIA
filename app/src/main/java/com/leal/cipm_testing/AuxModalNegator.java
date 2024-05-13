package com.leal.cipm_testing;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AuxModalNegator {

    // List of auxiliary and modal verbs for checking
    private static final String[] AUXILIARY_VERBS = {
            "am", "is", "are", "was", "were", "being", "been",
            "have", "has", "had",
            "do", "does", "did",
            "can", "could",
            "will", "would",
            "shall", "should",
            "may", "might",
            "must",
            "ought"
    };
    public String negateSentenceSpanishComp(String sentence) {
        String[] wordsToNegate = {"yo", "tú", "él", "ella", "eso", "nosotros", "ellos"};
        String[] parts = sentence.split("\\s+");
        StringBuilder result = new StringBuilder();

        boolean quizáFound = parts.length > 1 && (parts[1].equalsIgnoreCase("quizá") || parts[1].equalsIgnoreCase("quizás"));
        boolean suponeQueFound = false;
        boolean pronounNegated = false; // Add a flag to track if negation has occurred

        for (int i = 0; i < parts.length; i++) {
            String part = parts[i];

            // Check for "se supone que" pattern
            if (i < parts.length - 2 && part.equalsIgnoreCase("se") && parts[i + 1].equalsIgnoreCase("supone") && parts[i + 2].equalsIgnoreCase("que")) {
                suponeQueFound = true;
                result.append(part).append(" ");
                continue;
            }

            // If "quizá" is found
            if (quizáFound && (part.equalsIgnoreCase("quizá") || part.equalsIgnoreCase("quizás"))) {
                part += " no";
                quizáFound = false;
            } else if (!quizáFound && !suponeQueFound && !pronounNegated) { // Check if a pronoun is yet to be negated
                for (String wordToNegate : wordsToNegate) {
                    if (part.equalsIgnoreCase(wordToNegate)) {
                        part += " no";
                        pronounNegated = true; // Set the flag to prevent further negations
                        break;
                    }
                }
            } else if (suponeQueFound && part.equalsIgnoreCase("que")) {
                part += " no";
                suponeQueFound = false;
            }

            result.append(part).append(" ");
        }

        return result.toString().trim();
    }



    public String negateSentenceSpanish(String sentence) {
        // List of words to check
        String[] wordsToNegate = {"yo", "tú", "él", "ella", "eso", "nosotros", "ellos"};
        // Split the sentence into parts
        String[] parts = sentence.split("\\s+");
        // StringBuilder to construct the result
        StringBuilder result = new StringBuilder();

        // Check if the second word is "quizá" or "quizás" and handle accordingly
        boolean quizáFound = parts.length > 1 && (parts[1].equalsIgnoreCase("quizá") || parts[1].equalsIgnoreCase("quizás"));
        boolean suponeQueFound = false;

        for (int i = 0; i < parts.length; i++) {
            String part = parts[i];

            // Check for "se supone que" pattern and set a flag
            if (i < parts.length - 2 && part.equalsIgnoreCase("se") && parts[i + 1].equalsIgnoreCase("supone") && parts[i + 2].equalsIgnoreCase("que")) {
                suponeQueFound = true;
                result.append(part).append(" ");
                continue;
            }

            // If "quizá" is found, append "no" after "quizá" and skip negation of pronouns
            if (quizáFound && (part.equalsIgnoreCase("quizá") || part.equalsIgnoreCase("quizás"))) {
                part += " no";
                quizáFound = false; // To ensure "no" is added only once after "quizá"
            } else if (!quizáFound && !suponeQueFound) {
                // If not handling "quizá" or "se supone que", proceed with original logic to negate using pronouns
                for (String wordToNegate : wordsToNegate) {
                    if (part.equalsIgnoreCase(wordToNegate)) {
                        part += " no";
                        break;
                    }
                }
            } else if (suponeQueFound && part.equalsIgnoreCase("que")) {
                // If "se supone que" pattern was found, add "no" right after "que"
                part += " no";
                suponeQueFound = false; // Reset the flag
            }

            // Append the (possibly modified) part to the result, followed by a space
            result.append(part).append(" ");
        }

        // Return the modified string, trimming trailing spaces
        return result.toString().trim();
    }
    public String negateSentenceSpanishOG(String sentence) {
        // List of words to check
        String[] wordsToNegate = {"yo", "tú", "él", "ella", "eso", "nosotros", "ellos"};
        // Split the sentence into parts
        String[] parts = sentence.split("\\s+");
        // StringBuilder to construct the result
        StringBuilder result = new StringBuilder();

        // Check if the second word is "quizá" or "quizás" and handle accordingly
        boolean quizáFound = parts.length > 1 && (parts[1].equalsIgnoreCase("quizá") || parts[1].equalsIgnoreCase("quizás"));

        for (int i = 0; i < parts.length; i++) {
            String part = parts[i];
            // If "quizá" is found, append "no" after "quizá" and skip negation of pronouns
            if (quizáFound && (part.equalsIgnoreCase("quizá") || part.equalsIgnoreCase("quizás"))) {
                part += " no";
                quizáFound = false; // To ensure "no" is added only once after "quizá"
            } else if (!quizáFound) {
                // If not handling "quizá", proceed with original logic to negate using pronouns
                for (String wordToNegate : wordsToNegate) {
                    if (part.equalsIgnoreCase(wordToNegate)) {
                        part += " no";
                        break;
                    }
                }
            }
            // Append the (possibly modified) part to the result, followed by a space
            result.append(part).append(" ");
        }

        // Return the modified string, trimming trailing spaces
        return result.toString().trim();
    }

    public  String negateFirstAuxOrModalContracted(String input) {
        String[] words = input.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (isAuxOrModal(words[i])) {
                switch (words[i]) {
                    case "will":
                        words[i] = "won't"; // Special case for "will"
                        break;
                    case "shall":
                        words[i] = "shan't"; // Less common, but included for completeness
                        break;
                    case "am":
                        words[i] = "ain't"; // Informal, and not always acceptable in formal writing
                        break;
                    case "can":
                        words[i] = "can't"; // Informal, and not always acceptable in formal writing
                        break;
                    default:
                        words[i] = words[i] + "n't";
                        break;
                }
                break; // Exit after the first match
            }
        }
        return String.join(" ", words);
    }
    public String negatePresentSimpleContracted(String input) {
        String[] words = input.split(" ");
        if (words.length < 2) return input; // Ensuring there's at least a subject and a verb

        String subject = words[0];
        String verb = words[1];
        String negation;

        boolean isThirdPersonSingular = false;
        switch (subject.toLowerCase()) {
            case "he":
            case "she":
            case "it":
                negation = "doesn't";
                isThirdPersonSingular = true;
                break;
            case "i":
            case "you":
            case "we":
            case "they":
                negation = "don't";
                break;
            default:
                return input; // If the first word isn't a recognized subject pronoun, return the original input
        }

        if (isThirdPersonSingular) {
            // Handle exceptions for irregular verbs
            if (verb.equalsIgnoreCase("has")) {
                // No need to remove 's' for "has", it's an irregular verb
            } else if (verb.endsWith("s")) {
                // General rule: Remove the last 's' for third person singular form when negating
                verb = verb.substring(0, verb.length() - 1);
            }
        }

        // Constructing the negated sentence
        words[1] = negation + " " + verb;

        return String.join(" ", words);
    }
    public String negateFirstAuxOrModal(String input) {
        String[] words = input.split(" ");
        boolean negated = false;

        for (int i = 0; i < words.length; i++) {
            // Existing aux/modal negation
            if (isAuxOrModal(words[i]) && !negated) {
                switch (words[i]) {
                    case "will":
                        words[i] = "will not";
                        negated = true;
                        break;
                    case "shall":
                        words[i] = "shall not";
                        negated = true;
                        break;
                    case "am":
                        words[i] = "am not";
                        negated = true;
                        break;
                    case "can":
                        words[i] = "cannot";
                        negated = true;
                        break;
                    default:
                        words[i] += " not";
                        negated = true;
                        break;
                }
            } else if (i + 2 < words.length && words[i].equals("for") &&
                    (words[i + 2].equals("to"))) {
                // Check for "for [pronoun] to" pattern
                switch (words[i + 1]) { // Assuming words[i+1] is a pronoun
                    case "me":
                    case "you":
                    case "him":
                    case "her":
                    case "them":
                    case "us":
                        words[i + 1] += " not";
                        negated = true;
                        break;
                }
                if (negated) break; // Exit after first negation
            }

            // Exit the loop once a negation has been applied
            if (negated) break;
        }

        return String.join(" ", words);
    }
    public  String negatePresentSimple(String input) {
        String[] words = input.split(" ");
        if (words.length < 2) return input; // Ensuring there's at least a subject and a verb

        String subject = words[0];
        String verb = words[1];
        String negation;

        boolean isThirdPersonSingular = false;
        switch (subject.toLowerCase()) {
            case "he":
            case "she":
            case "it":
                negation = "does not";
                isThirdPersonSingular = true;
                break;
            case "i":
            case "you":
            case "we":
            case "they":
                negation = "do not";
                break;
            default:
                return input; // If the first word isn't a recognized subject pronoun, return the original input
        }

        if (isThirdPersonSingular && verb.endsWith("s")) {
            // Remove the last 's' for third person singular form when negating
            verb = verb.substring(0, verb.length() - 1);
        }

        // Constructing the negated sentence
        words[1] = negation + " " + verb;

        return String.join(" ", words);
    }
    private static boolean isAuxOrModal(String word) {
        for (String auxOrModal : AUXILIARY_VERBS) {
            if (word.equalsIgnoreCase(auxOrModal)) {
                return true;
            }
        }
        return false;
    }
    public String negatePastSimple(String sentence) {
        if(sentence == null){
            return "negate Past Simple Null";
        }
        // Split the sentence into words
        String[] words = sentence.split(" ");

        // Check if the sentence is valid (starts with a pronoun and has at least a verb)
        if (words.length < 2) {
            return "Invalid sentence";
        }

        // Rebuild the sentence with "didn't" inserted before the verb
        // words[0] is the pronoun, words[1] is the verb
        // Use String.join to concatenate the rest of the sentence
        String restOfSentence = String.join(" ", Arrays.copyOfRange(words, 2, words.length));

        return words[0] + " didn't " + words[1] + (restOfSentence.isEmpty() ? "" : " " + restOfSentence);
    }
    public  String negatePastSimpleWish(String sentence) {
        // Split the sentence into words
        String[] words = sentence.split(" ");

        // Check if the sentence is valid (starts with a pronoun and has at least a verb)
        if (words.length < 2) {
            return "Invalid sentence";
        }

        // Rebuild the sentence with "didn't" inserted before the verb
        // words[0] is the pronoun, and words[1] is the rest of the sentence
        return words[2] + " didn't " + words[3];
    }

    public  String contractWill(String sentence) {
        // Define the patterns for each pronoun and its contraction
        String[][] pronounsAndContractions = {
                {"(?i)\\bI will\\b", "I'll"},
                {"(?i)\\byou will\\b", "you'll"},
                {"(?i)\\bhe will\\b", "he'll"},
                {"(?i)\\bshe will\\b", "she'll"},
                {"(?i)\\bwe will\\b", "we'll"},
                {"(?i)\\bthey will\\b", "they'll"}
        };

        for (String[] pair : pronounsAndContractions) {
            Pattern pattern = Pattern.compile(pair[0]);
            Matcher matcher = pattern.matcher(sentence);
            if (matcher.find()) {
                return matcher.replaceFirst(pair[1]);
            }
        }

        // Return the original sentence if no match is found
        return sentence;
    }
    public String negateWishPastSimple(String sentence) {
        // Split the sentence into parts to find the segment after "wish"
        String[] parts = sentence.split("\\s+");

        // Initialize a variable to store the index of "wish"
        int wishIndex = -1;

        // Find the index of "wish"
        for (int i = 0; i < parts.length; i++) {
            if (parts[i].equalsIgnoreCase("wish")) {
                wishIndex = i;
                break;
            }
        }

        // Check if the sentence is valid (contains "wish" and has at least one verb after)
        if (wishIndex == -1 || wishIndex + 1 >= parts.length - 1) {
            return "Invalid sentence";
        }

        // Rebuild the sentence up to "wish"
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= wishIndex; i++) {
            sb.append(parts[i]).append(" ");
        }

        // Preserve the subject after "wish" and insert "didn't"
        sb.append(parts[wishIndex + 1]).append(" didn't ");

        // Append the rest of the sentence after "didn't"
        for (int i = wishIndex + 2; i < parts.length; i++) {
            sb.append(parts[i]).append(" ");
        }

        // Return the modified sentence, trimming the last space
        return sb.toString().trim();
    }
    public String negatePresentSimpleCausativeHave(String input) {
        String[] words = input.split(" ");
        if (words.length < 2) return input; // Ensuring there's at least a subject and a verb

        String subject = words[0];
        String verb = words[1];
        String negation;

        boolean isThirdPersonSingular = false;
        switch (subject.toLowerCase()) {
            case "he":
            case "she":
            case "it":
                negation = "does not";
                isThirdPersonSingular = true;
                break;
            case "i":
            case "you":
            case "we":
            case "they":
                negation = "do not";
                break;
            default:
                return input; // If the first word isn't a recognized subject pronoun, return the original input
        }

        if (isThirdPersonSingular) {
            if (verb.equalsIgnoreCase("has")) {
                // Special case for "has" to become "does not have"
                verb = "have";
            } else if (verb.endsWith("s")) {
                // For other verbs, remove the last 's' for third person singular form when negating
                verb = verb.substring(0, verb.length() - 1);
            }
        }

        // Reconstruct the negated sentence with the updated verb
        words[1] = negation + " " + verb;

        return String.join(" ", words);
    }




    // takes present continuous and contracts to be to the pronoun
    public String contractPresentContinuousPresent(String sentence) {
        String[] words = sentence.split(" ");
        if (words.length < 3) return sentence; // Ensure sentence is long enough for present continuous

        String subject = words[0];
        String auxiliary = words[1];
        String remainingSentence = String.join(" ", Arrays.copyOfRange(words, 2, words.length));

        // Apply contraction
        switch (auxiliary) {
            case "am":
                subject += "'m";
                break;
            case "are":
                subject += "'re";
                break;
            case "is":
                subject += "'s";
                break;
            default:
                return sentence; // If the auxiliary is not present continuous, return original sentence
        }

        // Rebuild the sentence with the contracted form
        return subject + " " + remainingSentence;
    }
    public String contractPresentPerfect(String sentence) {
        String[] words = sentence.split(" ");
        if (words.length < 3) return sentence; // Ensure sentence is long enough for present perfect

        String subject = words[0];
        String auxiliary = words[1];
        String remainingSentence = String.join(" ", Arrays.copyOfRange(words, 2, words.length));

        // Apply contraction for present perfect tense
        switch (auxiliary) {
            case "have":
                subject += "'ve";
                break;
            case "has":
                subject += "'s";
                break;
            default:
                return sentence; // If the auxiliary is not present perfect, return original sentence
        }

        // Rebuild the sentence with the contracted form
        return subject + " " + remainingSentence;
    }

    public String contractPresentPerfectIncludingNot(String sentence) {
        String[] words = sentence.split(" ");
        if (words.length < 3) return sentence; // Ensure sentence is long enough

        String subject = words[0];
        String auxiliary = words[1];
        boolean isNegative = words.length > 3 && words[2].equals("not");
        String remainingSentence;

        if (isNegative) {
            // Adjust for negation
            remainingSentence = String.join(" ", Arrays.copyOfRange(words, 3, words.length));
            switch (auxiliary) {
                case "have":
                    subject += "'ve not";
                    break;
                case "has":
                    subject += "'s not";
                    break;
                default:
                    return sentence; // Return original sentence if it doesn't match expected structure
            }
        } else {
            // Handle non-negated sentences
            remainingSentence = String.join(" ", Arrays.copyOfRange(words, 2, words.length));
            switch (auxiliary) {
                case "have":
                    subject += "'ve";
                    break;
                case "has":
                    subject += "'s";
                    break;
                default:
                    return sentence; // Return original sentence if it doesn't match expected structure
            }
        }

        // Rebuild the sentence with the contracted form
        return subject + " " + remainingSentence;
    }

    //takes preent continuous affirmative, contracts to be to pronoun,negates it
    public String negateAndContractPresentContinuous(String sentence) {
        String[] words = sentence.split(" ");
        if (words.length < 3) return sentence; // Ensure sentence is long enough

        String subject = words[0];
        String auxiliary = words[1];
        boolean isNegated = false;
        String verb;

        // Check for negation and find the main verb
        if (words.length > 2 && words[2].equals("not")) {
            isNegated = true;
            if (words.length < 4) return sentence; // Ensure sentence is long enough for negation
            verb = words[3];
        } else {
            verb = words[2];
        }

        // Apply contraction to the auxiliary verb
        switch (auxiliary) {
            case "am":
                subject += "'m";
                break;
            case "are":
                subject += "'re";
                break;
            case "is":
                subject += "'s";
                break;
            default:
                return sentence; // If the auxiliary is not in present continuous, return original sentence
        }

        // Adjust for negation without further contraction
        String negation = isNegated ? " not" : "";

        // Rebuild the sentence
        String remainingSentence = verb + (words.length > 4 ? " " + String.join(" ", Arrays.copyOfRange(words, 4, words.length)) : "");
        return subject + negation + " " + remainingSentence;
    }

    //takes contracted,affirmative or negated,present continuous , expands it
    public String expandPresentContinuous(String sentence) {
        // Replace common contractions with their full forms
        sentence = sentence.replaceAll("I'm not ", "I am not ");
        sentence = sentence.replaceAll("I'm ", "I am ");
        sentence = sentence.replaceAll("you're not ", "you are not ");
        sentence = sentence.replaceAll("you're ", "you are ");
        sentence = sentence.replaceAll("he's not ", "he is not ");
        sentence = sentence.replaceAll("he's ", "he is ");
        sentence = sentence.replaceAll("she's not ", "she is not ");
        sentence = sentence.replaceAll("she's ", "she is ");
        sentence = sentence.replaceAll("it's not ", "it is not ");
        sentence = sentence.replaceAll("it's ", "it is ");
        sentence = sentence.replaceAll("we're not ", "we are not ");
        sentence = sentence.replaceAll("we're ", "we are ");
        sentence = sentence.replaceAll("they're not ", "they are not ");
        sentence = sentence.replaceAll("they're ", "they are ");

        // Handle the special case of 'isn't' being contracted without a pronoun directly before it.
        // This might require context-specific handling based on your application's needs.
        // The basic pattern below might need adjustments for complex sentences.
        sentence = sentence.replaceAll("isn't ", "is not ");

        return sentence;
    }
    public String negateVerbalAdjective(String phrase) {
        // Split the phrase into words
        String[] words = phrase.split(" ");
        if (words.length < 3) return phrase; // Ensure there's at least "the", a verbal adjective, and a noun

        // Assuming the verbal adjective is always the second word (after "the")
        words[1] = "non-" + words[1];

        // Reconstruct and return the modified phrase
        return String.join(" ", words);
    }
    public String addNoAfterQue(String phrase) {
        // Split the phrase into words
        String[] words = phrase.split(" ");
        if (words.length < 4) return phrase; // Ensure there's at least "el/la", a noun, "que", and a verb

        // Create a new array to accommodate the additional "no"
        String[] modifiedWords = new String[words.length + 1];

        // Copy elements up to "que"
        for (int i = 0; i < 3; i++) {
            modifiedWords[i] = words[i];
        }

        // Insert "no" after "que"
        modifiedWords[3] = "no";

        // Copy the rest of the words
        for (int i = 3; i < words.length; i++) {
            modifiedWords[i + 1] = words[i];
        }

        // Reconstruct and return the modified phrase
        return String.join(" ", modifiedWords);
    }
    public  String contractHadOrWould(String sentence) {
        String[] words = sentence.split(" ");

        // Check if the sentence is too short to contain a pronoun, "had" or "would", and a verb.
        if (words.length < 3) {
            return sentence; // Return the original sentence if it's too short.
        }

        for (int i = 0; i <= words.length - 3; i++) {
            if ((words[i+1].equalsIgnoreCase("had") || words[i+1].equalsIgnoreCase("would"))) {
                // Contract and rebuild the sentence.
                String contractedWord = words[i] + "'d";
                // Replace the pronoun and "had"/"would" with the contraction and rebuild the sentence.
                String[] before = Arrays.copyOfRange(words, 0, i); // Part of the sentence before the pronoun.
                String[] after = Arrays.copyOfRange(words, i + 2, words.length); // Part of the sentence after "had"/"would".
                return String.join(" ", before) + " " + contractedWord + " " + String.join(" ", after);
            }
        }
        return sentence; // Return the original sentence if no contraction is made.
    }

    public  String applyContractionModalsHave(String sentence) {
        String[] modals = {"would", "should", "could", "might", "must"};

        for (String modal : modals) {
            if (sentence.contains(modal + " have")) {
                sentence = sentence.replaceFirst(modal + " have", modal + "'ve");
                break; // Stop once the first match is found and replaced.
            }
        }

        return sentence;
    }

    public String negateThereBeWithNo(String sentence) {
        // Array of "there + be" variations
        String[] thereBeVariations = {
                "there is ", "there are ", "there was ", "there were ",
                "there will be ", "there would be ", "there could be ",
                "there should be ", "there might be ", "there has been ",
                "there have been ", "there had been ", "there will have been ",
                "there would have been ", "there could have been ",
                "there should have been ", "there might have been ",
                "there is going to be ", "there was going to be "
        };

        for (String variation : thereBeVariations) {
            // Check if the sentence starts with any variation of "there + be"
            if (sentence.startsWith(variation)) {
                // Find the index immediately after the variation
                int indexAfterVariation = sentence.indexOf(variation) + variation.length();

                // Check if the next word is "a "
                if (sentence.startsWith("a ", indexAfterVariation)) {
                    // Replace "a " with "no " directly
                    return sentence.substring(0, indexAfterVariation) + "no " + sentence.substring(indexAfterVariation + 2);
                } else {
                    // Insert "no " before the complement if "a " is not present
                    return sentence.substring(0, indexAfterVariation) + "no " + sentence.substring(indexAfterVariation);
                }
            }
        }

        // Return the original sentence if no "there + be" variation is found
        return sentence;
    }
    public String negateThereBeSpanish(String spanishSentence) {
        // Spanish negation simply by prefixing with "no "
        return "no " + spanishSentence;
    }
    public String negateReflexiveSpanish(String sentence) {
        // List of words to check
        String[] wordsToNegate = {"yo", "tú", "él", "ella", "eso", "nosotros", "ellos"};
        // Split the sentence into parts
        String[] parts = sentence.split("\\s+");
        // StringBuilder to construct the result
        StringBuilder result = new StringBuilder();

        // Check if the second word is "quizá" or "quizás" and handle accordingly
        boolean quizáFound = parts.length > 1 && (parts[1].equalsIgnoreCase("quizá") || parts[1].equalsIgnoreCase("quizás"));
        boolean suponeQueFound = false;
        boolean pronounNegated = false; // Flag to indicate if a pronoun has already been negated

        for (int i = 0; i < parts.length; i++) {
            String part = parts[i];

            // Check for "se supone que" pattern and set a flag
            if (i < parts.length - 2 && part.equalsIgnoreCase("se") && parts[i + 1].equalsIgnoreCase("supone") && parts[i + 2].equalsIgnoreCase("que")) {
                suponeQueFound = true;
                result.append(part).append(" ");
                continue;
            }

            // If "quizá" is found, append "no" after "quizá" and skip negation of pronouns
            if (quizáFound && (part.equalsIgnoreCase("quizá") || part.equalsIgnoreCase("quizás"))) {
                part += " no";
                quizáFound = false; // To ensure "no" is added only once after "quizá"
            } else if (!quizáFound && !suponeQueFound && !pronounNegated) {
                // If not handling "quizá" or "se supone que", and no pronoun has been negated yet, proceed with original logic to negate using pronouns
                for (String wordToNegate : wordsToNegate) {
                    if (part.equalsIgnoreCase(wordToNegate)) {
                        part += " no";
                        pronounNegated = true; // Set the flag since a pronoun has been negated
                        break;
                    }
                }
            } else if (suponeQueFound && part.equalsIgnoreCase("que")) {
                // If "se supone que" pattern was found, add "no" right after "que"
                part += " no";
                suponeQueFound = false; // Reset the flag
            }

            // Append the (possibly modified) part to the result, followed by a space
            result.append(part).append(" ");
        }

        // Return the modified string, trimming trailing spaces
        return result.toString().trim();
    }

}
