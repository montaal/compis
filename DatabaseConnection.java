import java.sql.*;
import java.util.ArrayList;

public class DatabaseConnection {
	private String connectionUrl;
	private Connection con;
	private Statement stmt;
	private ResultSet rs;
	private static DatabaseConnection database;

	private DatabaseConnection(String connectionUrl) {
		this.connectionUrl = connectionUrl;
	}

	public static DatabaseConnection getDatabaseConnection() {
		if (database == null) {
					database = new DatabaseConnection("jdbc:mysql://localhost:3306/compis?autoReconnect=true&useSSL=false");
		 }
		return database;
	 }

	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}

	public Statement getStmt() {
		return stmt;
	}

	public void setStmt(Statement stmt) {
		this.stmt = stmt;
	}

	public ResultSet getRs() {
		return rs;
	}

	public void setRs(ResultSet rs) {
		this.rs = rs;
	}

	public ArrayList<String> executeQuery(String query, int columns) {
		ArrayList<String> queryResults = new ArrayList<String>();
		try {
    		// Establish the connection.
				//Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
					Class.forName("com.mysql.jdbc.Driver");
        		con = DriverManager.getConnection(connectionUrl,"root","Password123");// cambiar

        		// Create and execute an SQL statement that returns some data.
        		String SQL = query;
						stmt = con.createStatement();
						if(columns!=0){
						rs = stmt.executeQuery(SQL);


        		// Iterate through the data in the result set and display it.
        		while (rs.next()) {
							ArrayList<String> tmp = new ArrayList<>();
							for(int i=0; i<columns;i++){
								tmp.add(rs.getString(i+1));
							}
							queryResults.add(String.join(",", tmp));
						}
					}else{
						stmt.executeUpdate(SQL);
					}
    		}

		// Handle any errors that may have occurred.
		catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			if (rs != null) try { rs.close(); } catch(Exception e) {}
	    		if (stmt != null) try { stmt.close(); } catch(Exception e) {}
	    		if (con != null) try { con.close(); } catch(Exception e) {}
		}

		return queryResults;
	}
}
