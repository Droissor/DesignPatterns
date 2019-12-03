package src.com.study.design.pattern.solid._interface.segregation.integral

class MultiFunctionPrinter :
    Machine {

    override fun print(document: String) {
        /**Do something*/
    }

    override fun scan(document: String) {
        /**Do something*/
    }

    override fun fax(document: String) {
        /**Do something*/
    }
}