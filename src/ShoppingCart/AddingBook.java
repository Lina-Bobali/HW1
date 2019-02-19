package ShoppingCart;
import java.util.ArrayList;

public class AddingBook {

		
	  public static ArrayList<ShoppingCartClass> al=new ArrayList<ShoppingCartClass>();	
		
		public static void  addcart() {
			
			ShoppingCartClass x = new ShoppingCartClass() ;
			al.add(x) ;
			
			 
		}
		
		public static void addBook(int cart , int price , String name, int count) { 
			Books x = new Books() ;
			x.NameBook=name; 
			x.Countbook=count ;
			x.priceBook=price ;
			al.get(cart).NewBooks.add(x) ;
			
			
		}
		public static void main(String[] args) {
			
			addcart() ;
			addBook(0,100,"java",2) ;
			addBook(0,100,"java",2) ;
			addBook(0,100,"java",2) ;
			addBook(0,100,"java",2) ;
			System.out.println("size of cart = "+al.size());
			System.out.println("total price = " + al.get(0).getcount());
			System.out.println("size book = " + al.get(0).NewBooks.size());

		}

}
