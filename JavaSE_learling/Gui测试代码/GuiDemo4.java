package com.cn.fxs.gui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
/**
 * @classname:GuiDemo4
 * @title:borderlayout���ֹ���������
 * @author:������
 *
 */
public class GuiDemo4 {

	public static void main(String[] args) {
		//��ʼ��frame����
		Frame fr=new Frame("borderlayout���ֹ������Ĳ��Գ���");
		//��ʼ��button����
		Button bt1=new Button("��");
		Button bt2=new Button("��");
		Button bt3=new Button("��");
		Button bt4=new Button("��");
		Button bt5=new Button("����");
		//����ť�����ӵ�frame������
		fr.add(bt1,BorderLayout.WEST);
		fr.add(bt2,BorderLayout.EAST);
		fr.add(bt3,BorderLayout.NORTH);
		fr.add(bt4,BorderLayout.SOUTH);
		fr.add(bt5,BorderLayout.CENTER);
		//�����Ƿ�ɼ�
		fr.setVisible(true);
		//���ó�ʼ����С
		fr.setSize(400, 400);
	}

}
