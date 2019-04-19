package com.cn.fxs.gui;
/*
 * 学习for和while和do..while循环语句*/
public class Demo2 {
	public static void main(String[] args) {
		//三种循环计算1+2+3+...+100的和
		Demo2 dm=new Demo2();
		dm.ForDemo();
		dm.WhileDemo();
		dm.DoWhileDemo();
	}
	public void ForDemo() {
		//使用for循环计算1到100的和
		int sum=0;
		//int i为初始化循环变量的参数;
		//i<=100为循环的循环条件，结果为布尔值
		//i++是为i做自增运算的使其变量始终变化
		for(int i=0;i<=100;i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
	public void WhileDemo() {
		//使用while循环计算1至100的和
		//定义求和变量sum和while初始化变量i
		int sum=0;
		int i=0;
		while(i<=100) {
			sum+=i;
			i++;
		}
		System.out.println(sum);
	}
	public void DoWhileDemo() {
		//使用do...while循环计算1至100的和
		int i=1;
		int sum=0;
		//while和do...while的区别在于：while循环是先判断是否循环在进行循环，do...while循环则是先进行一次循环在进行判断还是否执行下去循环
		//总的来说就是：do...while循环至少执行一次
		do {
			sum+=i;
			i++;
		}while(i<=100);
		System.out.println(sum);
	}
}
