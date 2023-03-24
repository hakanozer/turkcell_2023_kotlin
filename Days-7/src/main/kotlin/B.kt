open class B constructor(_name:String) : Base(20) {

    var name = _name

    override fun create(): String {
        return "B Product Create"
    }

    fun sales() {
        if (_a > 50) {
            create();
        }else {
            super.create();
        }
        println("B Sales")
    }

}