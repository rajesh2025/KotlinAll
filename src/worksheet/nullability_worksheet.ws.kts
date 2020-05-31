import javax.lang.model.type.NullType

var nulllistItem: List<String?> = listOf(null,null)
print(nulllistItem)

var  blueColor :Int? = null
var greenColor = null
var colorList :List<Int?> = listOf(blueColor,greenColor)
print(colorList)

var nulllist :List<Int>? = null
println(nulllist)
var nullType :List<NullType>? = null


listOf(null,null)

// null safety
var nullTest :Int ?= null
var result = nullTest?.plus(1) ?:0
result = nullTest?.inc() ?:0
println(result)
