fun main(args: Array<String>) {
    var isActive = true
    var x = ""
    var y = ""
    var z = 0
    var answer = ""


    do {

        println("შეიყვანეთ X ცვლადის მნიშვნელობა")
        x = readln()
        do {
            if (!isValidInt(x)){
                println("შეიყვანეთ X ცვლადის მნიშვნელობა (ციფრი)")
                x = readln()
            }
        }while (!isValidInt(x))

        println("შეიყვანეთ Y ცვლადის მნიშვნელობა")
        y = readln()
        do {
            if (!isValidInt(y)){
                println("შეიყვანეთ Y ცვლადის მნიშვნელობა (ციფრი)")
                y = readln()
            }
        }while (!isValidInt(y))

        z = x.toInt() + y.toInt()
        println("X და Y ჯამი არის: $z")

        do {
            println("გსურთ პროგრამის ხელახლა დაწყება <Y/N>?")
            answer = readln()
            if (answer == "არა"){
                isActive = false
                break
            }
            if (answer != "დიახ"){
                println("გთხოვთ ჩაწეროთ სწორად!!!")
            }

        }while (answer != "დიახ")

    } while (isActive)
}

fun isValidInt(number: String): Boolean{
    return number.toIntOrNull() != null
}