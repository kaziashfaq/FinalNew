import java.awt.EventQueue;

import javax.swing.JFrame;

public class Visitor {

	private JFrame frmPms;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Visitor window = new Visitor();
					window.frmPms.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Visitor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPms = new JFrame();
		frmPms.setTitle("PMS");
		frmPms.setBounds(100, 100, 450, 300);
		frmPms.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPms.getContentPane().setLayout(null);
	}

}
