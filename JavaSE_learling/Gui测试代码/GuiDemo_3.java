package com.cn.fxs.gui;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GuiDemo_3 {

	public static void main(String[] args) {
		new BJframe();
	}
}
//����һ���࣬ʵ�ֶԼ������Ĳ��ֹ���
@SuppressWarnings("serial")
class BJframe extends Frame{
	public Object tf1;
	public BJframe() {
		/*
		 * tf1,tf2,tf3ʵ�ּӷ��Ķ���
		 */
		TextField tf1=new TextField(10);
		TextField tf2=new TextField(10);
		TextField tf3=new TextField(10);
		//��������ġ�=����ť
		Button bt=new Button("=");
		bt.addActionListener(new JTQ(tf1, tf2, tf3));
		//���ò��ֹ�����
		setLayout(new FlowLayout());
		//�������ӽ�frame
		add(tf1);
		//����һ��labelΪ��̬�ı�����
		//ʵ�ּӷ�
		add(new Button("+"));
		add(tf2);
		add(bt);
		add(tf3);
		addwindowclosing(this);
		setVisible(true);
		setSize(200,200);
	}
	//����һ��˽�з���ʵ�ֹرչ���
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
//����һ����������
class JTQ implements ActionListener{
	//�ӷ�
	TextField num1,num2,num3;
	public JTQ(TextField num1,TextField num2,TextField num3) {
		this.num1=num1;
		this.num2=num2;
		this.num3=num3;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//��ȡ������������֣����ҽ���ת��
		int n1=Integer.parseInt(num1.getText());
		int n2=Integer.parseInt(num2.getText());
		//�����������������
		num3.setText(""+(n1+n2));
	}
	
}
