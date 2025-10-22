package bookSorter;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args)
	{
		Book book1 = new Book("Savaş ve Barış", 1200, "Lev Tolstoy", "1869");
		Book book2 = new Book("Suç ve Ceza", 600, "Fyodor Dostoyevski", "1866");
		Book book3 = new Book("Uğultulu Tepeler", 350, "Emily Brontë", "1847");
		Book book4 = new Book("Simyacı", 200, "Paulo Coelho", "1988");
		Book book5 = new Book("Moby Dick", 500, "Herman Melville", "1851");
		
		//Book nesnelerini bir Set yapısında saklama
		Set<Book> bookSet = new TreeSet<>();
		bookSet.add(book1);
		bookSet.add(book2);
		bookSet.add(book3);
		bookSet.add(book4);
		bookSet.add(book5);
		
		System.out.println("Sort of Book's name: ");
		for (Book book : bookSet)
			System.out.println(book.getName());
		
		// Kitapları sayfa sayısına göre sıralama
		
		System.out.println("Sort of Book's page count");
		Set<Book> setByPageCount = new TreeSet<>( (o1, o2) -> o1.getPageCount() - o2.getPageCount());

		
		setByPageCount.addAll(bookSet);
		
		for (Book book : setByPageCount)
		{
			System.out.println(book.getPageCount());
		}
	}

}
