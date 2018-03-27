package project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Frame;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.*;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JComboBox;

public class login extends JFrame {
	public static JButton can;
	private JPanel contentPane;
	private JTextField usertxt;
	private JPasswordField passtxt;
	private JLabel labe;
	public static login fra;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args)throws NullPointerException {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 fra = new login();
					fra.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	Connection connect=null;
	/**
	 * Create the frame.
	 */
	public login() {
		
		connect=Dbase.dbconnector();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel user = new JLabel("user:");
		user.setFont(new Font("Tahoma", Font.PLAIN, 15));
		user.setBounds(57, 73, 72, 21);
		contentPane.add(user);
		
		usertxt = new JTextField();
		usertxt.setBounds(95, 75, 148, 20);
		contentPane.add(usertxt);
		usertxt.setColumns(10);
		
		passtxt = new JPasswordField();
		passtxt.setBounds(95, 114, 148, 21);
		contentPane.add(passtxt);
		
		JLabel password = new JLabel("password");
		password.setFont(new Font("Tahoma", Font.PLAIN, 14));
		password.setBounds(27, 114, 65, 21);
		contentPane.add(password);
		
		JButton next = new JButton("Next");
		next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("hello");
				try {
					String query="select * from details where name=? and password=?";
					PreparedStatement pst=connect.prepareStatement(query);
					pst.setString(1, usertxt.getText());
					pst.setString(2, passtxt.getText());
					ResultSet rst=pst.executeQuery();
					int count=0;
					
					while(rst.next()){
						count++;
						}
				if(count==1)
			   {
				System.out.println("login sucess");
				User user=new User();
				user.setVisible(true);
				
			}
				else{
					//frame.Dispose;
					 labe = new JLabel("ENTER VALID CREDENTIALS");
					labe.setForeground(Color.RED);
					labe.setBounds(95, 146, 183, 14);
					contentPane.add(labe);
					//JOptionPane.showMessageDialog(null, "PLEASE ENTER CORRECT CREDENTIALS");
					//login.setVisible
				     fra=new login();
				    fra.setVisible(true);
				    fra.getContentPane().add(labe);
				}
					rst.close();
					pst.close();
				//	connect.close();
					
				} catch (Exception e) {
					System.out.println(e);
					e.printStackTrace();
				}
				
			}
		});
		next.setBounds(90, 182, 89, 23);
		contentPane.add(next);
		
		 can = new JButton("cancel");
	can.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			fra.setVisible(false);
			}
		});
		can.setBounds(189, 182, 89, 23);
		contentPane.add(can);
		String gu[]={"select","male","female"};
		
	
		}
	
	public  void invi(){
		fra.setVisible(false);
	}
}
