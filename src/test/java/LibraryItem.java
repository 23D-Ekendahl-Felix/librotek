// Detta är LibraryItem den är daddy kalss för Book och Magazine
public class LibraryItem {
    private int id;
    private String title;
    private boolean isAvailable;

    public LibraryItem(int id, String title, boolean isAvailable) {
        this.id = id;
        this.title = title;
        this.isAvailable = isAvailable;
    }

    public int getId() {return id;}
    public String getTitle() {return title;}
    public boolean isAvailable() {return isAvailable;}

    public void setId(int id) {this.id = id;}
    public void setTitle(String title) {this.title = title;}
    public void setAvailable(boolean available) {isAvailable = available;}
}