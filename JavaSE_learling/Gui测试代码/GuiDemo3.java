package com.cn.fxs.gui;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
/**
 * @classname:GuiDemo3
 * @title:����flowlayout���ֹ�����
 * @author:������
 *
 */
public class GuiDemo3 {
	public static void main(String[] args) {
		//����frame����
		Frame fr=new Frame("����flowlayout���ֹ�����");
		//������ťbutton����
		Button bt1=new Button("��ť1");
		Button bt2=new Button("��ť2");
		Button bt3=new Button("��ť3");
		//�������ֹ�����
		fr.setLayout(new FlowLayout());
		//��button������ӵ�frame��
		fr.add(bt1);
		fr.add(bt2);
		fr.add(bt3);
		//����frame�Ƿ�ɼ����ҳ�ʼ����С
		fr.setVisible(true);
		fr.setSize(400, 400);
	}
}
