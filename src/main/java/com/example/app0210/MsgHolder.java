package com.example.app0210;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MsgHolder extends RecyclerView.ViewHolder {

    ImageView profile_img;
    TextView name;
    TextView content;
    TextView time;


    public MsgHolder(@NonNull View itemView) {
        super(itemView);

        profile_img = itemView.findViewById(R.id.profile_img);
        name = itemView.findViewById(R.id.name);
        content = itemView.findViewById(R.id.content);
        time = itemView.findViewById(R.id.time);
    }
}
