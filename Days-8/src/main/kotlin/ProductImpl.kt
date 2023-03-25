class ProductImpl : IProduct {

    override fun productAdd(title: String, price: Int): Boolean {
        return true
    }

    override fun productList(): List<String> {
        var list = arrayListOf<String>()
        return list
    }

    override fun productSearch(data: String): List<String> {
        var list = arrayListOf<String>()
        return list
    }

    fun productCall() {

    }

}