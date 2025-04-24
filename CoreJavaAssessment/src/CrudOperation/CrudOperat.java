package CrudOperation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;

public class CrudOperat extends JFrame implements ActionListener{
	
	JTextField firstName, id, lastName, E_Mail, contactTextField;
	JButton insert, update, delete, search;
	
	public int random;
	
	CrudOperat(){
		
		
		
		Random rand = new Random();
        random = rand.nextInt(100);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/TOPS-logo.png"));
        Image i2 = i1.getImage().getScaledInstance(400, 50, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(40, 30, 400, 50);
        add(label);
        
        
		
		JLabel ID = new JLabel("ID");
		ID.setFont(new Font("Raileway",Font.BOLD,14));
		ID.setBounds(40, 120, 40, 30);
		add(ID);
		
		
		
		id = new JTextField();
		id.setFont(new Font("Raileway",Font.BOLD,14));
		id.setBounds(230, 120, 250, 30);
		add(id);
		
		
		
		JLabel fName = new JLabel("First Name");
		fName.setFont(new Font("Raileway",Font.BOLD,14));
		fName.setBounds(40, 160, 100, 30);
		add(fName);
		
		
		
		firstName = new JTextField();
		firstName.setFont(new Font("Raileway",Font.BOLD,14));
		firstName.setBounds(230, 160, 250, 30);
		add(firstName);
		
		
		
		JLabel lName = new JLabel("Last Name");
		lName.setFont(new Font("Raileway",Font.BOLD,14));
		lName.setBounds(40, 200, 100, 30);
		add(lName);
		
		
		
		lastName = new JTextField();
		lastName.setFont(new Font("Raileway",Font.BOLD,14));
		lastName.setBounds(230, 200, 250, 30);
		add(lastName);
		
		
		
		JLabel eMail = new JLabel("E-mail");
		eMail.setFont(new Font("Raileway",Font.BOLD,14));
		eMail.setBounds(40, 240, 100, 30);
		add(eMail);
		
		
		
		E_Mail = new JTextField();
		E_Mail.setFont(new Font("Raileway",Font.BOLD,14));
		E_Mail.setBounds(230, 240, 250, 30);
		add(E_Mail);
		
		
		
		JLabel contact = new JLabel("Contact");
		contact.setFont(new Font("Raileway",Font.BOLD,14));
		contact.setBounds(40, 280, 100, 30);
		add(contact);
		
		
		
		contactTextField = new JTextField();
		contactTextField.setFont(new Font("Raileway",Font.BOLD,14));
		contactTextField.setBounds(230, 280, 250, 30);
		add(contactTextField);
		
		
		
		insert = new JButton("Insert");
		insert.setBackground(new Color(0, 204, 255));
		insert.setForeground(Color.black);
		insert.setFont(new Font("Raleway", Font.BOLD, 15));
		insert.setBounds(40, 340, 150, 30);
		insert.addActionListener(this);
		add(insert);
		
		
		
		update = new JButton("Update");
		update.setBackground(new Color(0, 204, 255));
		update.setForeground(Color.black);
		update.setFont(new Font("Raleway", Font.BOLD, 15));
		update.setBounds(330, 340, 150, 30);
		update.addActionListener(this);
		add(update);
		
		
		
		search = new JButton("Search");
		search.setBackground(new Color(0, 204, 255));
		search.setForeground(Color.black);
		search.setFont(new Font("Raleway", Font.BOLD, 15));
		search.setBounds(40, 390, 150, 30);
		search.addActionListener(this);
		add(search);
		


		delete = new JButton("Delete");
		delete.setBackground(new Color(255, 0, 0));
		delete.setForeground(Color.black);
		delete.setFont(new Font("Raleway", Font.BOLD, 15));
		delete.setBounds(330, 390, 150, 30);
		delete.addActionListener(this);
		add(delete);

		
		
		setTitle("Miku Assessment");
	    setLayout(null);
		setSize(550, 500);
	    getContentPane().setBackground(Color.WHITE);
	    setLocation(350,100);
	    setVisible(true);
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	    
	    
	    
	}		//constructor closing
	
	
	
    public void actionPerformed(ActionEvent ae){
    	
//    	this condition applied for insert Button
    	
    	if (ae.getSource() == insert) {
    		String idTextField = "" + random;
	        String fname = firstName.getText();
	        String lname = lastName.getText();
	        String email = E_Mail.getText();
	        String cnt = contactTextField.getText();
	        
	        
	        
	        try{
	            if(fname.equals("")){
	                JOptionPane.showMessageDialog(null, "First Name is Required");
	            }else if(lname.equals("")){
	                JOptionPane.showMessageDialog(null, "Last Name Name is Required");
	            }else if(email.equals("")){
	                JOptionPane.showMessageDialog(null, "Email is Required");
	            }else if(cnt.equals("")){
	                JOptionPane.showMessageDialog(null, "Contact Number is Required");
	            }else{
	            	
	            	Conn c = new Conn();
		                	
		                	String query = "insert into student values('"+idTextField+"', '"+fname+"', '"+lname+"', '"+email+"', '"+cnt+"')";
			                c.s.executeUpdate(query);
		                    JOptionPane.showMessageDialog(null, "Data Inserted Successfully");
		                    
		                    
		     
//		                    this is used for  clear all TextFields after inserted the data
			                id.setText("");
			                firstName.setText("");
			                lastName.setText("");
			                E_Mail.setText("");
			                contactTextField.setText("");
	                
	               	               
	            }
	        }catch (Exception e){
	            System.out.println(e);
	        }
	        
	        
//	        this condition applied for update button
    	}else if(ae.getSource() == update) {
    		
    		String idTextField = id.getText();
	        String fname = firstName.getText();
	        String lname = lastName.getText();
	        String email = E_Mail.getText();
	        String cnt = contactTextField.getText();
	        
	        try{
	        	if(id.equals("")){
	                JOptionPane.showMessageDialog(null, "id is Required");
	            }else if(fname.equals("")){
	                JOptionPane.showMessageDialog(null, "First Name is Required");
	            }else if(lname.equals("")){
	                JOptionPane.showMessageDialog(null, "Last Name Name is Required");
	            }else if(email.equals("")){
	                JOptionPane.showMessageDialog(null, "Email is Required");
	            }else if(cnt.equals("")){
	                JOptionPane.showMessageDialog(null, "Contact Number is Required");
	            }else{
	            	
	            	Conn c = new Conn();
	            	
		                	String query = "update student set first_name = '"+fname+"', last_name = '"+lname+"', email = '"+email+"', mobile_no = '"+cnt+"' where id = '"+idTextField+"'";
			                c.s.executeUpdate(query);
		                    JOptionPane.showMessageDialog(null, "Data updated Successfully");
		                    
		                    
		     
//		                    this is used for  clear all TextFields after inserted the data
			                id.setText("");
			                firstName.setText("");
			                lastName.setText("");
			                E_Mail.setText("");
			                contactTextField.setText("");
	                
	               	               
	            }
	        }catch (Exception e){
	            System.out.println(e);
	        }
    		
    		
//    		this condition applied for search button
    	}else if(ae.getSource() == search) {

	        String idTextField = id.getText();
	        
	        
    		try {
                Conn c = new Conn();
                String query = "select * from student where id = '"+idTextField+"'";
                ResultSet rs = c.s.executeQuery(query);
                
                
//                this is use for get data / search data from database to form field by field
                if(rs.next()){
//                    id.setText(rs.getString("id"));
                    firstName.setText(rs.getString("first_name"));
                    lastName.setText(rs.getString("last_name"));
                    E_Mail.setText(rs.getString("email"));
                    contactTextField.setText(rs.getString("mobile_no"));
                    
                    JOptionPane.showMessageDialog(null, "Data founded");
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Please Enter Correct id Number");
                }
                
                
            }catch(Exception e) {
                e.printStackTrace();
            }
    		
    		
//    		this condition applied for delete button
    	}else if(ae.getSource() == delete) {
    		
    		String idLabel = id.getText();
    		
    		try{
                Conn c = new Conn();
                
                c.s.executeUpdate("delete from student where id = '"+idLabel+"'");
                
                if(idLabel == "") {
                	JOptionPane.showMessageDialog(null, "Student Data Not Found, Please search again and delete");
                }else {
                	JOptionPane.showMessageDialog(null, "Student Data Deleted Successfully");
                }
               
                
                
//                after deletes the data clear the all fields
                id.setText("");
                firstName.setText("");
                lastName.setText("");
                E_Mail.setText("");
                contactTextField.setText("");
                
           
            }catch(Exception e){
                e.printStackTrace();
            
            }
    	}

    }		//actionPerformed Closing

	
	 
	
	public static void main(String args[]) {
		new CrudOperat();
	}		//main method closing



}		//main class closing
