import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;
import javax.swing.JCheckBox;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import java.awt.Color;

public class Giaodien extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Giaodien frame = new Giaodien();
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
	public Giaodien() {
		setBackground(new Color(255, 255, 255));
		setTitle("T\u00CDNH L\u01AF\u01A0NG");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 538, 723);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(122, 13, 388, 27);
		contentPane.add(textField);
		
		JLabel label = new JLabel("Ng\u00E0y sinh");
		label.setBounds(22, 53, 72, 32);
		contentPane.add(label);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerDateModel(new Date(1601053200000L), null, null, Calendar.DAY_OF_YEAR));
		spinner.setBounds(122, 58, 244, 22);
		contentPane.add(spinner);
		
		JLabel label_1 = new JLabel("S\u1ED1 \u0111i\u1EC7n tho\u1EA1i");
		label_1.setBounds(22, 203, 113, 32);
		contentPane.add(label_1);
		
		JLabel lblThmNin = new JLabel("Th\u00E2m ni\u00EAn");
		lblThmNin.setBounds(22, 241, 84, 32);
		contentPane.add(lblThmNin);
		
		JLabel label_3 = new JLabel("L\u01B0\u01A1ng");
		label_3.setBounds(22, 282, 77, 32);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("Ph\u1EE5 c\u1EA5p");
		label_4.setBounds(22, 327, 72, 32);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("K\u1EBFt qu\u1EA3");
		label_5.setBounds(22, 372, 72, 32);
		contentPane.add(label_5);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(122, 206, 244, 27);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(122, 287, 244, 27);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(122, 372, 388, 259);
		contentPane.add(textField_3);
		
		JButton button = new JButton("Tho\u00E1t");
		button.setBounds(413, 644, 97, 25);
		contentPane.add(button);
		
		JButton button_1 = new JButton("T\u00EDnh");
		button_1.setBounds(304, 644, 97, 25);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("L\u01B0u");
		button_2.setBounds(22, 644, 97, 25);
		contentPane.add(button_2);
		
		JLabel label_6 = new JLabel("H\u1ECD t\u00EAn");
		label_6.setBounds(22, 13, 113, 32);
		contentPane.add(label_6);
		
		JRadioButton radioButton = new JRadioButton("Nam");
		radioButton.setSelected(true);
		radioButton.setBounds(207, 143, 72, 25);
		contentPane.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("N\u1EEF");
		radioButton_1.setBounds(373, 143, 72, 25);
		contentPane.add(radioButton_1);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Gi\u1EDBi t\u00EDnh", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(122, 116, 387, 74);
		contentPane.add(panel);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(122, 332, 244, 27);
		contentPane.add(textField_4);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(122, 246, 244, 22);
		contentPane.add(spinner_1);
	}

}

