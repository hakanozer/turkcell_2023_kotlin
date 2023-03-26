 open class A {

     val name = "Asya"
     protected val number = 100
     private val status = false

     fun fncCall() {
         println(" $status ")
     }

}

class B : A() {
    fun call() {
        println( "$name - $number ")
    }
}