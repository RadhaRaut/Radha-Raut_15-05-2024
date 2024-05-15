package Encapsulation;

public class Test {

	public static void main(String[] args) {
		Product product1 = new Product(2200, "Lenovo laptop T460s", 89504.34);
		System.out.println(product1.getProductId());
		System.out.println(product1.getProductName());
		System.out.println(product1.getProductPrice());

		System.out.println("--------------"); 
		product1.setProductId(9900);
		System.out.println(product1.getProductId()); 
		product1.setProductName("dell");
		System.out.println(product1.getProductName());
		product1.setProductPrice(40000.23);
		System.out.println(product1.getProductPrice());
	}
}
