package com.example.app0201;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

// 주사위 App
// 1. 버튼을 누르면 주사위 눈이 랜덤으로 출력된다. (Random)
// 2. 두 주사위 눈을 비교한다.
// 2-1 img1 > img2 : tv_user1에 카운트 1
// 2-2 img1 < img2 : tv_user2에 카운트 1
// 2-3 img1 = img2 : Toast를 이용해서 무승부 알림창 띄우기

public class MainActivity extends AppCompatActivity {


    int[]imgArray = {R.drawable.dice1, R.drawable.dice2, R.drawable.dice3,
                     R.drawable.dice4, R.drawable.dice5, R.drawable.dice6};


    int pos1;
    int pos2;
    int a = 0;
    int b = 0;


    ImageView img1, img2;
    TextView  tv_user1, tv_user2;
    Button btn_shake;

    // Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
        tv_user1 = findViewById(R.id.tv_user1);
        tv_user2 = findViewById(R.id.tv_user2);
        btn_shake = findViewById(R.id.btn_shake);

        btn_shake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // img1, img2에 사용할 랜덤수를 생성하기!
                pos1 = (int)(Math.random()*6);
                pos2 = (int)(Math.random()*6);
                // int pos1 = random.nextInt(imgArray.length);
                // int pos2 = random.nextInt(imgArray.length);

                // img1, img2에 주사위이미지 변경하기!
                img1.setImageResource(imgArray[pos1]);
                img2.setImageResource(imgArray[pos2]);

                if(pos1>pos2){
                    // TextView의 text속성값을 가져온다
                    // text값을 정수로 변환한다

                    // a++;
                    int user1 = Integer.parseInt(tv_user1.getText().toString());

                    // setText()메소드는 매개변수를 String타입으로 받을 수 있기 때문에
                    // 정수형 변수인 user1을 문자열로 변환 ( String.valueOf() )
                    tv_user1.setText(String.valueOf(user1+1));
                }else if(pos1<pos2){
                    b++;
                    int user2 = Integer.parseInt(tv_user2.getText().toString());
                    tv_user2.setText(String.valueOf(user2+1));
                    //tv_user2.setText(Integer.toString(b));
                }else{
                    Toast.makeText(MainActivity.this, "무승부", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}