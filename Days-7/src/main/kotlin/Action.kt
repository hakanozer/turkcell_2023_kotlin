class Action constructor(val name: String, val age: Int ) {

    init {
        println("init Call $name")
    }

    fun call( num1: Int, num2: Int ) {
        val sum = num1 + num2;
        println( "Sum : $sum" )
    }


}