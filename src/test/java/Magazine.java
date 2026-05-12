// detta är Magazine innerhåller dessas id title issueNumber category publishedYear isAvailable
public class Magazine extends LibraryItem {
    private int issueNumber;
    private String category;
    private int publishedYear;

    public Magazine(String id, String title, int issueNumber, String category, int publishedYear, boolean isAvailable) {
        super(id, title, isAvailable);
        this.issueNumber = issueNumber;
        this.category = category;
        this.publishedYear = publishedYear;
    }

    public int getIssueNumber() {return issueNumber;}
    public String getCategory() {return category;}
    public int getPublishedYear() {return publishedYear;}

    public void setIssueNumber(int issueNumber) {this.issueNumber = issueNumber;}
    public void setCategory(String category) {this.category = category;}
    public void setPublishedYear(int publishedYear) {this.publishedYear = publishedYear;}

}