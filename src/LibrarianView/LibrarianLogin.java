package LibrarianView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controller.MyJdbc;
public class LibrarianLogin {

	public LibrarianLogin() {
		
		// TODO Auto-generated constructor stub
		JFrame f1 =new JFrame("LibrarianLogin");
		JLabel l=new JLabel("librarian login form");
		l.setBounds(150, 10, 300, 90);
		JLabel Name=new JLabel("Enter Name:");
		Name.setBounds(10, 80, 250, 60);
		JTextField tx = new JTextField();
		tx.setBounds(150, 100, 150, 20);
		JLabel Pass=new JLabel("Enter Password:");
		Pass.setBounds(10, 130, 250, 60);
		JTextField tx1 = new JTextField();
		tx1.setBounds(150, 150, 150, 20);
		JButton btnlogin=new JButton(" Login");
		btnlogin.setBounds(150, 200, 150, 60);
		btnlogin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub 
				String librarianName = tx.getText();
				String Pass = tx1.getText();
				if(MyJdbc.validate(librarianName, Pass))
						{
					       
					       f1.dispose();
						}
				else
				{
					JOptionPane.showMessageDialog(f1, "Username or Password incorrect","Alert",JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		f1.add(l);
		f1.add(Name);
		f1.add(Pass);
		f1.add(tx);
		f1.add(btnlogin);
		f1.add(tx1);
		f1.setLayout(null);
		f1.setVisible(true);
		f1.setSize(600,400);
	}
	
	
	}
	

