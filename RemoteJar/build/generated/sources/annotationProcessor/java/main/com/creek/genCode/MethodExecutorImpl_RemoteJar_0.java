package com.creek.genCode;

import com.creek.router.protocol.*;
import com.creek.router.bean.*;

public class MethodExecutorImpl_RemoteJar_0 implements MethodExecutor { 

    /*
        Annotation Path = remote_jar_method
    */

    public final RouterBean bean = RouterBean.create("101", "0", "remote_jar_method", "com.hi.remotejar.MyClass", "getRemoteWords", "java.lang.String");

    @Override
    public Object execute(Object instance, Checker checker, Object... parameters) {
        CheckResult result = checker.methodCheck(bean, com.hi.remotejar.MyClass.class, parameters);
        if (!result.isOk) {
            return MethodReturn.ERROR_PARAMETER;
        }
        com.hi.remotejar.MyClass proxyInstance = null;
        if (checker.instanceCheck(instance, com.hi.remotejar.MyClass.class)) {
            proxyInstance = (com.hi.remotejar.MyClass) instance;
        }else {
            proxyInstance = new com.hi.remotejar.MyClass();
        }
        return proxyInstance.getRemoteWords();
    }


}