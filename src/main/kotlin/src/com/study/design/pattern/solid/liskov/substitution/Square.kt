package src.com.study.design.pattern.solid.liskov.substitution

class Square(size: Int) : Rectangle(size, size) {

    /** Simulate sets override, can't do this in Kotlin, what we should thanks :)
     * The main problem here is that when i need change width or height i will change both
     * to the same value, to force rectangle to be an square.
     * */
    fun setSize(size: Int) {
        this.width = size
        this.height = size
    }


}