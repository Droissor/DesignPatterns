package src.com.study.design.pattern.creational.builder;

class CodeBuilder {

    private StringBuilder stringBuilder = new StringBuilder();

    CodeBuilder(String className) {
        stringBuilder.append("public class ");
        stringBuilder.append(className);
        stringBuilder.append(System.getProperty("line.separator"));
        stringBuilder.append("{");
        stringBuilder.append(System.getProperty("line.separator"));
    }

    CodeBuilder addField(String name, String type)
    {
        stringBuilder.append("  public ");
        stringBuilder.append(type);
        stringBuilder.append(" ");
        stringBuilder.append(name );
        stringBuilder.append(";");
        stringBuilder.append(System.getProperty("line.separator"));

        return this;
    }

    @Override
    public String toString()
    {
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
