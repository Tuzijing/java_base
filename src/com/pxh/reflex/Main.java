package com.pxh.reflex;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;


/**
  * FileName: Main.java
  * package com.pxh.reflex
  *Type Main
  * git 
  * Author:   Peng Xuehui
  * Date:     2017年11月30日 下午3:10:10
  * Description: Program main entrance
  * History:
  * <author>          <time>          <version>          <desc>
  * 作者姓名           修改时间           版本号              描述
  */
public class Main {

	/**
	 *
	 * @Time:2017年11月30日 下午3:14:00
	 * @Username:Peng xh
	 * @Todo:Program main entrance 
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		/**
		 * 反射有三种加载方式
		 * 1.new Obeject().getClass()  使用对象方法
		 * 2.Class.forName() 使用类加载器
		 * 3.xx.class //类名后面直接加class  
		 */
		String bagRotu = "com.pxh.reflex.Student";
		try {
			//===================加载类==========
			Class clz = ReflexFactory.loadClassByRotu(bagRotu);
			//==================构造器==========
			//公共构造器
			Constructor<Student>[] constructors =  clz.getConstructors(); //获取的所有公共构造器
			System.out.println("打印所有公共构造器");
			for(Constructor<Student> constructor:constructors){
				System.out.println(constructor);
			}
			//所有构造器（包括私有构造器）
			Constructor<Student>[] constructors2 = clz.getDeclaredConstructors(); //获取所有构造器
			System.out.println("打印所有构造器（包括私有）");
			for(Constructor<Student> constructor:constructors2){
				System.out.println(constructor);
			}
			//获取指定公共构造器
			System.out.println("打印获取指定的公共构造器");
			Constructor<Student> constructor = clz.getConstructor(int.class,String.class);
			System.out.println(constructor);
			System.out.println("获取指定的私有构造器");
			Constructor<Student> constructor2 = clz.getDeclaredConstructor(int.class);
			System.out.println(constructor2);
			
			
			
			//=================初始化对象============
			//调用公共构造函数初始
			System.out.println("调用公共构造函数初始化");
			Student student = constructor.newInstance(1,"2");
			System.out.println(student);
			//调用私有构造函数初始化   注意一定要设置 Accessible为true
			System.out.println("调用使用函数初始化");
			constructor2.setAccessible(true);
			Student student2 = constructor2.newInstance(new Object[]{1});
			System.out.println(student2);
			
			//===================操作类成员=========
			//获取所有公共类型的类成员
			System.out.println("获取所有公共类型的类成员");
			Field[] fields =  clz.getFields();
			for(Field field:fields){
				if(field.getType() == int.class){
					System.out.println("我是int   "+field.getName());
				}
				System.out.print(field.getType()+"---"+field.getName()+" ");
			}
			//获取所有类型成员
			System.out.println("获取所有类成员");
			Field[] fields2 = clz.getDeclaredFields();
			for(Field field:fields2){
				if(field.getType() == int.class){
					System.out.println("我是int   "+field.getName());
				}
				System.out.print(field.getType()+"---"+field.getName()+" ");
			}
			//对变量复制
		
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	

	
	

}
