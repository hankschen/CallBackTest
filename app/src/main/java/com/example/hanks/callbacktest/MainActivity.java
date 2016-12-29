package com.example.hanks.callbacktest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView1;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1 = (TextView)findViewById(R.id.textView1);
        btn = (Button)findViewById(R.id.button1);
        btn.setOnClickListener(clickListener);

    }

    View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            new Hello(callBack).speak();

        }
    };

    HelloCallBack callBack = new HelloCallBack() {
        @Override
        public void success(String strSuccess) {

            textView1.setText(strSuccess);

        }
    };
}
