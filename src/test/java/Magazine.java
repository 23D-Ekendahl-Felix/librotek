// detta är Magazine innerhåller dessas id title issueNumber category publishedYear isAvailable
public class Magazine extends LibraryItem {
    private int issueNumber;
    private String category;
    private int publishedYear;
    private boolean isAvailable;

    public Magazine(int id, String title, int issueNumber, String category, int publishedYear, boolean isAvailable) {
        super(id, title, isAvailable);
        this.issueNumber = issueNumber;
        this.category = category;
        this.publishedYear = publishedYear;
        this.isAvailable = isAvailable;
    }
   
    public int getIssueNumber() {return issueNumber;}
    public String getCategory() {return category;}
    public int getPublishedYear() {return publishedYear;}
    public boolean isAvailable() {return isAvailable;}

    public void setIssueNumber(int issueNumber) {this.issueNumber = issueNumber;}
    public void setCategory(String category) {this.category = category;}
    public void setPublishedYear(int publishedYear) {this.publishedYear = publishedYear;}
    public void setAvailable(boolean available) {isAvailable = available;}

}