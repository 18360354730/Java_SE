package com.cn.fxs.gui;

/*
 * 通过代码来学习Java Se基础语法知识
 * 直接学习语法if和switch语法
 */

public class Demo {
	public static void main(String[] args) {
		int a=10,y=11;
		char f='a';
		Demo dm=new Demo();
		//m.DemoIf(a, y);
		dm.DemoSwitch(f);
	}
	//自定义方法演示if语句和if...else语句以及if...else if...else语句
	public void DemoIf(int x,int y) {
		//如果x小于y，则输出y
		if(x<y) {
			System.out.println(y);
		}
		//否则如果x大于y的话，则输出x
		else if(x>y) {
			System.out.println(x);
		}
		//否则输出错误
		else {
			System.out.println("错误");
		}
	}
	//自定义方法演示switch语句的语法
	public void DemoSwitch(char a) {
		//如果a='a'的话输出a,否则如果a='b'的话输出b，否则输出c
		//switch从执行效率上大大减少了if...else if..else的使用，使我们代码更加简洁易懂
		//如果分支较少的话选择if，如果条件分支多的话使用switch
		switch (a) {
		case 'a':
			System.out.println("a");
			break;
		case 'b':
			System.out.println("b");
			break;
		default:
			System.out.println("c");
			break;
		}
	}
}