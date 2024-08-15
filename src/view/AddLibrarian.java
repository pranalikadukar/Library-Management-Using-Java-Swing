package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controller.MyJdbc;
import model.Library;

public class AddLibrarian {

	public AddLibrarian() {
		JFrame f3 =new JFrame("Add Librarian");
		JLabel l=new JLabel("Add Librarian");
		l.setBounds(150, 10, 300, 90);
		JLabel ID=new JLabel(" Id:");
		ID.setBounds(10, 60, 250, 60);
		JTextField IDtx = new JTextField();
		IDtx.setBounds(150, 70, 150, 20);
		JLabel Name=new JLabel(" Name:");
		Name.setBounds(10, 80, 250, 60);
		JTextField Nametx = new JTextField();
		Nametx.setBounds(150, 100, 150, 20);
		JLabel Pass=new JLabel(" Password:");
		Pass.setBounds(10, 130, 250, 60);
		JTextField Passtx = new JTextField();
		Passtx.setBounds(150, 150, 150, 20);
		JLabel Email=new JLabel(" Email:");
		Email.setBounds(10, 180, 250, 60);
		JTextField Emailtx = new JTextField();
		Emailtx.setBounds(150, 200, 150, 20);
		JLabel Address=new JLabel(" Address:");
		Address.setBounds(10, 230, 250, 60);
		JTextField Addresstx = new JTextField();
		Addresstx.setBounds(150, 250, 150, 20);
		JLabel City=new JLabel(" City:");
		City.setBounds(10, 280, 250, 60);
		JTextField Citytx = new JTextField();
		Citytx.setBounds(150, 300, 150, 20);
		JLabel Contact=new JLabel(" Contact:");
		Contact.setBounds(10, 330, 250, 60);
		JTextField Contacttx = new JTextField();
		Contacttx.setBounds(150, 350, 150, 20);
		JButton addbtn = new JButton("Add Librarian");
		addbtn.setBounds(140, 400, 150, 60);
		JButton Backbtn = new JButton("back");
		Backbtn.setBounds(150, 480, 120, 40);
		addbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int id = Integer.parseInt(IDtx.getText());
				String name= Nametx.getText();
				String pass = Passtx.getText();
				String email = Emailtx.getText();
				String address = Addresstx.getText();
				String city = Citytx.getText();
				String contact = Contacttx.getText();
				try {
					int a=0;
					 a=MyJdbc.insert(id,name,pass,email,address,city,contact);
					 if(a>0)
						JOptionPane.showMessageDialog(f3, "Librarian add Successfully","Alert",JOptionPane.WARNING_MESSAGE);
						 
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					JOptionPane.showMessageDialog(f3, "Error something is wrong please add data prperly","Alert",JOptionPane.WARNING_MESSAGE);
				}
				
				
				
			}
		});
		Backbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				new AdminSection();
				f3.dispose();
				
			}
		});
		f3.add(l);
		f3.add(ID);
		f3.add(IDtx);
		 f3.add(Name);
		 f3.add(Nametx);
		 f3.add(Pass);
		 f3.add(Passtx);
		 f3.add(Email);
		 f3.add(Emailtx);
		 f3.add(Address);
		 f3.add(Addresstx);
		 f3.add(City);
		 f3.add(Citytx);
		 f3.add(Contact);
		 f3.add(Contacttx);
		 f3.add(addbtn);
		 f3.add(Backbtn);
		f3.setLayout(null);
		f3.setVisible(true);
		f3.setSize(600,650);
	}
 
}
