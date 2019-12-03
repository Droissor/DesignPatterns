package src.com.study.design.pattern.solid._interface.segregation.segregated

class PhotoCopier : Printer, Scanner {

    override fun print(document: String) {
        /**Do something*/
    }

    override fun scan(document: String) {
        /**Do something*/
    }
}