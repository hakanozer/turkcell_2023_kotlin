sealed class Action {
    constructor() {
        println("Action Call")
    }

    constructor( num:Int ) {
        println("Action Call : $num")
    }

    class obj1 : Action(1)
    class obj2 : Action(2)
    class obj3 : Action(3)

    fun call() {
        println("Call Call")
    }
}
