import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Layout {

	private JFrame frame;

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
		
		JLabel label = new JLabel("Delete me!");
		label.setBounds(20, 100, 107, 16);
		frame.getContentPane().add(label);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JLabel lblHello = new JLabel("Hello!");
				lblHello.setBounds(10, 51, 61, 16);
				frame.getContentPane().add(lblHello);
				frame.revalidate();
				frame.repaint();
				
				frame.getContentPane().remove(label);
			}
		});
		btnUpdate.setBounds(10, 10, 117, 29);
		frame.getContentPane().add(btnUpdate);
		
		
		
		
	}
}
