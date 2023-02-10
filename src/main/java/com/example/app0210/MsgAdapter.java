package com.example.app0210;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MsgAdapter extends RecyclerView.Adapter<MsgHolder> {

    private ArrayList<MsgVO> datas;
    private Context context;

    public MsgAdapter(ArrayList<MsgVO> datas, Context context){
        this.datas = datas;
        this.context = context;
    }

    public MsgHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MsgHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.msg, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MsgHolder holder, int position) {
        holder.profile_img.setImageResource(datas.get(position).getImageResource());
        holder.name.setText(datas.get(position).getName());
        holder.content.setText(datas.get(position).getMessage());
        holder.time.setText(datas.get(position).getTime());

    }

    @Override
    public int getItemCount() {
        return datas.size();
    }


}
