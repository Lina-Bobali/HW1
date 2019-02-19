package ShoppingCart;

import static org.junit.Assert.*;

public class Test {
	

		@org.junit.Test
		void testAddcart() {
			ShoppingCartClass x = new ShoppingCartClass() ;
			assertTrue(0 == x.getcount()) ;
		}

		@org.junit.Test
		void testAddBok() {
			AddingBook x = new AddingBook() ;
			x.addcart();
			x.addBook(0, 127,"java", 1);
			assertTrue(1==x.al.get(0).NewBooks.size()) ;
			assertTrue(127 == x.al.get(0).NewBooks.get(0).priceBook) ;
			x.al.get(0).NewBooks.clear();
			x.al.clear();

		}
		@org.junit.Test
		void testAddBook2() {
			AddingBook y = new AddingBook() ; 
			y.addcart();
			y.addBook(0, 127,"java", 1);
			y.addBook(0, 100,"Web desing Book", 1);
			assertTrue(2==y.al.get(0).NewBooks.size()) ;
			assertTrue(227 == y.al.get(0).getcount()) ;
			
		}

}



