package src.com.study.design.pattern.solid.dependency.inversion

import src.com.study.design.pattern.solid.dependency.inversion.domain.Person

/**
 * A. High-level modules should not depend on low-level modules.
 * Both should depend on abstractions.
 *
 * B. Abstractions should not depend on details.
 * Details should depend on abstractions.
 * */

class DependencyInversionDemo

fun main() {

    val parent = Person("John")
    val firstChild = Person("Chris")
    val secondChild = Person("Matt")

    val relationships = Relationships()

    relationships.addParentAndChild(parent, firstChild)
    relationships.addParentAndChild(parent, secondChild)

    println("Old Research")
    Research(relationships)

    println("New Research")
    BetterResearch(relationships)
}