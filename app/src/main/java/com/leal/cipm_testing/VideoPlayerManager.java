package com.leal.cipm_testing;

import android.util.Log;

import com.google.android.exoplayer2.SimpleExoPlayer;

public class VideoPlayerManager {
    private static VideoPlayerManager instance = null;
    private SimpleExoPlayer currentPlayer;

    // Singleton pattern para asegurar una sola instancia
    public static VideoPlayerManager getInstance() {
        if (instance == null) {
            instance = new VideoPlayerManager();
        }
        return instance;
    }

    // Método para reproducir un reproductor
    public void playPlayer(SimpleExoPlayer player) {
        if (currentPlayer != null && currentPlayer != player) {
            currentPlayer.setPlayWhenReady(false);
        }
        currentPlayer = player;
        currentPlayer.setPlayWhenReady(true);
    }

    // Método para liberar el reproductor
    public void releasePlayer(SimpleExoPlayer player) {
        if (player == currentPlayer) {
            currentPlayer = null;
        }
        player.release();
    }
}

