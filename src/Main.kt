fun main() {
//    print(reverseString("1345"))
    /*val array: Array<Int> = arrayOf(1, 2, 3, 4, 5, 8,1)
    var newArray: Array<Int> = emptyArray()
    newArray = reverseArray(array)
    newArray.forEach {
        println(it)
    }*/

    println(removeWhiteSpacesFromString("   123   abc   456   x y z "))
//    println(replaceWhiteSpacesFromStringWithCharacter("   123   abc   456   x y z "))

}

fun reverseString(str: String): String {
    var newStr = ""
    for (i in str.length - 1 downTo 0) {
        newStr += str[i]
    }
    return newStr
}

fun reverseArray(array: Array<Int>): Array<Int> {
    var newArr: Array<Int> = emptyArray()

    for (i in array.size - 1 downTo 0) {
        newArr += array[i]
    }
    return newArr
}

fun removeWhiteSpacesFromString(str: String): String {
    var newStr: String = ""

    for (element in str.trim()) {
        if (element == ' ') {
            newStr += ""
        }else{
            newStr += element
        }
    }
    return newStr
}

fun replaceWhiteSpacesFromStringWithCharacter(str : String): String{
    var newStr = ""
    var replaceSymbol = '-'

    for (i in str.trim()){
        if (i == ' '){
            newStr += replaceSymbol
        }else{
            newStr+=i
        }
    }
    return newStr
}
