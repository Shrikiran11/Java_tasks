package com.cf.javaTasks;

public class Batch_Insert_JDBC {
	//try batch update
		public static void main(String[] args) {
			try (Connection connection = DriverManager
		            .getConnection("jdbc:mysql://localhost:3306/myproj", "root", "root");
		            // Step 2:Create a statement using connection object
		            Statement statement = connection.createStatement()) {
		            connection.setAutoCommit(false);
		            statement.addBatch("INSERT INTO Employee VALUES (22, 'Pramod', 'pramod@gmail.com', 'India', '123');");
		            statement.addBatch("INSERT INTO Employee VALUES (33, 'A', 'a@gmail.com', 'India', '123');");
		            statement.addBatch("INSERT INTO Employee VALUES (44, 'B', 'b@gmail.com', 'India', '123');");
		            statement.addBatch("INSERT INTO Employee VALUES (48, 'C', 'c@gmail.com', 'India', '123');");
		            statement.addBatch("INSERT INTO Employee VALUES (66, 'D', 'd@gmail.com', 'India', '123');");
		            int[] updateCounts = statement.executeBatch();
		            System.out.println(Arrays.toString(updateCounts));
		            connection.commit();
		        } catch (BatchUpdateException e) {
		          	System.err.println("SQLState: " + e.getSQLState());
	                System.err.println("Error Code: " + e.getErrorCode());
	                System.err.println("Message: " + e.getMessage());
		  
		        } catch (SQLException e) {
		        	System.err.println("SQLState: " + e.getSQLState());
	                System.err.println("Error Code: " + e.getErrorCode());
	                System.err.println("Message: " + e.getMessage());
		  
		        }

		}

	}
