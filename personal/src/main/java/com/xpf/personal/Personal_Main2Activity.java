package com.xpf.personal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.xpf.annotation.ARouter;

@ARouter(path = "/personal/Personal_Main2Activity")
public class Personal_Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_main2);
    }
}
