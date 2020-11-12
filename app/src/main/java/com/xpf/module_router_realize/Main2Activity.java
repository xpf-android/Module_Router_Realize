package com.xpf.module_router_realize;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.xpf.annotation.ARouter;
import com.xpf.annotation.Parameter;

@ARouter(path = "/app/Main2Activity")
public class Main2Activity extends AppCompatActivity {

    @Parameter
    String username;
    @Parameter
    boolean success;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
}
