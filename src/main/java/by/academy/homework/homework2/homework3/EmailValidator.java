package by.academy.homework.homework2.homework3;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class EmailValidator implements Validator{
    @Override
    public boolean validate(String Email) {
        Pattern pattern = Pattern.compile("[A-Za-z0-9+_.-]+@(.+)");
        Matcher matcher = pattern.matcher(Email);
        return matcher.matches();
    }
}
