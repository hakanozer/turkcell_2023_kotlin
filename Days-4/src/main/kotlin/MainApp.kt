fun main() {

    var count = 10;
    var result = if ( count > 9 ) {
        callPrint()
        true
    }else {
        100
    }
    println( result )

    // hatalı kullanım
    // var result1 = ( count > 9) ? "Büyük" : "Küçük"
    var result1 = if (count > 9) "Büyük"  else "Küçük"
    println( result1 )


    // Else - if
    var name = "Hasan";
    var surname = "Bil";
    var email = "hasan@mail.com";

    if (name == "") {
       println("Name Empty!")
    }else if ( surname == "" ) {
        println("Surname Empty!")
    }else if ( email == "" ) {
        println("Email Empty!")
    }else {
        println("Form Send..")
    }

    var num1 = 10
    var num2 = 11
    if ( num1 > 9 ) {
        if (num2 > num1) {

        }
    }

    if  ( num1 > 9 && num2 > num1 ) {
        println("Şart Geçerli")
    }else {
        println("Şartlar Geçersiz")
    }


    // when
    var str = "Ankara"
    when (str) {
        "Ankara" -> multiLineAnkara()
        "İstanbul" -> println( "İstanbul" )
        "İzmir" -> println( "İzmir" )
        else -> println("City Empty!")
    }


    var countx = 10
    when (countx) {
        in 1..5 -> println("1-5")
        in 6..10 -> println("5-10")
        else -> println("Empty!")
    }

    var arr = arrayOf( "Ali", "Veli", "Hasan", "Zehra", "Ayşe", "Selin" )
    for ( item in arr ) {
        println(item)
    }

    println("=======================")
    for ( item in 0..arr.size - 1 ) {
        var strItem = arr[item]
        if ( strItem == "Veli" ) {
            continue
        }
        if (strItem == "Zehra") {
            println("Zehra Found!")
            break // for loop break
        }
        println("For Call : $strItem")
    }

    println("=======================")
    var itr = arr.iterator()
    while ( itr.hasNext() ) {
        println( itr.next() )
    }

    println("=======================")
    while ( itr.hasNext() ) {
        println( itr.next() )
    }

    var i = 0
    while( i < 10 ) {
        println("While Call $i")
        i++;
    }

    println("=======================")
    var x = 0
    do {
        println("X Line Call $x")
        x++
    }while ( x < 10 )


}

fun callPrint() {
    println("Call Print Line")
}

fun multiLineAnkara() {
    println("Ankara")
    println(10)
    println(true)
}