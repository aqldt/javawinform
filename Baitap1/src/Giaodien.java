import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class Giaodien extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JPanel panel;
	private JTextField textField_5;
	private JTextField textField_6;
	
	int tb;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 533, 424);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("H\u1ECD t\u00EAn sinh vi\u00EAn:");
		lblNewLabel.setBounds(12, 13, 174, 16);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		textField = new JTextField();
		textField.setBounds(198, 12, 302, 22);
		textField.setColumns(10);
		
		JLabel lblLpTrnhWindows = new JLabel("L\u1EADp tr\u00ECnh Windows");
		lblLpTrnhWindows.setBounds(37, 75, 170, 16);
		lblLpTrnhWindows.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JLabel lblLpTrnhJava = new JLabel("L\u1EADp tr\u00ECnh Java");
		lblLpTrnhJava.setBounds(37, 116, 149, 16);
		lblLpTrnhJava.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JLabel lblQunTrSql = new JLabel("Qu\u1EA3n tr\u1ECB SQL Server");
		lblQunTrSql.setBounds(37, 156, 185, 16);
		lblQunTrSql.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JLabel lblCuTrcD = new JLabel("C\u1EA5u tr\u00FAc d\u1EEF li\u1EC7u");
		lblCuTrcD.setBounds(37, 195, 149, 16);
		lblCuTrcD.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		textField_1 = new JTextField();
		textField_1.setBounds(230, 74, 64, 22);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(230, 115, 64, 22);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(230, 155, 64, 22);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(230, 194, 64, 22);
		textField_4.setColumns(10);
		contentPane.setLayout(null);
		contentPane.add(lblNewLabel);
		contentPane.add(textField);
		contentPane.add(lblLpTrnhWindows);
		contentPane.add(lblLpTrnhJava);
		contentPane.add(lblQunTrSql);
		contentPane.add(lblCuTrcD);
		contentPane.add(textField_1);
		contentPane.add(textField_2);
		contentPane.add(textField_3);
		contentPane.add(textField_4);
		
		panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Nh\u1EADp trung b\u00ECnh m\u00F4n", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(12, 39, 302, 205);
		contentPane.add(panel);
		
		JButton btnNewButton = new JButton("T\u00EDnh TB");
		btnNewButton.setBounds(366, 73, 97, 25);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int a=Integer.parseInt(textField_1.getText());
				int b=Integer.parseInt(textField_2.getText());
				int c=Integer.parseInt(textField_3.getText());
				int d=Integer.parseInt(textField_4.getText());
				
				tb=(a+b+c+d)/4;
				
			}
		});
		
		JButton btnXpLoi = new JButton("X\u1EBFp Lo\u1EA1i");
		btnXpLoi.setBounds(366, 114, 97, 25);
		contentPane.add(btnXpLoi);
		
		JButton btnTipTc = new JButton("Ti\u1EBFp T\u1EE5c");
		btnTipTc.setBounds(366, 154, 97, 25);
		contentPane.add(btnTipTc);
		
		JButton btnThot = new JButton("Tho\u00E1t");
		btnThot.setBounds(366, 193, 97, 25);
		contentPane.add(btnThot);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Ch\u1EE9c n\u0103ng", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(336, 47, 154, 193);
		contentPane.add(panel_1);
		
		textField_5 = new JTextField();
		textField_5.setBounds(37, 278, 260, 79);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "X\u1EBFp lo\u1EA1i", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(12, 259, 307, 118);
		contentPane.add(panel_2);
		
		textField_6 = new JTextField();
		textField_6.setBounds(352, 299, 103, 36);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "\u0110i\u1EC3m trung b\u00ECnh", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(336, 259, 127, 118);
		contentPane.add(panel_3);
	}
}
