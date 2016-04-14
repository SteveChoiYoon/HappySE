package sehw1;

import javax.swing.JOptionPane;

/**
 * @param count : ������ ����
 *        price : ������ ����
 *        name : ������ �̸�
 * @author Young Yoon Choi
 * @brief ������ ������ �������� Class, ������ �Լ��� �����ϰ�, �Һ��ڰ� ���Ḧ ������ ������ ������ ������ ���ҽ�Ű��
 *        �Լ�, ���� �����ִ� ������ ���� �׸��� ������ ������ �ʱ�ȭ���ִ� �Լ��� �����Ͽ���. 
 */
public class beverage{
	
	int count;
	int price;
	String name;
	
	// ������ method
	public beverage(int count, int price, String name){
		this.count = count;
		this.price = price;
		this.name = name;
	}
	
	// ���Ḧ ������ ������ ������ ������ ���̴� �Լ�
	public void ReduceBeverage(){
		count--;
	}
	
	// ���� ���� ������ ������ �����ִ� �Լ�
	public void getCount(){
		JOptionPane.showMessageDialog(null, 
                "���� ������ ���� :         "+String.valueOf(count)+"\n",
                "Change :      ", JOptionPane.INFORMATION_MESSAGE);
	}
	
	// ������ ���� �ʱ�ȭ
	public void ResetBeverage(){
		count = 30;
	}
	
}