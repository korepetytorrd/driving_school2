import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        String email="rd@gmail.com";
        String haslo="1234";
        //TODO Wczytanie danych email i hasło od użytkownika
        System.out.println("Podaj email");
        //email = sc.nextLine();

        System.out.println("Podaj hasło");
        //haslo = sc.nextLine();


        if (LoginManager.login(email, haslo, "user.txt")){
            System.out.println("Zalogowany");
            switch (LoginManager.whoIsLogged(email, "user.txt")){

                case 1:
                    System.out.println("admin");
                    break;
                    case 2:
                        System.out.println("instruktor");
                        break;
                        case 3:
                            System.out.println("kursant");
                            break;
                            default:
                                System.out.println("Nieznany User");
                

                
            }

        }else{
            System.out.println("Niezalogowany");
        }





    }


}
