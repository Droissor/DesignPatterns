package src.com.study.design.pattern.solid.dependency.inversion

import src.com.study.design.pattern.solid.dependency.inversion.domain.Person

interface RelationshipBrowser {

    fun findAllChildrenOf(name: String): List<Person>

}