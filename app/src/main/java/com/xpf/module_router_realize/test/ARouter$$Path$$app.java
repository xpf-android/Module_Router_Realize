package com.xpf.module_router_realize.test;


import com.xpf.annotation.modle.RouterBean;
import com.xpf.api.core.ARouterLoadPath;
import com.xpf.module_router_realize.MainActivity;

import java.util.HashMap;
import java.util.Map;

/**
 * 模拟ARouter路由器的组文件对应的路径
 */
public class ARouter$$Path$$app implements ARouterLoadPath {
    /**
     * 返回对应组(模块)名，所有被注解过的Activity的RouterBean对象的集合
     * @return
     */
    @Override
    public Map<String, RouterBean> loadPath() {
        Map<String, RouterBean> pathMap = new HashMap<>();
        pathMap.put("/app/MainActivity", RouterBean.create(RouterBean.Type.ACTIVITY,
                MainActivity.class,
                "/app/MainActivity",
                "app"));

        return pathMap;
    }
}
