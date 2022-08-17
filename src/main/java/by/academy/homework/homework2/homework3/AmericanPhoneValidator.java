package by.academy.homework.homework2.homework3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//                Решение задачи № 5
public class AmericanPhoneValidator implements Validator {
    private final static Pattern pattern = Pattern.compile("\\+1\\d{10}");

    @Override
    public boolean validate(String phoneNumber) {
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }
}

