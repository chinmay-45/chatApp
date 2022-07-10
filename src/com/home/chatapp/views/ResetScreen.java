//package com.home.chatapp.views;
//
//import java.awt.BorderLayout;
//import java.awt.EventQueue;
//
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//import javax.swing.border.EmptyBorder;
//
//import com.home.chatapp.dao.UserDAO;
//
//import javax.swing.JButton;
//import javax.swing.JTextField;
//import javax.swing.JLabel;
//import javax.swing.JOptionPane;
//
//import java.awt.Font;
//import java.security.NoSuchAlgorithmException;
//import java.sql.SQLException;
//
//import javax.swing.JPasswordField;
//import java.awt.event.ActionListener;
//import java.awt.event.ActionEvent;
//
//public class ResetScreen extends JFrame {
//
//	private JPanel contentPane;
//	private JTextField usid;
//	private JPasswordField passw;
//   
//	
//	
//	private void passReset() {
//		String userid=usid.getText();
//		char[] pass=passw.getPassword();
//		
//		UserDAO userDAO=new UserDAO();
//		try {
//			if(userDAO.reset(userid, new String(pass))==1) {
//				JOptionPane.showMessageDialog(this, "Password reset Succesfully");
//				dispose();
//			}
//			else {
//				JOptionPane.showMessageDialog(this, "Sorry wrong no matching userid");
//			}
//			
//		}
//		catch(ClassNotFoundException | NoSuchAlgorithmException | SQLException e) {
//			e.printStackTrace();
//			
//		}
//		
//		
//		
//		
//	}
//	
//
//	public ResetScreen() {
//		setTitle("ResetScreen");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(100, 100, 765, 456);
//		contentPane = new JPanel();
//		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//		setContentPane(contentPane);
//		contentPane.setLayout(null);
//		
//		JButton btnNewButton = new JButton("Change Password");
//		btnNewButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				passReset();
//			}
//		});
//		btnNewButton.setFont(new Font("Arial", Font.BOLD, 16));
//		btnNewButton.setBounds(265, 314, 215, 37);
//		contentPane.add(btnNewButton);
//		
//	
//		
//		usid = new JTextField();
//		usid.setBounds(236, 143, 244, 30);
//		contentPane.add(usid);
//		usid.setColumns(10);
//		
//		JLabel lblNewLabel = new JLabel("Enter userID and new pass or just enter userid and press reset to delete Id ");
//		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 14));
//		lblNewLabel.setBounds(119, 36, 584, 55);
//		contentPane.add(lblNewLabel);
//		
//		JLabel userid = new JLabel("UserId");
//		userid.setFont(new Font("Arial", Font.BOLD, 16));
//		userid.setBounds(97, 137, 74, 37);
//		contentPane.add(userid);
//		
//		JLabel pass = new JLabel("New Password");
//		pass.setFont(new Font("Arial", Font.BOLD, 16));
//		pass.setBounds(97, 217, 142, 37);
//		contentPane.add(pass);
//		
//		passw = new JPasswordField();
//		passw.setBounds(236, 217, 244, 30);
//		contentPane.add(passw);
//	}
//}
