package sehw1;

import javax.swing.JOptionPane;

/**
 * @param inputMoney : 소비자가 넣은 돈을 표시하기 위한 변수
 *        countNum : countNum에 따라 Vending Machine의 돈과 inputMoney가 갱신된다.
 *        change1, change2, change3, change4 : 잔돈반환 함수구현을 위한 변수, 돈의 종류에 따른 갯수 
 * @author Young Yoon Choi
 * @brief 돈이 투입되면 vending machine 내부의 돈과 소비자가 넣은 돈이 모두 갱신되고, 예외처리를 통해
 *        남은 돈을 소비자에게 반환해주는 함수를 구현한 Class
 * @exception Vending Machine에 남은 돈이 잔돈보다 적을 경우 오류처리
 */
public class machine {
	
	product p = new product();
	money m = new money();
	int inputMoney;

	// 투입된 돈에 따라 각각의 변수들을 모두 갱신시켜준다. 
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
	
	// 잔돈을 반환해주는 함수 
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
		
		// 예외처리
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
	                  "1000원 :         "+String.valueOf(change1)+"\n"+
	                  "500원 :      "+String.valueOf(change2)+"\n"+
	                  "100원 :      "+String.valueOf(change3)+"\n"+
	                  "10원 :      "+String.valueOf(change4)+"\n", 
	                  "Change :      ", JOptionPane.INFORMATION_MESSAGE);
		}
	}

}
