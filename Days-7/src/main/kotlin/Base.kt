open class Base {
    var _a:Int = 0
    constructor() {
        println("Base constructor Call")
    }

    constructor(a: Int) {
        _a = a
    }

    open fun create() : String {
        return "Base Create Call";
    }

    fun price() : Int {
        return _a * _a;
    }

}