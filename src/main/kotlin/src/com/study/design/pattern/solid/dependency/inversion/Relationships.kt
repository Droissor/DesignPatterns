package src.com.study.design.pattern.solid.dependency.inversion

import src.com.study.design.pattern.solid.dependency.inversion.domain.Person
import src.com.study.design.pattern.solid.dependency.inversion.domain.Relationship

open class Relationships : RelationshipBrowser {

    val relations = mutableListOf<Triple<Person, Relationship, Person>>()

    fun addParentAndChild(parent: Person, child: Person) {
        relations.add(Triple(parent, Relationship.PARENT, child))
        relations.add(Triple(child, Relationship.CHILD, parent))
    }

    override fun findAllChildrenOf(name: String) = relations.filter { it.second == Relationship.PARENT && it.first.name == name }.map { it.third }

}