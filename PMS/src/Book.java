
public class Book extends Document{
	private int isbn;
	private String publisherName;
	
	public Book(String name, String autName,String date, int price,int num,String pubName){
		super(name, autName,date,price);
		isbn = num;
		publisherName = pubName;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getPublisherName() {
		return publisherName;
	}

	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}
	
	
}
