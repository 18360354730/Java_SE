package com.cn.fxs.gui;

import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GuiDemo_2 {

	public static void main(String[] args) {
		new MyFrameTextfield();
	}
}
@SuppressWarnings("serial")
/*
 * 定义一个类
 * 作用：用来初始化我们的frame和处理我们监听器对象
 */
class MyFrameTextfield extends Frame{
	public MyFrameTextfield() {
		//初始化textfield对象
		TextField tf=new TextField();
		//将tf对象添加到frame中
		add(tf);
		//将监听器添加进去tf对象中
		tf.addActionListener(new JTl());
		//初始化大小并设置是否可见
		setVisible(true);
		setSize(200, 200);
		pack();
		addwindowclosing(this);
	}
	//添加一个内部私有方法实现窗口关闭
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
/*
 * 定义一个监听器类，监听器类实现actionlistener接口
 * 重写接口的方法
 * 作用：实现监听功能
 */
class JTl implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		//获取事件源的信息然后传给textfield对象
		TextField tf1=(TextField) e.getSource();
		//输出tf1对象获取的文本框信息
		System.out.println(tf1.getText());
		//清空文本框内容
		tf1.setText("");
	}
	
}