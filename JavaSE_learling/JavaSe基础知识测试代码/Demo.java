package com.cn.fxs.gui;

/*
 * ͨ��������ѧϰJava Se�����﷨֪ʶ
 * ֱ��ѧϰ�﷨if��switch�﷨
 */

public class Demo {
	public static void main(String[] args) {
		int a=10,y=11;
		char f='a';
		Demo dm=new Demo();
		//m.DemoIf(a, y);
		dm.DemoSwitch(f);
	}
	//�Զ��巽����ʾif����if...else����Լ�if...else if...else���
	public void DemoIf(int x,int y) {
		//���xС��y�������y
		if(x<y) {
			System.out.println(y);
		}
		//�������x����y�Ļ��������x
		else if(x>y) {
			System.out.println(x);
		}
		//�����������
		else {
			System.out.println("����");
		}
	}
	//�Զ��巽����ʾswitch�����﷨
	public void DemoSwitch(char a) {
		//���a='a'�Ļ����a,�������a='b'�Ļ����b���������c
		//switch��ִ��Ч���ϴ�������if...else if..else��ʹ�ã�ʹ���Ǵ�����Ӽ���׶�
		//�����֧���ٵĻ�ѡ��if�����������֧��Ļ�ʹ��switch
		switch (a) {
		case 'a':
			System.out.println("a");
			break;
		case 'b':
			System.out.println("b");
			break;
		default:
			System.out.println("c");
			break;
		}
	}
}