class Customer constructor(private var _unumber: Int, private var _uTC: Int = 0 ) : User() {

    override fun userNumber(): Int {
        return this._unumber;
    }

    override fun userTC(): Int {
        return this._uTC
    }

}