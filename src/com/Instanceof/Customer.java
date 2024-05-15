package com.Instanceof;

public class Customer {
	//fields
		private int customerId;
		private String customerName;
		private long customerContactNo;
		private String customerAddress;
		
		
		public Customer()
		{
			//to initialize an object(state), we use constructor.
			customerId = 101;
			customerName = "Anitha";
			customerContactNo = 9023451234l;
			customerAddress = "Pune";
		}
		
		public void getCustomer()
		{
			System.out.println(customerId);
			System.out.println(customerName);
			System.out.println(customerContactNo);
			System.out.println(customerAddress);
		}
		
}
