fun main(args: Array<String>) {
    println( args.joinToString() )

    // Kotlinde ; gerekli değildir.
    println("Hello Kotlin")
    println( 10 * 50 )
    //println( 10 / 0 )
    print("Kemal"); print("Bilirim")
    println("Bilsin")
    print("Bilki")

    // Değişkenler
    /*
        Multi line
        comment
    */

    // String
    // Karakter Katarı
    println()
    var name = "Ali"
    println(name)
    var surname:String = "Bilmem"
    name = "Kemal"
    println(name)
    var nick = "20"


    // Int
    // tam sayı
    var age:Int = 30
    var num:Byte = 30
    var num1:Short = 32700
    var num2:Long = 999999934534534539;
    age = 2147000000
    num = 127

    // Boolean Type
    // True - False
    var status:Boolean = true

    // Float, Double
    // Ondalıklı değerler
    var on1:Float = 10.5f
    var on2:Double = 3453453.534534534534
    println( on2 + 3453453 )

    // Char
    //  içerisine sadece bir karakter atılabilen değerlerdir.
    var c1 = 'A'


    // Type Casting
    // Tür dönüşümü
    var stNum = "100"
    var convert = stNum.toInt();
    println( 10 + convert )



}