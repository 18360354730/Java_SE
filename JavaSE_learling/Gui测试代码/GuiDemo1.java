package com.cn.fxs.gui;

import java.awt.Color;
import java.awt.Frame;

/**
 * @classname:GuiDemo1
 * @title:��һ��Gui����
 * @author:������
 *
 */
@SuppressWarnings("serial")
public class GuiDemo1 extends Frame {

	public static void main(String[] args) {
		//��ʼ��frame����
		Frame fr=new Frame("��һ��Gui����");
		//���ñ���ɫ
		fr.setBackground(Color.red);
		//�����Ƿ�ɼ�
		fr.setVisible(true);
		//���ó�ʼ����С
		fr.setSize(200, 200);
		//���ô�����ʾ��λ��
		fr.setLocation(300, 300);
		//���ô����Ƿ��ܱ��ı��С
		fr.setResizable(false);
		/*���෽����java JDK API*/
	}

}
