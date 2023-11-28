import java.sql.*;
import java.io.*;
public class Jdbc16 {

	public static void main(String args[]) {
		String name = null;
		String password = null;
		 
		 BufferedReader br  = new  BufferedReader(new InputStreamReader(System.in)); 
		
		 System.out.println("Enter Name and Password");
		 
		 try {
			 
			 name =  br.readLine();
			 password =  br.readLine();
			 
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 
			 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb" ,"root","root" );
			 
			 Statement st = con.createStatement();
			 
			 //int result = st.executeUpdate("Insert into emp values('"+name+"','"+password+"' )");
			 //System.out.println("Recorde insert suceesfully");
			 
			 
			 int result = st.executeUpdate(" Delete form emp  where name= '"+name+"' and password = '"password"' ");
			 System.out.println("Recorde are deleted ");
			 
			 
			 //int result = st.executeUpdate("update emp  set name= 'raj' where name= 'Rishabh' ");
			 //System.out.println("Recored update scucessfull");
			 
			 ResultSet rs = st.executeQuery("Select * from emp");
			 
			 System.out.println("Record are");
			 
			 while(rs.next()) {
				 System.out.println(rs.getString(1) +"  "+ rs.getString(2));
			 }
			 }catch(Exception e) {
				 
				 System.out.println(e);
			 }
			 		 
			 
		 }
		 

			 
			 
			 
			 
			 
			 
		 
	}


