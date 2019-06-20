package com.lyc.mybatis.session;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;

import com.lyc.mybatis.mapping.Function;
import com.lyc.mybatis.mapping.MapperBean;
import com.lyc.mybatis.mapping.MyConfiguration;

public class MyMapperProxy implements InvocationHandler {

    private MySqlsession mySqlsession;

    private MyConfiguration myConfiguration;

    public MyMapperProxy(MyConfiguration myConfiguration, MySqlsession mySqlsession) {
        this.myConfiguration = myConfiguration;
        this.mySqlsession = mySqlsession;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        MapperBean readMapper = myConfiguration.readMapper("UserMapper.xml");
        //是否是xml文件对应的接口
        if (!method.getDeclaringClass().getName().equals(readMapper.getInterfaceName())) {
            return null;
        }
        List<Function> list = readMapper.getList();
        if (null != list || 0 != list.size()) {
            for (Function function : list) {
                //id是否和接口方法名一样
                if (method.getName().equals(function.getFuncName())) {
                    return mySqlsession.selectOne(function.getSql(), String.valueOf(args[0]));
                }
            }
        }
        return null;
    }
}