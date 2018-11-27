import java.awt.EventQueue;
import java.util.Vector;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.jgoodies.forms.factories.DefaultComponentFactory;

public class Shipping {

	private JFrame frmAddBook;
	private Vector<Document> docs;
	private JTextField name;
	private JTextField address;
	private JTextField phone;
	private JTextField city;
	private JTextField province;
	

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					AddBook window = new AddBook();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public Shipping() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAddBook = new JFrame();
		frmAddBook.getContentPane().setBackground(Color.DARK_GRAY);
		frmAddBook.setTitle("Shipping info");
		frmAddBook.setBounds(100, 100, 538, 370);
		frmAddBook.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAddBook.getContentPane().setLayout(null);
		
		JLabel bName = new JLabel("Name");
		bName.setFont(new Font("Tahoma", Font.BOLD, 14));
		bName.setForeground(Color.WHITE);
		bName.setBounds(24, 43, 94, 14);
		frmAddBook.getContentPane().add(bName);
		
		JLabel ads = new JLabel("Address");
		ads.setForeground(Color.WHITE);
		ads.setFont(new Font("Tahoma", Font.BOLD, 14));
		ads.setBounds(24, 80, 115, 14);
		frmAddBook.getContentPane().add(ads);
		
		JLabel pn = new JLabel("Phone Number");
		pn.setFont(new Font("Tahoma", Font.BOLD, 14));
		pn.setForeground(Color.WHITE);
		pn.setBounds(24, 123, 115, 14);
		frmAddBook.getContentPane().add(pn);
		
		JLabel ct = new JLabel("City");
		ct.setFont(new Font("Tahoma", Font.BOLD, 14));
		ct.setForeground(Color.WHITE);
		ct.setBounds(24, 167, 115, 14);
		frmAddBook.getContentPane().add(ct);
		
		JLabel pv = new JLabel("Province");
		pv.setForeground(Color.WHITE);
		pv.setFont(new Font("Tahoma", Font.BOLD, 14));
		pv.setBounds(24, 207, 104, 14);
		frmAddBook.getContentPane().add(pv);
		
		name = new JTextField();
		name.setBounds(164, 41, 200, 20);
		frmAddBook.getContentPane().add(name);
		name.setColumns(10);
		
		address = new JTextField();
		address.setBounds(164, 78, 200, 20);
		frmAddBook.getContentPane().add(address);
		address.setColumns(10);
		
		phone = new JTextField();
		phone.setBounds(164, 121, 200, 20);
		frmAddBook.getContentPane().add(phone);
		phone.setColumns(10);
		
		city = new JTextField();
		city.setBounds(164, 164, 200, 20);
		frmAddBook.getContentPane().add(city);
		city.setColumns(10);
		
		province = new JTextField();
		province.setBounds(164, 205, 200, 20);
		frmAddBook.getContentPane().add(province);
		province.setColumns(10);
		
		
		JButton add = new JButton("Next Step");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmAddBook.dispose();
				Pay p = new Pay();
			}
		});
		add.setBounds(133, 254, 89, 23);
		frmAddBook.getContentPane().add(add);
		
		JButton back = new JButton("Return");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmAddBook.dispose();
				Operator op = new Operator(docs);
			}
		});
		back.setBounds(285, 254, 89, 23);
		frmAddBook.getContentPane().add(back);
		
		
		frmAddBook.setVisible(true);
	}
}
