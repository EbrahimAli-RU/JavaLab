package main;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Calculator {
	static double a=0,b=0,result=0;
    static int operator=0;
	JFrame f;
	Font fr;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,plus,minus,sub,mul,equal,div,clear,dot,backspace;
	JTextArea t;
	Calculator(){
		f =new JFrame("Calculator");
		fr= new Font("Arial",Font.BOLD,28);
		JPanel text = new JPanel();
		JPanel button = new JPanel(new GridLayout(4,4,4,6));
		JPanel south = new JPanel();
		 t =new JTextArea(2,13);
		// t.setBounds(0, 0, 300, 50);
		 t.setFont(fr);
		 b1 =new JButton("1");
		 b1.setFont(fr);
		 b2 =new JButton("2");
		 b2.setFont(fr);
		 b3 =new JButton("3");b3.setFont(fr);
		 b4 =new JButton("4");b4.setFont(fr);
		 b5 =new JButton("5");b5.setFont(fr);
		 b6 =new JButton("6");b6.setFont(fr);
		 b7 =new JButton("7");b7.setFont(fr);
		 b8 =new JButton("8");b8.setFont(fr);
		 b9 =new JButton("9");b9.setFont(fr);
		 b0 =new JButton("0");b0.setFont(fr);
		 plus =new JButton("+");plus.setFont(fr);
		 minus =new JButton("-");minus.setFont(fr);
		 mul =new JButton("X");mul.setFont(fr);
		 div =new JButton("/");div.setFont(fr);
		 equal =new JButton("=");equal.setFont(fr);
		 dot =new JButton(".");dot.setFont(fr);
		 clear =new JButton("C");clear.setFont(fr);
		//JButton clear1 =new JButton("CE");
		//JButton squar =new JButton("Square");
		 backspace =new JButton("B");backspace.setFont(fr);
		//JButton dot =new JButton(".");
		f.setLayout(new BorderLayout());
		f.add(text,BorderLayout.NORTH);
		f.add(button,BorderLayout.CENTER);
		f.add(south,BorderLayout.SOUTH);
		text.add(t);
		//clear.setBounds(60,380,100,100);
		south.add(clear);south.add(backspace);
		button.add(b7);button.add(b8);button.add(b9);button.add(mul);
		button.add(b4);button.add(b5);button.add(b6);button.add(div);
		button.add(b1);button.add(b2);button.add(b3);button.add(minus);
		button.add(dot);button.add(b0);button.add(equal);button.add(plus);
		
		f.setSize(350,450);
		f.setVisible(true);
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		
	}
	

	public static void main(String args[]) {
		new Calculator
		();
		
		
	}
}