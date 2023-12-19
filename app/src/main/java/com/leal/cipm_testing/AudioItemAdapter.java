package com.leal.cipm_testing;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class AudioItemAdapter extends RecyclerView.Adapter<AudioItemAdapter.AudioItemViewHolder> {
    private List<AudioItem> audioItems;

    public AudioItemAdapter(List<AudioItem> audioItems) {
        this.audioItems = audioItems;
    }

    @NonNull
    @Override
    public AudioItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_question, parent, false);
        return new AudioItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AudioItemViewHolder holder, int position) {
        AudioItem item = audioItems.get(position);
        holder.tvQuestion.setText(item.getQuestion());
        holder.imgCheckmark.setVisibility(item.isRecorded() ? View.VISIBLE : View.GONE);
        holder.tvRecordingTimer.setText(item.getRecordingTimer());
        holder.tvFeedback.setText(item.getFeedback());

        holder.btnRecord.setOnClickListener(v -> {
            Toast.makeText(v.getContext(), "button clicked", Toast.LENGTH_SHORT).show();
        });
    }

    @Override
    public int getItemCount() {
        return audioItems.size();
    }

    public static class AudioItemViewHolder extends RecyclerView.ViewHolder {
        TextView tvQuestion;
        ImageView imgCheckmark;
        Button btnRecord;
        TextView tvRecordingTimer;
        TextView tvFeedback;

        public AudioItemViewHolder(@NonNull View itemView) {
            super(itemView);
            tvQuestion = itemView.findViewById(R.id.tvQuestionItem);
            imgCheckmark = itemView.findViewById(R.id.imgCheckmark);
            btnRecord = itemView.findViewById(R.id.btnRecord);
            tvRecordingTimer = itemView.findViewById(R.id.tvRecordingTimer);
            tvFeedback = itemView.findViewById(R.id.tvFeedback);
        }
    }
}

