//En Book class som innerhåller detta id title author genre pages isAvailable
public class Book extends LibraryItem { 
    private String author;
    private String genre;
    private int pages;

    public Book(String id, String title, String author, String genre, int pages, boolean isAvailable) {
        super(id, title, isAvailable);
        this.author = author;
        this.genre = genre;
        this.pages = pages;
    }

    public String getAuthor() {return author;}
    public String getGenre() {return genre;}
    public int getPages() {return pages;}
 
    public void setAuthor(String author) {this.author = author;}
    public void setGenre(String genre) {this.genre = genre;}
    public void setPages(int pages) {this.pages = pages;}
 
}




