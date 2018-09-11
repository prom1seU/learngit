package com.weixiong.lambda;

/**
 * lambda主要作用：避免匿名内部类定义过多
 * 其实质属于函数式编程
 * @author apple
 *
 */
public class LanbdaPractice1 {
	//静态内部类
	static class Test1 implements Runnable{
		public void run() {
			for(int i=0;i<100;i++) {
				System.out.println("This is test1");
			}
		}
	}

	public static void main(String[] args) {
		//局部内部类
		class Test2 implements Runnable{
			public void run() {
				for(int i=0;i<100;i++) {
					System.out.println("This is test1");
				}
			}
		}
		
//		new Thread(new demoThread1()).start();
		new Thread(()->{
			for(int i=0;i<100;i++) {
				System.out.println("This is t2");
			}
		}).start();
		
		new Thread(()->{
			for(int i=0;i<10;i++) {
				System.out.println("This is t3");
			}
		}).start();
		
		new Thread(new Test1()).start();
		new Thread(new Test2()).start();
		
		//匿名内部类(必须借助接口或者父类)
		new Thread(new Runnable() {
			public void run() {
				
			}
		}).start();
	}
}

class demoThread1 implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("This is t1");
		}
		
		
	}	
}
