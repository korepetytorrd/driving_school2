
public class LoginManager {

    String email;
    String pass;

    public static com.example.app.User login(String email, String haslo){
        FileManager.readUsersFromFile("user.txt");

        return new com.example.app.User(email,haslo);
    }



}
