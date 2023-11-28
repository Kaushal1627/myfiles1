import java.sql.*;

public class mySql14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			 
			 name =  br.readLine();
			 password =  br.readLine();
			 
			 Class.forName(com.mysql.cj.jdbc.Driver.);
			 
			 Connection con =DriverManager.getConnection("jdbc: mysql://localhost 3306/ 'mydb'" ,"root","root" );
			 
					 Statment stmt =con.createStatment();
			 
                     ResultSet rs = stmt.excuteQuery("Select * from emp");
			 
			           System.out.println("Record are");
			           
			           while(rs.next())
			        	   con.close();
			        	   
			        	 System.out.println((rs.getString(1)+"  "+ rs.getNString(2)));
			           catch(Exception e) {
			        	   System.out.println(e);
			           }
			 
		
	}

}
