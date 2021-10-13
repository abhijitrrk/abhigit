package AbhiProject;

public class firstEcommerce  extends ProductAbstract implements productDetails {
	
	public void displayProductCategories()
	{
		System.out.println("Clothing, Footware, Accessories");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to My Ecommerce Site");
		System.out.println("We Sell the following Products");
		System.out.println();
		firstEcommerce a = new firstEcommerce();
		a.displayProductCategories();
		productDetails b = new firstEcommerce();
		b.getProductName();
		b.getProductPrice();
		b.getProductDescription();
		
		a.producttaxes();
		a.ProductDisocunts();
		
		productAddDetails d = new productAddDetails();
		d.addDetails();
	
		
		
		
	
		
		
		
	}

	@Override
	public void getProductName() {
		// TODO Auto-generated method stub
		System.out.println("List all the names of the products here");
		
	}

	@Override
	public void getProductPrice() {
		// TODO Auto-generated method stub
		System.out.println("List price points of the products");
	}

	@Override
	public void getProductDescription() {
		// TODO Auto-generated method stub
		System.out.println("List product Description");
	}

	@Override
	public void producttaxes() {
		// TODO Auto-generated method stub
		System.out.println("Mention all the taxes that needs to be inplemented in the products");
		
	}
}