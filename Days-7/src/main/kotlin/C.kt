class C : B("C Title") {

    override fun toString(): String {
        return "{C Class Call}"
    }

    fun mail( send:String, to: String ) {
        println( "Send : $send to: $to" )
    }

    override fun create(): String {
        //return super.create()
        return "C Product Create"
    }

}