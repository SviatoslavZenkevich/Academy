package by.academy.homework.homework3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BelarusPhoneValidator implements Validator{
    @Override
    public boolean validate(String phoneNumber) {
        Pattern pattern = Pattern.compile("\\+375\\d{9}");
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }
}
