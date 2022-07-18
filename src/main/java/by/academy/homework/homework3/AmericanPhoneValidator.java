package by.academy.homework.homework3;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//                Решение задачи № 5
public class AmericanPhoneValidator implements Validator {

@Override
    public boolean validate(String phoneNumber) {
        Pattern pattern = Pattern.compile("\\+1\\d{10}");
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }
}

