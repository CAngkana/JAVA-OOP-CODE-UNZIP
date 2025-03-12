package workshop2;
import java.util.ArrayList;

public class Invoice {
	//Data Abstraction 
	//Composition of Invoice
	private static Shop shop;
	
	private static ArrayList<LineItem> items ;
	
	public static void setShop(Shop shop1) {
		shop = shop1;
	}
	
	public static void addLineItem(LineItem item1) {
		if(items != null) {
			items.add(item1);
		} else {
			items = new ArrayList<LineItem>();
			items.add(item1);
		}
	}
	
	public static double calculateAmountDue() {
		double AmountDue=0; int a=0;
		for(a=0;a<items.size();a++) {
			AmountDue+=items.get(a).calculateTotal();
			//AmountDue= 0+items.get(0).....
		}
		return AmountDue ;
	}
	
	public static void printInvoice() {
		int i=0;
		System.out.println("-----------------------------------");
        System.out.println("            INVOICE               ");
        System.out.println("-----------------------------------");
        System.out.println("\t\t\t"+shop.getName());
        System.out.println("\t\t\t"+shop.getAddress());
        System.out.println("===================================");
        System.out.printf("%-20s%-10s%-5s%-10s\n", "Description", "Price", "Qty", "Total");
        System.out.println("-----------------------------------");	
        for(i=0;i<items.size();i++) {
        	 System.out.printf("%-20s%-10s%-5s%-10s\n", 
        	 items.get(i).getProduct().getName(),
        	 items.get(i).getProduct().getunitPrice(),
        	 items.get(i).getQty(),
        	 items.get(i).calculateTotal());
        }
        System.out.println("-----------------------------------");
        System.out.println("Amount Due: "+ calculateAmountDue());
	}
	
	public static void main(String[] args) {
		Shop shop1 = new Shop();
		shop1.setName("MY SHOPPY");
		shop1.setAddress("99 หมู่ 18 ถ.พหลโยธิน\n"+ "\t\t\tคลองหลวง ปทุมธานี 12121");
		Invoice.setShop(shop1);
		
		Product product1 = new Product(); 
		product1.setName("Toaster");
		product1.setunitPrice(29.95);
		
		Product product2 = new Product(); 
		product2.setName("Hair Dryer"); 
		product2.setunitPrice(24.95);
		
		Product product3 = new Product(); 
		product3.setName("Car Vacuum"); 
		product3.setunitPrice(19.99);
		
		LineItem item1 = new LineItem(); 
		item1.setProduct(product1);
		item1.setQty(3);
		Invoice.addLineItem(item1);
		
		LineItem item2 = new LineItem();
		item2.setProduct(product2);
		item2.setQty(1);
		Invoice.addLineItem(item2);
				
		LineItem item3 = new LineItem(); 
		item3.setProduct(product3); 
		item3.setQty(2);
		Invoice.addLineItem(item3);
		
		Invoice.printInvoice();
	}
}
