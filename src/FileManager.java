import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class FileManager {

    public static com.example.app.User[] readUsersFromFile(String filePath){
        ArrayList<com.example.app.User> usersList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String line=br.readLine();
            while ( line != null) {
                String [] values = line.split(";");
                com.example.app.User user = new com.example.app.User(values[3],values[4]);
                usersList.add(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return usersList.toArray(new com.example.app.User[0]);

    }

}
