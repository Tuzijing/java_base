package com.pxh.exception;
 /**
  * FileName: CustomException.java
  * package com.pxh.exception
  *Type CustomException
  * git 
  * Author:   Peng Xuehui
  * Date:     2017年11月30日 下午3:31:27
  * Description: Custom Exception 
  * History:
  * <author>          <time>          <version>          <desc>
  * 作者姓名           修改时间           版本号              描述
  */
public class CustomException extends Exception {

	/**
	 *
	 *@Time:2017年11月30日 下午3:34:55
	 *@Field:serialVersionUID
	 *@Todo:TODO
	 */
	private static final long serialVersionUID = 1262373952361733571L;
	
	private int exceptionNum; //异常编号
	private String message;
	/**
	 *
	 * @Time:2017年11月30日 下午3:41:10
	 * @Username:Peng xh
	 * @Todo:
	 * @param exceptionNum
	 * @param message
	 */
	public CustomException(int exceptionNum, String message) {
		this.exceptionNum = exceptionNum;
		this.message = message;
	}
	
	
	 /**
	  * getMessage
	  *CustomException
	  * git 
	  * Author:   Peng Xuehui
	  * Date:     2017年11月30日 下午3:42:09
	  * Description: return exception mesage
	  * History:
	  * <author>          <time>          <version>          <desc>
	  * 作者姓名           修改时间           版本号              描述
	  */
	@Override
	public String getMessage() {
		
		return "异常编号:"+this.exceptionNum+",异常信息:"+this.message;
	}
	
	
	


	

}
