package com.emp;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public  class EmployeeDaoImpl implements EmployeeDaoIntrf {
@Override
	public void showEmployeeBasedonId(int id) {
		// TODO Auto-generated method stub
	con =DBcon.createDBconnection();
	String query="select*from emp where id="+id;
try {
	Statement stmt=con.createStatement();
	
	ResultSet rs=stmt.executeQuery(query);
	while(rs.next()) {
		System.out.println("id is"+rs.getInt(1));
		System.out.println("name is"+rs.getString(2));
		System.out.println("salary is"+rs.getDouble(3));
		System.out.println("age is"+rs.getInt(4));
		System.out.println("execute sucessfully");
	}
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	
		
	}

Connection con;
	@Override
	public void createEmployee(Employee emp) {
		// TODO Auto-generated method stub
		con =DBcon.createDBconnection();
		
		String query="insert into emp values(?,?,?,?)";
		try {
			PreparedStatement pstm=con.prepareStatement(query);
			pstm.setInt(1, emp.getId());
			pstm.setString(2, emp.getName());
			pstm.setDouble(3, emp.getSalary());
			pstm.setInt(4, emp.getAge());
		 pstm.executeUpdate();
		
			System.out.println("inserted sucessfuly");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void showAllEmployee() {
		// TODO Auto-generated method stub
		con =DBcon.createDBconnection();
		String query="select*from emp";
		try {
			Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery(query);
		while(rs.next()) {
			System.out.println("id is:"+rs.getInt(1));
			System.out.println("name is:"+rs.getString(2));
			System.out.println("salary is:"+rs.getDouble(3));
			System.out.println("age is:"+rs.getInt(4));
			System.out.println("execute sucessfully");
		}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void updateEmployeeBasedonId(int id,double salary1) {
		
		// TODO Auto-generated method stub
		
		
		con =DBcon.createDBconnection();
		String query="update emp set salary=? where id =?";
		try {
			PreparedStatement pstm=con.prepareStatement(query);
			pstm.setDouble(1, salary1);
			pstm.setInt(2, id);
			int cnt=pstm.executeUpdate();
			System.out.println("emp updated sucessfulyy");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void DeleteEmployee(int id) {
		con =DBcon.createDBconnection();
		String query="delete from emp where id =?";
		try {
			PreparedStatement pstm=con.prepareStatement(query);
			pstm.setDouble(1, id);
			int cnt=pstm.executeUpdate();
			if(cnt!=0)
			System.out.println("emp deleted sucessfulyy"+id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		// TODO Auto-generated method stub
		
	}

