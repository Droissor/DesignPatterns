package src.com.study.design.pattern.behavioral.nullobject;

public class NullObjectDemo {
    public static void main(String[] args) throws Exception {
        NullLog nullLog = new NullLog();
        Account account = new Account(nullLog);

        account.someOperation();
    }
}
