// 2020110975 문정원
// 본인은 이 소스파일을 다른 사람의 소스를 복사하지 않고 직접 작성하였습니다.


class Employee {
	private String a_first_name;
	public String getA_first_name() {
		return a_first_name;
	}
	public void setA_first_name(String a_first_name) {
		this.a_first_name = a_first_name;
	}
	
	private String a_last_name;
	public String getA_last_name() {
		return a_last_name;
	}
	public void setA_last_name(String a_last_name) {
		this.a_last_name = a_last_name;
	}
	
	private double monthly_salary;
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
		Employee Employee1 = new Employee("Bob", "Jones", 34500.00);
		Employee Employee2 = new Employee("Nemo", "Kim", 37809.00);
	
		System.out.printf("Employee 1: %s %s; Yearly Salary: %.2f\n", Employee1.getA_first_name(), Employee1.getA_last_name(), Employee1.getMonthly_salary());
		System.out.printf("Employee 2: %s %s; Yearly Salary: %.2f\n\n", Employee2.getA_first_name(), Employee2.getA_last_name(), Employee2.getMonthly_salary());
		System.out.println("Increasing employee salaries by 10%");
		System.out.printf("Employee 1: %s %s; Yearly Salary: %.2f\n", Employee1.getA_first_name(), Employee1.getA_last_name(), Employee1.getMonthly_salary()*1.1);
		System.out.printf("Employee 2: %s %s; Yearly Salary: %.2f\n\n", Employee2.getA_first_name(), Employee2.getA_last_name(), Employee2.getMonthly_salary()*1.1);
	}
}
