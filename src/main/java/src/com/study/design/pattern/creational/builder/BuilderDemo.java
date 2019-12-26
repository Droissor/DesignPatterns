package src.com.study.design.pattern.creational.builder;

public class BuilderDemo {
    public static void main(String[] args) {
        CodeBuilder codeBuilder = new CodeBuilder("Person")
                .addField("name", "String")
                .addField("age", "Int");

        System.out.println(codeBuilder);

    }
}
