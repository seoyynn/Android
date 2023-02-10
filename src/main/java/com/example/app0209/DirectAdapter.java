package com.example.app0209;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DirectAdapter extends RecyclerView.Adapter<DirectHolder> {
    private ArrayList<DirectVO> datas; // RV에 뿌릴 데이터
    private Context context; // Activity 에서 보내줄 화면구성 정보!

    public DirectAdapter(ArrayList<DirectVO> datas, Context context) {
        this.datas = datas;
        this.context = context;
    }

    @NonNull
    @Override
    public DirectHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new DirectHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.templete, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull DirectHolder holder, int position) {
        // holder => 이전에 만들어진 View들이 저장된 ViewHolder
        // position => 위치
        holder.tv_title.setText(datas.get(position).getTitle());
        holder.tv_address.setText(datas.get(position).getAddress());
        holder.btn_go.setOnClickListener(V->{
            Intent it_url = new Intent(Intent.ACTION_VIEW, Uri.parse(datas.get(position).getAddress()));
            // Intent it_url = new Intent(Intent.ACTION_VIEW, Uri.parse(holder.tv_address.getText().toString());

            // 새로 task 하나 더 만들어서 실행할게요! 라는 뜻
            it_url.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(it_url);
        });

    }

    @Override
    public int getItemCount() {
        return datas.size();
    }
}