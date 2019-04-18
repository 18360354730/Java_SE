package com.cn.fxs.gui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GuiDemo_1 {

	public static void main(String[] args) {
		//定义一个frame对象
		Frame fr=new Frame("实现事件监听效果测试");
		//初始化button对象
		Button bt=new Button("点击我！！！");
		//创建一个监听器对象
		JT modify=new JT();
		//将监听器对象添加到button里面去
		bt.addActionListener(modify);
		//将button对象添加到frame中
		fr.add(bt,BorderLayout.CENTER);
		fr.pack();
		//将frame对象添加到windowlistener时间监听中去
		addwindowlistener(fr);
		//设置窗口的初始化大小，且是否可见
		fr.setVisible(true);
		fr.setSize(400, 400);
	}
	//创建一个关闭窗口的关闭方法
	@SuppressWarnings("unused")
	private static void addwindowlistener(Frame f) {
		//frame对象添加一个window监听并且创一个内部类
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}
//创建监听类，作为监听类必须实现actionlistener接口
class JT implements ActionListener{
	//实现接口后要重写它的方法
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("已经触发了监听器");
	}
}