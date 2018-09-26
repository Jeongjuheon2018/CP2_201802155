package operatingSystem;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.SwingConstants;

public class OperatingSystem extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OperatingSystem frame = new OperatingSystem();
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
	public OperatingSystem() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 255);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uAC70\uB9AC\uB97C \uB9C8\uC77C \uB2E8\uC704\uB85C \uC785\uB825\uD558\uC2DC\uC624.");
		lblNewLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 14));
		lblNewLabel.setBounds(49, 39, 219, 55);
		contentPane.add(lblNewLabel);
		
		JFormattedTextField formattedTextField_1 = new JFormattedTextField();
		formattedTextField_1.setText("1");
		formattedTextField_1.setHorizontalAlignment(SwingConstants.RIGHT);
		formattedTextField_1.setBounds(286, 56, 95, 23);
		contentPane.add(formattedTextField_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 115, 436, 36);
		contentPane.add(panel);
		
		JButton btnNewButton = new JButton("\uBCC0\uD658");
		btnNewButton.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 16));
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 171, 436, 70);
		contentPane.add(panel_1);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setFont(new Font("±¼¸²", Font.PLAIN, 14));
		formattedTextField.setText("             1\uB9C8\uC77C\uC740 1.6\uD0AC\uB85C\uBBF8\uD130\uC785\uB2C8\uB2E4.         ");
		formattedTextField.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(formattedTextField);
	}
}
