package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Login {

	public Login() {
		 {
				JFrame f =new JFrame("Login");
				JLabel l=new JLabel("Library Management - Java Tpoint");
				l.setBounds(110, 20, 250, 60);
				JButton adminbtn=new JButton("Admin Login");
				adminbtn.setBounds(150, 80, 150, 60);
				JButton librarianbtn=new JButton("Librarian Login");
				librarianbtn.setBounds(150, 150, 150, 60);
				adminbtn.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						   new Adminlogin();
					}
				});
				librarianbtn.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						
					}
				});
				f.add(l);
				f.add(adminbtn);
				f.add(librarianbtn);
				f.setLayout(null);
				f.setVisible(true);
				f.setSize(600,400);
			}
	}

}
