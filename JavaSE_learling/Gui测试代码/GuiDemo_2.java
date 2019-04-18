package com.cn.fxs.gui;

import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GuiDemo_2 {

	public static void main(String[] args) {
		new MyFrameTextfield();
	}
}
@SuppressWarnings("serial")
/*
 * ����һ����
 * ���ã�������ʼ�����ǵ�frame�ʹ������Ǽ���������
 */
class MyFrameTextfield extends Frame{
	public MyFrameTextfield() {
		//��ʼ��textfield����
		TextField tf=new TextField();
		//��tf������ӵ�frame��
		add(tf);
		//����������ӽ�ȥtf������
		tf.addActionListener(new JTl());
		//��ʼ����С�������Ƿ�ɼ�
		setVisible(true);
		setSize(200, 200);
		pack();
		addwindowclosing(this);
	}
	//���һ���ڲ�˽�з���ʵ�ִ��ڹر�
	@SuppressWarnings("unused")
	private static void addwindowclosing(Frame f) {
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}
/*
 * ����һ���������࣬��������ʵ��actionlistener�ӿ�
 * ��д�ӿڵķ���
 * ���ã�ʵ�ּ�������
 */
class JTl implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		//��ȡ�¼�Դ����ϢȻ�󴫸�textfield����
		TextField tf1=(TextField) e.getSource();
		//���tf1�����ȡ���ı�����Ϣ
		System.out.println(tf1.getText());
		//����ı�������
		tf1.setText("");
	}
	
}