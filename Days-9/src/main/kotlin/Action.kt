private class Action {

    // private -> class -> sadece kendi dosyası içinde görünebilme yeteneği
    // private -> variable, fun, object -> sadece kendi classı içinde görünebilme yeteneği
    private val age = 40;

    // public -> Default -> classı erişime uygun olan her yerden görünebilme yeteneğini sahip.
    val name = "Ali Bilmem"

}

class PrClass {
    fun call() {
        var ac1 = Action()
        ac1.name
    }
}
