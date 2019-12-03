package src.com.study.design.pattern.solid.dependency.inversion

class BetterResearch(relationshipBrowser: RelationshipBrowser) {

    init {
        relationshipBrowser.findAllChildrenOf("John").forEach { println("John has a child called ${it.name}") }
    }
}