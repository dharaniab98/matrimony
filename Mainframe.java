package project;
import java.sql.*;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.awt.Canvas;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JEditorPane;
import javax.swing.JMenuBar;
import javax.swing.JPasswordField;

import java.awt.SystemColor;
import java.awt.Panel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.Button;
import javax.swing.JMenuItem;

public class Mainframe{

	private JFrame frmHomeframe;
	public static JTextField name;
	private JTextField age;
	private JTextField degree;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)throws NullPointerException {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mainframe window = new Mainframe();
					window.frmHomeframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	Connection connection;
	public Mainframe() {
		initialize();
		connection=Dbase.dbconnector();
	}
     
	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frmHomeframe = new JFrame();
		frmHomeframe.getContentPane().setBackground(Color.WHITE);
		frmHomeframe.getContentPane().setFont(new Font("Arial", Font.BOLD, 18));
		frmHomeframe.setTitle("HOMEFRAME");
		frmHomeframe.setBackground(Color.WHITE);
		frmHomeframe.setBounds(100, 100, 872, 821);
		frmHomeframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHomeframe.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("       FIXED IN HEAVEN");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 44));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(-46, 0, 779, 46);
		frmHomeframe.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("REGISTER");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				register reg=new register();
				reg.setVisible(true);
			}
		});
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setBounds(586, 76, 102, 23);
		frmHomeframe.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("LOGIN");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/*final JFrame f=new JFrame("passwordfield");
				JPasswordField value=new JPasswordField();
				JLabel l=new JLabel("password");
				l.setBounds(20,100,80,30);
				value.setBounds(100,100,100,30);
				JButton jb=new JButton("Next");
				JButton can=new JButton("cancel");
				 jb.setBounds(70,150,60,30);
				 can.setBounds(140,150,80,30);
					f.add(value);
				f.add(jb);
				f.add(can);
					f.add(l);
					f.setSize(300,300);
					f.setLayout(null);
					f.setVisible(true);*/
				login fram=new login();
						fram.setVisible(true);
				fram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				
			}
		});
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.setBounds(700, 76, 89, 23);
		frmHomeframe.getContentPane().add(btnNewButton_1);
		
		JLabel iml = new JLabel("");
		Image img=new ImageIcon(this.getClass().getResource("/marry.png")).getImage();
		iml.setIcon(new ImageIcon(img));
		iml.setBounds(0, 110, 595, 364);
		frmHomeframe.getContentPane().add(iml);
		
		JLabel vedika = new JLabel("");
		
		Image img1=new ImageIcon(this.getClass().getResource("/vedika.png")).getImage();
		vedika.setIcon(new ImageIcon(img1));
		
		vedika.setBounds(588, 110, 273, 364);
		frmHomeframe.getContentPane().add(vedika);
		
		JLabel vam = new JLabel("");
		Image img2=new ImageIcon(this.getClass().getResource("/vamsi.png")).getImage();
		vam.setIcon(new ImageIcon(img2));
		
		
		vam.setBounds(10, 530, 121, 112);
		frmHomeframe.getContentPane().add(vam);
		
		JLabel vname = new JLabel("NAME:VAMSI");
		vname.setFont(new Font("Tahoma", Font.PLAIN, 14));
		vname.setBounds(165, 530, 83, 14);
		frmHomeframe.getContentPane().add(vname);
		
		JLabel lblNewLabel_1 = new JLabel("AGE:20");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(165, 555, 83, 14);
		frmHomeframe.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("BTECH ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(163, 583, 61, 23);
		frmHomeframe.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("RECENT PROFILES");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(156, 496, 305, 23);
		frmHomeframe.getContentPane().add(lblNewLabel_3);
		
		JLabel GOP = new JLabel("");
		Image img3=new ImageIcon(this.getClass().getResource("/gopi.png")).getImage();
		GOP.setIcon(new ImageIcon(img3));
		
		
		GOP.setBounds(258, 530, 108, 112);
		frmHomeframe.getContentPane().add(GOP);
		
		JLabel gname = new JLabel("NAME:GOPI");
		gname.setFont(new Font("Tahoma", Font.PLAIN, 14));
		gname.setBounds(396, 542, 71, 14);
		frmHomeframe.getContentPane().add(gname);
		
		JLabel lblNewLabel_4 = new JLabel("AGE:   21");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(396, 562, 61, 14);
		frmHomeframe.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("MBA  ");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(396, 587, 46, 14);
		frmHomeframe.getContentPane().add(lblNewLabel_5);
		
		name = new JTextField();
		name.setBounds(693, 530, 108, 20);
		frmHomeframe.getContentPane().add(name);
		name.setColumns(10);
		name.setText("hello");
		
		JLabel lblNewLabel_6 = new JLabel("PHOTO");
		lblNewLabel_6.setBounds(524, 515, 108, 98);
		frmHomeframe.getContentPane().add(lblNewLabel_6);
		
		age = new JTextField();
		age.setFont(new Font("Tahoma", Font.PLAIN, 14));
		age.setBounds(693, 559, 108, 20);
		frmHomeframe.getContentPane().add(age);
		age.setColumns(10);
		
		degree = new JTextField();
		degree.setFont(new Font("Tahoma", Font.PLAIN, 14));
		degree.setBounds(693, 590, 108, 20);
		frmHomeframe.getContentPane().add(degree);
		degree.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_3.setBounds(524, 530, 108, 99);
		frmHomeframe.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("NAME");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_7.setBounds(642, 530, 46, 20);
		frmHomeframe.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("AGE");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_8.setBounds(642, 562, 46, 14);
		frmHomeframe.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("DEGREE");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_9.setBounds(638, 590, 52, 23);
		frmHomeframe.getContentPane().add(lblNewLabel_9);
		
		JLabel SUCES = new JLabel("");
		
		Image img4=new ImageIcon(this.getClass().getResource("/SUC.png")).getImage();
		SUCES.setIcon(new ImageIcon(img4));
		SUCES.setBounds(219, 632, 604, 98);
		frmHomeframe.getContentPane().add(SUCES);
		
		JMenu mnNewMenu_1 = new JMenu("PACKAGES");
		mnNewMenu_1.setBounds(108, 77, 107, 22);
		frmHomeframe.getContentPane().add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("PREMIUM");
		mnNewMenu_1.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("PRIME");
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("KALYANAM");
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_2 = new JMenu("ABOUT US");
		mnNewMenu_2.setBounds(230, 76, 107, 22);
		frmHomeframe.getContentPane().add(mnNewMenu_2);
		
		JMenu mnNewMenu = new JMenu("HOME");
		mnNewMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Mainframe window = new Mainframe();
				window.frmHomeframe.setVisible(true);	
			}
		});
		mnNewMenu.setBounds(15, 76, 83, 22);
		frmHomeframe.getContentPane().add(mnNewMenu);
		
		JMenu mnNewMenu_3 = new JMenu("HELP");
		mnNewMenu_3.setBounds(347, 76, 107, 22);
		frmHomeframe.getContentPane().add(mnNewMenu_3);
		
		JLabel QUOTE = new JLabel("LOGIN   AS   A    SINGLE   AND  LOGOUT    AS    A   COUPLE");
		QUOTE.setForeground(Color.RED);
		QUOTE.setFont(new Font("Tahoma", Font.PLAIN, 16));
		QUOTE.setBounds(57, 48, 502, 23);
		frmHomeframe.getContentPane().add(QUOTE);
		
		JButton btnNewButton_2 = new JButton("refresh");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
				Statement st=connection.createStatement();
				ResultSet rs=st.executeQuery("select * from register");
			//	int count=0;
					while(rs.next()){
					
						System.out.println("hello");
						System.out.println(""+rs.getString(1)+""+rs.getString(2)+rs.getString(3)+rs.getString(4)+rs.getString(7));
						name.setText(rs.getString(1));
						age.setText(rs.getString(2));
						degree.setText(rs.getString(6));
					}
					//connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnNewButton_2.setBounds(470, 76, 89, 23);
		frmHomeframe.getContentPane().add(btnNewButton_2);
	    
		
		
	    
	}
}
