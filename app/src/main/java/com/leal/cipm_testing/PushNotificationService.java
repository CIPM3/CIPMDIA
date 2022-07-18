package com.leal.cipm_testing;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.app.NotificationManagerCompat;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class PushNotificationService extends FirebaseMessagingService {
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onMessageReceived(@NonNull RemoteMessage remoteMessage) {
        String title =remoteMessage.getNotification().getTitle();
        String text = remoteMessage.getNotification().getBody();

        final String channel_ID= "HEADS_UP_NOTIFICATION";

        NotificationChannel channel  = new NotificationChannel(
                channel_ID,
                "heads up notification",
                NotificationManager.IMPORTANCE_HIGH
        );

        getSystemService(NotificationManager.class)
                .createNotificationChannel(channel);
        Notification.Builder notification = new Notification.Builder(this,channel_ID)
                .setContentTitle(title)
                        .setContentText(text)

                                        .setAutoCancel(true);
        NotificationManagerCompat.from(this).notify(1, notification.build());

        super.onMessageReceived(remoteMessage);

    }
}
