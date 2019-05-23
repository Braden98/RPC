package RPC.Netty.provider;

import RPC.Netty.api.IRpcHello;

public class RpcHello implements IRpcHello {

	@Override
	public String hello(String name) {
		return "Hello , " + name + "!";
	}

}
