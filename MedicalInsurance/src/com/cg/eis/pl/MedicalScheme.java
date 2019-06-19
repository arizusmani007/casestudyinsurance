package com.cg.eis.pl;
import java.io.*;
import java.util.*;
import com.cg.eis.bean.*;
import com.cg.eis.service.*;

public class MedicalScheme {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		EmployeeServiceImpl service=new EmployeeServiceImpl();
		Map<Integer,Employee> emp=new TreeMap<Integer,Employee>();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String choice="";
		while(true)
		{
		System.out.println("1 Add Employee");
		System.out.println("2 Find Scheme");
		System.out.println("3 Display all Employees");
		System.out.println("4 Exit");
		System.out.println("Enter your choice");
		choice=br.readLine();
		switch(choice)
		{
		case "1":	int id=0;
					String name="";
					String designation="";
					double salary=0.0;
					System.out.println("Enter Employee ID");
					while(true)
					{
						String s_id=br.readLine();
						boolean ch1=Validator.validatedata(s_id,Validator.eidpattern);
						if(ch1==true)
						{
							try {
								id=Integer.parseInt(s_id);
								break;
							}
							catch(NumberFormatException e)
							{
								System.out.println("Employee ID must be numeric.Re Enter");
							}
						}
						else
						{
							System.out.println("Re Enter Employee ID in 3 digits");
						}
					}
					System.out.println("Enter Employee name");
					while(true)
					{
						String s_name=br.readLine();
						boolean ch1=Validator.validatedata(s_name,Validator.spattern);
						if(ch1==true)
						{
							try {
								name=s_name;
								break;
							}
							catch(NumberFormatException e)
							{
								System.out.println("Name must be alphabet.Re Enter");
							}
						}
						else
						{
							System.out.println("Re Enter name in alphabets");
						}
					}
					System.out.println("Enter Designation");
					while(true)
					{
						String s_des=br.readLine();
						boolean ch1=Validator.validatedata(s_des,Validator.spattern);
						if(ch1==true)
						{
							try {
								designation=s_des;
								break;
							}
							catch(NumberFormatException e)
							{
								System.out.println("Designation must be alphabet.Re Enter");
							}
						}
						else
						{
							System.out.println("Re Enter Designation in alphabets");
						}
					}
					System.out.println("Enter salary");
					while(true)
					{
						String s_sal=br.readLine();
						boolean ch1=Validator.validatedata(s_sal,Validator.salpattern);
						if(ch1==true)
						{
							try {
								salary=Double.parseDouble(s_sal);
								break;
							}
							catch(NumberFormatException e)
							{
								System.out.println("Salary must be numeric.Re Enter");
							}
						}
						else
						{
							System.out.println("Re Enter salary in numerics");
						}
					}
					Employee ob=new Employee(id,name,salary,designation);
					emp.put(ob.getId(),ob);
					break;
		case "2":	/*if(salary>5000.00 && salary<20000.00 && designation.equals("System Associate"))
					System.out.println("Scheme C");
					else if(salary>=20000.00 && salary<40000.00 && designation.equals("Programmer"))
					System.out.println("Scheme B");
					else if(salary>=40000.00 && designation.equals("Manager"))
					System.out.println("Scheme A");
					else if(salary<5000.00 && designation.equals("Clerk"))
					System.out.println("No Scheme");
					else 
					System.out.println("Not an Employee");
					break;
					*/
		case "3":	Collection<Employee> vc=emp.values();
					List<Employee> emplist=new ArrayList<Employee>(vc);
					for(Employee e:emplist)
					{
						service.printStatement(e);
					}
					break;
		case "4":	System.out.println("Exiting Program");
					System.exit(0);
		default:	System.out.println("Invalid Choice");
		}
		}

}
}
