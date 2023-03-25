class A constructor(_x:Int) : Base(_x) {

    override fun create() : String {
        return "A Product Create"
    }

    fun title() : String {
        return "A Product Title";
    }

}