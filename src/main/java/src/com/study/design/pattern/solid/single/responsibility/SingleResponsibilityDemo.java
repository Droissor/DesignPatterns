package src.com.study.design.pattern.solid.single.responsibility;

class SingleResponsibilityDemo {

    public static void main(String[] args) throws Exception {
        Journal journal = new Journal();

        journal.addEntry("I have study today");
        journal.addEntry("I have worked today");
        journal.addEntry("I have played today");
        journal.removeEntry();

        System.out.println(journal);

        new Persistence().saveJournal(journal);
    }
}
