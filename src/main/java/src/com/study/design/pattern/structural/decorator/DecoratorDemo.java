package src.com.study.design.pattern.structural.decorator;

/**
 * I didn't particularly find it a very illustrative exercise,
 * it could be the standard christmas tree or something like that
 */
public class DecoratorDemo {
    public static void main(String[] args) {
        Dragon dragon = new Dragon();

        dragon.setAge(50); //apparently a 50 year old dragon will be too old to fly =/

        System.out.println(dragon.crawl());
        System.out.println(dragon.fly());
    }
}
