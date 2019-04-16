package com.cn.fxs.gui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
/**
 * @classname:GuiDemo4
 * @title:borderlayout布局管理器测试
 * @author:凡先生
 *
 */
public class GuiDemo4 {

	public static void main(String[] args) {
		//初始化frame对象
		Frame fr=new Frame("borderlayout布局管理器的测试程序");
		//初始化button对象
		Button bt1=new Button("左");
		Button bt2=new Button("右");
		Button bt3=new Button("北");
		Button bt4=new Button("南");
		Button bt5=new Button("居中");
		//将按钮组件添加到frame对象中
		fr.add(bt1,BorderLayout.WEST);
		fr.add(bt2,BorderLayout.EAST);
		fr.add(bt3,BorderLayout.NORTH);
		fr.add(bt4,BorderLayout.SOUTH);
		fr.add(bt5,BorderLayout.CENTER);
		//设置是否可见
		fr.setVisible(true);
		//设置初始化大小
		fr.setSize(400, 400);
	}

}
