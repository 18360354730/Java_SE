package com.cn.fxs.gui;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GuiDemo_3 {

	public static void main(String[] args) {
		new BJframe();
	}
}
//定义一个类，实现对计算器的布局工作
@SuppressWarnings("serial")
class BJframe extends Frame{
	public Object tf1;
	public BJframe() {
		/*
		 * tf1,tf2,tf3实现加法的对象
		 */
		TextField tf1=new TextField(10);
		TextField tf2=new TextField(10);
		TextField tf3=new TextField(10);
		//创建计算的‘=’按钮
		Button bt=new Button("=");
		bt.addActionListener(new JTQ(tf1, tf2, tf3));
		//设置布局管理器
		setLayout(new FlowLayout());
		//将组件添加进frame
		add(tf1);
		//设置一个label为静态文本对象
		//实现加法
		add(new Button("+"));
		add(tf2);
		add(bt);
		add(tf3);
		addwindowclosing(this);
		setVisible(true);
		setSize(200,200);
	}
	//定义一个私有方法实现关闭功能
	@SuppressWarnings("unused")
	private static void addwindowclosing(Frame f) {
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}
//创建一个监听器类
class JTQ implements ActionListener{
	//加法
	TextField num1,num2,num3;
	public JTQ(TextField num1,TextField num2,TextField num3) {
		this.num1=num1;
		this.num2=num2;
		this.num3=num3;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//获取我们输入的数字，并且进行转型
		int n1=Integer.parseInt(num1.getText());
		int n2=Integer.parseInt(num2.getText());
		//将输入的数进行运算
		num3.setText(""+(n1+n2));
	}
	
}
