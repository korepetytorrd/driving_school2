import java.util.Scanner;

public class App {
  public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        String email;
        String haslo;
        //TODO Wczytanie danych email i hasło od użytkownika 
        System.out.println("Podaj email");
        email = sc.nextLine();

        System.out.println("Podaj hasło");
         haslo = sc.nextLine();

        System.out.println("Twój email i hasło to:" + '\n' + email + '\n' + haslo);
       
        
        

    }

    public static User login(String email, String haslo){
      return User(email,haslo);
    }
}
