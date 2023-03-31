class BaseImpl : IBase {

    override fun security(string: String): Boolean {
        if ( string == "Ali" ) {
            return true;
        }
        return false;
    }

    override fun token(string: String): Boolean {
        if (string == "token_1234") {
            return true;
        }
        return false;
    }

}