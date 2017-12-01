package com.pxh.thread.runable;
/**
 * 
* <b>Description:</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> Java_Base
* <br><b>PackageName:</b> com.pxh.thread.runable
* <br><b>ClassName:</b>MyRunable.java
* <br><b>Date:</b> 2017年12月1日 上午11:38:33
 */
public class MyRunable implements Runnable {

	@Override
	public void run() {
		System.out.println("我是自定义Runnable线程");
	}

}
