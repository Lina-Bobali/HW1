package ShoppingCart;
import java.util.ArrayList;

class ShoppingCartClass {

		
		ArrayList<Books> NewBooks ;

		ShoppingCartClass() {
		
			NewBooks =new ArrayList<Books>();	
			
		} 
		
		public int getcount() {
			int total=0 ;
			int i = NewBooks.size() ; 
			for (int x =0 ; x<i;x++) { 
			total += NewBooks.get(x).priceBook ;
			}
			return total ;
		}
		
}
