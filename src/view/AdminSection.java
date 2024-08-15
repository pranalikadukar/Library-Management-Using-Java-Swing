package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import controller.MyJdbc;

public class AdminSection {

	public AdminSection() {
		// TODO Auto-generated constructor stu
			 {
					JFrame f2 =new JFrame("Admin Section");
					JButton btnlibrarian=new JButton("Add Librarian");
					btnlibrarian.setBounds(150, 80, 150, 50);
					JButton btnview=new JButton("View Librarian");
					btnview.setBounds(150, 140, 150, 50);
					JButton btndelete=new JButton("Delete Librarian");
					btndelete.setBounds(150, 200, 150, 50);
					JButton btnlogout=new JButton("Logout");
					btnlogout.setBounds(150, 270, 150, 50);
					btnlibrarian.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent arg0) {
							// TODO Auto-generated method stub
							new AddLibrarian();
							f2.dispose();
							
						}
					});
					btnview.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent arg0) {
							// TODO Auto-generated method stub
							new ViewLibrarian();
							f2.dispose();
							
						}
					});
					btndelete.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							new Deletelibrarian();
							f2.dispose();
						}
					});
					btnlogout.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							new Login();
							f2.dispose();
						}
					});
					f2.add(btnlibrarian);
					f2.add(btnview);
					f2.add(btndelete);
					f2.add(btnlogout);
					f2.setLayout(null);
					f2.setVisible(true);
					f2.setSize(600,400);
			 }
	}
	

}
