package com.weixiong.lambda;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class LambdaTest01 {
	
	static class Like3 implements ILike{

		@Override
		public void lambda() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	public static void main(String[] args) {
		ILike k0 = new Like();
		k0.lambda();
		
		//匿名内部类
		ILike k1 = new ILike() {
			public void lambda() {
				System.out.println("this is k1");
			}
		};
		k1.lambda();
		
		//lambda改写
		ILike k2 = ()->{
			System.out.println("this is k2");
		};
		k2.lambda();
		
		ILike k3 = ()->System.out.println("this is k3");
		k3.lambda();
		
		class Like4 implements ILike{
			public void lambda() {
				System.out.println("this is k1");
			}
		}
	}

}

//lambda表达式适用于只有一个方法的接口
interface ILike{
	void lambda();
}

class Like implements ILike{

	@Override
	public void lambda() {
		// TODO Auto-generated method stub
		System.out.println("I like lambda");
	}
	
}

class Like2 implements ILike{

	@Override
	public void lambda() {
		// TODO Auto-generated method stub
		System.out.println("I like lambda2");
	}
	
}
