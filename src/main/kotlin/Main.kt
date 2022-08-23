fun main() {
    var spanishNumber = ""

    print("Choose a number 1-10: ")
    var userNum = readLine()!!.toInt()

    when (userNum){
        1 -> spanishNumber = "uno"
        2 -> spanishNumber = "dos"
        3 -> spanishNumber = "tres"
        4 -> spanishNumber = "cuatro"
        5 -> spanishNumber = "cinco"
        6 -> spanishNumber = "seis"
        7 -> spanishNumber = "siete"
        8 -> spanishNumber = "ocho"
        9 -> spanishNumber = "nueve"
        10 -> spanishNumber = "diez"
        else -> spanishNumber = "Not in range"
    }

    if (userNum in 1..10) {
        print("$userNum in Spanish is $spanishNumber")
    } else {
        print(spanishNumber)
    }
}