fun main() {
//    print(reverseString("1345"))
    /*val array: Array<Int> = arrayOf(1, 2, 3, 4, 5, 8,1)
    var newArray: Array<Int> = emptyArray()
    newArray = reverseArray(array)
    newArray.forEach {
        println(it)
    }*/

//    println(removeWhiteSpacesFromString("   123   abc   456   x y z "))
//    println(replaceWhiteSpacesFromStringWithCharacter("   123   abc   456   x y z "))

    val array = arrayOf(9,1,2,4,2,1,5,87,12,1,3,2)
    /*array.sort()*/
    /*val newArray = */
//    sortArrayManually(array)
   val newArray = removeDuplicateElementsInArray(array)

    /*for (i in array) {
        println(i)
    }*/

    countOfDuplicateElementsInArrayForEachElement(array)
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
        } else {
            newStr += element
        }
    }
    return newStr
}

fun replaceWhiteSpacesFromStringWithCharacter(str: String): String {
    var newStr = ""
    var replaceSymbol = '-'

    for (i in str.trim()) {
        if (i == ' ') {
            newStr += replaceSymbol
        } else {
            newStr += i
        }
    }
    return newStr
}

fun removeDuplicateElementsInArray(arr: Array<Int>): Array<Int> {
    var newArray = emptyArray<Int>()

    for (i in arr.indices) {
        if (i == arr.size - 1 || arr[i] != arr[i + 1]) {
            newArray += arr[i]
        }
    }
    return newArray
}

fun sortArrayManually(array: Array<Int>): Array<Int> {
    var i = 0

    while (i < array.size - 1) {
        if (array[i] > array[i + 1]) {
            val temp = array[i]
            array[i] = array[i + 1]
            array[i + 1] = temp
            i = -1
        }
        i++
    }

    return array
}

fun countOfDuplicateElementsInArrayForEachElement(array: Array<Int>){


 /*   for (i in array.indices){
        var countOfDuplicateElements = 0
        for (j in i + 1..<array.size) {
                if (array[i] == array[j]){
                    countOfDuplicateElements+=1
                }
        }
        if (countOfDuplicateElements> 0){
            println("${array[i]}... ${countOfDuplicateElements+1}")
        }else{
            println("${array[i]}... ${0}")
        }
    }*/

    for (i in array.indices) {
        var count = 0
        if (array[i] != Int.MIN_VALUE) {
            for (j in i + 1..<array.size) {
                if (array[i] == array[j]) {
                    count++
                    array[j] = Int.MIN_VALUE
                }
            }
            if (count > 0) {
                println("${array[i]} repeated ${count + 1} times")
            } else {
                println("${array[i]} repeated 0 times")
            }
        }
    }
}