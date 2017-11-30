/**
 *
 * @Time:2017年11月30日  下午2:06:10
 * @UserName:Peng Xh
 * @Todo:TODO
 */
package com.pxh.reflex;
 /**
  * FileName: Student.java
  * package com.pxh.reflex
  *Type Student
  * git 
  * Author:   Peng Xuehui
  * Date:     2017年11月30日 下午2:06:10
  * Description: reflex test class
  * History:
  * <author>          <time>          <version>          <desc>
  * 作者姓名           修改时间           版本号              描述
  */
public class Student {
	private int id; 
	private String name;
	
	public int id1;
	public String name1;
	
	public static int id2;
	public static String name2;
	
	@SuppressWarnings("unused")
	private static int id3;
	@SuppressWarnings("unused")
	private static String name3;
	/**
	 *
	 * @Time:2017年11月30日 下午2:52:49
	 * @Username:Peng xh
	 * @Todo: Non parametric construction
	 */
	public Student() {}

	

	/**
	 *
	 * @Time:2017年11月30日 下午3:01:47
	 * @Username:Peng xh
	 * @Todo:One parameters construct
	 * @param id
	 */
	@SuppressWarnings("unused")
	private Student(int id) {
		super();
		this.id = id;
	}


	/**
	 *
	 * @Time:2017年11月30日 下午2:52:23
	 * @Username:Peng xh
	 * @Todo:Tow parameters construction
	 * @param id 
	 * @param name
	 */
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	/**
	 * 
	  * @Time:2017年11月30日 下午3:04:45
	  * @Author:Peng Xh
	  * @Description: test1
	  * @git 
	  * @Return void
	  * History:
	  * <author>          <time>          <version>          <desc>
	  * 作者姓名           修改时间           版本号              描述
	 */
	public void test1(){
		System.out.println("");
	}
	
	@SuppressWarnings("unused")
	private void test2(){}
	
	@SuppressWarnings("unused")
	private static String test3(){
		return "private static String test3 method";
	}
	
	public static String test4(){
		return "public static String test4 method";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}



	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	
	
	
}
