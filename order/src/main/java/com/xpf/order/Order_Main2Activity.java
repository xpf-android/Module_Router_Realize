package com.xpf.order;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.xpf.annotation.ARouter;

@ARouter(path = "/order/Order_Main2Activity")
public class Order_Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_main2);
    }
}
