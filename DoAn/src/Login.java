import java.awt.EventQueue;

import javax.swing.JFrame;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Window;

import javax.swing.SwingConstants;

import databaseConnection.DTBConn;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {

	private JFrame frame;
	private JTextField Login;
	private JPasswordField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setAlwaysOnTop(true);
		frame.setBounds(100, 100, 282, 325);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel.setBounds(81, 11, 106, 33);
		frame.getContentPane().add(lblNewLabel);
		
		Login = new JTextField();
		Login.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		Login.setBounds(33, 130, 199, 20);
		frame.getContentPane().add(Login);
		Login.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("User Name");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(95, 106, 80, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("PassWord");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(95, 161, 80, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Login");
		
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNewButton.setBounds(33, 252, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Sign In");
		
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNewButton_1.setBounds(143, 252, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		password = new JPasswordField();
		password.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		password.setBounds(33, 186, 199, 20);
		frame.getContentPane().add(password);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String UserName = Login.getText();
				String PassWord = password.getText();
				if(UserName.equals("") || PassWord.equals("") ) {
					JOptionPane.showMessageDialog(frame, "chua nhap tai hoac mat khau");
				}
				else {
					if ( DTBConn.Login(UserName, PassWord)) {
						AppView app = new AppView();
						app.frame.setVisible(true);
						frame.setVisible(false);
					}
					
				}
			}
		});
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String UserName = Login.getText();
				String PassWord = password.getText();
				if(DTBConn.Usecheck(UserName)) {
					JOptionPane.showMessageDialog(frame, "Tai khoan da toan tai");
				}
				else {
					if(DTBConn.Sigin(UserName,PassWord))
					{
						JOptionPane.showMessageDialog(frame, "Dang ki thanh cong");
					}
					else {
						JOptionPane.showMessageDialog(frame, "Dang ki that bai");
					}
				}
			}
		});
	}
}
