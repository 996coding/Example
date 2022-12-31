package com.creek.genCode;

import com.creek.router.protocol.*;
import com.creek.router.bean.*;

public class MethodBeansImpl_RemoteJar implements MethodBeans { 

    @Override
    public RouterBean methodAskRouterBean(String annotationPath, String pkgName) {

        return null;
    }

    @Override
    public RouterBean methodReplyRouterBean(String annotationPath) {
        RouterBean bean;
        if ("remote_jar_method".equals(annotationPath)) {
            bean = RouterBean.create("101", "0", "remote_jar_method", "com.hi.remotejar.MyClass", "getRemoteWords", "java.lang.String");
            return bean;
        }
        return null;
    }


}