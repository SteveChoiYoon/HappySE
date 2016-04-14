package sehw1;

/**
 * @param resetmoney : ������ ���� �����ϱ� ���� ����, resetmoney��ŭ ���� ������Ų��.
 *        thousand : 1000�� ¥�� ����
 *        fivehundred : 500�� ¥�� ����
 *        onehundred : 100�� ¥�� ����
 *        ten : 10�� ¥�� ���� 
 * @author Young Yoon Choi
 * @brief Vending Machine�� ���� �ִ� ���� ��Ÿ���� ���� Class, ������ �� ���� �����ϴ� �Լ��� �������־���. 
 */
public class money {
	
	int resetmoney;
	int thousand = 20;
	int fivehundred = 20;
	int onehundred = 20;
	int ten = 20;	
	
	// ���� ������ ���� �����ϴ� �Լ� ����
	public void ResetThousand(int resetmoney){
		thousand += resetmoney;
	}
	
	public void ResetFivehundred(int resetmoney){
		fivehundred += resetmoney;
	}
	
	public void ResetOnehundred(int resetmoney){
		onehundred += resetmoney;
	}
	
	public void ResetTen(int resetmoney){
		ten += resetmoney;
	}
}
