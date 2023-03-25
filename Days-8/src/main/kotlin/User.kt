abstract class User {

    private var _num:Int = 0
    constructor() { }

    constructor( num:Int ) {
        _num = num
        _num = 100
        println( _num )
    }

    abstract fun userNumber() : Int
    abstract fun userTC() : Int

    fun userName() : String {
        if ( userNumber() == 100 ) {
            return "Ali Bilmem"
        }else if  ( userNumber() == 200 ) {
            return "Erkan Bilsin"
        }else {
            return "";
        }
    }

    fun userTotal() : Int {
        if ( userNumber() == 100 ) {
            return 55000
        }else if  ( userNumber() == 200 ) {
            return 65000
        }else {
            return 0
        }
    }

}