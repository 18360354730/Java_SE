package com.cn.fxs.gui;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
/**
 * @classname:GuiDemo2
 * @title:��һ������panel����
 * @author:������
 */
@SuppressWarnings("serial")
public class GuiDemo2 extends Frame {

	public static void main(String[] args) {
		//��ʼ��frame����
		Frame fr=new Frame("��һ������Panel�ĳ���");
		//��ʼ��panel����
		Panel pl=new Panel(null);
		//���ô����Ƿ���ʾ
		fr.setVisible(true);
		//���ô��ڳ�ʼ������
		fr.setBounds(300,300,500,500);
		//���ò��ֹ�����
		fr.setLayout(null);
		//���ñ�����ɫ
		fr.setBackground(Color.BLUE);
		//����panel�ĳ�ʼλ��
		pl.setBounds(40, 40, 400, 400);
		//���������ı�����ɫ
		pl.setBackground(Color.RED);
		//��ӵ�frame�ķ���
		fr.add(pl);
	}

}
