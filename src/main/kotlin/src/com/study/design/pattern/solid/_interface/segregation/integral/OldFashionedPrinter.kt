package src.com.study.design.pattern.solid._interface.segregation.integral

class OldFashionedPrinter :
    Machine {

    override fun print(document: String) {
        /**Do something*/
    }

    override fun scan(document: String) {
        throw Exception("OldFashionedPrinter can't scan")
    }

    override fun fax(document: String) {
        throw Exception("OldFashionedPrinter can't fax")
    }
}