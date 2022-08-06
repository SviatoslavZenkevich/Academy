package by.academy.homework.homework4.Task1;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

import static java.time.temporal.ChronoUnit.DAYS;

public class CustomDate {
    private String date;
    private Year year;
    private Month month;
    private Day day;
    LocalDate localDate;

    public CustomDate() {

        super();
    }
//    Один из конструкторов - строка в формате dd-mm-yyyy, добавить валидацию для этой строки.
    public CustomDate(String date) {
        this.day = new Day(Integer.parseInt(date.substring(0, 2)));
        this.month = new Month(Integer.parseInt(date.substring(3, 5)));
        this.year = new Year(Integer.parseInt(date.substring(6)));

    }

    //    Методы: задать дату, вывести на консоль день недели по заданной дате.
    public LocalDate getDate() {
        Scanner sc = new Scanner(System.in);
        DateValidator dateValidator = new DateValidator();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        while (true) {
            System.out.println("Enter the date in the format dd-mm-yyyy: ");
            String date = sc.nextLine();
            if (dateValidator.validate(date)) {
                localDate = LocalDate.parse(date, dateFormatter);
                break;
            } else {
                System.out.println("You have entered wrong date. Please try again.");
            }
        }

        return localDate;
    }

    public String dayOfWeek(LocalDate date) {
        Scanner scan = new Scanner(System.in);
        String day = "";
        int weekDayNum = date.getDayOfWeek().getValue();

        switch (weekDayNum) {
            case 1:
                day = String.valueOf(weekDay.MONDAY);
                break;
            case 2:
                day = String.valueOf(weekDay.TUESDAY);
                break;
            case 3:
                day = String.valueOf(weekDay.WEDNESDAY);
                break;
            case 4:
                day = String.valueOf(weekDay.THURSDAY);
                break;
            case 5:
                day = String.valueOf(weekDay.FRIDAY);
                break;
            case 6:
                day = String.valueOf(weekDay.SATURDAY);
                break;
            case 7:
                day = String.valueOf(weekDay.SUNDAY);
                break;
        }
        return day;
    }

    public long countDaysBetweenTwoDates() {
        CustomDate customDate = new CustomDate();
        LocalDate firstDate = customDate.getDate();
        LocalDate secondDate = customDate.getDate();

        long daysBetween = DAYS.between(firstDate, secondDate);
        return daysBetween;
    }


    class Year {
        int year;

        public Year(int year) {
            this.year = year;
        }

        public void isLeapYear() {
            System.out.println("Enter number of year:");
            Scanner scan = new Scanner(System.in);
            int year = scan.nextInt();
            if (year % 4 == 0) {
                if (year % 100 == 0 && year % 400 == 0) {
                    System.out.println("This year is a leap year");
                }
            } else {
                System.out.println("This year is not a leap year");
            }
        }
    }

    class Month {
int month;
        public Month(int month) {
this.month=month;
        }


    }


    public class Day {
        int day;

        public Day(int day) {
            this.day = day;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomDate that = (CustomDate) o;
        return Objects.equals(date, that.date) && Objects.equals(year, that.year) && Objects.equals(month, that.month) && Objects.equals(day, that.day) && Objects.equals(localDate, that.localDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, year, month, day, localDate);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CustomDate{");
        sb.append("date='").append(date).append('\'');
        sb.append(", year=").append(year);
        sb.append(", month=").append(month);
        sb.append(", day=").append(day);
        sb.append(", localDate=").append(localDate);
        sb.append('}');
        return sb.toString();
    }
}
