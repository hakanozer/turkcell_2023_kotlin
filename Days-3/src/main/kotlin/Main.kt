fun main(args: Array<String>) {

    // Arrays -> Diziler
    // Bir değişken içinde birden fazla değer tutumak için kullanılır.

    // dizi oluşturma
    var cities = arrayOf("İstanbul", "Ankara", "Ankara", "İzmir", "İzmir", "Bursa" )
    var numbers = arrayOf(10,20,30)
    var anyArr = arrayOf(10, true, 10.5, 'A', "Ali");
    println(cities)
    println(numbers)
    println(anyArr)

    // dizi item ulaşım
    println( cities[0] )

    // item add
    cities = cities.plus("Hatay")
    println( cities[4] )
    // println( cities[5] ) -> error

    // size
    println( cities.size )

    // dizi elemanlarını tersine tekrar oluştur
    cities.reverse();

    // get
    println( cities.get(0) )

    // set
    cities.set(1, "Adıyaman")
    println( cities[1] )

    // array in item search
    var city = "hatay"
    if ( city in cities ) {
        println("$city Var")
    }else {
        println("$city dizi içinde yok")
    }

    // distinct
    // Tekrarlanan verilerin sadece bir tanesinin kullanılması için geçerlidir.
    var arrayList = cities.distinct()

    // tüm elemanları ayrı ayrı yazdırma
    for ( item in arrayList ) {
        println( item )
    }

    // drop
    // belirli bir index elemanından başlayıp diziyi değiştir
    println("=============================")
    for ( item in cities ) {
        println(item)
    }
    var dropList = cities.drop(3)
    println("=============================")
    for ( item in dropList ) {
        println(item)
    }

    // Range
    // Aralık belirterek bir işlemin yapılmasını sağlar
    for ( item in 3..8 ) {
        println( item )
    }

    // downTo
    for( item in 10 downTo 6 ) {
        println(item)
    }

    // step
    for( item in 1..20 step 4 ) {
        println( item )
    }

    // char range
    for( item in 'a'..'z' ) {
        println( item )
    }

    // reversed
    for( item in ('a'..'z').reversed() ) {
        println( item )
    }

    // filter
    var arr1 = (1..100).filter { item -> item > 50 }
    println( arr1 )
    var arr2 = cities.filter { item -> item.contains("a") }
    println(arr2)


    var val1 = 1..100 step 3
    println( val1.step )
    println( val1.maxOrNull() )
    println( val1.sum() )

    noParams()
    sum(10,50)
    sum(55,444)
    var intSum = sumReturn(660, 500)
    println( intSum )

    var name = "Ali"
    var lists = order(name, 30)
    println( name.hashCode() )
    println( lists.get(0) )
    println( lists.get(1) )

    var sumi = calculate(60, 100, ::sumx)
    println( sumi )

    var sizeChar = callChar("Merhaba Istanbul", ::charSize )
    println( "Total Size : $sizeChar" )

    var intSize = charSize("asdsaa");
    println(intSize)

}

fun noParams() {
    println("noParams Call")
}

fun sum( num1:Int, num2:Int ) {
    var sm = num1 + num2
    println( "Sum : $sm" )
}

fun sumReturn( num1:Int, num2:Int ): Int {
    var sm = num1 + num2
    return sm
}

fun order( str:String, num: Int ): List<Any> {
    println( str.hashCode() )
    var arr = arrayListOf(str + " Bilmem", num * 1.4)
    return arr
}

fun sumx(a: Int, b: Int) = a + b
fun calculate(a: Int, b: Int, operation:(Int, Int) -> Int): Int {
    return operation(a, b)
}

fun charSize( title:String ) = title.length
fun callChar(stData: String, operation: (String) -> Int ) : Int {
    return operation(stData)
}