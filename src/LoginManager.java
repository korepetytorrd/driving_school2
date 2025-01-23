import java.io.BufferedReader;
import java.io.FileReader;

public class LoginManager {
    public static boolean  login(String email, String haslo, String path){
        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String line;
            while ( (line =br.readLine()) != null ) {
                String [] values = line.split(";");
                if ( email.equals(values[3]) && haslo.equals(values[4]) ) return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static int whoIsLogged(String email, String path){
        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String line;
            while ( (line =br.readLine()) != null ) {
                String [] values = line.split(";");
                if ( email.equals(values[3]) ) return Integer.parseInt(values[7]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

}
