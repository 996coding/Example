package com.hi.remotejar;

import com.creek.router.annotation.CreekMethod;

public class MyClass {

    @CreekMethod(path = "remote_jar_method")
    public String getRemoteWords() {
        return "Hello world from remote method !";
    }

}