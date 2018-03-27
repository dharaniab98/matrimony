package project;
import java.sql.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.event.*;

/*import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;*/

public class register extends JFrame {
    private JComboBox relig;
    private JComboBox educ;
    private JRadioButton male;
	private JPanel contentPane;
	private JTextField names;
	 private JComboBox regi;
    private JTextField ager;
    private JTextField mob;
    private JComboBox gen;
    private JLabel mssg;
    private static register fra;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 fra = new register();
					fra.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */Connection conne;
	private JTextField passw;
	public register() {
		conne=Dbase.dbconnector();
		setBackground(Color.BLUE);
		setTitle("registrationforn");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 541, 498);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NAME");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(44, 39, 46, 14);
		contentPane.add(lblNewLabel);
		
		names = new JTextField();
		//namer=names.getText();
		names.setFont(new Font("Tahoma", Font.PLAIN, 14));
		names.setBounds(133, 35, 217, 23);
		contentPane.add(names);
		names.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("DOB");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(44, 104, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("RELIGION");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(44, 215, 60, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("REGION");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(44, 258, 60, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("EDUCATION");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(44, 307, 75, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("MOBILE");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(44, 350, 60, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(44, 332, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("GENDER");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_7.setBounds(44, 178, 60, 14);
		contentPane.add(lblNewLabel_7);
		
		JButton btnNewButton = new JButton("NEXT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			//String x=
			try{
				
				//String query="insert into register (name,age,gender,religion,region,education,mobile,password) values (?,?,?,?,?,?,?,?)";
				String query="insert into details (name,age,gender,religion,region,education,mobile,password) values(?,?,?,?,?,?,?,?)";
				PreparedStatement pst=conne.prepareStatement(query);
				pst.setString(1, names.getText());
				pst.setString(2, ager.getText());
				pst.setString(3, String.valueOf(gen.getSelectedItem()));
				
				pst.setString(4, String.valueOf(relig.getSelectedItem()));
				pst.setString(5, String.valueOf(regi.getSelectedItem()));
				pst.setString(6, String.valueOf(educ.getSelectedItem()));
				pst.setString(7, mob.getText());
				pst.setString(8, passw.getText());
				pst.execute();
		
				
				//conne.close();
			JOptionPane.showMessageDialog(null, "registerd sucessfully");
			}
			catch(Exception e){
				System.out.println(e);
				mssg = new JLabel(" FILL ALL THE DETAILS TO REGISTER OR TRY WITH ANOTHER USERNAME");
				mssg.setFont(new Font("Tahoma", Font.PLAIN, 16));
				mssg.setForeground(Color.RED);
				mssg.setBounds(133, 378, 312, 14);
				fra=new register();
				contentPane.add(mssg);
				fra.setVisible(true);
				 fra.getContentPane().add(mssg);
			}
			
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(198, 399, 89, 23);
		contentPane.add(btnNewButton);
		
		
		String[] day_arr=new String[31];
	      for(int i=1;i<=31;i++)
	       day_arr[i-1]=Integer.toString(i);
		
		JComboBox day = new JComboBox(day_arr);
		day.setFont(new Font("Tahoma", Font.PLAIN, 14));
		day.setBounds(133, 104, 60, 22);
		contentPane.add(day);
		 String[] month_arr={"jan","feb","mar","apr","may","jun","jul","aug","sep","oct","nov","dec"};
		JComboBox month = new JComboBox(month_arr);
		month.setFont(new Font("Tahoma", Font.PLAIN, 14));
		month.setBounds(214, 105, 60, 20);
		contentPane.add(month);
		
		  int j=1950;
		  String[] year_arr=new String[70]; 
		    for(int i=1;i<=50;i++)
		    {
	          year_arr[i-1]=Integer.toString(j);
	            j++;
		    }
		
		JComboBox year = new JComboBox(year_arr);
		year.setBounds(295, 107, 55, 20);
		contentPane.add(year);
		
		
		 String[] reli={"select","hindu","muslim","christian","doesn'tmatter"};
		 relig = new JComboBox(reli);
		//System.out.println(String.valueOf(relig.getSelectedItem());
		relig.setFont(new Font("Tahoma", Font.PLAIN, 14));
		relig.setBounds(133, 214, 217, 20);
		contentPane.add(relig);
		
		String[] edu={"select","bachelors","masters","doctorate","diploma","undergraduate","highschool","no schooling"};
		 educ = new JComboBox(edu);
		educ.setFont(new Font("Tahoma", Font.PLAIN, 14));
		educ.setBounds(143, 306, 207, 20);
		contentPane.add(educ);
		
		
		String[] caste={"select","andhrapradesh","karnataka","tamilnadu","kerala","maharastra","punjab","telangana"};
		 regi = new JComboBox(caste);
		regi.setFont(new Font("Tahoma", Font.PLAIN, 14));
		regi.setBounds(133, 257, 217, 20);
		contentPane.add(regi);
		
		JLabel lblNewLabel_8 = new JLabel("AGE");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_8.setBounds(44, 142, 46, 14);
		contentPane.add(lblNewLabel_8);
		
		ager = new JTextField();
		ager.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ager.setBounds(133, 137, 217, 22);
		contentPane.add(ager);
		ager.setColumns(10);
		
		mob = new JTextField();
		mob.setFont(new Font("Tahoma", Font.PLAIN, 14));
		mob.setBounds(153, 347, 207, 20);
		contentPane.add(mob);
		mob.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("PASSWORD");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_9.setBounds(44, 79, 75, 14);
		contentPane.add(lblNewLabel_9);
		
		passw = new JTextField();
		passw.setFont(new Font("Tahoma", Font.PLAIN, 14));
		passw.setBounds(133, 73, 217, 20);
		contentPane.add(passw);
		passw.setColumns(10);
		
		 String[] gendre={"select","male","female"};
		
		 gen = new JComboBox(gendre);
		gen.setFont(new Font("Tahoma", Font.PLAIN, 14));
		gen.setBounds(133, 177, 217, 20);
		contentPane.add(gen);
		
		
		 
	}
}
