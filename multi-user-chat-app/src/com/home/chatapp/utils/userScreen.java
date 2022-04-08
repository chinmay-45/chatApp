package com.home.chatapp.utils;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class userScreen extends JFrame{
	private JTextField usid;
	private JPasswordField pass;

	
	public static void main(String[] args) {
		
					userScreen window = new userScreen();
				
			
	}
	private void register() {
		String user=usid.getText();
		char [] passw=pass.getPassword();
		
	}

	
	public userScreen() {
		getContentPane().setFont(new Font("Arial", Font.BOLD, 15));
		setResizable(false);
		setTitle("login");
		setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("login");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 40));
		lblNewLabel.setBounds(241, 32, 105, 48);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("userId");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_1.setBounds(80, 137, 70, 32);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 17));
		lblNewLabel_2.setBounds(80, 179, 105, 40);
		getContentPane().add(lblNewLabel_2);
		
		JButton loginbt = new JButton("login");
		loginbt.setFont(new Font("Arial", Font.BOLD, 16));
		loginbt.setBounds(147, 229, 127, 48);
		getContentPane().add(loginbt);
		
		JButton registerbt = new JButton("register");
		registerbt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		registerbt.setFont(new Font("Arial", Font.BOLD, 16));
		registerbt.setBounds(306, 229, 127, 48);
		getContentPane().add(registerbt);
		
		usid = new JTextField();
		usid.setBounds(198, 146, 234, 23);
		getContentPane().add(usid);
		usid.setColumns(10);
		
		pass = new JPasswordField();
		pass.setBounds(199, 190, 234, 23);
		getContentPane().add(pass);
		setBounds(100, 100, 565, 448);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
}
