//En Book class som innerhåller detta id title author genre pages isAvailable
public class Book extends LibraryItem { 
    private String author;
    private String genre;
    private int pages;
    private boolean isAvailable;

    public Book(int id, String title, String author, String genre, int pages, boolean isAvailable) {
        super(id, title, isAvailable);
        this.author = author;
        this.genre = genre;
        this.pages = pages;
        this.isAvailable = isAvailable;
    }

    public String getAuthor() {return author;}
    public String getGenre() {return genre;}
    public int getPages() {return pages;}
    public boolean isAvailable() {return isAvailable;}

    public void setAuthor(String author) {this.author = author;}
    public void setGenre(String genre) {this.genre = genre;}
    public void setPages(int pages) {this.pages = pages;}
    public void setAvailable(boolean available) {isAvailable = available;}
}




