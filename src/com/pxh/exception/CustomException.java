package com.pxh.exception;
/**
 * 
* <b>Description:自定义异常</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> java_base
* <br><b>PackageName:</b> com.pxh.exception
* <br><b>ClassName:</b> CustomException
* <br><b>Date:</b> 2017年11月30日 下午9:34:46
 */
public class CustomException extends Exception {

	private static final long serialVersionUID = 1262373952361733571L;
	
	private int exceptionNum; //异常编号
	private String message;

	public CustomException(int exceptionNum, String message) {
		this.exceptionNum = exceptionNum;
		this.message = message;
	}
	

	@Override
	public String getMessage() {
		return "异常编号:"+this.exceptionNum+",异常信息:"+this.message;
	}
	
	
	


	

}
