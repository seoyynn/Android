package com.example.app0209;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

// 상위 클래스에 생성자가 설계되어 있다면 하위 클래스는 반드시 생성자를 구현해야 함

public class DirectHolder extends RecyclerView.ViewHolder {

    TextView tv_title;
    TextView tv_address;
    Button btn_go;


    public DirectHolder(@NonNull View itemView) {
        super(itemView); // 상위 클래스의 생성자를 호출하는 명령
        // 반드시 생성자 첫번째 줄에 위치해야 함

        tv_title = itemView.findViewById(R.id.tv_title);
        tv_address = itemView.findViewById(R.id.tv_address);
        btn_go = itemView.findViewById(R.id.btn_go);

    }

    // 재사용할 View ( TextView * 2 ) 저장하는 용도

}