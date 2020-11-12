package com.xpf.personal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.xpf.annotation.ARouter;
import com.xpf.annotation.modle.RouterBean;
import com.xpf.api.core.ARouterLoadPath;

import java.util.Map;

@ARouter(path = "/personal/Personal_MainActivity")
public class Personal_MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personal_activity_main);
    }

    public void jumpApp(View view) {
        // 类加载方式交互，需要准确的全类名路径，维护成本较高且容易出现人为失误
        /*try{
            Class targetClass = Class.forName("com.xpf.module_interaction.MainActivity");
            Intent intent = new Intent(this, targetClass);
            intent.putExtra("params","xpf");
            startActivity(intent);
        }catch(ClassNotFoundException e) {
            e.printStackTrace();
        }*/

        //全局Map记录路径信息方式实现交互(跳转)
        /*Class<?> targetClass = RecordPathManager.getTargetClass("app", "MainActivity");
        if (targetClass == null) {
            Log.d(Config.TAG, "获取targetClass为空...");
        }
        Intent intent = new Intent(this, targetClass);
        intent.putExtra("name", "xpf");
        startActivity(intent);*/

        //最终集成化模式，所有子模块APT生成的类文件都会打包到apk中
        /*ARouter$$Group$$order loadGroup = new ARouter$$Group$$order();
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
                intent.putExtra("name", "xpf");
                startActivity(intent);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }*/
    }

    public void jumpOrder(View view) {

    }
}
