fun main(args: Array<String>) {

    var x = 10
    var y = 20;

    var end = x + y
    println(end)
    end = x - y
    println(end)
    end = x * y
    println(end)
    end = x / y
    println( end )
    end = x % y
    println(end)

    var status = false
    status = x > y
    println( status )
    status = x < y
    println(status)
    status = x >= y
    println( status )
    status = x <= y
    println( status )
    status = x == y
    println(status)
    status = x != y
    println( status )

    if ( x != y ) {
        println("x and y not equals")
    }else {
        println("x and y equals")
    }

    x += 5
    println(x)

    y -= 6 // y = y - 6
    println(y)

    x *= 4 // x = x * 4
    println(x)

    x /= 3 // x = x / 3
    println(x)

    var a = 5
    var b = 6

    println(+a)
    println(-a)

    ++a // a = a + 1
    --a // a = a - 1
    println(a)

    // 5
    println(++a)
    println(a++)
    println(a)

    a++; ++a; a++;
    println(a)

    println(!!!!!status)


    // && -> ve
    // solda bulunan şart ile sağda bulunan şartı true olarak ara
    var endVar = a == 10 && b >= 6 && a > 5
    println(endVar)

    // || -> veya
    // solda veya sağdaki şartlardan bir tanesinin true olması durumudur
    var orVar = a == 15 || b > 5 || 100 > 1
    println(orVar)

    // a -> 10
    // b -> 6
    var endOrVar = a > 10 && b > 5 || a > 3 && b == 10
    println(endOrVar)

    var xx = true
    var yy = false
    var zz = true

    var statusVar = xx.and(yy)
    statusVar = xx.or(yy)
    if ( xx == yy ) {
        statusVar = true
    }else {
        statusVar = false
    }
    statusVar = xx and yy
    println(statusVar)

    var str1 = "Lorem Ipsum, dizgi ve baskı endüstrisinde kullanılan mıgır metinlerdir. Lorem Ipsum, adı bilinmeyen bir matbaacının bir hurufat numune kitabı oluşturmak üzere bir yazı galerisini alarak karıştırdığı 1500'lerden beri endüstri standardı sahte metinler olarak kullanılmıştır. Beşyüz yıl boyunca varlığını sürdürmekle kalmamış, aynı zamanda pek değişmeden elektronik dizgiye de sıçramıştır. 1960'larda Lorem Ipsum pasajları da içeren Letraset yapraklarının yayınlanması ile ve yakın zamanda Aldus PageMaker gibi Lorem Ipsum sürümleri içeren masaüstü yayıncılık yazılımları ile popüler olmuştur."
    var charCount = str1.length
    if (charCount > 160) {
        println("Veri gönderilemez")
    }else {
        println("Send Data...")
    }
    println(charCount)

    var strType = "Fenerbahçe bu sene " +
            "şampiyon " +
            "olacak"
    var strType1 = """Fenerbahçe bu sene
        şampiyon
        olacak
    """
    println( strType )
    println( strType1 )

    var name = "Ali"
    var surname = "Bilmem"
    println("Name: $name Surname: $surname ")
    println("Name: " + name + " Surname: " + surname)

    println( str1[0] )

    println( str1.length )
    println( str1.lastIndex )

    println( str1.lowercase() )
    println( str1.uppercase() )

    var address = " İstanbul                  "
    println( address.trim() )

    var concat = "$name $surname"
    concat = concat.drop(1)
    println(concat)
    concat = concat.dropLast(3)
    println(concat)

    var index = str1.indexOf("dizgi")
    println( index )

    var statu = str1.contains("oyun")
    println( statu )

    var computer_1 = "Macbook Air"
    var computer_2 = "Macbook Pro"
    var count = computer_1.compareTo(computer_2)
    println(count)


    //println( str1[700] )
    println( str1.getOrNull(700) )

    var newString = str1.replace("Lorem", "Ali")
    println(newString)
    
}