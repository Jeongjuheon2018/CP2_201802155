package operatingSystem2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JFormattedTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;

public class OperatingSystem2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OperatingSystem2 frame = new OperatingSystem2();
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
	public OperatingSystem2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uC6D0\uAE08\uC744 \uC785\uB825\uD558\uC2DC\uC624.");
		lblNewLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 16));
		lblNewLabel.setBounds(74, 30, 162, 46);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uC774\uC728\uC744 \uC785\uB825\uD558\uC2DC\uC624.");
		lblNewLabel_1.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 16));
		lblNewLabel_1.setBounds(74, 85, 162, 57);
		contentPane.add(lblNewLabel_1);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setText("1000");
		formattedTextField.setHorizontalAlignment(SwingConstants.RIGHT);
		formattedTextField.setBounds(248, 42, 151, 27);
		contentPane.add(formattedTextField);
		
		JFormattedTextField formattedTextField_1 = new JFormattedTextField();
		formattedTextField_1.setHorizontalAlignment(SwingConstants.RIGHT);
		formattedTextField_1.setText("7.5");
		formattedTextField_1.setBounds(248, 102, 151, 27);
		contentPane.add(formattedTextField_1);
		
		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setBounds(0, 207, 436, 46);
		contentPane.add(panel);
		
		JFormattedTextField formattedTextField_2 = new JFormattedTextField();
		formattedTextField_2.setText("                 \uC774\uC790\uB294 \uC5F0 75\uB9CC\uC6D0\uC785\uB2C8\uB2E4.              ");
		panel.add(formattedTextField_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 152, 436, 46);
		contentPane.add(panel_1);
		
		JButton btnNewButton = new JButton("\uBCC0\uD658");
		btnNewButton.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 14));
		panel_1.add(btnNewButton);
	}
}
