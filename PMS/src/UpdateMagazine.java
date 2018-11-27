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

public class UpdateMagazine {

	private JFrame frmUpdate;
	private Vector<Document>docs;
	private Magazine doc;
	private String title;
	private JTextField bkName;
	private JTextField aName;
	private JTextField isbnNum;
	private JTextField publisher;
	private JTextField date;
	private JTextField docPrice;

	private int index;

	/**
	 * Create the application.
	 */
	public UpdateMagazine(Vector<Document>docs, String name, int index) {
		this.docs = (Vector)docs.clone();
		title = name;
		doc = (Magazine)getDoc(title);
		this.index = index;
		initialize();
	}
	public Document getDoc(String n){
		for(int i = 0; i < docs.size();i++){
			if(docs.get(i).getName().equals(title)){
				return docs.get(i);
			}
		}
		return null;
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmUpdate = new JFrame();
		frmUpdate.getContentPane().setBackground(Color.DARK_GRAY);
		frmUpdate.setTitle("Update");
		frmUpdate.setBounds(100, 100, 511, 374);
		frmUpdate.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmUpdate.getContentPane().setLayout(null);
		
		JLabel bName = new JLabel("Magazine Name");
		bName.setFont(new Font("Tahoma", Font.BOLD, 14));
		bName.setForeground(Color.WHITE);
		bName.setBounds(45, 42, 94, 14);
		frmUpdate.getContentPane().add(bName);
		
		JLabel autName = new JLabel("Author Name");
		autName.setForeground(Color.WHITE);
		autName.setFont(new Font("Tahoma", Font.BOLD, 14));
		autName.setBounds(45, 79, 115, 14);
		frmUpdate.getContentPane().add(autName);
		
		JLabel isbn = new JLabel("Mag ID");
		isbn.setFont(new Font("Tahoma", Font.BOLD, 14));
		isbn.setForeground(Color.WHITE);
		isbn.setBounds(47, 112, 46, 14);
		frmUpdate.getContentPane().add(isbn);
		
		JLabel pubName = new JLabel("Company");
		pubName.setFont(new Font("Tahoma", Font.BOLD, 14));
		pubName.setForeground(Color.WHITE);
		pubName.setBounds(45, 143, 115, 14);
		frmUpdate.getContentPane().add(pubName);
		
		JLabel pubDate = new JLabel("Publish Date");
		pubDate.setForeground(Color.WHITE);
		pubDate.setFont(new Font("Tahoma", Font.BOLD, 14));
		pubDate.setBounds(45, 176, 104, 14);
		frmUpdate.getContentPane().add(pubDate);
			
		
		bkName = new JTextField();
		bkName.setBounds(164, 41, 200, 20);
		frmUpdate.getContentPane().add(bkName);
		bkName.setColumns(10);
		bkName.setText(doc.getName());
		
		aName = new JTextField();
		aName.setBounds(164, 78, 200, 20);
		frmUpdate.getContentPane().add(aName);
		aName.setColumns(10);
		aName.setText(doc.getAutName());
		
		isbnNum = new JTextField();
		isbnNum.setBounds(164, 111, 200, 20);
		frmUpdate.getContentPane().add(isbnNum);
		isbnNum.setColumns(10);
		isbnNum.setText(Integer.toString(doc.getMagId()));
		
		publisher = new JTextField();
		publisher.setBounds(164, 142, 200, 20);
		frmUpdate.getContentPane().add(publisher);
		publisher.setColumns(10);
		publisher.setText(doc.getCompany());
		
		date = new JTextField();
		date.setBounds(164, 175, 200, 20);
		frmUpdate.getContentPane().add(date);
		date.setColumns(10);
		date.setText(doc.getDate());
		
		docPrice = new JTextField();
		docPrice.setBounds(164, 207, 200, 20);
		frmUpdate.getContentPane().add(docPrice);
		docPrice.setColumns(10);
		docPrice.setText(Integer.toString(doc.getPrice()));
		
		JButton add = new JButton("Update");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = bkName.getText();
				String author = aName.getText();
				String pDate = date.getText();
				int num = Integer.parseInt((isbnNum.getText()));
				String pubN= publisher.getText();
				int price = Integer.parseInt((docPrice.getText()));
				
				Magazine b = (Magazine)docs.get(index);
				
				b.setName(name);
				b.setAuthorName(author);
				b.setMagId(num);
				b.setPrice(price);
				b.setPublishDate(pDate);
				b.setCompany(pubN);
				System.out.println("cheng");
				JOptionPane.showMessageDialog(null, "Successfully Updated");
				
			}
		});
		add.setBounds(280, 254, 89, 23);
		frmUpdate.getContentPane().add(add);
		
		JButton back = new JButton("Return");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmUpdate.dispose();
				Operator op = new Operator(docs);
			}
		});
		back.setBounds(181, 254, 89, 23);
		frmUpdate.getContentPane().add(back);
		
		JLabel price = DefaultComponentFactory.getInstance().createLabel("Price");
		price.setFont(new Font("Tahoma", Font.BOLD, 14));
		price.setForeground(Color.WHITE);
		price.setBounds(47, 208, 92, 14);
		frmUpdate.getContentPane().add(price);
		
		
		frmUpdate.setVisible(true);
	}
	}


