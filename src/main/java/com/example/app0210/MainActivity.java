package com.example.app0210;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<MsgVO> msgVO = new ArrayList<MsgVO>();

    RecyclerView rv;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MsgVO vo1 = new MsgVO(R.drawable.zonzal01, "남주혁", "두시기가 최고에용", "오전 10:39");
        MsgVO vo2 = new MsgVO(R.drawable.zonzal02, "주혁씨", "무키무키 후토마키", "오전 10:45");
        MsgVO vo3 = new MsgVO(R.drawable.zonzal03, "존잘님", "조앵바보 두식개천재", "오전 10:52");
        MsgVO vo4 = new MsgVO(R.drawable.psy, "박서연", "온냐 점심뭐먹을거야?", "오전 11:05");
        MsgVO vo5 = new MsgVO(R.drawable.princess, "조앵", "장서연개천재~~~~", "오전 11:17");
        MsgVO vo6 = new MsgVO(R.drawable.img01, "임소완", "공주님@@@~~@@@", "오전 11:17");
        MsgVO vo7 = new MsgVO(R.drawable.img02, "조앵", "장서연개천재~~~~", "오전 11:17");
        MsgVO vo8 = new MsgVO(R.drawable.img03, "조앵", "저한테 왜구러세요 ", "오전 11:17");

        msgVO.add(vo1);
        msgVO.add(vo2);
        msgVO.add(vo3);
        msgVO.add(vo4);
        msgVO.add(vo5);
        msgVO.add(vo6);
        msgVO.add(vo7);
        msgVO.add(vo8);

        rv = findViewById(R.id.RecyclerView);

        MsgAdapter adapter = new MsgAdapter(msgVO, getApplicationContext());
        rv.setAdapter(adapter);

        rv.setLayoutManager(new LinearLayoutManager(this));


    }
}