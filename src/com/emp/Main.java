package com.emp;

import java.util.Scanner;

public class Main {

	public static void main(String[]args) {
		  EmployeeDaoIntrf dao=new  EmployeeDaoImpl();
			System.out.println("Wlecome to employee management system");
			
			Scanner sc=new Scanner(System.in);
			do {
				
	System.out.println("1.Add employeen\n"+
			"2.show all employee\n"
		   +"3.show employee based on id\n"+
		    "4.update emp based on id\n"+
		   "5.delete employee");
	
    System.out.println("enter your choice:");
    int ch= sc.nextInt();
    
	Employee emp=new Employee();
	            
	            switch (ch) {
	            case 1:
	            	
	            	System.out.println("enter the id :");
	            	int id =sc.nextInt();
	            	System.out.println("enter the name:");
	            	String name=sc.next();
	            	System.out.println("enter the age:");
	            	int age=sc.nextInt();
	            	System.out.println("enter the salary:");
	            	double salary=sc.nextDouble();
	            
	            	emp.setId(id);
	            	emp.setName(name);
	            	emp.setAge(age);
	            	emp.setSalary(salary);
	            	dao.createEmployee(emp);
	            	break;
	            case 2:
	            	
	            	dao.showAllEmployee();
	            	break;
	            case 3:
	            	System.out.println("enter id to show details:");
	            	int id1=sc.nextInt();
	            	dao.showEmployeeBasedonId(id1);
	            	break;
	            case 4:
	            	System.out.println("enter id to update detail:");
	            	int id2=sc.nextInt();
	            	System.out.println("enter the new salry details:");
	                double salary1=sc.nextDouble();
	            	dao.updateEmployeeBasedonId(id2,salary1);
	            	break;
	             case 5:
	            	 System.out.println("enter id to delete detail:");
		            	int id3=sc.nextInt();
	            dao.DeleteEmployee(id3);
	            break;
	            case 6:
	            	System.out.println("Thankyou for using this application!!");
	            	System.exit(ch);
	            	default:
	            		System.out.println("enter yhe valid choice!");
	            		break;
	            	
	            		
	            }
				
			}while(true);
					
			}
		
	}

