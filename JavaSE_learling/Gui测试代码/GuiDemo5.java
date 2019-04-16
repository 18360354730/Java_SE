package com.cn.fxs.gui;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
/**
 * @classname:GuiDemo5
 * @title:gridlayout布局管理器测试
 * @author:凡先生
 *
 */
public class GuiDemo5 {

	public static void main(String[] args) {
		//初始化frame对象
		Frame fr=new Frame("测试gridlayout布局管理器");
		//初始化gridlayout管理器
		fr.setLayout(new GridLayout(3,2));
		//初始化button对象
		Button bt1=new Button("按钮1");
		Button bt2=new Button("按钮2");
		Button bt3=new Button("按钮3");
		Button bt4=new Button("按钮4");
		Button bt5=new Button("按钮5");
		Button bt6=new Button("按钮6");
		//将button添加到frame对象中
		fr.add(bt1);
		fr.add(bt2);
		fr.add(bt3);
		fr.add(bt4);
		fr.add(bt5);
		fr.add(bt6);
		//设置是否可见并设置初始化大小
		fr.setVisible(true);
		fr.setSize(400, 400);
	}
}
