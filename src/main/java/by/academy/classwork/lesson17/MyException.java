package by.academy.classwork.lesson17;

public class MyException extends Exception{
    private int detail;

    public MyException(int detail, String message) {
        super(message);
        this.detail=detail;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MyException{");
        sb.append("detail=").append(detail);
        sb.append('}');
        return sb.toString();
    }
}
