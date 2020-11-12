package com.xpf.module_router_realize;

import com.xpf.api.core.ParameterLoad;
import com.xpf.module_router_realize.MainActivity;

public class XActivity$$Parameter implements ParameterLoad {
    @Override
    public void loadParameter(Object target) {
        //执行一次
        MainActivity t = (MainActivity) target;
        //循环
        t.name = t.getIntent().getStringExtra("name");
        t.age = t.getIntent().getIntExtra("age", t.age);
    }
}
