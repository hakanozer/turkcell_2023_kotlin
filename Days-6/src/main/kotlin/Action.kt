class Action {

    var name = "Erkan Bilsin"
    private var number = 10
    var settings = Settings();

    companion object {
        var num = 100;
    }

    init {
        println(name)
        println("init Call")
    }

    constructor(){
        println("constructor call")
    }

    constructor(_number:Int) {
        number = _number
        println("_number constructor call")
    }

    fun stringSize( data: String ) : Int {
        var num = 100
        call()
        return data.length + number
    }

   private fun call() {
        println("Call Line")
   }

}