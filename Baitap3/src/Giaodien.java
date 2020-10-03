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
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class Giaodien extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

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
		setTitle("QU\u1EA2N L\u00DD SINH VI\u00CAN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 385, 531);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHVTn = new JLabel("H\u1ECD v\u00E0 t\u00EAn");
		lblHVTn.setBounds(12, 13, 113, 32);
		contentPane.add(lblHVTn);
		
		JLabel label_1 = new JLabel("Ng\u00E0y sinh");
		label_1.setBounds(12, 58, 72, 32);
		contentPane.add(label_1);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerDateModel(new Date(1601053200000L), null, null, Calendar.DAY_OF_YEAR));
		spinner.setBounds(96, 63, 260, 22);
		contentPane.add(spinner);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(95, 18, 261, 27);
		contentPane.add(textField);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Nam");
		rdbtnNewRadioButton.setSelected(true);
		rdbtnNewRadioButton.setBounds(129, 125, 72, 25);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnN = new JRadioButton("N\u1EEF");
		rdbtnN.setBounds(257, 125, 72, 25);
		contentPane.add(rdbtnN);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Gi\u1EDBi t\u00EDnh", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(96, 98, 259, 65);
		contentPane.add(panel);
		
		JLabel lblKhoa = new JLabel("Khoa");
		lblKhoa.setBounds(12, 176, 72, 32);
		contentPane.add(lblKhoa);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"C\u00F4ng ngh\u1EC7 th\u00F4ng tin", "Ngo\u1EA1i ng\u1EEF", "Qu\u1EA3n tr\u1ECB kinh doanh"}));
		comboBox.setToolTipText("");
		comboBox.setBounds(96, 186, 260, 22);
		contentPane.add(comboBox);
		
		JLabel lblTrngThi = new JLabel("Tr\u1EA1ng th\u00E1i");
		lblTrngThi.setBounds(12, 232, 72, 32);
		contentPane.add(lblTrngThi);
		
		textField_1 = new JTextField();
		textField_1.setBounds(96, 237, 260, 191);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Th\u00EAm");
		btnNewButton.setBounds(121, 450, 97, 25);
		contentPane.add(btnNewButton);
		
		JButton btnThot = new JButton("Tho\u00E1t");
		btnThot.setBounds(246, 450, 97, 25);
		contentPane.add(btnThot);
	}
}
