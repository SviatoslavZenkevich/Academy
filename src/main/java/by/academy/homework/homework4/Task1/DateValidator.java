package by.academy.homework.homework4.Task1;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateValidator implements Validator {
    private final static Pattern pattern= Pattern.compile("(0[1-9]|[12][0-9]|3[01])\\-(0[1-9]|1[012])\\-((19[4-9][0-9])|(20[0,1][0-9])|(202[0-2]))");
        @Override
        public boolean validate(String date) {
            Matcher matcher = pattern.matcher(date);
            return matcher.matches();
        }
    }

