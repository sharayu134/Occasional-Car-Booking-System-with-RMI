import java.rmi.Naming; 
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException; 
	import java.rmi.NotBoundException;
	import java.util.*;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel; 
	
	public class BookingRMIClient implements ActionListener  {
	
		BookingInterface c;
		JFrame log = new JFrame();
		JFrame sign = new JFrame();
		JFrame wec = new JFrame();
		JFrame cr = new JFrame();
		JFrame get = new JFrame();
		JFrame al = new JFrame();
		 DefaultTableModel model = new DefaultTableModel();
		JButton lSUBMIT,lSignup;
		  JPanel lpanel;
		  JLabel llabel1,llabel2;
		   JTextField  ltext1;
		  JPasswordField ltext2;
		  JCheckBox lshowPassword;
		  JLabel sl1, sl2, sl3, sl4, sl5, sl6, sl7, sl8;  
		    JTextField stf1, stf2, stf5, stf6, stf7;  
		    JButton sbtn1, sbtn2,sbtn3;  
		    JPasswordField sp1, sp2;  
		    JLabel wl1;
		    JTextField  wtf6 ;
		    JButton wbtn1, wbtn2,wbtn3,wbtn4; 
		    
		    JLabel cl1, cl2, cl3, cl4, cl5;
		    JTextField ctf1, ctf2, ctf5, ctf6;
		    JButton cbtn1, cbtn2,cbtn3;  ;  
		   
		    JTextField gtf1, gtf2, gtf3, gtf4;
			 JLabel  gl1, gl2, gl3, gl4;
			 JPanel gpanel;
			 JButton gbtn1;
			 
			    Container cnt = al.getContentPane();
			    JTable jtbl = new JTable(model);
				Container d;
				JButton back;
				
				BookingRMIClient() throws MalformedURLException, RemoteException, NotBoundException
				{
					 c = ( BookingInterface)
		                 Naming.lookup("rmi://localhost/BookingService");
					}
			
		
		void login()
		{
				
			   llabel1 = new JLabel();
			   llabel1.setText("Username:");
			   ltext1 = new JTextField(15);
			 
			   llabel2 = new JLabel();
			   llabel2.setText("Password:");
			   ltext2 = new JPasswordField(15);
			   lshowPassword=new JCheckBox("Show Password");
			  
			   lSUBMIT=new JButton("SUBMIT");
			   lSignup= new JButton("signup"); 
			   
			   lpanel=new JPanel(new FlowLayout());
			   lpanel.setLayout(null);
			   llabel1.setBounds(100, 70, 400, 30);  
			   llabel2.setBounds(100, 110, 200, 30);  
			  
			   ltext1.setBounds(180, 70, 200, 30);  
			   ltext2.setBounds(180, 110, 200, 30);  
			   lshowPassword.setBounds(180,150,150,30);
			   lSUBMIT.setBounds(150,200,100,40);
			   lSignup.setBounds(270,200,100,40);
			   lpanel.add(llabel1);
			   lpanel.add(ltext1);
			   lpanel.add(llabel2);
			   lpanel.add(ltext2);
			   lpanel.add(lshowPassword);
			   lpanel.add(lSUBMIT);
			   lpanel.add(lSignup);
			  
			   log.add(lpanel,BorderLayout.CENTER);
			   lSignup.addActionListener(this);
			   lSUBMIT.addActionListener(this);
			   lshowPassword.addActionListener(this);
			   log.setTitle("LOGIN FORM");
			   log.setVisible(true);
			   log.setSize(600,500);
		}
		void signup()
		{
			 	sign.setVisible(true);  
		        sign.setSize(700, 700);  
		        sign.setLayout(null);  
		        sign.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
		        sign.setTitle("Registration ");  
		        sl1 = new JLabel("Registration");  
		        sl1.setForeground(Color.blue);  
		        sl1.setFont(new Font("Serif", Font.BOLD, 20));  
		        sl2 = new JLabel("Name:");  
		        sl3 = new JLabel("Email-ID:");  
		        sl4 = new JLabel("Create Passowrd:");  
		        sl5 = new JLabel("Confirm Password:");  
		        sl6 = new JLabel("Country:");  
		        sl7 = new JLabel("State:");  
		        sl8 = new JLabel("Phone No:");   
		        stf1 = new JTextField();  
		        stf2 = new JTextField();  
		        sp1 = new JPasswordField();  
		        sp2 = new JPasswordField();  
		        stf5 = new JTextField();  
		        stf6 = new JTextField();  
		        stf7 = new JTextField();  
		        sbtn1 = new JButton("Submit");  
		        sbtn2 = new JButton("Clear");  
		        sbtn3 = new JButton("login");
		        sbtn1.addActionListener(this);  
		        sbtn2.addActionListener(this);  
		       sbtn3.addActionListener(this); 
		        sl1.setBounds(100, 30, 400, 30);  
		        sl2.setBounds(80, 70, 200, 30);  
		        sl3.setBounds(80, 110, 200, 30);  
		        sl4.setBounds(80, 150, 200, 30);  
		        sl5.setBounds(80, 190, 200, 30);  
		        sl6.setBounds(80, 230, 200, 30);  
		        sl7.setBounds(80, 270, 200, 30);  
		        sl8.setBounds(80, 310, 200, 30);  
		        stf1.setBounds(300, 70, 200, 30);  
		        stf2.setBounds(300, 110, 200, 30);  
		        sp1.setBounds(300, 150, 200, 30);  
		        sp2.setBounds(300, 190, 200, 30);  
		        stf5.setBounds(300, 230, 200, 30);  
		        stf6.setBounds(300, 270, 200, 30);  
		        stf7.setBounds(300, 310, 200, 30);  
		        sbtn1.setBounds(50, 350, 100, 30);  
		        sbtn2.setBounds(170, 350, 100, 30);  
		        sbtn3.setBounds(290, 350, 100, 30); 
		        sign.add(sl1);  
		        sign.add(sl2);  
		        sign.add(stf1);  
		        sign.add(sl3);  
		        sign.add(stf2);  
		        sign.add(sl4);  
		        sign.add(sp1);  
		        sign.add(sl5);  
		        sign.add(sp2);  
		        sign.add(sl6);  
		        sign.add(stf5);  
		        sign.add(sl7);  
		        sign.add(stf6);  
		        sign.add(sl8);  
		        sign.add(stf7);  
		        sign.add(sbtn1);  
		        sign.add(sbtn2);  
		        sign.add(sbtn3);
		}
		void Welcome()
		{
			 wec.setVisible(true);  
	         wec.setSize(700, 700);  
	         wec.setLayout(null);  
	         wec.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	         wec.setTitle("Welcome");
	         
	         wl1 = new JLabel("Car Rental System"); 
	         wl1.setForeground(Color.blue);  
	         wl1.setFont(new Font("Serif", Font.BOLD, 20));  
	         wbtn1 = new JButton("Create Booking");  
	         wbtn2 = new JButton("Delete Booking");  
	         wbtn3 = new JButton("Get Booking"); 
	         wbtn4 = new JButton("Log Out");
	         wtf6 = new JTextField(); 
	         wbtn1.addActionListener(this);  
	         wbtn2.addActionListener(this);  
	         wbtn3.addActionListener(this); 
	         wbtn4.addActionListener(this); 
	         wtf6.setBounds(50, 190, 200, 30);
	         
	         wec.add(wl1);
	         wec.add(wbtn1);
	         wec.add(wbtn2);
	         wec.add(wbtn3);
	         wec.add(wbtn4);
	         wl1.setBounds(100, 30, 400, 30); 
	         wbtn1.setBounds(100,80,450,80);
	         wbtn2.setBounds(100,180,450,80);
	         wbtn3.setBounds(100,280,450,80);
	         wbtn4.setBounds(100,380,450,80);
		}
		void createbook()
		{
			cr.setVisible(true);  
	        cr.setSize(700, 700);  
	        cr.setLayout(null);  
	        cr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	        cr.setTitle("book your car now!! ");  
	        cl1 = new JLabel("Fill the Details");  
	        cl1.setForeground(Color.blue);  
	        cl1.setFont(new Font("Serif", Font.BOLD, 20)); 
	        
	        cl2 = new JLabel("CAR ID:");  
	        cl3 = new JLabel("Duration:");  
	        cl4 = new JLabel("Start Date:");  
	        cl5 = new JLabel("End Date:");  
	        ctf1 = new JTextField();  
	        ctf2 = new JTextField();  
	        ctf5 = new JTextField();  
	        ctf6 = new JTextField(); 
	        cbtn1 = new JButton("Submit");  
	        cbtn2 = new JButton("Clear");  
	        cbtn3 = new JButton("Display Available cars");  

	        cbtn1.addActionListener(this);  
	        cbtn2.addActionListener(this); 
	        cbtn3.addActionListener(this);  

	        cl1.setBounds(100, 30, 400, 30);  
	        cl2.setBounds(80, 70, 200, 30);  
	        cl3.setBounds(80, 110, 200, 30);  
	        cl4.setBounds(80, 150, 200, 30);  
	        cl5.setBounds(80, 190, 200, 30); 
	        ctf1.setBounds(200, 70, 200, 30);  
	        ctf2.setBounds(200, 110, 200, 30);  
	        ctf5.setBounds(200, 150, 200, 30);  
	        ctf6.setBounds(200, 190, 200, 30); 
	        cbtn1.setBounds(150, 250, 100, 30);  
	        cbtn2.setBounds(300, 250, 100, 30); 
	        cbtn3.setBounds(150, 300, 250, 30);
	        cr.add(cl1);  
	        cr.add(cl2);  
	        cr.add(ctf1);  
	        cr.add(cl3);  
	        cr.add(ctf2);  
	        cr.add(cl4);  
	        cr.add(ctf5);  
	        cr.add(cl5);  
	        cr.add(ctf6);  
	        cr.add(cbtn1);  
	        cr.add(cbtn2);  
	        cr.add(cbtn3);
	        
	     
	        
			
			
			
		}
		
		void getbook() throws RemoteException, SQLException
		{
			String carid3=JOptionPane.showInputDialog( "enter the id of booking"); 
	     //   DatabaseFun f3=new DatabaseFun();
	        String arr[]= {"","","",""};
	        
	        arr=c.get(carid3);
			 gpanel=new JPanel(new FlowLayout());
			   gpanel.setLayout(null);
			   get.setSize(600,500);
			   get.setVisible(true);
			   gbtn1 = new JButton("Submit");  
			     JLabel label=new JLabel("Database data : ");   
			     label.setBounds(10,40,100,20);
			     gl1 = new JLabel("car id:");

			        gl2 = new JLabel("duration:");

			        gl3 = new JLabel("start date:");

			        gl4 = new JLabel("End date:");
			        gtf1 = new JTextField();

			        gtf2 = new JTextField();

			        gtf3 = new JTextField();

			        gtf4 = new JTextField();
			        gl1.setBounds(80, 70, 200, 30);  
			        gl2.setBounds(80, 110, 200, 30);  
			        gl3.setBounds(80, 150, 200, 30);  
			        gl4.setBounds(80, 190, 200, 30);  
			        
			        gtf1.setBounds(200, 70, 200, 30);  
			         gtf2.setBounds(200, 110, 200, 30);  
			         gtf3.setBounds(200, 150, 200, 30);  
			         gtf4.setBounds(200, 190, 200, 30); 
			 
			        gpanel.add(label);
			        gpanel.add(gl1);
			        gpanel.add(gl2);
			        gpanel.add(gl3);
			        gpanel.add(gl4);
			        gpanel.add(gtf1);
			        gpanel.add(gtf2);
			        gpanel.add(gtf3);
			        gpanel.add(gtf4);
			        get.add(gpanel,BorderLayout.CENTER);
			        
		
			        
			       
			        gtf1.setText(arr[0]);
					
	                gtf2.setText(arr[1]);

	                gtf3.setText(arr[2]);

	                gtf4.setText(arr[3]);
	                
			        
		}
		void bookingtable()  throws RemoteException, SQLException
		{
				//DatabaseFun f2= new DatabaseFun();
				String arr[]=c.albook();
				 d=al.getContentPane();
		    		d.setLayout(null);
		   
		    	    al.setTitle("Available Cars");
		    	    al.setSize(830,600);
		    	    al.setVisible(true);
		    		back=new JButton("Back");
		    		back.setBounds(425, 400, 100, 50);
		    		d.add(back);
		    		cnt.setLayout(new FlowLayout(FlowLayout.LEFT));
		    		 model.addColumn("Car id");
		    	     model.addColumn("Car model");
		    	     model.addColumn("Seating Capacity");
		    	     System.out.println(arr[0]);
		    	     System.out.println(arr[1]);
		    	     System.out.println(arr[2]);
		    	     
		    	    model.addRow(new Object[]{arr[0],arr[1],arr[2]});
		    	    JScrollPane pg = new JScrollPane(jtbl);
		            cnt.add(pg);
		            al.pack();
		           // al.dispose();
		}
		public void actionPerformed(ActionEvent e)
		{
			 if (e.getSource() == lSignup) 
			   {
				  signup();
				 
				   
			   }
			       
			       
			   
			   //Coding Part of RESET button
			   if (e.getSource() == lSUBMIT) 
			   {
				 //  DatabaseFun f1= new DatabaseFun();
				   String userText;
			       String pwdText;
				   userText = ltext1.getText();
			       pwdText = ltext2.getText();
			       int c1 = 0;
				try {
					c1 = c.logsubmit(userText,pwdText);
				} catch (RemoteException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			       if(c1==5)
			       {
			    	   JOptionPane.showMessageDialog(log, "Login Successful");
			    	   Welcome();
			    
			       }
			       else if(c1==4)
			       {
			    	   JOptionPane.showMessageDialog(log, "Invalid Username or Password");
		    	   }
			       }
				   
			       
			   
			  //Coding Part of showPassword JCheckBox
			   if (e.getSource() == lshowPassword) {
			       if (lshowPassword.isSelected()) {
			           ltext2.setEchoChar((char) 0);
			       } else {
			           ltext2.setEchoChar('*');
			       }
			   }
			   
			   
			   
			   
			   
			   if (e.getSource() == sbtn1)  
		         {  
		            int x = 0;  
		            String name = stf1.getText();  
		           // System.out.println(s1);
		            String mail = stf2.getText();  
		            //System.out.println(s2);
		            char[] pass1 = sp1.getPassword(); 
		           // System.out.println(s3);
		            char[] pass2= sp2.getPassword();   
		           // System.out.println(s4);
		            String s8 = new String(pass1); 
		            System.out.println(s8);
		            String s9 = new String(pass2); 
		            System.out.println(s9);
		            String country = stf5.getText();  
		            //System.out.println(s5);
		            String state = stf6.getText(); 
		            //System.out.println(s6);
		            String mob = stf7.getText(); 
		            //System.out.println(s7);
		         
		            if (s8.equals(s9))  
		            {  
		            	//DatabaseFun f1= new DatabaseFun();
		            	int y = 0;
						try {
							y = c.sign(name,mail,s8,country,state,mob);
						} catch (RemoteException | SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
		            	if(y==3)
		            	{	
		            		JOptionPane.showMessageDialog(sbtn1, "Data Saved Successfully"); 
		            	}
		            }  
		            else  
		            {  
		                JOptionPane.showMessageDialog(sbtn1, "Password Does Not Match");  
		            }   
		          }   
		          if(e.getSource() == sbtn2) 
		          {  
		            stf1.setText("");  
		            stf2.setText("");  
		            sp1.setText("");  
		            sp2.setText("");  
		            stf5.setText("");  
		            stf6.setText("");  
		            stf7.setText("");  
		          } 
		         if(e.getSource() == sbtn3)
		          {
		        	 BookingRMIClient bk = null;
					try {
						bk = new BookingRMIClient();
					} catch (MalformedURLException | RemoteException | NotBoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
		        	bk.login();
		        	sign.dispose();
		          }
		         
		         
		         if (e.getSource() == wbtn1)  
		     	{
		     		 createbook();
		     		 wec.dispose();
		 	    	   

		     	}
		     	if(e.getSource()==wbtn2)
		     	{
		     		  String carid=JOptionPane.showInputDialog( "enter the id of booking which you want to delete"); 
		           
		     		//DatabaseFun f2= new DatabaseFun();
		     		try {
						c.del(carid);
					} catch (RemoteException | SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
		     		JOptionPane.showMessageDialog(wbtn1, "Data Deleted");
		     		
		     	}
		     	if(e.getSource()==wbtn3)
		     	{
		     		  
		     		try {
						getbook();
					} catch (RemoteException | SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
		     	}
		     	if(e.getSource()==wbtn4)
		     	{
		     		BookingRMIClient bk = null;
					try {
						bk = new BookingRMIClient();
					} catch (MalformedURLException | RemoteException | NotBoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
		     		bk.login();
		     		wec.dispose();
		     	}
		     	
		     	
		     	
		     	if (e.getSource() == cbtn1)  
		        {  
		           int x = 0;  
		           String carid = ctf1.getText();  

		           String duration = ctf2.getText();  

		           String start = ctf5.getText(); 

		           String end= ctf6.getText();   
		          // DatabaseFun f1= new DatabaseFun();
		          int t = 0;
				try {
					t = c.create(carid,duration,start,end);
				} catch (RemoteException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		          if(t==7)
		          {
		        	  JOptionPane.showMessageDialog(cbtn1, "Data Saved Successfully"); 

		          }
		           cr.dispose();
		           BookingRMIClient bk = null;
				try {
					bk = new BookingRMIClient();
				} catch (MalformedURLException | RemoteException | NotBoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		           bk.Welcome();
		           
		        }
		     	if(e.getSource()==cbtn2)
		     	{
		     		  
		              ctf1.setText("");  
		              ctf2.setText("");  
		              
		              ctf5.setText("");  
		              ctf6.setText("");  
		       
		           
		     	}
		     	if(e.getSource()==cbtn3)
		    	{
		    		
		    		try {
						bookingtable();
					} catch (RemoteException | SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
		    		

		    	}
		     	if(e.getSource()==back)
		     	{
		     		  al.dispose();
		     		
					BookingRMIClient bk = null;
					try {
						bk = new BookingRMIClient();
					} catch (MalformedURLException | RemoteException | NotBoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			           bk.createbook();
			         
		     	}
		}
		
		
	 
	    public static void main(String[] args)  throws RemoteException, SQLException, MalformedURLException, NotBoundException { 
	    	
	    	
	    	BookingRMIClient bk=new BookingRMIClient();
	    	
	Scanner sc=new Scanner(System.in);
	int ch,a,b;
	String name = null;long mobno = 0;String password = null;
	        try { 
	           BookingInterface c = ( BookingInterface)
	                           Naming.lookup("rmi://localhost/BookingService"); 
	           System.out.println(" client is ready to connect...");
	   		
      bk.login();
	
	        } 
	        catch (MalformedURLException murle) { 
	            System.out.println(); 
	            System.out.println(
	              "MalformedURLException"); 
	            System.out.println(murle); 
	        } 
	        catch (RemoteException re) { 
	            System.out.println(); 
	            System.out.println(
	                        "RemoteException"); 
	            System.out.println(re); 
	        } 
	        catch (NotBoundException nbe) { 
	            System.out.println(); 
	            System.out.println(
	                       "NotBoundException"); 
	            System.out.println(nbe); 
	        } 
	        catch (
	            java.lang.ArithmeticException
	                                      ae) { 
	            System.out.println(); 
	            System.out.println(
	             "java.lang.ArithmeticException"); 
	            System.out.println(ae); 
	        } 
	    } 
	}



