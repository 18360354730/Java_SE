package com.cn.fxs.gui;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
/**
 * @classname:GuiDemo2
 * @title:第一个测试panel程序
 * @author:凡先生
 */
@SuppressWarnings("serial")
public class GuiDemo2 extends Frame {

	public static void main(String[] args) {
		//初始化frame对象
		Frame fr=new Frame("第一个测试Panel的程序");
		//初始化panel对象
		Panel pl=new Panel(null);
		//设置窗口是否显示
		fr.setVisible(true);
		//设置窗口初始化坐标
		fr.setBounds(300,300,500,500);
		//设置布局管理器
		fr.setLayout(null);
		//设置背景颜色
		fr.setBackground(Color.BLUE);
		//设置panel的初始位置
		pl.setBounds(40, 40, 400, 400);
		//设置容器的背景颜色
		pl.setBackground(Color.RED);
		//添加到frame的方法
		fr.add(pl);
	}

}
