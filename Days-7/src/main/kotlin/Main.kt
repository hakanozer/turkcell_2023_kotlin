fun main(args: Array<String>) {

    val action = Action("Serkan Bilsinler", 40)
    action.call(40, 60)
    //val profile = Profile();

    val objA = A(11)
    println( "${objA.create()} Title : ${objA.title()} Price: ${objA.price()}" )

    val objB = B("B Title Name")
    println( "${objB.create()} Title : B Product Price: ${objB.price()}" )

    val objC = C()
    objC.hashCode();
    println( objC )

    val baseA:Base = A(100)
    val baseB:Base = B("New Title")
    val baseC:Base = C();
}