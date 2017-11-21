import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;

public class Layout {

	private JFrame frame;
	private final ButtonGroup radios = new ButtonGroup();
	JLabel label = new JLabel("Item 1");

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
	
	class RadioListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JRadioButton btn = (JRadioButton)e.getSource();
			label.setText(btn.getText());
		}
		
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
		
		JRadioButton item1 = new JRadioButton("Item 1");
		radios.add(item1);
		item1.setSelected(true);
		item1.setBounds(11, 13, 141, 23);
		frame.getContentPane().add(item1);
		
		JRadioButton item2 = new JRadioButton("Item 2");
		radios.add(item2);
		item2.setBounds(11, 45, 141, 23);
		frame.getContentPane().add(item2);
		
		JRadioButton item3 = new JRadioButton("Item 3");
		radios.add(item3);
		item3.setBounds(11, 82, 141, 23);
		frame.getContentPane().add(item3);
		
		
		label.setBounds(6, 117, 116, 16);
		frame.getContentPane().add(label);
		
		RadioListener listener = new RadioListener();
		item1.addActionListener(listener);
		item2.addActionListener(listener);
		item3.addActionListener(listener);
	}
}
