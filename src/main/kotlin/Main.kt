import kotlin.math.pow

fun Task_1()
{
    println("Введите строку")
    var str = (readln() + ' ').toMutableList()
    var str1 = ""

    for (i in 0 until str.size) {
        str1 += str[i]

        if (i == str.size - 1)
            break

        var count = 1
        while (str[i] == str[i + 1]) {
            str.removeAt(i)
            count++
        }
        if (count != 1)
            str1 += count.toString()
    }
    println(str1)
}
fun Task_2()
{
    println("Введите строку: ")
    val text = readln()

    val charCounts = mutableMapOf<Char, Int>()
    for (char in text) {
        charCounts[char] = charCounts.getOrDefault(char, 0) + 1
    }

    val sortedChars = charCounts.keys.sorted()

    println("Количество различных символов: ${charCounts.size}")
    println("Символы (в алфавитном порядке):")
    for (char in sortedChars) {
        println("$char - ${charCounts[char]}")
    }
}
fun Task_3()
{
    println("Введите вещественное число:")
    val decimalNumber = readln().toInt()

    var decimal = decimalNumber
    var binaryNumber = ""

    while (decimal > 0) {
        binaryNumber += (decimal % 2).toString()
        decimal /= 2
    }

    println("число $decimalNumber в двоичной форме - $binaryNumber")
}
fun Task_4()
{
    println("Введите два числа и символ операции (разделять пробелами): ")
    val input = readln().split(" ")

    val number1 = input[0].toDouble()
    val number2 = input[1].toDouble()
    val operator = input[2].single()

    var result = 0.0
    when (operator) {
        '+' -> result = number1 + number2
        '-' -> result = number1 - number2
        '*' -> result = number1 * number2
        '/' -> result = number1 / number2
    }
    println("Результат: ${result.toString()}")

}
fun Task_5()
{
    print("Введите целое число n: ")
    val n = readln().toDouble()

    print("Введите основание степени x: ")
    val x = readln().toDouble()

    var y  = 0
    while (x.pow(y.toDouble()) != n && x.pow(y.toDouble()) < n) {
        y++
    }

    if (x.pow(y.toDouble()) == n) {
        println("Показатель степени: $y")
    }
    else {
        println("Целочисленный показатель не существует")
    }

}
fun Task_6()
{
    print("Введите целое число a: ")
    val n = readln()

    print("Введите целое число b: ")
    val x = readln()

    val number1 = (n + x).toInt()
    val number2 = (x + n).toInt()

    if (number1 % 2 != 0)
        println("Нечетное число $number1")
    else if (number2 % 2 != 0)
        println("Нечетное число $number2")
    else
        println("Создать нечетное число невозможно")

}

fun main() {
    println("Введите номер задания:")
    var a = readln()
    when(a)
    {
        "1" -> Task_1()
        "2" -> Task_2()
        "3" -> Task_3()
        "4" -> Task_4()
        "5" -> Task_5()
        "6" -> Task_6()
    }
}