package com.pxh.thread.thread;
/**
 * 
* <b>Description:自定义线程</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> Java_Base
* <br><b>PackageName:</b> com.pxh.thread.thread
* <br><b>ClassName:</b>MyThread.java
* <br><b>Date:</b> 2017年12月1日 上午11:30:10
 */
public class MyThread extends Thread {

	@Override
	public void run() {
		System.out.println("我是自定义线程");
	}

}
