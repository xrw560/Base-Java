package cn.ncut.java.base.hadooprpc.client;

import java.net.InetSocketAddress;

import cn.ncut.java.base.hadooprpc.protocol.SomeService;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;


public class MyClient {
    public static void main(String[] args) throws Exception {
        SomeService someService = RPC.getProxy(
                SomeService.class, Long.MAX_VALUE, new InetSocketAddress(
                        "localhost", 5555), new Configuration());
        String ret = someService.heartBeat("wilson");
        System.out.println(ret);
    }
}
