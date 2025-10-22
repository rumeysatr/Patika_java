package bookSorter;

//bu kodda treeSet kullanma sebebim TreeSet'ler 
//Veri kümesine konulan elemanların verdiğiniz kurala göre 
//sıralanmasını sağlar.
public class Book implements Comparable<Book>{
	
	private String name;
	private int pageCount;
	private String authorName;
	private String publishDate;
	
	
	public Book(String name, int pageCount, String authorName, String publishDate) {
		super();
		this.name = name;
		this.pageCount = pageCount;
		this.authorName = authorName;
		this.publishDate = publishDate;
	}

	public String getName() {
		return name;
	}

	public int getPageCount() {
		return pageCount;
	}

	public String getAuthorName() {
		return authorName;
	}

	public String getPublishDate() {
		return publishDate;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

	@Override
	public int compareTo(Book other) {

		return this.name.compareTo(other.name);
	}

	
	
	

}
