package src.com.study.design.pattern.solid.dependency.inversion

import src.com.study.design.pattern.solid.dependency.inversion.domain.Relationship

class Research(relationships: Relationships) {

    init {
        /**And if we need to change how stores the relationships? */
        relationships.relations.filter { it.second == Relationship.PARENT && it.first.name == "John" }.map { it.third }
            .forEach { println("John has a child called ${it.name}") }
    }
}