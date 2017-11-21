import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Layout {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Layout window = new Layout();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Layout() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(6, 11, 47, 16);
		frame.getContentPane().add(lblName);
		
		textField = new JTextField();
		textField.setBounds(57, 6, 130, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setBounds(6, 52, 346, 16);
		frame.getContentPane().add(label);
		
		JButton btnSayHi = new JButton("Say Hi");
		btnSayHi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText("Hi " + textField.getText() + "!");
			}
		});
		btnSayHi.setBounds(189, 6, 117, 29);
		frame.getContentPane().add(btnSayHi);
		
		
	}
}
