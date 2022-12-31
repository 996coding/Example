package com.creek.genCode;

import com.creek.router.protocol.*;

public class MethodProxyImpl_RemoteJar implements MethodProxy { 

    @Override
    public MethodExecutor proxy(String annotationPath) {
        if ("remote_jar_method".equals(annotationPath)) {
            return new MethodExecutorImpl_RemoteJar_0();
        }
        return null;
    }


}