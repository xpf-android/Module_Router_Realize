package com.xpf.module_router_realize;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.xpf.annotation.ARouter;
import com.xpf.annotation.Parameter;

@ARouter(path = "/app/Main3Activity")
public class Main3Activity extends AppCompatActivity {

    @Parameter
    String password;
    @Parameter
    int gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
}
