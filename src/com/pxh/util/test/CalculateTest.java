package com.pxh.util.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.pxh.util.Calculate;

/**
* <b>Description:</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> java_base
* <br><b>PackageName:</b> com.pxh.util.test
* <br><b>ClassName:</b> CalculateTest
* <br><b>Date:</b> 2017年12月2日 下午2:40:21
*/

public class CalculateTest {

	public Calculate calculate;
	
	
	
	/**
	 * 
	* <b>Description:在没给方法执行前执行</b><br> 
	* @Note
	* <b>userName:Peng Xuehui</b><br>
	* <br><b>Date:</b> 2017年12月2日 下午2:56:53
	* <br><b>Version:</b> 1.0
	 */
	@Before
	public  void initCalculate(){
		calculate = new Calculate();
	}
	
	/**
	*  异常测试 expected
	*  超时测试timeout
	*  @Ignore 忽略测试
	* <b>Description:</b><br> 
	* @Note
	* <b>userName:Peng Xuehui</b><br>
	* <br><b>Date:</b> 2017年12月2日 下午2:57:34
	* <br><b>Version:</b> 1.0
	 */
	@Test()
	public void testAdd() {
		
		Assert.assertEquals(3,calculate.add(1, 2));
		
	}

	@Test
	public void testSub() {
		
	}
	
	@Test
	public void returnStr(){
		Assert.assertEquals("你好", calculate.returnStr());
	}
}
