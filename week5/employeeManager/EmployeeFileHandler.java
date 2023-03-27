package week5.employeeManager;

import java.io.*;
import java.util.*;

public class EmployeeFileHandler{
	@SuppressWarnings("unchecked")
	public static void main(String args[]) throws Exception
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int ch=-1;
		
		File file = new File("employee.txt");
		ArrayList<Employee> arrlist = null;
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		
		if(file.isFile())
		{
			ois=new ObjectInputStream(new FileInputStream(file));
			arrlist = (ArrayList<Employee>)ois.readObject();
			ois.close();
		}
		boolean found = false;
		
		do {
			System.out.println("0. EXIT");
			System.out.println("1. INSERT");
			System.out.println("2. DISPLAY");
			System.out.println("3. UPDATE");
			System.out.println("4. DELETE");
			System.out.println("5. SEARCH BY EMPLOYEE ID");
			System.out.println("Enter your Choice:");
			ch = in.nextInt(); in.nextLine();
			
		switch(ch)
		{
		
		case 0: 
			System.out.println("Exited successfully");
			break;
			
		case 1: 
			System.out.println("Enter the employee ID :");
			int id = in.nextInt(); in.nextLine();
			System.out.println("Enter the employee Name :");
			String name = in.nextLine();
			System.out.println("Enter the age :");
			int age = in.nextInt();in.nextLine();
			System.out.println("Enter the employee salary :");
			int salary = in.nextInt();in.nextLine();
			arrlist.add(new Employee(id,name,age,salary));
			oos = new ObjectOutputStream(new FileOutputStream(file));
			oos.writeObject(arrlist);
			oos.close();
			System.out.println("Insertion successful");
			break;
			
		case 2: 
			if(file.isFile())
			{
				ois=new ObjectInputStream(new FileInputStream(file));
				arrlist = (ArrayList<Employee>)ois.readObject();
				ois.close();
				for(int i=0;i<arrlist.size();i++)
				{
					System.out.print(arrlist.get(i));
					System.out.println();
				}
			}
			else
			{
				System.out.println("File not found");
			}

			break;
			
		case 3: 
			System.out.println("Enter the EmpID to be updated:");
			int empid = in.nextInt();in.nextLine();
			found = false;
			for(int i=0;i<arrlist.size();i++)
			{
				if(arrlist.get(i).empID == empid)
				{
					System.out.println("Enter new employee ID:");
					id = in.nextInt(); in.nextLine();
					System.out.println("Enter new employee Name:");
					name = in.nextLine();
					System.out.println("enter new age:");
					age = in.nextInt();in.nextLine();
					System.out.println("Enter new employee salary:");
					salary = in.nextInt();in.nextLine();
					arrlist.get(i).setID(id);
					arrlist.get(i).setName(name);
					arrlist.get(i).setAge(age);
					arrlist.get(i).setSalary(salary);
					oos = new ObjectOutputStream(new FileOutputStream(file));
					oos.writeObject(arrlist);
					oos.close();
					found=true;
				}
			}
			if(found)
			{
				System.out.println("Data updated successfully");
			}
			else
			{
				System.out.println("Data Not found");
			}
			break;
			
		case 4: 
			System.out.println("Enter the EmpID to be Deleted:");
			empid = in.nextInt();in.nextLine();
			found = false;
			for(int i=0;i<arrlist.size();i++)
			{
				if(arrlist.get(i).empID == empid)
				{
					arrlist.remove(i);
					oos = new ObjectOutputStream(new FileOutputStream(file));
					oos.writeObject(arrlist);
					oos.close();
					found=true;
				}
			}
			if(found)
			{
				System.out.println("Deleted Successfully");
			}
			else
			{
				System.out.println("Data Not found");
			}
			break;
			
		case 5:
			System.out.println("Enter the EmpID to be Searched");
			empid = in.nextInt();in.nextLine();
			found = false;
			for(int i=0;i<arrlist.size();i++)
			{
				if(arrlist.get(i).getID() == empid)
				{
					System.out.println(arrlist.get(i));
					found = true;
					break;
				}
			}
			if(found==false)
			{
				System.out.println("Data not found");
			}
			break;
		default: 
			System.out.println("Invalid choice");
			break;
		}
		}while(ch!=0);
	}
}