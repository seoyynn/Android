package com.example.app0201;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    Button btnWeb, btnCamera, btnDial, btnCall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        btnWeb = findViewById(R.id.btnWeb);
        btnCamera = findViewById(R.id.btnCamera);
        btnDial = findViewById(R.id.btnDial);
        btnCall = findViewById(R.id.btnCall);

        btnWeb.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                // 현재 액티비티에서 다른 액티비티를 실행시켜보자!
                // 1. Intent 객체생성
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://comic.naver.com/webtoon/detail?titleId=725829&no=65&weekday="));

                // 2. Intent에 담긴 정보로 실행
                startActivity(intent);
            }


        });

        btnCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivity(intent);
            }
        });

        btnDial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:010-5105-9721"));
                startActivity(intent);
            }
        });

        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:010-5105-9721"));

                if(ContextCompat.checkSelfPermission(MainActivity3.this,
                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    ActivityCompat.requestPermissions(MainActivity3.this,
                            new String[]{Manifest.permission.CALL_PHONE}, 0);
                }

                startActivity(intent);
            }
        });
    }
}