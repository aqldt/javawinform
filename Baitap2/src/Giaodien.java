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
import javax.swing.JTextField;
import java.awt.List;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import java.awt.Choice;
import javax.swing.JRadioButton;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

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
		setBackground(Color.WHITE);
		setTitle("T\u00CDNH TI\u1EC0N N\u01AF\u1EDAC");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 548, 649);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("H\u1ECD t\u00EAn kh\u00E1ch h\u00E0ng");
		lblNewLabel.setBounds(12, 13, 113, 32);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(160, 18, 340, 27);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNgySinh = new JLabel("Ng\u00E0y sinh");
		lblNgySinh.setBounds(12, 58, 72, 32);
		contentPane.add(lblNgySinh);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerDateModel(new Date(1601053200000L), null, null, Calendar.MONTH));
		spinner.setBounds(160, 63, 196, 22);
		contentPane.add(spinner);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Nam");
		rdbtnNewRadioButton.setSelected(true);
		rdbtnNewRadioButton.setBounds(229, 145, 72, 25);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnN = new JRadioButton("N\u1EEF");
		rdbtnN.setBounds(351, 145, 72, 25);
		contentPane.add(rdbtnN);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Gi\u1EDBi t\u00EDnh", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(160, 125, 316, 69);
		contentPane.add(panel);
		
		JLabel lblSinThoi = new JLabel("S\u1ED1 \u0111i\u1EC7n tho\u1EA1i");
		lblSinThoi.setBounds(12, 208, 113, 32);
		contentPane.add(lblSinThoi);
		
		JLabel lbliTngS = new JLabel("\u0110\u1ED1i t\u01B0\u1EE3ng s\u1EED d\u1EE5ng");
		lbliTngS.setBounds(12, 254, 113, 32);
		contentPane.add(lbliTngS);
		
		JLabel lblKhiLngNc = new JLabel("Kh\u1ED1i l\u01B0\u1EE3ng n\u01B0\u1EDBc");
		lblKhiLngNc.setBounds(12, 299, 113, 32);
		contentPane.add(lblKhiLngNc);
		
		JLabel lblTinNc = new JLabel("Ti\u1EC1n n\u01B0\u1EDBc");
		lblTinNc.setBounds(12, 344, 72, 32);
		contentPane.add(lblTinNc);
		
		JLabel lblKtQu = new JLabel("K\u1EBFt qu\u1EA3");
		lblKtQu.setBounds(12, 387, 72, 32);
		contentPane.add(lblKtQu);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(160, 211, 196, 27);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(160, 304, 196, 27);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(160, 349, 196, 27);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(160, 392, 340, 144);
		contentPane.add(textField_4);
		
		JLabel lblSNhnKhu = new JLabel("S\u1ED1 nh\u00E2n kh\u1EA9u");
		lblSNhnKhu.setBounds(363, 207, 91, 32);
		contentPane.add(lblSNhnKhu);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Sinh hoa\u0323t h\u00F4\u0323 d\u00E2n c\u01B0", "Sa\u0309n xu\u00E2\u0301t kinh doanh", "C\u01A1 quan ha\u0300nh chi\u0301nh"}));
		comboBox.setToolTipText("");
		comboBox.setBounds(160, 259, 196, 22);
		contentPane.add(comboBox);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(466, 213, 30, 22);
		contentPane.add(spinner_1);
		
		JButton btnNewButton = new JButton("Tho\u00E1t");
		btnNewButton.setBounds(403, 564, 97, 25);
		contentPane.add(btnNewButton);
		
		JButton btnTnh = new JButton("T\u00EDnh");
		btnTnh.setBounds(294, 564, 97, 25);
		contentPane.add(btnTnh);
		
		JButton btnLu = new JButton("L\u01B0u");
		btnLu.setBounds(12, 564, 97, 25);
		contentPane.add(btnLu);
	}
}