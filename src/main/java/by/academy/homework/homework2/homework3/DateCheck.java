package by.academy.homework.homework2.homework3;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//                Решение задачи № 3
public class DateCheck {
    public boolean dateCheck1 (String date) {
        Pattern pattern = Pattern.compile("(0[1-9]|[12][0-9]|3[01])\\/(0[1-9]|1[012])\\/((19[4-9][0-9])|(20[0,1][0-9])|(202[0-2]))");
        Matcher matcher = pattern.matcher(date);
        return matcher.matches();
    }

    public boolean dateCheck2 (String date){
        Pattern pattern = Pattern.compile("(0[1-9]|[12][0-9]|3[01])\\-(0[1-9]|1[012])\\-((19[4-9][0-9])|(20[0,1][0-9])|(202[0-2]))");
        Matcher matcher = pattern.matcher(date);
        return matcher.matches();
    }
}
