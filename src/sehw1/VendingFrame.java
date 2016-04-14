package sehw1;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.imageio.ImageIO;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class VendingFrame extends JFrame {
	/**
	 * @param machine : machine.java �ȿ� ������ �Լ��� �����ų ��ü
	 *        lblNewLabel_1 : �ٲ�� �ݾ��� �����ϴ� JLabel ����
	 *        image : Jpanel�� �̹����� �����ϱ� ���� ���̴� ����
	 * @author Young Yoon Choi
	 * @brief ������ ��ü ���� �� Frame ����
	 */
	machine machine = null;
	JLabel lblNewLabel_1 = null;
	BufferedImage Image = null;

	public VendingFrame() {
		/**
		 * @param machine : ��ü ����
		 *        Image : ���׸��� ������ ����
		 * @author Young Yoon Choi
		 * @brief JPanel ��濡 image�� �����ϱ� ���� �Լ�, image ũ�� ���� �� panel�� ��������ش�.
		 */
		machine = new machine();
		getContentPane().setLayout(null);
		this.setBounds(0, 0, 1000, 600);
		JPanel panel = new JPanel(){
			public BufferedImage loadNDrawImageFile() {
				try {
					Image = ImageIO.read(getClass().getResource("/sehw1/1333.PNG"));
					} catch (IOException e) {
						e.printStackTrace();
						}
				return Image;
				}
			
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				Graphics2D g2 = (Graphics2D)g;
				g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
						RenderingHints.VALUE_ANTIALIAS_ON);
			    if (loadNDrawImageFile()!=null) {
			    	BufferedImage viewImage = loadNDrawImageFile();         
			        g2.drawImage(viewImage, 0, 0, null);
			        }
			    } 
		};
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 982, 598);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		/**
		 * @param btnNewButton : main ���� �� ������ �� ������ ������ button ����
		 *        machine.inputMoney : machine�� ���� �ִ� public ����, customer�� ���� ���� ǥ�����ִ� ����
		 *        machine.p.be1.count : ù��° ������ ������ ��Ÿ���� ����
		 * @author Young Yoon Choi
		 * @brief vending machine���� ������� �̴� ������ �ϴ� ������ ������ JButton �Լ�
		 *        ������� �ϳ� ������ ������ ������ �ٰ�, inputMoney�� ������ ���ݸ�ŭ ������Ų��.
		 * @exception inputMoney�� ������ ���ݺ��� ������ ����ó�� 
		 *            ������ ������ 0�� �Ǹ� ����ó��
		 */
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(machine.inputMoney < 820){
					JOptionPane.showMessageDialog(null,
							"Not enough Money", 
							"Caution", JOptionPane.INFORMATION_MESSAGE);
				}
				else{
					if(machine.p.be1.count == 0){
						JOptionPane.showMessageDialog(null,
								"Not enough Beverage", 
								"Caution", JOptionPane.INFORMATION_MESSAGE);
					}
					else{
						JOptionPane.showMessageDialog(null, "**�����Ͻ� ���ᰡ ���Խ��ϴ�.**");
						machine.p.be1.ReduceBeverage();
						machine.inputMoney -= 820;
						machine.p.be1.getCount();
					}
				}	
				lblNewLabel_1.setText(Integer.toString(machine.inputMoney));
			}
		});
		btnNewButton.setBounds(40, 147, 100, 150);
		btnNewButton.setIcon(new ImageIcon(VendingFrame.class.getResource("/sehw1/1.PNG")));
		panel.add(btnNewButton);
		
		/**
		 * @param btnNewButton : main ���� �� ������ �� ������ ������ button ����
		 *        machine.inputMoney : machine�� ���� �ִ� public ����, customer�� ���� ���� ǥ�����ִ� ����
		 *        machine.p.be4.count : ù��° ������ ������ ��Ÿ���� ����
		 * @author Young Yoon Choi
		 * @brief vending machine���� ������� �̴� ������ �ϴ� ������ ������ JButton �Լ�
		 *        ������� �ϳ� ������ ������ ������ �ٰ�, inputMoney�� ������ ���ݸ�ŭ ������Ų��.
		 * @exception inputMoney�� ������ ���ݺ��� ������ ����ó�� 
		 *            ������ ������ 0�� �Ǹ� ����ó��
		 */
		JButton button = new JButton("New button");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(machine.inputMoney < 830){
					JOptionPane.showMessageDialog(null,
							"Not enough Money", 
							"Caution", JOptionPane.INFORMATION_MESSAGE);
				}
				else{
					if(machine.p.be4.count == 0){
						JOptionPane.showMessageDialog(null,
								"Not enough Beverage", 
								"Caution", JOptionPane.INFORMATION_MESSAGE);
					}
					else{
						JOptionPane.showMessageDialog(null, "**�����Ͻ� ���ᰡ ���Խ��ϴ�.**");
						machine.p.be4.ReduceBeverage();
						machine.inputMoney -= 830;
						machine.p.be4.getCount();
					}
				}
				lblNewLabel_1.setText(Integer.toString(machine.inputMoney));
			}
		});
		button.setBounds(156, 147, 100, 150);
		button.setIcon(new ImageIcon(VendingFrame.class.getResource("/sehw1/2.PNG")));
		panel.add(button);
		
		/**
		 * @param btnNewButton : main ���� �� ������ �� ������ ������ button ����
		 *        machine.inputMoney : machine�� ���� �ִ� public ����, customer�� ���� ���� ǥ�����ִ� ����
		 *        machine.p.be3.count : ù��° ������ ������ ��Ÿ���� ����
		 * @author Young Yoon Choi
		 * @brief vending machine���� ������� �̴� ������ �ϴ� ������ ������ JButton �Լ�
		 *        ������� �ϳ� ������ ������ ������ �ٰ�, inputMoney�� ������ ���ݸ�ŭ ������Ų��.
		 * @exception inputMoney�� ������ ���ݺ��� ������ ����ó�� 
		 *            ������ ������ 0�� �Ǹ� ����ó��
		 */
		JButton button_1 = new JButton("New button");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(machine.inputMoney < 560){
					JOptionPane.showMessageDialog(null,
							"Not enough Money", 
							"Caution", JOptionPane.INFORMATION_MESSAGE);
				}
				else{
					if(machine.p.be3.count == 0){
						JOptionPane.showMessageDialog(null,
								"Not enough Beverage", 
								"Caution", JOptionPane.INFORMATION_MESSAGE);
					}
					else{
						JOptionPane.showMessageDialog(null, "**�����Ͻ� ���ᰡ ���Խ��ϴ�.**");
						machine.p.be3.ReduceBeverage();
						machine.inputMoney -= 560;
						machine.p.be3.getCount();
					}
				}
				lblNewLabel_1.setText(Integer.toString(machine.inputMoney));
			}
		});
		button_1.setBounds(274, 147, 100, 150);
		button_1.setIcon(new ImageIcon(VendingFrame.class.getResource("/sehw1/3.PNG")));
		panel.add(button_1);
		
		/**
		 * @param btnNewButton : main ���� �� ������ �� ������ ������ button ����
		 *        machine.inputMoney : machine�� ���� �ִ� public ����, customer�� ���� ���� ǥ�����ִ� ����
		 *        machine.p.be5.count : ù��° ������ ������ ��Ÿ���� ����
		 * @author Young Yoon Choi
		 * @brief vending machine���� ������� �̴� ������ �ϴ� ������ ������ JButton �Լ�
		 *        ������� �ϳ� ������ ������ ������ �ٰ�, inputMoney�� ������ ���ݸ�ŭ ������Ų��.
		 * @exception inputMoney�� ������ ���ݺ��� ������ ����ó�� 
		 *            ������ ������ 0�� �Ǹ� ����ó��
		 */
		JButton button_2 = new JButton("New button");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(machine.inputMoney < 420){
					JOptionPane.showMessageDialog(null,
							"Not enough Money", 
							"Caution", JOptionPane.INFORMATION_MESSAGE);
				}
				else{
					if(machine.p.be5.count == 0){
						JOptionPane.showMessageDialog(null,
								"Not enough Beverage", 
								"Caution", JOptionPane.INFORMATION_MESSAGE);
					}
					else{
						JOptionPane.showMessageDialog(null, "**�����Ͻ� ���ᰡ ���Խ��ϴ�.**");
						machine.p.be5.ReduceBeverage();
						machine.inputMoney -= 420;
						machine.p.be5.getCount();
					}
				}
				lblNewLabel_1.setText(Integer.toString(machine.inputMoney));
			}
		});
		button_2.setBounds(394, 147, 100, 150);
		button_2.setIcon(new ImageIcon(VendingFrame.class.getResource("/sehw1/4.PNG")));
		panel.add(button_2);
		
		/**
		 * @param btnNewButton : main ���� �� ������ �� ������ ������ button ����
		 *        machine.inputMoney : machine�� ���� �ִ� public ����, customer�� ���� ���� ǥ�����ִ� ����
		 *        machine.p.be2.count : ù��° ������ ������ ��Ÿ���� ����
		 * @author Young Yoon Choi
		 * @brief vending machine���� ������� �̴� ������ �ϴ� ������ ������ JButton �Լ�
		 *        ������� �ϳ� ������ ������ ������ �ٰ�, inputMoney�� ������ ���ݸ�ŭ ������Ų��.
		 * @exception inputMoney�� ������ ���ݺ��� ������ ����ó�� 
		 *            ������ ������ 0�� �Ǹ� ����ó��
		 */
		JButton button_3 = new JButton("New button");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(machine.inputMoney < 930){
					JOptionPane.showMessageDialog(null,
							"Not enough Money", 
							"Caution", JOptionPane.INFORMATION_MESSAGE);
				}
				else{
					if(machine.p.be2.count == 0){
						JOptionPane.showMessageDialog(null,
								"Not enough Beverage", 
								"Caution", JOptionPane.INFORMATION_MESSAGE);
					}
					else{
						JOptionPane.showMessageDialog(null, "**�����Ͻ� ���ᰡ ���Խ��ϴ�.**");
						machine.p.be2.ReduceBeverage();
						machine.inputMoney -= 930;
						machine.p.be2.getCount();
					}
				}
				lblNewLabel_1.setText(Integer.toString(machine.inputMoney));
			}
		});
		button_3.setBounds(510, 147, 100, 150);
		button_3.setIcon(new ImageIcon(VendingFrame.class.getResource("/sehw1/5.PNG")));
		panel.add(button_3);
		
		/**
		 * @author Young Yoon Choi
		 * @brief Label�� ����� ���� Panel ����
		 */
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(30, 307, 110, 35);
		panel_1.setBackground(Color.RED);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		/**
		 * @param 1b1NewLabel : ������ ������ ��Ÿ�� Label ����
		 * @author Young Yoon Choi
		 * @brief ������� ������ ��Ÿ���� ���� Label ����
		 */
		JLabel lblNewLabel = new JLabel("820\uC6D0");
		lblNewLabel.setForeground(new Color(30, 144, 255));
		lblNewLabel.setFont(new Font("HY�߰��", Font.BOLD, 18));
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 5, 110, 30);
		panel_1.add(lblNewLabel);
		
		/**
		 * @author Young Yoon Choi
		 * @brief Button�� ����� ���� Panel ����
		 */
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(766, 173, 204, 123);
		panel.add(panel_6);
		panel_6.setLayout(null);
		
		/**
		 * @author Young Yoon Choi
		 * @param btnNewButton_1 : ���ο� Button�� ������ ����
		 * @brief ���� ���Ա��� ���� �Һ��ڰ� ���� �ִ� ������ �� �� �ִ� Button ����
		 */
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg = JOptionPane.showInputDialog("**���� �����Ͻÿ�.**");
				machine.InputThousandwon(Integer.parseInt(msg));
				lblNewLabel_1.setText(Integer.toString(machine.inputMoney));
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(VendingFrame.class.getResource("/sehw1/11.PNG")));
		btnNewButton_1.setBounds(12, 5, 180, 110);
		panel_6.add(btnNewButton_1);
		
		/**
		 * @author Young Yoon Choi
		 * @brief Label�� ����� ���� Panel ����
		 */
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(146, 307, 110, 35);
		panel_2.setLayout(null);
		panel_2.setBackground(Color.RED);
		panel.add(panel_2);
		
		/**
		 * @param label : ������ ������ ��Ÿ�� Label ����
		 * @author Young Yoon Choi
		 * @brief ������� ������ ��Ÿ���� ���� Label ����
		 */
		JLabel label = new JLabel("830\uC6D0");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(new Color(30, 144, 255));
		label.setFont(new Font("HY�߰��", Font.BOLD, 18));
		label.setBackground(Color.BLACK);
		label.setBounds(0, 5, 110, 30);
		panel_2.add(label);
		
		/**
		 * @author Young Yoon Choi
		 * @brief Label�� ����� ���� Panel ����
		 */
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(264, 307, 110, 35);
		panel_3.setLayout(null);
		panel_3.setBackground(Color.RED);
		panel.add(panel_3);
		
		/**
		 * @param label_1 : ������ ������ ��Ÿ�� Label ����
		 * @author Young Yoon Choi
		 * @brief ������� ������ ��Ÿ���� ���� Label ����
		 */
		JLabel label_1 = new JLabel("560\uC6D0");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(new Color(30, 144, 255));
		label_1.setFont(new Font("HY�߰��", Font.BOLD, 18));
		label_1.setBackground(Color.BLACK);
		label_1.setBounds(0, 5, 110, 30);
		panel_3.add(label_1);
		
		/**
		 * @author Young Yoon Choi
		 * @brief Label�� ����� ���� Panel ����
		 */
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(384, 307, 110, 35);
		panel_4.setLayout(null);
		panel_4.setBackground(Color.RED);
		panel.add(panel_4);
		
		/**
		 * @param label_2 : ������ ������ ��Ÿ�� Label ����
		 * @author Young Yoon Choi
		 * @brief ������� ������ ��Ÿ���� ���� Label ����
		 */
		JLabel label_2 = new JLabel("420\uC6D0");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(new Color(30, 144, 255));
		label_2.setFont(new Font("HY�߰��", Font.BOLD, 18));
		label_2.setBackground(Color.BLACK);
		label_2.setBounds(0, 5, 110, 30);
		panel_4.add(label_2);
		
		/**
		 * @author Young Yoon Choi
		 * @brief Label�� ����� ���� Panel ����
		 */
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(500, 307, 110, 35);
		panel_5.setLayout(null);
		panel_5.setBackground(Color.RED);
		panel.add(panel_5);
		
		/**
		 * @param label_3 : ������ ������ ��Ÿ�� Label ����
		 * @author Young Yoon Choi
		 * @brief ������� ������ ��Ÿ���� ���� Label ����
		 */
		JLabel label_3 = new JLabel("930\uC6D0");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setForeground(new Color(30, 144, 255));
		label_3.setFont(new Font("HY�߰��", Font.BOLD, 18));
		label_3.setBackground(Color.BLACK);
		label_3.setBounds(0, 5, 110, 30);
		panel_5.add(label_3);
		
		/**
		 * @author Young Yoon Choi
		 * @brief Button�� ����� ���� Panel ����
		 */
		JPanel panel_7 = new JPanel();
		panel_7.setBounds(766, 307, 204, 123);
		panel_7.setLayout(null);
		panel.add(panel_7);
		
		/**
		 * @author Young Yoon Choi
		 * @param msg : JOptionPane�� ���� ������ ������ String ����
		 *        msg2 : JOptionPane�� ���� ������ ������ String ����
		 *        Integer.parseInt(msg) : msg ������ int�� ��ȯ��Ű�� method
		 *        Integer.parseInt(msg2) : msg2 ������ int�� ��ȯ��Ű�� method
		 * @brief ���õ� ����, �׸��� ������ ������ ���� �Һ��ڰ� �ִ� ���� �ٲٴ� ������ �ϴ� Button ����
		 */
		JButton button_4 = new JButton("New button");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg = JOptionPane.showInputDialog("**������ �����Ͻÿ�. (500 / 100 / 10)**");
				String msg2 = JOptionPane.showInputDialog("**�� �� �����ðڽ��ϱ�?**");
				if(Integer.parseInt(msg) == 500){
					machine.InputFivehundredwon(Integer.parseInt(msg2));
					lblNewLabel_1.setText(Integer.toString(machine.inputMoney));
				}
				else if(Integer.parseInt(msg) == 100){
					machine.InputOnehundredwon(Integer.parseInt(msg2));
					lblNewLabel_1.setText(Integer.toString(machine.inputMoney));
				}
				else{
					machine.InputTenwon(Integer.parseInt(msg2));
					lblNewLabel_1.setText(Integer.toString(machine.inputMoney));
				}
			}
		});
		button_4.setIcon(new ImageIcon(VendingFrame.class.getResource("/sehw1/213.PNG")));
		button_4.setBounds(12, 5, 180, 110);
		panel_7.add(button_4);
		
		/**
		 * @author Young Yoon Choi
		 * @brief Button�� ����� ���� Panel ����
		 */
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(766, 440, 204, 123);
		panel_8.setLayout(null);
		panel.add(panel_8);
		
		/**
		 * @author Young Yoon Choi
		 * @param button_5 : Button ����
		 * @brief �Һ��ڿ��� ���� ����ŭ�� �ܵ����� ��ȯ���ִ� Button ����
		 */
		JButton button_5 = new JButton("New button");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				machine.ReturnMoney();
				lblNewLabel_1.setText(Integer.toString(machine.inputMoney));
			}
		});
		button_5.setIcon(new ImageIcon(VendingFrame.class.getResource("/sehw1/4443.PNG")));
		button_5.setBounds(12, 5, 180, 110);
		panel_8.add(button_5);
		
		/**
		 * @author Young Yoon Choi
		 * @param lblNewLabel_1 : label ����
		 * @brief �Һ��ڰ� ���� �󸶳� �־������� �����ִ� Label ����
		 */
		lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setBackground(new Color(173, 255, 47));
		lblNewLabel_1.setFont(new Font("HY�߰��", Font.BOLD, 18));
		lblNewLabel_1.setText(Integer.toString(machine.inputMoney));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(766, 65, 204, 79);
		panel.add(lblNewLabel_1);
		
		/**
		 * @author Young Yoon Choi
		 * @brief Button�� ����� ���� Panel ����
		 */
		JPanel panel_9 = new JPanel();
		panel_9.setBounds(30, 352, 110, 35);
		panel.add(panel_9);
		
		/**
		 * @author Young Yoon Choi
		 * @param btnNewButton_2 : reset Button ����
		 * @brief ����(be1)�� �� �������� ������ ������ �������ϴ� Button ����
		 */
		JButton btnNewButton_2 = new JButton("reset");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "**���ᰡ ���� �Ǿ����ϴ�.**");
				machine.p.be1.ResetBeverage();
				lblNewLabel_1.setText(Integer.toString(machine.inputMoney));
			}
		});
		panel_9.add(btnNewButton_2);
		
		/**
		 * @author Young Yoon Choi
		 * @brief Button�� ����� ���� Panel ����
		 */
		JPanel panel_10 = new JPanel();
		panel_10.setBounds(146, 352, 110, 35);
		panel.add(panel_10);
		
		/**
		 * @author Young Yoon Choi
		 * @param btnNewButton_2 : reset Button ����
		 * @brief ����(be4)�� �� �������� ������ ������ �������ϴ� Button ����
		 */
		JButton button_6 = new JButton("reset");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "**���ᰡ ���� �Ǿ����ϴ�.**");
				machine.p.be4.ResetBeverage();
				lblNewLabel_1.setText(Integer.toString(machine.inputMoney));
			}
		});
		panel_10.add(button_6);
		
		/**
		 * @author Young Yoon Choi
		 * @brief Button�� ����� ���� Panel ����
		 */
		JPanel panel_11 = new JPanel();
		panel_11.setBounds(264, 352, 110, 35);
		panel.add(panel_11);
		
		/**
		 * @author Young Yoon Choi
		 * @param btnNewButton_2 : reset Button ����
		 * @brief ����(be3)�� �� �������� ������ ������ �������ϴ� Button ����
		 */
		JButton button_7 = new JButton("reset");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "**���ᰡ ���� �Ǿ����ϴ�.**");
				machine.p.be3.ResetBeverage();
				lblNewLabel_1.setText(Integer.toString(machine.inputMoney));
			}
		});
		panel_11.add(button_7);
		
		/**
		 * @author Young Yoon Choi
		 * @brief Button�� ����� ���� Panel ����
		 */
		JPanel panel_12 = new JPanel();
		panel_12.setBounds(384, 352, 110, 35);
		panel.add(panel_12);
		
		/**
		 * @author Young Yoon Choi
		 * @param btnNewButton_2 : reset Button ����
		 * @brief ����(be5)�� �� �������� ������ ������ �������ϴ� Button ����
		 */
		JButton button_8 = new JButton("reset");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "**���ᰡ ���� �Ǿ����ϴ�.**");
				machine.p.be5.ResetBeverage();
				lblNewLabel_1.setText(Integer.toString(machine.inputMoney));
			}
		});
		panel_12.add(button_8);
		
		/**
		 * @author Young Yoon Choi
		 * @brief Button�� ����� ���� Panel ����
		 */
		JPanel panel_13 = new JPanel();
		panel_13.setBounds(500, 352, 110, 35);
		panel.add(panel_13);
		
		/**
		 * @author Young Yoon Choi
		 * @param btnNewButton_2 : reset Button ����
		 * @brief ����(be2)�� �� �������� ������ ������ �������ϴ� Button ����
		 */
		JButton button_9 = new JButton("reset");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "**���ᰡ ���� �Ǿ����ϴ�.**");
				machine.p.be2.ResetBeverage();
				lblNewLabel_1.setText(Integer.toString(machine.inputMoney));
			}
		});
		panel_13.add(button_9);
		
		/**
		 * @author Young Yoon Choi
		 * @brief Button�� ����� ���� Panel ����
		 */
		JPanel panel_14 = new JPanel();
		panel_14.setBounds(622, 204, 128, 137);
		panel.add(panel_14);
		panel_14.setLayout(null);
		
		/**
		 * @author Young Yoon Choi
		 * @param btnNewButton_3 : Button ����
		 *        msg : JOptionPane�� ���� ������ ������ String ����
		 *        msg2 : JOptionPane�� ���� ������ ������ String ����
		 *        Integer.parseInt(msg) : msg ������ int�� ��ȯ��Ű�� method
		 *        Integer.parseInt(msg2) : msg2 ������ int�� ��ȯ��Ű�� method
		 * @brief �� ������ ȭ�� ����, ������ ���� �� ���� �� ������ ������ŭ Vending Machine�� �����ϴ� Button ����
		 */
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg = JOptionPane.showInputDialog("**�����Ͻ� ���� �����Ͻÿ�."
						+ " (1000 / 500 / 100 / 10)**");
				String msg2 = JOptionPane.showInputDialog("**�� �� �����ðڽ��ϱ�?**");
				if(Integer.parseInt(msg) == 1000){
					machine.m.ResetThousand(Integer.parseInt(msg2));
					lblNewLabel_1.setText(Integer.toString(machine.inputMoney));
				}
				else if(Integer.parseInt(msg) == 500){
					machine.m.ResetFivehundred(Integer.parseInt(msg2));
					lblNewLabel_1.setText(Integer.toString(machine.inputMoney));
				}
				else if(Integer.parseInt(msg) == 100){
					machine.m.ResetOnehundred(Integer.parseInt(msg2));
					lblNewLabel_1.setText(Integer.toString(machine.inputMoney));
				}else{
					machine.m.ResetTen(Integer.parseInt(msg2));
					lblNewLabel_1.setText(Integer.toString(machine.inputMoney));
				}
			}
		});
		btnNewButton_3.setIcon(new ImageIcon(VendingFrame.class.getResource("/sehw1/445556.PNG")));
		btnNewButton_3.setBounds(12, 5, 104, 122);
		panel_14.add(btnNewButton_3);
	}
}
	

