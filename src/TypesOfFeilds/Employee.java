package TypesOfFeilds;

public class Employee {
	//fields
	
		//non-static fields
		private int employeeId;
		private String employeeName;
		private String employeeDesignation;
		private double employeeSalary;
		
		//static fields
		public static String countryName;
		
		//static block
		static
		{
			countryName = "Bharat";
		}
		
	
		//default/zero-parameterized constructor
		public Employee()
		{

		}
		
		public Employee(int employeeId, String employeeName, String employeeDesignation, double employeeSalary)
		{
			this.employeeId = employeeId;
			this.employeeName = employeeName;
			this.employeeDesignation = employeeDesignation;
			this.employeeSalary = employeeSalary;
		}
		
		//non-static method
		public void getEmployee()
		{
			System.out.println(this.employeeId);
			System.out.println(this.employeeName);
			System.out.println(this.employeeDesignation);
			System.out.println(this.employeeSalary);		
		}
		
		//static method
		public static void getEmployeeCountryName()
		{
			System.out.println(countryName);	
		}
}
