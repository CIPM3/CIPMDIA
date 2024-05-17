package com.leal.cipm_testing;

import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.ui.StyledPlayerView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

public class FullScreenVideoFragment extends Fragment {
    private SimpleExoPlayer player;
    private StyledPlayerView playerView;
    private Button btnExitFullScreen;

    //"https://adrianlealcaldera.com/examenexpl.mp4"

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_full_screen_video, container, false);
        playerView = view.findViewById(R.id.video_player_fullscreen);
        btnExitFullScreen = view.findViewById(R.id.btn_exit_full_screen);

        btnExitFullScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exitFullScreen();
            }
        });

        initializePlayer();

        return view;
    }

    private void initializePlayer() {
        // Inicializar el reproductor
        if (getArguments() != null) {
            long position = getArguments().getLong("position");
            boolean playWhenReady = getArguments().getBoolean("playWhenReady");

            player = new SimpleExoPlayer.Builder(getContext()).build();
            playerView.setPlayer(player);
            player.setPlayWhenReady(playWhenReady);
            player.seekTo(position);
            player.setMediaItem(MediaItem.fromUri("https://adrianlealcaldera.com/examenexpl.mp4"));
            player.prepare();
        }
    }

    private void exitFullScreen() {
        if (getActivity() != null) {
            getActivity().setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
            getActivity().getSupportFragmentManager().popBackStack();
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        if (player != null) {
            player.release();
            player = null;
        }
    }
}

