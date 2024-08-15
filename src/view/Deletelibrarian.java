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

public class Deletelibrarian {

	public Deletelibrarian() {
	
		// TODO Auto-generated constructor stub
		JFrame f5 =new JFrame("Delete");
		JLabel l=new JLabel("Delete librarian");
		l.setBounds(150, 10, 300, 90);
		JLabel id=new JLabel("Enter id:");
		id.setBounds(10, 80, 250, 60);
		JTextField idtx = new JTextField();
		idtx.setBounds(150, 100, 150, 20);
		JButton btnDelete=new JButton(" Delete");
		btnDelete.setBounds(150, 150, 150, 60);
		btnDelete.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String sid = idtx.getText();
				try {  
					int id = Integer.parseInt(sid);
					MyJdbc.delete(id);
					f5.dispose();
					JOptionPane.showMessageDialog(f5, "Librarian Deleted Successfully","Alert",JOptionPane.WARNING_MESSAGE);
				} catch (NumberFormatException | ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					JOptionPane.showMessageDialog(f5, "Error something is wrong please Enter correct id","Alert",JOptionPane.WARNING_MESSAGE);
				}
				
			}
		});
		
		 f5.add(l);
		 f5.add(id);
		 f5.add(idtx);
		 f5.add(btnDelete);
		f5.setLayout(null);
		f5.setVisible(true);
		f5.setSize(600,400);
	}

}
