package sehw1;

import javax.swing.JOptionPane;

/**
 * @param count : 음료의 갯수
 *        price : 음료의 가격
 *        name : 음료의 이름
 * @author Young Yoon Choi
 * @brief 음료의 정보를 생성해준 Class, 생성자 함수를 구현하고, 소비자가 음료를 선택할 때마다 음료의 갯수를 감소시키는
 *        함수, 현재 남아있는 음료의 갯수 그리고 음료의 갯수를 초기화해주는 함수를 구현하였다. 
 */
public class beverage{
	
	int count;
	int price;
	String name;
	
	// 생성자 method
	public beverage(int count, int price, String name){
		this.count = count;
		this.price = price;
		this.name = name;
	}
	
	// 음료를 선택할 때마다 음료의 갯수를 줄이는 함수
	public void ReduceBeverage(){
		count--;
	}
	
	// 현재 남은 음료의 갯수를 보여주는 함수
	public void getCount(){
		JOptionPane.showMessageDialog(null, 
                "남은 음료의 갯수 :         "+String.valueOf(count)+"\n",
                "Change :      ", JOptionPane.INFORMATION_MESSAGE);
	}
	
	// 음료의 갯수 초기화
	public void ResetBeverage(){
		count = 30;
	}
	
}