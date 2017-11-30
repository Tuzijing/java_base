package com.pxh.lamda;
/**
* <b>Description:lamda程序主入口</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> java_base
* <br><b>PackageName:</b> com.pxh.lamda
* <br><b>ClassName:</b> Main
* <br><b>Date:</b> 2017年11月30日 下午10:28:54
*/

public class Main {
	
	public static void main(String[] args) {
		/**
		 * 以下是lambda表达式的重要特征:
    	 * 可选类型声明：不需要声明参数类型，编译器可以统一识别参数值。
    	 * 可选的参数圆括号：一个参数无需定义圆括号，但多个参数需要定义圆括号。
    	 * 可选的大括号：如果主体包含了一个语句，就不需要使用大括号。
     	 * 可选的返回关键字：如果主体只有一个表达式返回值则编译器会自动返回值，大括号需要指定明表达式返回了一个数值。
     	 * 
     	 * 
     	 * 使用 Lambda 表达式需要注意以下两点：
     	 * Lambda 表达式主要用来定义行内执行的方法类型接口，例如，一个简单方法接口
     	 * Lambda 表达式免去了使用匿名方法的麻烦，并且给予Java简单但是强大的函数化的编程能力。
     	 * 
     	 * 
     	 * 
     	 * Lambda 表达式免去了使用匿名方法的麻烦，并且给予Java简单但是强大的函数化的编程能力。
     	 * 
     	 * 定义接口时候最好加上@FunctionalInterface，是接口更规范， 
     	 * @FunctionalInterface 只能使用在只有一个抽象方法的接口上
     	 * 
     	 * 
		 */
		//无参数ladam表示
		LamdaDemo demo = ()->{return "hello world";};
		System.out.println(demo.print());
		
		//有参数无返回值测试
		LamdaDemo1 demo1 = (name)->System.out.println(name);
		System.out.println("有参数无返回值的测试:");
		demo1.print1("hello world");
		
		
		
	}

}
