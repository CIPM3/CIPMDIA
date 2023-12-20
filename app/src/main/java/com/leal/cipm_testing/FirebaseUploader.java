package com.leal.cipm_testing;

import android.net.Uri;

import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageMetadata;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class FirebaseUploader {

    private FirebaseStorage storage;
    private FirebaseFirestore firestore;
    public FirebaseUploader() {
        storage = FirebaseStorage.getInstance();
        firestore = FirebaseFirestore.getInstance();
    }
    public void uploadAudioAndCreateDocument(String userEmail, File audioFile,String question) {
        // Assuming storageReference is already defined and initialized.



        StorageReference storageReference = FirebaseStorage.getInstance().getReference();
        // Create a reference for the audio file in Firebase Storage
        String fileName = audioFile.getName();
        StorageReference audioRef = storageReference.child("audio/" + userEmail+ question+fileName);


        // Upload file to Firebase Storage
        UploadTask uploadTask = audioRef.putFile(Uri.fromFile(audioFile));

        // Add success and failure listeners to the upload task
        uploadTask.addOnSuccessListener(taskSnapshot -> {
            // Upon successful upload, get the download URL
            audioRef.getDownloadUrl().addOnSuccessListener(downloadUri -> {
                // Create Firestore document with the download URL
                createFirestoreDocument(userEmail, downloadUri.toString(), question);
            });
        }).addOnFailureListener(exception -> {
            // Handle unsuccessful uploads here
            // Log the error or notify the user
        });
    }

    private void createFirestoreDocument(String userEmail, String downloadUrl, String question) {
        DocumentReference docRef = firestore.collection(userEmail).document(question);
        Map<String, Object> docData = new HashMap<>();
        docData.put("feedback", "");
        docData.put("timestamp", System.currentTimeMillis());
        docData.put("storageLink", downloadUrl);

        docRef.set(docData)
                .addOnSuccessListener(aVoid -> {
                    // Document successfully written!
                })
                .addOnFailureListener(e -> {
                    // Error writing document
                });
    }
}
