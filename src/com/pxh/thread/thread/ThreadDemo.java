package com.pxh.thread.thread;
/**
 * 
* <b>Description:</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> Java_Base
* <br><b>PackageName:</b> com.pxh.thread.thread
* <br><b>ClassName:</b>ThreadDemo.java
* <br><b>Date:</b> 2017年12月1日 上午11:35:49
 */
public class ThreadDemo {

	/**
	* 
	* <b>Description:</b><br> 
	* @param args
	* @Exception 
	* @Note
	* <b>userName:Peng Xuehui</b><br>
	* <br><b>Date:</b> 2017年12月1日 上午11:35:49
	* <br><b>Version:</b> 1.0
		*/

	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		myThread.start();

	}

}
