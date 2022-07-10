package com.home.chatapp.views;

import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.home.chatapp.DTO.UserDTO;
import com.home.chatapp.dao.UserDAO;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.DropMode;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class RegisterScreen extends JFrame {
	private JTextField usid;
	private JTextField pass;
	private JPasswordField passw;
	private JTextField em;
	
	
	private void register() {
		String user=usid.getText();
		
		char[] pass=passw.getPassword();
		UserDTO userdto=new UserDTO(user,pass);	
		UserDAO userDAO=new UserDAO();
		try {
			int res=userDAO.add(userdto);
			if(res>0) {
				JOptionPane.showMessageDialog(this, "Registered Successfully");
				setVisible(false);
				dispose();
			}
		}
		catch(ClassNotFoundException | SQLException sq) {
			JOptionPane.showMessageDialog(this, "Some db exception occured");
			sq.printStackTrace();
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

	public RegisterScreen() {
		
		getContentPane().setFont(new Font("Arial", Font.BOLD, 15));
		setResizable(false);
		setTitle("Register Screen");
		setSize(776,452);
		setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("User-ID");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel.setBounds(119, 98, 93, 27);
		getContentPane().add(lblNewLabel);
		
		usid = new JTextField();
		usid.setBounds(255, 95, 266, 37);
		getContentPane().add(usid);
		usid.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_1.setBounds(119, 176, 116, 27);
		getContentPane().add(lblNewLabel_1);
		
		
		JLabel lblNewLabel_2 = new JLabel("Email");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_2.setBounds(119, 253, 72, 19);
		getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				register();
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 18));
		btnNewButton.setBounds(300, 311, 132, 46);
		getContentPane().add(btnNewButton);
		
		passw = new JPasswordField();
		passw.setBounds(255, 173, 266, 37);
		getContentPane().add(passw);
		
		em = new JTextField();
		em.setBounds(255, 253, 266, 37);
		getContentPane().add(em);
		em.setColumns(10);
		
	}
}
