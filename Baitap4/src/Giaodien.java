import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;

public class Giaodien extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
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
		setTitle("T\u00EDnh l\u01B0\u01A1ng");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 529, 766);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(112, 13, 388, 27);
		contentPane.add(textField);
		
		JLabel label = new JLabel("Ng\u00E0y sinh");
		label.setBounds(12, 53, 72, 32);
		contentPane.add(label);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerDateModel(new Date(1601053200000L), null, null, Calendar.DAY_OF_YEAR));
		spinner.setBounds(112, 58, 244, 22);
		contentPane.add(spinner);
		
		JLabel label_1 = new JLabel("S\u1ED1 \u0111i\u1EC7n tho\u1EA1i");
		label_1.setBounds(12, 203, 113, 32);
		contentPane.add(label_1);
		
		JLabel lblLoiNhnVin = new JLabel("Lo\u1EA1i nh\u00E2n vi\u00EAn");
		lblLoiNhnVin.setBounds(12, 278, 113, 32);
		contentPane.add(lblLoiNhnVin);
		
		JLabel lblLng = new JLabel("L\u01B0\u01A1ng");
		lblLng.setBounds(12, 319, 77, 32);
		contentPane.add(lblLng);
		
		JLabel lblPhCp = new JLabel("Ph\u1EE5 c\u1EA5p");
		lblPhCp.setBounds(12, 364, 72, 32);
		contentPane.add(lblPhCp);
		
		JLabel label_5 = new JLabel("K\u1EBFt qu\u1EA3");
		label_5.setBounds(12, 409, 72, 32);
		contentPane.add(label_5);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(112, 206, 244, 27);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(112, 324, 244, 27);
		contentPane.add(textField_2);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(112, 409, 388, 259);
		contentPane.add(textField_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("");
		comboBox.setBounds(112, 283, 244, 22);
		contentPane.add(comboBox);
		
		JButton button = new JButton("Tho\u00E1t");
		button.setBounds(403, 681, 97, 25);
		contentPane.add(button);
		
		JButton button_1 = new JButton("T\u00EDnh");
		button_1.setBounds(294, 681, 97, 25);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("L\u01B0u");
		button_2.setBounds(12, 681, 97, 25);
		contentPane.add(button_2);
		
		JLabel lblHTn = new JLabel("H\u1ECD t\u00EAn");
		lblHTn.setBounds(12, 13, 113, 32);
		contentPane.add(lblHTn);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Nam");
		rdbtnNewRadioButton.setSelected(true);
		rdbtnNewRadioButton.setBounds(197, 143, 72, 25);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("N\u1EEF");
		rdbtnNewRadioButton_1.setBounds(363, 143, 72, 25);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Gi\u1EDBi t\u00EDnh", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(112, 116, 387, 74);
		contentPane.add(panel);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Nh\u00E2n vi\u00EAn t\u1EADp s\u1EF1");
		chckbxNewCheckBox.setSelected(true);
		chckbxNewCheckBox.setBounds(112, 244, 177, 25);
		contentPane.add(chckbxNewCheckBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"8000000", "5000000", "3000000"}));
		comboBox_1.setBounds(112, 369, 244, 22);
		contentPane.add(comboBox_1);
	}

}
