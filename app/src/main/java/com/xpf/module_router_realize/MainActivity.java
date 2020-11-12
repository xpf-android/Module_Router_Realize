package com.xpf.module_router_realize;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.xpf.annotation.ARouter;
import com.xpf.annotation.Parameter;
import com.xpf.annotation.modle.RouterBean;
import com.xpf.api.core.ARouterLoadPath;
import com.xpf.common.Cons;
import com.xpf.module.apt.ARouter$$Group$$order;
import com.xpf.module.apt.ARouter$$Group$$personal;

import java.util.Map;

@ARouter(path = "/app/MainActivity")
public class MainActivity extends AppCompatActivity {
    @Parameter
    String name;
    @Parameter(name = "agex")
    int age;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (BuildConfig.isRelease) {
            Log.d(Cons.TAG, "当前为：集成化模式，除app可运行，其它子模块都是Android Library");
        } else {
            Log.d(Cons.TAG, "当前为：组件化模式，app/order/personal等子模块都可独立运行");
        }

        // 获取传递参数值
//        name = getIntent().getStringExtra("name");
//        age = getIntent().getIntExtra("age",age);

    }


    /**
     * 跳转至order模块的Order_MainActivity
     */
    public void jumpOrder(View view) {
        //最终集成化模式，所有子模块APT生成的类文件都会打包到apk中
        ARouter$$Group$$order loadGroup = new ARouter$$Group$$order();
        Map<String, Class<? extends ARouterLoadPath>> groupMap = loadGroup.loadGroup();
        //app--->personal
        Class<? extends ARouterLoadPath> clazz = groupMap.get("order");
        //类加载技术
        try {
            ARouterLoadPath path = clazz.newInstance();
            Map<String, RouterBean> pathMap = path.loadPath();
            //获取/order/Order_MainActivity
            RouterBean routerBean = pathMap.get("/order/Order_MainActivity");
            if (routerBean != null) {
                Intent intent = new Intent(this, routerBean.getClazz());
                intent.putExtra("name", "simon");
                intent.putExtra("agex", 20);
                startActivity(intent);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 跳转至personal的Personal_MainActivity
     */
    public void jumpPersonal(View view) {
        //最终集成化模式，所有子模块APT生成的类文件都会打包到apk中
        ARouter$$Group$$personal loadGroup = new ARouter$$Group$$personal();
        Map<String, Class<? extends ARouterLoadPath>> groupMap = loadGroup.loadGroup();
        //app--->personal
        Class<? extends ARouterLoadPath> clazz = groupMap.get("personal");
        //类加载技术
        try {
            ARouterLoadPath path = clazz.newInstance();
            Map<String, RouterBean> pathMap = path.loadPath();
            //获取/personal/Personal_MainActivity
            RouterBean routerBean = pathMap.get("/personal/Personal_MainActivity");
            if (routerBean != null) {
                Intent intent = new Intent(this, routerBean.getClazz());
                intent.putExtra("name", "xpf");
                startActivity(intent);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
