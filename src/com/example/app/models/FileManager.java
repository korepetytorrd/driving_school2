import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class FileManager {
   
    public static User[] readUsersFromFile(String filePath){
        ArrayList<User> usersList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String line;
            while (line = br.readLine() != null) {
                String [] values = line.split(";");
                User user = new User(values[3],values[4]);
                usersList.add(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return usersList.toArray(new User[0]);

    }

}
