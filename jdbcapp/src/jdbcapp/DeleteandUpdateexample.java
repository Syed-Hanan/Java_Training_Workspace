package jdbcapp;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import oracle.jdbc.OracleDriver;

public class DeleteandUpdateexample {

	public static void main(String[] args) throws SQLException {
		DriverManager.registerDriver(new OracleDriver());
		String url = "jdbc:oracle:thin:@10.33.59.56:1521:xe";
		Connection conn = DriverManager.getConnection(url,"system","manager");
		System.out.println("connected");
		
		String editqry= "update student set stdname=?,sub1=? where regno=?";
		PreparedStatement pst =conn.prepareStatement(editqry);
		pst.setString(1, "manish");
		pst.setInt(2, 30);
		pst.setInt(3, 169);
		int syed=pst.executeUpdate();
		if(syed>0)
			System.out.println("updated" + syed);
		else
			System.out.println("not updated "+syed);
		String dlqry="delete from student where regno=?";
		pst=conn.prepareStatement(dlqry);
		pst.setInt(1, 123);
		syed=pst.executeUpdate();
		if(syed>0)
			System.out.println("deleted" + syed);
		else
			System.out.println("not deleted "+syed);
		conn.close();
		

	}

}
