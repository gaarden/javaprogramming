// 2020110975 문정원
// 본인은 이 소스파일을 다른 사람의 소스를 복사하지 않고 직접 작성하였습니다.

import java.util.Scanner;

class Employee {
	String a_first_name;
	public String getA_first_name() {
		return a_first_name;
	}
	public void setA_first_name(String a_first_name) {
		this.a_first_name = a_first_name;
	}
	
	String a_last_name;
	public String getA_last_name() {
		return a_last_name;
	}
	public void setA_last_name(String a_last_name) {
		this.a_last_name = a_last_name;
	}
	
	double monthly_salary;
	public double getMonthly_salary() {
		return monthly_salary;
	}
	public void setMonthly_salary(double monthly_salary) {
		this.monthly_salary = monthly_salary;
	}
	
	public Employee(String a_first_name, String a_last_name, double monthly_salary)
	{
		this.a_first_name = a_first_name;
		this.a_last_name = a_last_name;
		if (monthly_salary>0) {
			this.monthly_salary = monthly_salary;
		}
	}
}

public class EmployeeTest {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		String a_first_name=null;
		String a_last_name=null;
		double monthly_salary=0;
		
		Employee employee1 = new Employee(a_first_name, a_last_name, monthly_salary);
		Employee employee2 = new Employee(a_first_name, a_last_name, monthly_salary);
		
		System.out.print("Enter first name: ");
		employee1.a_first_name = input.next();
		System.out.print("Enter last name: ");
		employee1.a_last_name = input.next();
		System.out.printf("Enter monthly salary: ");
		employee1.monthly_salary = input.nextDouble();
		
		System.out.print("\nEnter first name: ");
		employee2.a_first_name = input.next();
		System.out.print("Enter last name: ");
		employee2.a_last_name = input.next();
		System.out.print("Enter monthly salary: ");
		employee2.monthly_salary = input.nextDouble();
		
		System.out.printf("Employee 1: %s %s; Yearly Salary: %.2f\n", employee1.getA_first_name(), employee1.getA_last_name(), employee1.getMonthly_salary()*12);
		System.out.printf("Employee 2: %s %s; Yearly Salary: %.2f\n\n", employee2.getA_first_name(), employee2.getA_last_name(), employee2.getMonthly_salary()*12);
		
		System.out.println("Increasing employee salaries by 10%");
		System.out.printf("Employee 1: %s %s; Yearly Salary: %.2f\n", employee1.getA_first_name(), employee1.getA_last_name(), employee1.getMonthly_salary()*1.1*12);
		System.out.printf("Employee 2: %s %s; Yearly Salary: %.2f", employee2.getA_first_name(), employee1.getA_last_name(), employee2.getMonthly_salary()*1.1*12);
		
	}
}