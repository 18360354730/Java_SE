package com.cn.fxs.gui;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
/**
 * @classname:GuiDemo3
 * @title:测试flowlayout布局管理器
 * @author:凡先生
 *
 */
public class GuiDemo3 {
	public static void main(String[] args) {
		//创建frame对象
		Frame fr=new Frame("测试flowlayout布局管理器");
		//创建按钮button对象
		Button bt1=new Button("按钮1");
		Button bt2=new Button("按钮2");
		Button bt3=new Button("按钮3");
		//创建布局管理器
		fr.setLayout(new FlowLayout());
		//将button对象添加到frame中
		fr.add(bt1);
		fr.add(bt2);
		fr.add(bt3);
		//设置frame是否可见并且初始化大小
		fr.setVisible(true);
		fr.setSize(400, 400);
	}
}
