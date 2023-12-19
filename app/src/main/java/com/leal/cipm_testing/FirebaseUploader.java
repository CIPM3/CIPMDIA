package com.leal.cipm_testing;

import android.net.Uri;

import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

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
    public void uploadAudioAndCreateDocument(String userEmail, File audioFile) {
        // Create a reference to "userEmail/audioFileName"
        String fileName = audioFile.getName();
        StorageReference storageRef = storage.getReference().child(userEmail + "/" + fileName);

        // Upload file
        storageRef.putFile(Uri.fromFile(audioFile))
                .addOnSuccessListener(taskSnapshot -> {
                    // Get the download URL
                    storageRef.getDownloadUrl().addOnSuccessListener(downloadUri -> {
                        // Create Firestore document
                        createFirestoreDocument(userEmail, downloadUri.toString(), fileName);
                    });
                })
                .addOnFailureListener(exception -> {
                    // Handle unsuccessful upload
                });
    }
    private void createFirestoreDocument(String userEmail, String downloadUrl, String fileName) {
        DocumentReference docRef = firestore.collection(userEmail).document();
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
