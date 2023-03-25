fun main(args: Array<String>) {

    var userCustomer = Customer(100, 12312312)
    println( "Title : ${userCustomer.userName()}  Total : ${userCustomer.userTotal()}" )

    var productImpl = ProductImpl()
    var product:IProduct = ProductImpl()

}