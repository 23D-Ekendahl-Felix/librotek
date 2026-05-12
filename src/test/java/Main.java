
//GSON objekt som vi behöver
import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
// Importera Type för att hjälpa json att omvandla data
import java.lang.reflect.Type;
//UniREST objekt som vi behöver
import kong.unirest.Unirest;
import kong.unirest.HttpResponse;
import kong.unirest.UnirestException;
// Importera Fil hantering
import java.nio.file.*;
import java.io.IOException;
// ArrayList för att lagra objekt
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static String BaseUrl = "http://10.151.168.5:3105/";
    private static Gson gson = new Gson();

    private static ArrayList<Book> books = new ArrayList<>();
    private static ArrayList<Magazine> magazines = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n====== BIBLIOTEK SYSTEM ======");
            System.out.println("1. Hämta böcker");
            System.out.println("2. Hämta tidningar");
            System.out.println("3. Visa böcker");
            System.out.println("4. Visa tidningar");
            System.out.println("5. Lägg till bok");
            System.out.println("6. Lägg till tidning");
            System.out.println("7. Avsluta");
            System.out.print("Välj alternativ: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    getBooks();
                    break;
                case 2:
                    getMagazines();
                    break;
                case 3:
                    showBooks();
                    break;
                case 4:
                    showMagazines();
                    break;
                case 5:
                    addNewBook();
                    break;
                case 6:
                    addNewMagazine();
                    break;
                case 7:
                    System.out.println("Avslutar programmet...");
                    return;
                default:
                    System.out.println("Ogiltigt val. Försök igen.");
            }
        }

    }

    private static void getBooks() {
        HttpResponse<String> response = Unirest.get(BaseUrl + "books").asString();
        String json_data = response.getBody();
        Gson gson = new Gson();
        Type typ_beskrivning = new TypeToken<ArrayList<Book>>() {
        }.getType();
        books = gson.fromJson(json_data, typ_beskrivning);

        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i).getTitle());
        }
    }

    private static void getMagazines() {
        HttpResponse<String> response = Unirest.get(BaseUrl + "magazines").asString();
        String json_data = response.getBody();
        Gson gson = new Gson();
        Type typ_beskrivning = new TypeToken<ArrayList<Magazine>>() {
        }.getType();
        magazines = gson.fromJson(json_data, typ_beskrivning);

        for (int i = 0; i < magazines.size(); i++) {
            System.out.println(magazines.get(i).getTitle());
        }
    }

    private static void showBooks() {
        for (Book book : books) {
            System.out.println(book.getTitle());
        }
    }

    private static void showMagazines() {
        for (Magazine magazine : magazines) {
            System.out.println(magazine.getTitle());
        }
    }

    private static void addNewBook() {
        System.out.print("Titel: ");
        String titel = scanner.nextLine();
        System.out.print("Författare: ");
        String author = scanner.nextLine();
        System.out.print("genre: ");
        String genre = scanner.nextLine();
        System.out.print("sidor: ");
        int pages = Integer.parseInt(scanner.nextLine());

        String id = String.valueOf(books.size() + 1);
        books.add(new Book(id, titel, author, genre, pages, true));
    }

    private static void addNewMagazine() {
        System.out.print("Titel: ");
        String titel = scanner.nextLine();
        System.out.print("Issue Number: ");
        int issueNumber = Integer.parseInt(scanner.nextLine());
        System.out.print("Kategori: ");
        String category = scanner.nextLine();
        System.out.print("Publiceringsår: ");
        int publishedYear = Integer.parseInt(scanner.nextLine());

        String id = String.valueOf(magazines.size() + 1);
        magazines.add(new Magazine(id, titel, issueNumber, category, publishedYear, true));
    }
}
