
public class Journal extends Document {
private int journalId;
private String startDate;
private String publisher;

public Journal(String name, String autName, String date,int price,int num,String pubName,String sd){
	super(name, autName,date,price);
	journalId = num;
	publisher = pubName;
	startDate = sd;
	
	
}

public int getJournalId() {
	return journalId;
}

public void setJournalId(int journalId) {
	this.journalId = journalId;
}

public String getStartDate() {
	return startDate;
}

public void setStartDate(String startDate) {
	this.startDate = startDate;
}

public String getPublisher() {
	return publisher;
}

public void setPublisher(String publisher) {
	this.publisher = publisher;
}
}
