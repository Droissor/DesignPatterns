package src.com.study.design.pattern.creational.prototype;

class PrototypeDemo {
    public static void main(String[] args) {
        Line line = new Line(new Point(5,0), new Point(0,5));

        Line otherLine = line.deepCopy();

        otherLine.end = new Point(10,10);

        System.out.println(line);
        System.out.println(otherLine);
    }
}
