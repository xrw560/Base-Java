package cn.ncut.java.base.springannotation.customannotation.service.impl;


import cn.ncut.java.base.springannotation.customannotation.annotation.RpcService;
import cn.ncut.java.base.springannotation.customannotation.service.HelloService;

@RpcService("HelloServicebb")
public class HelloServiceImpl implements HelloService {
    public String hello(String name) {
        return "Hello! " + name;
    }

    public void test() {
        System.out.println("test");
    }
}
