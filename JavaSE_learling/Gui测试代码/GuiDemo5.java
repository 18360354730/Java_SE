package com.cn.fxs.gui;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
/**
 * @classname:GuiDemo5
 * @title:gridlayout���ֹ���������
 * @author:������
 *
 */
public class GuiDemo5 {

	public static void main(String[] args) {
		//��ʼ��frame����
		Frame fr=new Frame("����gridlayout���ֹ�����");
		//��ʼ��gridlayout������
		fr.setLayout(new GridLayout(3,2));
		//��ʼ��button����
		Button bt1=new Button("��ť1");
		Button bt2=new Button("��ť2");
		Button bt3=new Button("��ť3");
		Button bt4=new Button("��ť4");
		Button bt5=new Button("��ť5");
		Button bt6=new Button("��ť6");
		//��button��ӵ�frame������
		fr.add(bt1);
		fr.add(bt2);
		fr.add(bt3);
		fr.add(bt4);
		fr.add(bt5);
		fr.add(bt6);
		//�����Ƿ�ɼ������ó�ʼ����С
		fr.setVisible(true);
		fr.setSize(400, 400);
	}
}
