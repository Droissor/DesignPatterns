package src.com.study.design.pattern.solid.single.responsibility

class SingleResponsibilityDemo

fun main() {
    val journal = Journal()

    journal.addEntry("I have study today")
    journal.addEntry("I have worked today")
    journal.addEntry("I have played today")
    journal.removeEntry()

    print(journal)

    Persistence().saveJournal(journal)
}