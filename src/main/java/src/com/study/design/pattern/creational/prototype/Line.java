package src.com.study.design.pattern.creational.prototype;

class Line {

    public Point start, end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    Line deepCopy() {
        return new Line(
                new Point(start.x, start.y),
                new Point(end.x, end.y)
        );
    }

    @Override
    public String toString() {
        return "Line{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}