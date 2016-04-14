package sehw1;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				try{
					VendingFrame frame = new VendingFrame();
					frame.setVisible(true);
					}
				catch(Exception e)
				{
					e.printStackTrace();
					}
				}
			});
		}

}

