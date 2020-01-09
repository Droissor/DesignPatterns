package src.com.study.design.pattern.structural.decorator;

class Lizard {
    public int age;

    public String crawl() {
        return (age > 1) ? "crawling" : "too young";
    }
}

