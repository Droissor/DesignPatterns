package src.com.study.design.pattern.behavioral.templatemethod;

public class TemplateMethodDemo {
    public static void main(String[] args) {

        Creature[] creatures = new Creature[]{new Creature(1, 3), new Creature(1, 2), new Creature(3,3)};

        PermanentCardDamageGame permanentCardDamageGame = new PermanentCardDamageGame(creatures);
        System.out.println(permanentCardDamageGame.combat(0,1));
        System.out.println(permanentCardDamageGame.combat(0,1));

        TemporaryCardDamageGame temporaryCardDamageGame = new TemporaryCardDamageGame(creatures);
        System.out.println(temporaryCardDamageGame.combat(0,1));
        System.out.println(temporaryCardDamageGame.combat(0,1));
        System.out.println(temporaryCardDamageGame.combat(1,2));
        System.out.println(temporaryCardDamageGame.combat(2,2));

    }
}
