package com.cn.fxs.gui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GuiDemo_1 {

	public static void main(String[] args) {
		//����һ��frame����
		Frame fr=new Frame("ʵ���¼�����Ч������");
		//��ʼ��button����
		Button bt=new Button("����ң�����");
		//����һ������������
		JT modify=new JT();
		//��������������ӵ�button����ȥ
		bt.addActionListener(modify);
		//��button������ӵ�frame��
		fr.add(bt,BorderLayout.CENTER);
		fr.pack();
		//��frame������ӵ�windowlistenerʱ�������ȥ
		addwindowlistener(fr);
		//���ô��ڵĳ�ʼ����С�����Ƿ�ɼ�
		fr.setVisible(true);
		fr.setSize(400, 400);
	}
	//����һ���رմ��ڵĹرշ���
	@SuppressWarnings("unused")
	private static void addwindowlistener(Frame f) {
		//frame�������һ��window�������Ҵ�һ���ڲ���
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}
//���������࣬��Ϊ���������ʵ��actionlistener�ӿ�
class JT implements ActionListener{
	//ʵ�ֽӿں�Ҫ��д���ķ���
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("�Ѿ������˼�����");
	}
}