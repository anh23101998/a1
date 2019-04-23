import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;


import databaseConnection.DTBConn;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JButton;

public class AppView {

	private JFrame frame;
	private JTable table;
	private JTextField txtMaXe;
	private JTextField textField_1;
	
	Calendar c = Calendar.getInstance();
    int year = c.get(Calendar.YEAR);
    int month = c.get(Calendar.MONTH);
    int day = c.get(Calendar.DAY_OF_MONTH);
    int hour = c.get(Calendar.HOUR_OF_DAY);
    int minute = c.get(Calendar.MINUTE);
    int second = c.get(Calendar.SECOND);
    int millis = c.get(Calendar.MILLISECOND);
    static int count = 1;
    private JTable table_1;
    private JTextField txtMXe;
    private JTextField textField_2;
    private JTextField txtNote;
    private JTextField textField_3;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppView window = new AppView();
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
	public AppView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1080, 750);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Open");
		
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Exit");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_2 = new JMenu("Customer");
		mnNewMenu_2.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Add");
		mntmNewMenuItem_3.setHorizontalAlignment(SwingConstants.CENTER);
		mnNewMenu_2.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Modify");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Modify.NewScreen();
			}
		});
		mntmNewMenuItem_4.setHorizontalAlignment(SwingConstants.CENTER);
		mnNewMenu_2.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Delete");
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Delete.NewScreen();
			}
		});
		
		mntmNewMenuItem_5.setHorizontalAlignment(SwingConstants.CENTER);
		mnNewMenu_2.add(mntmNewMenuItem_5);
		
		JMenu mnNewMenu_3 = new JMenu("Check");
		menuBar.add(	mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("CheckData");
		mntmNewMenuItem.setHorizontalAlignment(SwingConstants.CENTER);
		
		mnNewMenu_3.add(mntmNewMenuItem);
		
		JMenu mnNewMenu_1 = new JMenu("Help");
		menuBar.add(mnNewMenu_1);
		
		JScrollPane scrollPane = new JScrollPane();
		
		txtMaXe = new JTextField();
		txtMaXe.setHorizontalAlignment(SwingConstants.CENTER);
		txtMaXe.setEditable(false);
		txtMaXe.setText("Mã Xe");
		txtMaXe.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setColumns(10);
		table = new JTable();		
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Mã xe", "Time", "Date", "Note"
			}
		));
		scrollPane.setViewportView(table);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		
		txtMXe = new JTextField();
		txtMXe.setText("Mã Xe");
		txtMXe.setHorizontalAlignment(SwingConstants.CENTER);
		txtMXe.setEditable(false);
		txtMXe.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("Image1");
		
		JButton btnNewButton_1 = new JButton("Image2");
		
		txtNote = new JTextField();
		txtNote.setEditable(false);
		txtNote.setText("Note");
		txtNote.setHorizontalAlignment(SwingConstants.CENTER);
		txtNote.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setColumns(10);
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(63)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(txtMXe)
						.addComponent(txtNote)
						.addComponent(txtMaXe)
						.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(32)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(textField_1)
						.addComponent(textField_3)
						.addComponent(textField_2))
					.addGap(152)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
						.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(31)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 288, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(textField_1)
								.addComponent(txtMaXe, GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE))
							.addGap(45)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(textField_3)
								.addComponent(txtNote, GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE))))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(19)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(txtMXe)
								.addComponent(textField_2, GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))
							.addGap(48)
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
							.addGap(41)
							.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(18)
							.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 277, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(63, Short.MAX_VALUE))
		);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Time", "Date", "Note"
			}
		));
		scrollPane_1.setViewportView(table_1);
		frame.getContentPane().setLayout(groupLayout);
			
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int NumCols = table.getModel().getColumnCount();
				Object [] fina = new Object[NumCols];
				Object [] fin = new Object[6];
				String img1 = "/image/font" +textField_1.getText()+".png";
				String img2 = "/image/back" +textField_1.getText()+".png";
				if(textField_1.getText().equals("")) {
					JOptionPane.showMessageDialog(frame, "Chưa nhập mã xe");
				}
				else {
					if(Integer.parseInt(textField_1.getText())< 100){
						fina[0] = textField_1.getText();
						fina[1] = hour +":"+minute +":"+ second ;
						fina[2] = year +"-"+month+"-"+ day;
						fina[3] = textField_3.getText();
						
						fin[0] = fina[0];
						fin[1] = img1;
						fin[2] = img2;
						fin[3] = hour +":"+minute +":"+ second;
						fin[4] = year +"-"+month+"-"+ day;
						fin[5] = fina[3];
						
						textField_2.setText(textField_1.getText());
						DTBConn.InsertData(fin);
						((DefaultTableModel) table.getModel()).addRow(fina);
					}					
					else{
						JOptionPane.showMessageDialog(frame, "Mã xe không hợp lệ");
					}
				}
			}
		});	
		
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Object [] fina = new Object[5];
				Object [] fin = new Object[3];
				
				if(textField_2.getText().equals("")) {
					JOptionPane.showMessageDialog(frame, "Chưa nhập mã xe");
				}
				else {
					fina = DTBConn.GetData(textField_2.getText());
					if(fina[0]==null)
					{
						JOptionPane.showMessageDialog(frame, "Mã xe không tồn tại");
					}
					 else {
					fina = DTBConn.GetData(textField_2.getText());
					
					fin[0] = fina[2];
					fin[1] = fina[3];
					
					((DefaultTableModel) table_1.getModel()).addRow(fin);		
				     }
			     }
			}	
		});
			
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JLabel lblNewLabel = new JLabel("New label");
				Object [] fina = new Object[5];
				String localDir = System.getProperty("user.dir");
				if(textField_2.getText().equals("")) {
					JOptionPane.showMessageDialog(frame, "Chưa nhập mã xe");
				}
				else {
					fina = DTBConn.GetData(textField_2.getText());
					if(fina[0]==null)
					{
						JOptionPane.showMessageDialog(frame, "Mã xe không tồn tại");
					}
					 else {
					JFrame frameImagi = new JFrame("Ảnh 1");				

					fina = DTBConn.GetData(textField_2.getText());
						
					lblNewLabel.setIcon(new ImageIcon(localDir +fina[0]));
						
					frameImagi.getContentPane().add(lblNewLabel, BorderLayout.CENTER);
					frameImagi.pack();
					frameImagi.setLocationRelativeTo(null);
					frameImagi.setVisible(true);
				}
				}
			}
		}); 
	
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JLabel lblNewLabel_1 = new JLabel("New label");
				Object [] fina = new Object[5];
				String localDir = System.getProperty("user.dir");
				if(textField_2.getText().equals("")) {
					JOptionPane.showMessageDialog(frame, "Chưa nhập mã xe");
				}
				else {
					fina = DTBConn.GetData(textField_2.getText());
					if(fina[0]==null)
					{
						JOptionPane.showMessageDialog(frame, "Mã xe không tồn tại");
					}
					 else {
					JFrame frameImagi = new JFrame("Ảnh 2");				

					fina = DTBConn.GetData(textField_2.getText());
							
            		lblNewLabel_1.setIcon(new ImageIcon(localDir +fina[1]));
					
					frameImagi.getContentPane().add(lblNewLabel_1, BorderLayout.CENTER);
					frameImagi.pack();
					frameImagi.setLocationRelativeTo(null);
					frameImagi.setVisible(true);
				}
				}				
			}
		});
	}
}
