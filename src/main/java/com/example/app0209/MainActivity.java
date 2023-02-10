package com.example.app0209;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.AbsListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    // 바로가기 데이터 만들기!
    // => 데이터 하나에는 제목(String), 주소(String)가 들어감
    // => DirectVO(ValueObject) => 사용자 정의 자료형

    // 1. DirectVO 를 저장할 ArrayList 생성
    ArrayList<DirectVO> SaveDvo = new ArrayList<DirectVO>();
    RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 2. DirectVO 객체 생성해서 ArrayList에 3개 저장~
        // - 제목과 주소는 여러분 하고싶은대로~

        DirectVO vo1 = new DirectVO("두식이네╰(*°▽°*)╯", "https://blog.naver.com/wddk117");
        DirectVO vo2 = new DirectVO("오뎅이네༼ つ ◕_◕ ༽つ","https://blog.naver.com/yg5057gmail");
        DirectVO vo3 = new DirectVO("개원이네(❁´◡`❁)", "https://blog.naver.com/leejang1226");
        SaveDvo.add(vo1);
        SaveDvo.add(vo2);
        SaveDvo.add(vo3);
        
        // SaveDvo.add(new DirectVO("네이버", "https://www.naver.com")); -> 이런식으로 저장해도됨

        rv = findViewById(R.id.RecyclerView);

        DirectAdapter adapter = new DirectAdapter(SaveDvo, getApplicationContext());
        rv.setAdapter(adapter);

        // 리스트 형태(LinearLayoutManager)로 할건지 그리드 형태(GridLayoutManager)로 할건지
        // ☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
        rv.setLayoutManager(new LinearLayoutManager(this));


    }
}