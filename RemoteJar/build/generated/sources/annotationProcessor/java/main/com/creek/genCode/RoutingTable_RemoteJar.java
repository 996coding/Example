package com.creek.genCode;

import com.creek.router.protocol.*;
import com.creek.router.bean.*;

public class RoutingTable_RemoteJar implements RoutingTable { 

    static {
        RoutingTableTools.addTable(new RoutingTable_RemoteJar());
    }

    public static String flag = RoutingTable_RemoteJar.class.getName();

    @Override
    public ClassBeans classBeans() {
        return new com.creek.genCode.ClassBeansImpl_RemoteJar();
    }

    @Override
    public MethodBeans methodBeans() {
        return new com.creek.genCode.MethodBeansImpl_RemoteJar();
    }

    @Override
    public RouterClazz routerClazz() {
        return new com.creek.genCode.RouterClazzImpl_RemoteJar();
    }

    @Override
    public MethodProxy methodProxy() {
        return new com.creek.genCode.MethodProxyImpl_RemoteJar();
    }

    @Override
    public InstanceCreator instanceCreator() {
        return new com.creek.genCode.InstanceCreatorImpl_RemoteJar();
    }


}