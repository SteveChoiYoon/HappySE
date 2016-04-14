package sehw1;

import javax.swing.JOptionPane;

/**
 * @param inputMoney : �Һ��ڰ� ���� ���� ǥ���ϱ� ���� ����
 *        countNum : countNum�� ���� Vending Machine�� ���� inputMoney�� ���ŵȴ�.
 *        change1, change2, change3, change4 : �ܵ���ȯ �Լ������� ���� ����, ���� ������ ���� ���� 
 * @author Young Yoon Choi
 * @brief ���� ���ԵǸ� vending machine ������ ���� �Һ��ڰ� ���� ���� ��� ���ŵǰ�, ����ó���� ����
 *        ���� ���� �Һ��ڿ��� ��ȯ���ִ� �Լ��� ������ Class
 * @exception Vending Machine�� ���� ���� �ܵ����� ���� ��� ����ó��
 */
public class machine {
	
	product p = new product();
	money m = new money();
	int inputMoney;

	// ���Ե� ���� ���� ������ �������� ��� ���Ž����ش�. 
	public void InputThousandwon(int countNum){
		m.thousand += countNum;
		inputMoney += countNum * 1000;
	}
	
	public void InputFivehundredwon(int countNum){
		m.fivehundred += countNum;
		inputMoney += countNum * 500;
	}
	
	public void InputOnehundredwon(int countNum){
		m.onehundred += countNum;
		inputMoney += countNum * 100;
	}
	
	public void InputTenwon(int countNum){
		m.ten += countNum;
		inputMoney += countNum * 10;
	}
	
	// �ܵ��� ��ȯ���ִ� �Լ� 
	public void ReturnMoney(){
		int change1 = 0, change2 = 0, change3 = 0, change4 = 0;
		if(inputMoney / 1000 > 0){
			change1 = inputMoney / 1000;
			m.thousand -= change1;
			inputMoney -= change1 * 1000;
		}
		if(inputMoney / 500 > 0){
			change2 = inputMoney / 500;
			m.fivehundred -= change2;
			inputMoney -= change2 * 500;
		}
		if(inputMoney / 100 > 0){
			change3 = inputMoney / 100;
			m.onehundred -= change3;
			inputMoney -= change3 * 100;
		}
		if(inputMoney / 10 > 0){
			change4 = inputMoney / 10;
			m.ten -= change4;
			inputMoney -= change4 * 10;
		}
		
		// ����ó��
		if((m.thousand - change1 < 0) || (m.fivehundred - change2 < 0) 
				|| (m.onehundred - change3 < 0) || (m.ten - change4 < 0)){
			JOptionPane.showMessageDialog(null,
					"Not enough Money", 
					"Caution", JOptionPane.INFORMATION_MESSAGE);

		}else{
			m.thousand -= change1;
			m.fivehundred -= change2;
			m.onehundred -= change3;
			m.ten -= change4;

			JOptionPane.showMessageDialog(null, 
	                  "1000�� :         "+String.valueOf(change1)+"\n"+
	                  "500�� :      "+String.valueOf(change2)+"\n"+
	                  "100�� :      "+String.valueOf(change3)+"\n"+
	                  "10�� :      "+String.valueOf(change4)+"\n", 
	                  "Change :      ", JOptionPane.INFORMATION_MESSAGE);
		}
	}

}
