package com.cn.fxs.gui;

import java.awt.Color;
import java.awt.Frame;

/**
 * @classname:GuiDemo1
 * @title:第一个Gui程序
 * @author:凡先生
 *
 */
@SuppressWarnings("serial")
public class GuiDemo1 extends Frame {

	public static void main(String[] args) {
		//初始化frame对象
		Frame fr=new Frame("第一个Gui测试");
		//设置背景色
		fr.setBackground(Color.red);
		//设置是否可见
		fr.setVisible(true);
		//设置初始化大小
		fr.setSize(200, 200);
		//设置窗口显示的位置
		fr.setLocation(300, 300);
		//设置窗口是否能被改变大小
		fr.setResizable(false);
		/*更多方法见java JDK API*/
	}

}
