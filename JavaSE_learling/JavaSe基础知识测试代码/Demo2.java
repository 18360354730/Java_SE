package com.cn.fxs.gui;
/*
 * ѧϰfor��while��do..whileѭ�����*/
public class Demo2 {
	public static void main(String[] args) {
		//����ѭ������1+2+3+...+100�ĺ�
		Demo2 dm=new Demo2();
		dm.ForDemo();
		dm.WhileDemo();
		dm.DoWhileDemo();
	}
	public void ForDemo() {
		//ʹ��forѭ������1��100�ĺ�
		int sum=0;
		//int iΪ��ʼ��ѭ�������Ĳ���;
		//i<=100Ϊѭ����ѭ�����������Ϊ����ֵ
		//i++��Ϊi�����������ʹ�����ʼ�ձ仯
		for(int i=0;i<=100;i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
	public void WhileDemo() {
		//ʹ��whileѭ������1��100�ĺ�
		//������ͱ���sum��while��ʼ������i
		int sum=0;
		int i=0;
		while(i<=100) {
			sum+=i;
			i++;
		}
		System.out.println(sum);
	}
	public void DoWhileDemo() {
		//ʹ��do...whileѭ������1��100�ĺ�
		int i=1;
		int sum=0;
		//while��do...while���������ڣ�whileѭ�������ж��Ƿ�ѭ���ڽ���ѭ����do...whileѭ�������Ƚ���һ��ѭ���ڽ����жϻ��Ƿ�ִ����ȥѭ��
		//�ܵ���˵���ǣ�do...whileѭ������ִ��һ��
		do {
			sum+=i;
			i++;
		}while(i<=100);
		System.out.println(sum);
	}
}
