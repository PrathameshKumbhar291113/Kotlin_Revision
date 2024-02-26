fun main() {
    print(reverseString("1345"))
}

fun reverseString(str: String): String{
    var newStr = ""
    for (i in str.length-1 downTo 0 ){
        newStr += str[i]
    }
    return newStr
}