import java.sql.*;

class App{
    public static void main(String ... args){
        try{
            String dbUrl="jdbc:mysql://localhost:3306/students";
            String username="root";
            String password="";

            Connection myConnection=DriverManager.getConnection(dbUrl, username, password);
            
	    Statement myStatement=myConnection.createStatement();

            ResultSet myResultSet=myStatement.executeQuery("select * from students");
            
	    while(myResultSet.next()){
                System.out.println("students full name : "+myResultSet.getString("firstname")+" "+myResultSet.getString("lastname")+" "+myResultSet.getString("branch"));
	  }
	}catch(Exception e){
	    System.out.println(e.getMessage());
	}
     }
}

