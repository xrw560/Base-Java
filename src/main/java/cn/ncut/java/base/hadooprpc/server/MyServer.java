package cn.ncut.java.base.hadooprpc.server;

import cn.ncut.java.base.hadooprpc.protocol.SomeService;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;
import org.apache.hadoop.ipc.RPC.Builder;
import org.apache.hadoop.ipc.Server;


public class MyServer {

	public static void main(String[] args) throws Exception {
		Builder builder = new RPC.Builder(new Configuration());
		builder.setBindAddress("localhost");
		builder.setPort(5555);
		builder.setProtocol(SomeService.class);
		builder.setInstance(new SomeServiceImpl());
		Server server = builder.build();
		server.start();
	}

}
