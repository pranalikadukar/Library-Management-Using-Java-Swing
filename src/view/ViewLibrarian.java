package view;

import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;

import controller.MyJdbc;

public class ViewLibrarian {

	public ViewLibrarian() {
		// TODO Auto-generated constructor stub
		JFrame f4 =new JFrame("Viewlibrarian");
		try {
			MyJdbc.View();
			JTable t1 = new JTable();
			t1.setAutoResizeMode(50);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  
		f4.setLayout(null);
		f4.setVisible(true);
		f4.setSize(600,400);
	}

}
