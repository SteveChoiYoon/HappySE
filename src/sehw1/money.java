package sehw1;

/**
 * @param resetmoney : 부족한 돈을 충전하기 위한 변수, resetmoney만큼 돈을 충전시킨다.
 *        thousand : 1000원 짜리 지폐
 *        fivehundred : 500원 짜리 동전
 *        onehundred : 100원 짜리 동전
 *        ten : 10원 짜리 동전 
 * @author Young Yoon Choi
 * @brief Vending Machine이 갖고 있는 돈을 나타내기 위한 Class, 생성자 및 돈을 충전하는 함수를 구현해주었다. 
 */
public class money {
	
	int resetmoney;
	int thousand = 20;
	int fivehundred = 20;
	int onehundred = 20;
	int ten = 20;	
	
	// 돈의 종류에 따라 충전하는 함수 구현
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
