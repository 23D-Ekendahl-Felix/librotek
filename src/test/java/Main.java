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
    public static void main(String[] args) {
        String BaseURL = "http://10.151.168.5:3105/";
        Gson gson = new Gson();

        // Skapa en Scanner för att läsa användarens input
        Scanner scanner = new Scanner(System.in);

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
                    // Hämta böcker
                    break;
                case 2:
                    // Hämta tidningar
                    break;
                case 3:
                    // Visa böcker
                    break;
                case 4:
                    // Visa tidningar
                    break;
                case 5:
                    // Lägg till bok
                    break;
                case 6:
                    // Lägg till tidning
                    break;
                case 7:
                    System.out.println("Avslutar programmet...");
                    return;
                default:
                    System.out.println("Ogiltigt val. Försök igen.");
            }
        }
    }
}