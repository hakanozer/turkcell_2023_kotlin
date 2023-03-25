interface IProduct {

    fun productAdd( title: String, price: Int ) : Boolean
    fun productList( ) : List<String>
    fun productSearch( data: String ) : List<String>

}