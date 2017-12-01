package com.pxh.thread.call;

import java.util.concurrent.Callable;

/**
 * 
* <b>Description:</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
 * @param <V>
* @Note
* <b>ProjectName:</b> Java_Base
* <br><b>PackageName:</b> com.pxh.thread.call
* <br><b>ClassName:</b>MyCall.java
* <br><b>Date:</b> 2017年12月1日 下午12:18:04
 */
public  class  MyCall<V> implements Callable<V> {

	private V v;
	
	public MyCall(V v){
		this.v = v;
	}
	
	@Override
	public V call() throws Exception {
		return this.v;
	}

}
