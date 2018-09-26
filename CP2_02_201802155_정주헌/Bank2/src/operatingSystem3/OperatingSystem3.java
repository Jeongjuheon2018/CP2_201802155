package operatingSystem3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import net.miginfocom.swing.MigLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OperatingSystem3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OperatingSystem3 frame = new OperatingSystem3();
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
	public OperatingSystem3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 404);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setText("23");
		formattedTextField.setHorizontalAlignment(SwingConstants.RIGHT);
		formattedTextField.setBounds(27, 21, 278, 36);
		contentPane.add(formattedTextField);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(27, 113, 276, 53);
		contentPane.add(panel_1);
		
		JButton btnNewButton_3 = new JButton("  9  ");
		
		JButton btnNewButton_4 = new JButton("  /  ");
		panel_1.setLayout(new GridLayout(0, 4, 0, 0));
		
		JButton btnNewButton_1 = new JButton("   7   ");
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("  8  ");
		panel_1.add(btnNewButton_2);
		panel_1.add(btnNewButton_3);
		panel_1.add(btnNewButton_4);
		
		JButton btnNewButton = new JButton("C");
		btnNewButton.setBounds(27, 67, 68, 36);
		contentPane.add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBounds(27, 176, 278, 48);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(0, 4, 0, 0));
		
		JButton btnNewButton_5 = new JButton("  4  ");
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("  5  ");
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("  6  ");
		panel.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("*");
		panel.add(btnNewButton_8);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(27, 234, 278, 48);
		contentPane.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 4, 0, 0));
		
		JButton btnNewButton_9 = new JButton("1");
		panel_2.add(btnNewButton_9);
		
		JButton button = new JButton("2");
		panel_2.add(button);
		
		JButton button_1 = new JButton("3");
		panel_2.add(button_1);
		
		JButton button_2 = new JButton("-");
		panel_2.add(button_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(27, 297, 287, 48);
		contentPane.add(panel_3);
		
		JButton btnNewButton_10 = new JButton("0");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		panel_3.setLayout(new GridLayout(0, 4, 0, 0));
		panel_3.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("00");
		panel_3.add(btnNewButton_11);
		
		JButton button_3 = new JButton("=");
		panel_3.add(button_3);
		
		JButton btnNewButton_12 = new JButton("+");
		panel_3.add(btnNewButton_12);
	}

}
