package project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.sql.*
;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;public class User extends JFrame {
	private JTextField textField;
	private JTextField name1;
	private JTextField age1;
	private JTextField region1;
	private JTextField education1;
	private JTextField name2;
	private JTextField age2;
	private JTextField region2;
	private JTextField education2;
	private JTextField name3;
	private JTextField age3;
	private JTextField region3;
	private JTextField education3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					User frame = new User();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	Connection conn1;
	private JTextField name4;
	private JTextField age4;
	private JTextField region4;
	private JTextField education4;
	public User() {
		conn1=Dbase.dbconnector();
		setTitle("USER");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 725, 481);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SELECT BELOW OPTIONS TO FILTER THE ITEMS");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(0, -7, 393, 31);
		getContentPane().add(lblNewLabel);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 25, 600, 21);
		getContentPane().add(menuBar);
		
		JMenu relgon = new JMenu("RELIGION");
		menuBar.add(relgon);
		
		JMenuItem rmenu = new JMenuItem("hindu");
		relgon.add(rmenu);
		
		JMenuItem rmenu1 = new JMenuItem("muslim");
		relgon.add(rmenu1);
		
		JMenuItem rmenu2 = new JMenuItem("christian");
		relgon.add(rmenu2);
		
		JMenuItem rmenu3 = new JMenuItem("doesn'tmatter");
		relgon.add(rmenu3);
		
		JMenu religi = new JMenu("REGION");
		menuBar.add(religi);
		
		JMenuItem remenu = new JMenuItem("andhrapradesh");
		religi.add(remenu);
		
		JMenuItem remenu1 = new JMenuItem("tamilnadu");
		religi.add(remenu1);
		
		JMenuItem remenu2 = new JMenuItem("karnataka");
		religi.add(remenu2);
		
		JMenuItem remenu3 = new JMenuItem("kerala");
		religi.add(remenu3);
		
		JMenu educ = new JMenu("EDUCATION");
		menuBar.add(educ);
		
		JMenuItem edumenu = new JMenuItem("bachelors");
		educ.add(edumenu);
		
		JMenuItem edumenu1 = new JMenuItem("masters");
		educ.add(edumenu1);
		
		JMenuItem edumenu2 = new JMenuItem("doctorate");
		educ.add(edumenu2);
		
		JMenuItem edumenu3 = new JMenuItem("diploma");
		educ.add(edumenu3);
		
		JMenu mnNewMenu_3 = new JMenu("AGE");
		menuBar.add(mnNewMenu_3);
		
		textField = new JTextField();
		mnNewMenu_3.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("LOGOUT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				}
		
		});
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.CYAN);
		panel1.setBounds(5, 50, 241, 121);
		getContentPane().add(panel1);
		panel1.setLayout(null);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setBounds(10, 11, 70, 20);
		panel1.add(lblName);
		
		JLabel lblNewLabel_1 = new JLabel("AGE");
		lblNewLabel_1.setBounds(10, 42, 46, 14);
		panel1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("REGION");
		lblNewLabel_2.setBounds(10, 72, 46, 14);
		panel1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_6 = new JLabel("EDUCATION");
		lblNewLabel_6.setBounds(10, 96, 70, 14);
		panel1.add(lblNewLabel_6);
		
		name1 = new JTextField();
		name1.setBounds(92, 11, 125, 20);
		panel1.add(name1);
		name1.setColumns(10);
		
		age1 = new JTextField();
		age1.setBounds(92, 39, 125, 20);
		panel1.add(age1);
		age1.setColumns(10);
		
		region1 = new JTextField();
		region1.setBounds(92, 69, 125, 20);
		panel1.add(region1);
		region1.setColumns(10);
		
		education1 = new JTextField();
		education1.setBounds(90, 93, 127, 20);
		panel1.add(education1);
		education1.setColumns(10);
		
		JPanel panel2 = new JPanel();
		panel2.setBounds(263, 50, 209, 121);
		getContentPane().add(panel2);
		panel2.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("NAME");
		lblNewLabel_3.setBounds(10, 21, 46, 14);
		panel2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("AGE");
		lblNewLabel_4.setBounds(10, 46, 46, 14);
		panel2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("REGION");
		lblNewLabel_5.setBounds(10, 71, 46, 14);
		panel2.add(lblNewLabel_5);
		
		JLabel lblNewLabel_7 = new JLabel("EDUCATION");
		lblNewLabel_7.setBounds(10, 96, 59, 14);
		panel2.add(lblNewLabel_7);
		
		name2 = new JTextField();
		name2.setBounds(80, 18, 119, 20);
		panel2.add(name2);
		name2.setColumns(10);
		
		age2 = new JTextField();
		age2.setBounds(80, 43, 119, 20);
		panel2.add(age2);
		age2.setColumns(10);
		
		region2 = new JTextField();
		region2.setBounds(80, 68, 119, 20);
		panel2.add(region2);
		region2.setColumns(10);
		
		education2 = new JTextField();
		education2.setBounds(79, 93, 120, 20);
		panel2.add(education2);
		education2.setColumns(10);
		
		JPanel panel3 = new JPanel();
		panel3.setBounds(485, 50, 209, 121);
		getContentPane().add(panel3);
		panel3.setLayout(null);
		
		JLabel lblNewLabel_8 = new JLabel("NAME");
		lblNewLabel_8.setBounds(10, 23, 46, 14);
		panel3.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("AGE");
		lblNewLabel_9.setBounds(10, 46, 46, 14);
		panel3.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("REGION");
		lblNewLabel_10.setBounds(10, 72, 46, 14);
		panel3.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("EDUCATION");
		lblNewLabel_11.setBounds(10, 97, 59, 14);
		panel3.add(lblNewLabel_11);
		
		name3 = new JTextField();
		name3.setBounds(78, 20, 121, 20);
		panel3.add(name3);
		name3.setColumns(10);
		
		age3 = new JTextField();
		age3.setBounds(78, 43, 121, 20);
		panel3.add(age3);
		age3.setColumns(10);
		
		region3 = new JTextField();
		region3.setBounds(78, 69, 121, 20);
		panel3.add(region3);
		region3.setColumns(10);
		
		education3 = new JTextField();
		education3.setBounds(78, 93, 121, 20);
		panel3.add(education3);
		education3.setColumns(10);
		
		JButton male1 = new JButton("male");
		male1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					try{
				System.out.print("hello");
				Statement st=conn1.createStatement();
				ResultSet rs=st.executeQuery("select * from register where gender='male'");
				int count=0;
				while(rs.next()){
					count++;
					System.out.println("hello");
					System.out.println(""+rs.getString(1)+""+rs.getString(2)+rs.getString(3)+rs.getString(4)+rs.getString(7));
					if(count==1){
					name1.setText(rs.getString(1));
					age1.setText(rs.getString(2));
					region1.setText(rs.getString(5));
					education1.setText(rs.getString(6));
					}
					else if(count==2){
						name2.setText(rs.getString(1));
						age2.setText(rs.getString(2));
						region2.setText(rs.getString(5));
						education2.setText(rs.getString(6));
					}
					else if(count==3){
						name3.setText(rs.getString(1));
						age3.setText(rs.getString(2));
				region3.setText(rs.getString(5));
				education3.setText(rs.getString(6));
			      }
					else {
						name4.setText(rs.getString(1));
						age4.setText(rs.getString(2));
				region4.setText(rs.getString(5));
				education4.setText(rs.getString(6));
			}
					
		}
		
		conn1.close();
}catch(Exception e){
	System.out.println(e);
}
			}
			
			
			
		});
		male1.setBounds(400, 0, 89, 21);
		getContentPane().add(male1);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 182, 236, 134);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_12 = new JLabel("NAME");
		lblNewLabel_12.setBounds(10, 11, 46, 14);
		panel.add(lblNewLabel_12);
		
		name4 = new JTextField();
		name4.setBounds(102, 8, 124, 20);
		panel.add(name4);
		name4.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("AGE");
		lblNewLabel_13.setBounds(10, 47, 46, 14);
		panel.add(lblNewLabel_13);
		
		age4 = new JTextField();
		age4.setBounds(102, 41, 124, 20);
		panel.add(age4);
		age4.setColumns(10);
		
		JLabel lblNewLabel_14 = new JLabel("REGION");
		lblNewLabel_14.setBounds(10, 79, 46, 14);
		panel.add(lblNewLabel_14);
		
		region4 = new JTextField();
		region4.setBounds(102, 76, 124, 20);
		panel.add(region4);
		region4.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("EDUCATION");
		lblNewLabel_15.setBounds(10, 109, 82, 14);
		panel.add(lblNewLabel_15);
		
		education4 = new JTextField();
		education4.setBounds(102, 106, 124, 20);
		panel.add(education4);
		education4.setColumns(10);
		
	/*	JButton btnNewButton_2 = new JButton("female");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
	
		try{
		Statement st=conn1.createStatement();
		ResultSet rs=st.executeQuery("select * from register where gender='female'");
		int count=0;
		while(rs.next()){
			count++;
			System.out.println("hello");
			System.out.println(""+rs.getString(1)+""+rs.getString(2)+rs.getString(3)+rs.getString(4)+rs.getString(7));
			if(count==1){
			name1.setText(rs.getString(1));
			age1.setText(rs.getString(2));
			region1.setText(rs.getString(5));
			education1.setText(rs.getString(6));
			}
			else if(count==2){
				name2.setText(rs.getString(1));
				age2.setText(rs.getString(2));
				region2.setText(rs.getString(5));
				education2.setText(rs.getString(6));
			}
			else{
				name3.setText(rs.getString(1));
				age3.setText(rs.getString(2));
				region3.setText(rs.getString(5));
				education3.setText(rs.getString(6));
			}
		}
		
	conn1.close();
}catch(Exception e){
	System.out.println(e);
}		}
		});
		btnNewButton_2.setBounds(486, 0, 89, 21);
		getContentPane().add(btnNewButton_2);*/
		
	}
}
