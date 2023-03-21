fun main(args: Array<String>) {

    // Map
    // Key, Val
    var map1 = mapOf<String, String>( "name" to "Ali", "surname" to "Bilmem", "name" to "Erkan"  )
    println( map1.get("name") )

    var map = mutableMapOf<String, String>()
    map.put("name", "Ali")
    map.put("surname", "Bilmem")
    map.put("email", "ali@mail.com")
    map.put("satatus", "false")
    map.put("class", "4.Class")
    println( map.get("name") )

    // all keys
    println("==================")
    var keys = map.keys
    for ( key in keys ) {
        println( map.get(key) )
    }
    println("==================")
    for( (k,v) in map ) {
        println( "Key :$k Value: $v" )
    }
    println("==================")
    map.forEach{ (k,v) ->
        println("k : $k v: $v")
    }

    println( map.size )
    println( map.count() )

    // key control
    if ( map.containsKey("name") ) {
        println( map.get("name") )
    }

    // key control
    if ( "name" in map ) {
        println("name OK")
    }

    // remove
    map.remove("name")

    // key sorted
    var resultMapSorted = map.toSortedMap();
    println( resultMapSorted )

    // filter
    var resultFilterValues = map.filterValues { item -> item.length > 3 }
    var resultFiterKey = map.filterKeys { key -> key.length > 6 }
    var resultFilter = map.filter { item -> item.key.length > 3  }

    println("resultFilter : $resultFilterValues")
    println("resultFilter : $resultFiterKey")
    println("resultFilter : $resultFilter")


    // Nesne üretim işlemi
    // Object
    var actionObj = Action();
    actionObj.name = "Serkan Bilki"
    println( actionObj.name )

    var actinObj1 = Action(200);
    println( actinObj1.name )

    var size = actionObj.stringSize("Ali Bilsin")
    println( size )

    println(Action.num)



}