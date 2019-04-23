import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import databaseConnection.DTBConn;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Modify {

	private JFrame frame2;
	private JTextField txtMXe;
	private JTextField textField_1;
	private JTextField txtNote;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Modify window = new Modify();
					window.frame2.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				try
				{
				Modify window = new Modify();
				window.frame2.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Modify() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame2 = new JFrame();
		frame2.setBounds(100, 100, 600, 400);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		txtMXe = new JTextField();
		txtMXe.setEditable(false);
		txtMXe.setText("M\u00E3 xe");
		txtMXe.setHorizontalAlignment(SwingConstants.CENTER);
		txtMXe.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setColumns(10);
		
		txtNote = new JTextField();
		txtNote.setEditable(false);
		txtNote.setText("Note");
		txtNote.setHorizontalAlignment(SwingConstants.CENTER);
		txtNote.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setColumns(10); 
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Max = textField_1.getText();
				String Nt  = textField_3.getText();
				DTBConn.ModifyData(Max, Nt);
			   
			}
		});
		GroupLayout groupLayout = new GroupLayout(frame2.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(47)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnNewButton, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(Alignment.LEADING, groupLayout.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(txtNote, Alignment.LEADING)
							.addComponent(txtMXe, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)))
					.addGap(85)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(textField_3)
						.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE))
					.addContainerGap(107, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(42)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(textField_1)
						.addComponent(txtMXe, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
					.addGap(45)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(textField_3)
						.addComponent(txtNote, GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE))
					.addGap(53)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(65, Short.MAX_VALUE))
		);
		frame2.getContentPane().setLayout(groupLayout);
	}
}
