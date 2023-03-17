import kotlin.math.sign

fun main(args: Array<String>) {

    // List
    // Runtime -> uygulama çalışıyorken bile içerisine veri alma yada silme yeteneğini sahiptirler.

    // Array
    // Normal dizi üyeleri daha sonradan içerisine veri alamazlar, verilerin silinmeside olamaz.
    var ls1 = listOf("Ali", "Veli");
    println(ls1)
    // ls1.add("Mehmet");

    // Mutable Array
    var mutList1 = mutableListOf<String>()

    // Eleman Ekleme
    mutList1.add("İstanbul")
    mutList1.add("İstanbul")
    mutList1.add("Ankara")
    mutList1.add("Bursa")
    mutList1.add("İzmir")
    mutList1.add(1, "Gaziantep")

    // single item
    var single = mutList1.get(0);
    var single1:String? = mutList1.getOrNull(9);
    single.length
    if (single1 != null) {
        single1.length
    }
    single1?.length
    //single1!!.length
    println(single)
    println(single1)

    // size
    var size = mutList1.size
    println("total Size: $size")

    // for loop
    for ( item in 0..mutList1.size - 1 ) {
        println( mutList1.get(item) )
    }

    println("===========================")
    for ( item in mutList1 ) {
        println( item )
    }

    // contains
    if ( "İstanbul" in mutList1 ) {
        println("İstanbul status: OK")
    }else {
        println("İstanbul status: False")
    }
    var statusContains = mutList1.contains("Bursa")
    println("Bursa Status: $statusContains")

    // indexOf
    var index = mutList1.indexOf("İstanbul");
    println("index : $index")

    // Add List
    var list1 = mutableListOf<String>("Adana", "Samsun", "Adıyaman");
    var newList = mutList1 + list1
    println(newList)

    mutList1.addAll(list1)
    println(mutList1)

    // remove list items
    var removeList = mutableListOf<String>("Gaziantep", "Bursa")
    var removeResult = mutList1 - removeList
    println( removeResult )

    // Slicing
    // Parçalama yaparak yeni dizi oluşturma
    var slicingArr = removeResult.slice(2..4)
    println( slicingArr )


    // filterNotNull
    var nullOrArr = mutableListOf<String?>("Ali", null, "Veli", "Zehra")
    nullOrArr.add(null);
    var filterNotNullArr = nullOrArr.filterNotNull();
    println(filterNotNullArr)

    // Filter
    var searchArr = mutList1.filter { item -> item.contains("d")  }
    println( searchArr )

    // drop
    var dropArr = mutList1.drop(3);
    println(dropArr)

    // groupBy
    var groupByArr = mutList1.groupBy { item -> item.length > 8 }
    println( groupByArr.get(false) )

    // chunked
    mutList1.add("Edirne")
    var chunkedArr = mutList1.chunked(3)
    println(chunkedArr)
    println(chunkedArr.size)
    for ( items in chunkedArr ) {
        println( "===Row===" )
        for ( item in items ) {
            println("chunked item : $item")
        }
    }

    // Set
    // Benzersiz değerleri kendi içinde toplama özelliği vardır
    var mutableSet1 = mutableSetOf<String>()
    mutableSet1.add("Ali")
    mutableSet1.add("Ali")
    mutableSet1.add("Ali")
    mutableSet1.add("Zehra")
    mutableSet1.add("Ayşe")
    mutableSet1.add("Mehmet")
    mutableSet1.add("Ahmet")

    // Remove
    mutableSet1.remove("Ali")

    // Remove if
    mutableSet1.removeIf { item -> item.length > 5 }
    mutableSet1.add("Zehra")

    // Normal
    mutableSet1.add("Serkan")
    println( mutableSet1 )

    // sorted
    var resultSet = mutableSet1.sorted();
    println( resultSet )

    var resultReverse = resultSet.reversed()
    println( resultReverse )


}