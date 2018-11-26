import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import com.jgoodies.forms.factories.DefaultComponentFactory;

public class AddMagazine {

	private JFrame frmAddMagazine;
	private Vector<Document> docs;
	private JTextField mName;
	private JTextField aName;
	private JTextField magId;
	private JTextField company;
	private JTextField date;
	private JTextField priceDoc;
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					AddMagazine window = new AddMagazine();
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
	public AddMagazine(Vector<Document> docs) {
		this.docs = docs;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAddMagazine = new JFrame();
		frmAddMagazine.getContentPane().setBackground(Color.DARK_GRAY);
		frmAddMagazine.setTitle("Add Magazine");
		frmAddMagazine.setBounds(100, 100, 506, 355);
		frmAddMagazine.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAddMagazine.getContentPane().setLayout(null);
		frmAddMagazine.setVisible(true);
		
		JLabel bName = new JLabel("Magazine Name");
		bName.setFont(new Font("Tahoma", Font.BOLD, 14));
		bName.setForeground(Color.WHITE);
		bName.setBounds(45, 42, 94, 14);
		frmAddMagazine.getContentPane().add(bName);
		
		JLabel autName = new JLabel("Author Name");
		autName.setForeground(Color.WHITE);
		autName.setFont(new Font("Tahoma", Font.BOLD, 14));
		autName.setBounds(45, 79, 115, 14);
		frmAddMagazine.getContentPane().add(autName);
		
		JLabel isbn = new JLabel("ID");
		isbn.setFont(new Font("Tahoma", Font.BOLD, 14));
		isbn.setForeground(Color.WHITE);
		isbn.setBounds(47, 112, 46, 14);
		frmAddMagazine.getContentPane().add(isbn);
		
		JLabel pubName = new JLabel("Company Name");
		pubName.setFont(new Font("Tahoma", Font.BOLD, 14));
		pubName.setForeground(Color.WHITE);
		pubName.setBounds(45, 143, 115, 14);
		frmAddMagazine.getContentPane().add(pubName);
		
		JLabel pubDate = new JLabel("Publish Date");
		pubDate.setForeground(Color.WHITE);
		pubDate.setFont(new Font("Tahoma", Font.BOLD, 14));
		pubDate.setBounds(45, 176, 104, 14);
		frmAddMagazine.getContentPane().add(pubDate);
		
		mName = new JTextField();
		mName.setBounds(164, 41, 200, 20);
		frmAddMagazine.getContentPane().add(mName);
		mName.setColumns(10);
		
		aName = new JTextField();
		aName.setBounds(164, 78, 200, 20);
		frmAddMagazine.getContentPane().add(aName);
		aName.setColumns(10);
		
		magId = new JTextField();
		magId.setBounds(164, 111, 200, 20);
		frmAddMagazine.getContentPane().add(magId);
		magId.setColumns(10);
		
		company = new JTextField();
		company.setBounds(164, 142, 200, 20);
		frmAddMagazine.getContentPane().add(company);
		company.setColumns(10);
		
		date = new JTextField();
		date.setBounds(164, 175, 200, 20);
		frmAddMagazine.getContentPane().add(date);
		date.setColumns(10);
		
		priceDoc = new JTextField();
		priceDoc.setBounds(164, 210, 200, 20);
		frmAddMagazine.getContentPane().add(priceDoc);
		priceDoc.setColumns(10);
		
		JButton add = new JButton("Add");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = mName.getText();
				String author = aName.getText();
				String pDate = date.getText();
				int num = Integer.parseInt((magId.getText()));
				String pubN= company.getText();
				int price = Integer.parseInt((priceDoc.getText()));
				Magazine m = new Magazine(name, author,pDate,price,num,pubN);
				docs.add(m);
				JOptionPane.showMessageDialog(null, "Successfully Added");
				
			}
		});
		add.setBounds(276, 255, 89, 23);
		frmAddMagazine.getContentPane().add(add);
		
		JButton back = new JButton("Return");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmAddMagazine.dispose();
				Operator op = new Operator(docs);
			}
		});
		back.setBounds(177, 255, 89, 23);
		frmAddMagazine.getContentPane().add(back);
		
		JLabel pr = DefaultComponentFactory.getInstance().createLabel("Price");
		pr.setFont(new Font("Tahoma", Font.BOLD, 14));
		pr.setForeground(Color.WHITE);
		pr.setBounds(45, 211, 92, 14);
		frmAddMagazine.getContentPane().add(pr);
		
		
		frmAddMagazine.setVisible(true);
	}
	}


