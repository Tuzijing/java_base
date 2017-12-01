package com.pxh.thread.runable;
/**
 * 
* <b>Description:</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> Java_Base
* <br><b>PackageName:</b> com.pxh.thread.runable
* <br><b>ClassName:</b>RunnableDemo.java
* <br><b>Date:</b> 2017年12月1日 上午11:44:17
 */
public class RunnableDemo {
	
	public static void main(String[] args) {
		MyRunable myRunable = new MyRunable();
		Thread thread = new Thread(myRunable);
		thread.start();
	}
	
}
