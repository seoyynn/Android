package com.example.app0125;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    
    // activity_main.xml에 배치한 Textview의 정보를 저장할 변수 생성
    // * TextView의 id와 변수명을 동일하게 정의!
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // activity_main.xml의 View정보를 접근하여 객체로 생성 (짱짱중요!!!!!!!!)
        txt = findViewById(R.id.txt);
        
        // TextView의 text속성값을 변경하는 메소드
        txt.setText("나의 첫 앱 실행~!잉"); // text를 기본값인 안녕하세요 말고 다른걸로 바꿔줌
    }
}