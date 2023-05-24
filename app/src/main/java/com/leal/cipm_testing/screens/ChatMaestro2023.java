package com.leal.cipm_testing.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.leal.cipm_testing.R;

import im.crisp.client.ChatActivity;

public class ChatMaestro2023 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_maestro2023);
    }

    public void av(View v) {
        Intent crispIntent = new Intent(this, ChatActivity.class);
        startActivity(crispIntent);
    }
}