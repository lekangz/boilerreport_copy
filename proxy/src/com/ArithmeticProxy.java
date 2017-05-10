package com;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class ArithmeticProxy {
	private Arithmetic arithmeric;
	
	public ArithmeticProxy(Arithmetic arithmeric) {
		this.arithmeric = arithmeric;
	}


	public Arithmetic get(){
		Arithmetic proxy=null;
		//代理对象由哪一类加载器负责加载
		ClassLoader loader=arithmeric.getClass().getClassLoader();
		//代理对象的类型，即其中有哪些方法
		Class[] interfaces=new Class[]{Arithmetic.class};
		//当调用代理对象其中的方法时，该执行的代码。
		InvocationHandler h=new InvocationHandler(){

			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				System.out.println("正在执行的方法："+method.getName()+"参数："+Arrays.asList(args));
				Object result=method.invoke(arithmeric, args);
				System.out.println("方法结束!");
				return result;
			}
			
		};
		proxy=(Arithmetic)Proxy.newProxyInstance(loader, interfaces, h);
		return proxy;
	}
}
