package homework_5;
import com.sun.jdi.IntegerValue;


import java.util.Arrays;
public class Password {

    public static void main(String[] args){
        System.out.println(isThePasswordValid("Pa$$w0rd"));
    }
    public static boolean isThePasswordValid(String password){
        String regex = "\\A(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,}\\z";
        return password.matches(regex);
    }
}






