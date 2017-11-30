package com.pxh.thread;
/**
* <b>Description:多线程入口</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> java_base
* <br><b>PackageName:</b> com.pxh.thread
* <br><b>ClassName:</b> Main
* <br><b>Date:</b> 2017年11月30日 下午11:15:02
*/

public class Main {

	public static void main(String[] args) {
		
		String name = "1111";
		int i =0;
		while(true){
			i+=1;
			System.out.println(i);
			name = "测试次数:"+i;
			System.out.println(name);
			name = null;
			try {
				Thread.sleep(2*1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
