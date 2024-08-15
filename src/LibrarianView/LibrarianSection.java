package LibrarianView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import view.AddLibrarian;
import view.Deletelibrarian;
import view.Login;
import view.ViewLibrarian;

public class LibrarianSection {

	public LibrarianSection() {
	
		// TODO Auto-generated constructor stub

		JFrame f2 =new JFrame("Librarian Section");
		JLabel l =new JLabel("Librarian section");
		JButton btnbooks=new JButton("Add books");
		btnbooks.setBounds(150, 80, 150, 50);
		JButton btnview=new JButton("View books");
		btnview.setBounds(150, 140, 150, 50);
		JButton btnissued=new JButton("Issued Book");
		btnissued.setBounds(150, 200, 150, 50);
		JButton issuedviewbtn=new JButton("Viewed issued book");
		issuedviewbtn.setBounds(150, 260, 150, 50);
		JButton btnReturn=new JButton("Return book");
		btnReturn.setBounds(150, 330, 150, 50);
		JButton btnlogout=new JButton("Logout");
		btnlogout.setBounds(150, 390, 150, 50);
		btnbooks.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				f2.dispose();
				
			}
		});
		btnview.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				f2.dispose();
				
			}
		});
		btnissued.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
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
		f2.add(btnbooks);
		f2.add(btnview);
		f2.add(btnissued);
		f2.add(issuedviewbtn);
		f2.add(btnReturn);
		f2.add(btnlogout);
		f2.setLayout(null);
		f2.setVisible(true);
		f2.setSize(600,700);
 }
	}
 
