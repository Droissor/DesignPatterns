package src.com.study.design.pattern.solid._interface.segregation.integral

interface Machine {

    fun print(document: String)
    fun scan(document: String)
    fun fax(document: String)

}