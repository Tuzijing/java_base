package com.pxh.thread.pool;

import java.util.concurrent.Executors;

/**
 * 
* <b>Description:newCacheThread Demo</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> Java_Base
* <br><b>PackageName:</b> com.pxh.thread.pool
* <br><b>ClassName:</b>NewCachedThreadPoolDemo.java
* <br><b>Date:</b> 2017年12月1日 下午5:38:35
 */
public class NewCachedThreadPoolDemo {
	
	public static void main(String[] args) {
		System.out.println( System.getSecurityManager());
		System.out.println( Thread.currentThread().getThreadGroup());
	}
}
