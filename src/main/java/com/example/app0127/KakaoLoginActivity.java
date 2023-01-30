package com.example.app0127;

import androidx.appcompat.app.AppCompatActivity;
// AppCompatActivity 2가지
// 1) appcompat
// 2) supportv7 : androidx버전에서는 지원하지 않음
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class KakaoLoginActivity extends AppCompatActivity
implements View.OnClickListener{
    // View.OnclickListner 인터페이스 : implements

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kakao_login);
        // 기능을 달아주는 곳

        // 1) 뷰한테 기능을 달아주려면 ID값(뷰가 가진 고유값)을 찾아와줘야한다
        Button btnLogin = findViewById(R.id.btnLogin);
        // +findViewById는 setContentView 아래에 작성해야한다!
        EditText editEmail = findViewById(R.id.editEmail);
        EditText editPw = findViewById(R.id.editPw);

        // Toast
        // Log : 버튼이 눌림!

        // 2) 버튼 클릭 이벤트 달아주기(클릭 감지하기)
        // 2-1) inner class 사용하기
        // 2-2) 람다식 사용하기
        // 2-3) 인터페이스 상속받기
        // ㄴ> 인터페이스를 통해서 OnClick이라는 메소드를 오버라이딩
        btnLogin.setOnClickListener(this);
        // this : 현재 Activity의 모든 화면 정보를 가지고 있음
        // 2-4) 메소드 만들어서 속성에서 달아주기

    }
    // 매개변수 : View에 대한 정보를 받아와야한다
    public void click(View view){
        // 클릭했을 때에 이벤트(실행시킬 코드)
        // import단축키 : Alt + Enter
        Log.v("status", "클릭이 감지되었습니다");
        // msg의 데이터타입 : String
        // 정수형 변수를 출력하고 싶다 : cast(형변환)
        // 안드로이드에서 형변환 -> toString(), String.valueof()
    }

    @Override
    public void onClick(View view) {
        // 어떤 뷰를 클릭했는지 구분이 필요!
        // : View의 ID로 구분!

        // id가 가진 데이터타입이 int이기 때문에 ==를 사용함
        if(view.getId() == R.id.btnLogin){
            // 실행코드
            Log.v("status","인터페이스로 클릭 구현");
        }
    }
}