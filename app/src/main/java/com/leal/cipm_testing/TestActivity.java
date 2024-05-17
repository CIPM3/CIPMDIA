//package com.leal.cipm_testing;
//
//import android.content.pm.ActivityInfo;
//import android.os.Bundle;
//import android.widget.Button;
//import androidx.appcompat.app.AppCompatActivity;
//import com.google.android.exoplayer2.MediaItem;
//import com.google.android.exoplayer2.SimpleExoPlayer;
//import com.google.android.exoplayer2.ui.StyledPlayerView;
//
//public class TestActivity extends AppCompatActivity implements FullScreenVideoFragment, PlayerProvider {
//
//    private StyledPlayerView playerView;
//    private SimpleExoPlayer player;
//    private long playbackPosition = 0;
//    private boolean playWhenReady = true;
//    private boolean isFullScreen = false;
//
//    String urlVideo = "https://firebasestorage.googleapis.com/v0/b/cipmbilling-24963.appspot.com/o/Cursos%20en%20Video%20Estructuras%2F10.%20Pasado%20continuo.mp4?alt=media&token=7eb20736-5434-4184-bc4f-e94ac0427570";
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_test);
//
//        playerView = findViewById(R.id.video_player_view);
//        initializePlayer();
//
//        Button btnFullScreen = findViewById(R.id.btn_full_screen);
//        btnFullScreen.setOnClickListener(view -> toggleFullScreen());
//    }
//
//    private void toggleFullScreen() {
//        if (!isFullScreen) {
//            openFullScreenDialog();
//            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
//            isFullScreen = true;
//        } else {
//            closeFullScreenDialog();
//            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
//            isFullScreen = false;
//        }
//    }
//
//
//    private void closeFullScreenDialog() {
//        getSupportFragmentManager().popBackStack();
//    }
//
//    private void initializePlayer() {
//        if (player == null) {
//            player = new SimpleExoPlayer.Builder(this).build();
//            playerView.setPlayer(player);
//            MediaItem mediaItem = MediaItem.fromUri(urlVideo);
//            player.setMediaItem(mediaItem);
//            player.prepare();
//        }
//        player.setPlayWhenReady(playWhenReady);
//        player.seekTo(playbackPosition);
//    }
//
//
//    @Override
//    public SimpleExoPlayer getSharedPlayer() {
//        return player;
//    }
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//        if (player != null) {
//            playbackPosition = player.getCurrentPosition();
//            playWhenReady = player.getPlayWhenReady();
//            player.release(); // Considera si necesitas liberar el reproductor aquí
//            player = null;
//        }
//    }
//
//    @Override
//    protected void onStart() {
//        super.onStart();
//        if (player == null) {
//            initializePlayer();
//        }
//        player.setPlayWhenReady(playWhenReady);
//        player.seekTo(playbackPosition);
//    }
//
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//        if (player != null) {
//            // Guardar posición y estado de reproducción
//            playbackPosition = player.getCurrentPosition();
//            playWhenReady = player.getPlayWhenReady();
//            player.setPlayWhenReady(false);  // Pausar al perder el foco
//        }
//    }
//
//    @Override
//    protected void onResume() {
//        super.onResume();
//        if (player != null) {
//            // Restaurar posición y estado de reproducción
//            player.setPlayWhenReady(playWhenReady);
//            player.seekTo(playbackPosition);
//        } else {
//            initializePlayer();
//        }
//    }
//
//    private void openFullScreenDialog() {
//        playbackPosition = player.getCurrentPosition(); // Asegúrate de obtener la posición actual antes de abrir el fragmento
//        playWhenReady = player.getPlayWhenReady();
//
//        FullScreenVideoFragment fullScreenFragment = FullScreenVideoFragment.newInstance(playbackPosition, playWhenReady);
//        fullScreenFragment.show(getSupportFragmentManager(), "full_screen_video");
//    }
//
//    @Override
//    public void onFragmentDismissed(long position, boolean isPlayWhenReady) {
//        this.playbackPosition = position;
//        this.playWhenReady = isPlayWhenReady;
//
//        if (player != null) {
//            player.seekTo(playbackPosition);
//            player.setPlayWhenReady(playWhenReady);
//        }
//    }
//
//}
