package com.xpf.order;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.xpf.annotation.ARouter;
import com.xpf.annotation.Parameter;
import com.xpf.common.Cons;

@ARouter(path = "/order/Order_MainActivity")
public class Order_MainActivity extends AppCompatActivity {

    @Parameter
    String name;

    @Parameter(name = "agex")
    int age = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_activity_main);
        Log.d(Cons.TAG, "order/Order_MainActivity");
        if (getIntent() != null) {
            /*String content = getIntent().getStringExtra("name");
            Log.d(Cons.TAG, content);*/

            new Order_MainActivity$$Parameter().loadParameter(this);
            Log.d(Cons.TAG, "name: " + name + " / age: " +age);
        }


    }

    public void jumpApp(View view) {
    }

    public void jumpPersonal(View view) {
    }
}
