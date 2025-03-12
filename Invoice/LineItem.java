package workshop2;

public class LineItem {
	//Data Abstraction of LineItem
	//ordered quantity of product in a line item of invoice.
	private int qty ;
	private Product product ;
	
	public Product getProduct() {
		return product;
	}
	public int getQty() {
		return qty;
	}
	
	public void setProduct(Product product) {
		this.product = product;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	//Function Abstraction of Line Item
	public double calculateTotal() {
		return product.getunitPrice()*qty ;
	}

}
