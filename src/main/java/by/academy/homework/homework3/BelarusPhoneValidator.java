package by.academy.homework.homework3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//                Решение задачи № 5
public class BelarusPhoneValidator implements Validator{
    @Override
    public boolean validate(String phoneNumber) {
        Pattern pattern = Pattern.compile("\\+375(29|25|44|33)[1-9]{1}\\d{6}");
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }
}
