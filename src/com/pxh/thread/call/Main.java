package com.pxh.thread.call;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 
* <b>Description:线程入库</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> Java_Base
* <br><b>PackageName:</b> com.pxh.thread.call
* <br><b>ClassName:</b>Main.java
* <br><b>Date:</b> 2017年12月1日 下午2:24:56
 */
public class Main {

	/**
	* 
	* <b>Description:</b><br> 
	* @param args
	* @Exception 
	* @Note
	* <b>userName:Peng Xuehui</b><br>
	* <br><b>Date:</b> 2017年12月1日 下午2:24:56
	* <br><b>Version:</b> 1.0
		*/

	public static void main(String[] args) {

		MyCall<String> myCall = new MyCall<String>("我是带返回值的线程");
		FutureTask<String> ft = new FutureTask<String>(myCall);
		//启动线程
		new Thread(ft).start();
		try {
			System.out.println(ft.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
