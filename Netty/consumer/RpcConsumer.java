package RPC.Netty.consumer;


import RPC.Netty.api.IRpcCalc;
import RPC.Netty.api.IRpcHello;
import RPC.Netty.consumer.proxy.RpcProxy;

public class RpcConsumer {
	
	public static void main(String[] args) {

		IRpcHello rpcHello = RpcProxy.create(IRpcHello.class);
		String r = rpcHello.hello("aaa");
		System.out.println(r);
		
		
		int a = 8,b = 2;
		IRpcCalc calc = RpcProxy.create(IRpcCalc.class);
		System.out.println(a + " + " + b +" = " + calc.add(a, b));
		System.out.println(a + " - " + b +" = " + calc.sub(a, b));
		System.out.println(a + " * " + b +" = " + calc.mult(a, b));
		System.out.println(a + " / " + b +" = " + calc.div(a, b));
		
		
	}
	
}
