
fun main(args: Array<String>) {

    var ac:Action = Action.obj1()
    val item = when(ac) {
        is Action.obj1 -> ac.call()
        is Action.obj2 -> 20
        is Action.obj3 -> false
    }
    println(item)

    var profile = Profile<String>()
    val itemx = profile.call("Profile")
    println(itemx)

    var profileX = Profile<User>()
    var arr = mutableListOf<User>()

    var base1 = BaseImpl()
    DelegateClass(base1).security("Ali")

    // Connection conn;
    try {
        // Hata olma olasılığı olan kodlar
        // conn.open()
        val num1 = 100
        val num2 = 0
        val end = num1 / num2
        println( end )
    }catch (ex:Exception) {
        // Hata varsa çalışan kodlar
        println("Lütfen sayısal, 0 olmayan ve pozitif değer giriniz!")
    }finally {
        // her durumda çalışmasını istediğimiz kodlar
        // conn.close()
    }
    println("This Line Call")

}