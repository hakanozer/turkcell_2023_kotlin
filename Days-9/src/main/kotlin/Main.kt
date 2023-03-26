import models.CategoryModel
import models.ProductModel
import user.Profile

fun main(args: Array<String>) {

    var a = A();
    var profile = Profile()
    profile.address

    val c1 = CategoryModel(10, "Elektronik")
    val c2 = CategoryModel(11, "Ev")
    val c3 = CategoryModel(12, "Telefon")

    var pro1 = ProductModel("TV", 30000, c1)
    println( " ${pro1.title}  ${pro1.price} " )

    val list = mutableListOf<ProductModel>()
    var p1 = ProductModel("TV", 30000,c1)
    var p2 = ProductModel("Tablet", 15000, c2)
    var p3 = ProductModel("Table", 4400,c1)
    var p4 = ProductModel("Pho e", 3300, c3)
    list.add(p1)
    list.add(p2)
    list.add(p3)
    list.add(p4)

    for ( item: ProductModel in list ) {
        println( " ${ item.title } - ${ item.price } - ${item.category.name} " )
    }
}