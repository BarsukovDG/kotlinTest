fun main() {
//    arrayTest(7)
//    println(numbers.asList())
    val nums: List<Int> = (1..10).toList()
    test_params("Alan", status = "Married")
    test_numbers(nums, 2, 3)
}

fun test_1() {
    var age: Int = 30
    var x: Int = 10
    var y: Int = x + 10
    //    val name: String
    //    name = "Test"
    println(age)
    println(x + y)

    val firstName = "Thomas"
    val lastName = "Anderson"
    val welcome = "Hello, $firstName $lastName"
    println(welcome)

    print("Введите имя: ")
    val name = readLine()
    println("Ваш возраст: ")
    val your_age = readLine()
    val birth_year: Int = 2024 - your_age!!.toInt()
    val birth_year_2: Int = birth_year - 1

    println("Ваше имя: $name")
    println("$name, Вы родились в 1й половине $birth_year-го или во 2й половине $birth_year_2-го года")
}


fun calc(){
    println("blablabla два числа")
    val first = readln().toDouble()
    val second = readln().toDouble()
    println("blabla action + - * /")
    val action = readln()[0]
    if (action == '+'){
        println(first + second)
    }
}


fun test_3() {
    val rnds = (0..10).random()
    var y: Int = 3
    println(
        """
            Я загадал число от 1 до 10.
            У тебя $y попытки, чтобы угадать число
            Твой вариант:
        """.trimIndent()
    )
    for (item in y - 1 downTo 0 step 1) {
        val x = readln().toInt()
        if (x > rnds) {
            println("Не угадал, $x больше")
        } else if (x < rnds) {
            println("Не угадал, $x меньше")
        } else if (x == rnds) {
            println("Да! Я загадал число $rnds")
            break
        }
        y -= 1
        if (y == 0) {
            println(
                """
                Попытки кончились!
                Я загадал число $rnds
                Ты проиграл""".trimIndent()
            )
        }
        println("Осталось $y попыток")
    }
}

fun test_4() {
    val rnds = (0..10).random()
    var y: Int = 3
    println(
        """
            Я загадал число от 1 до 10.
            У тебя $y попытки, чтобы угадать число
            Твой вариант:
        """.trimIndent()
    )
    for (item in y - 1 downTo 0 step 1) {
        val x = readln().toInt()
        when {
            x > rnds -> println("Не угадал, $x больше")
            x < rnds -> println("Не угадал, $x меньше")
        }
        if (x == rnds) {
            println("Да! Я загадал число $rnds")
            break
        }
        y -= 1
        if (y == 0) {
            println(
                """
                Попытки кончились!
                Я загадал число $rnds
                Ты проиграл""".trimIndent()
            )
        }
        println("Осталось $y попыток")
    }

}

fun test_5(a: Int){
    val a = a
    when(a){
        in 10..19 -> println("a в диапазоне от 10 до 19")
        in 20..29 -> println("a в диапазоне от 20 до 29")
        !in 10..20 -> println("a вне диапазона от 10 до 20")
        else -> println("неопределенное значение")
    }
}

fun test_6(){
    val range1 = 5 downTo 1
    for(c in range1) print(c)
    println()

    val range2 = 'a'..'d'
    for(c in range2) print(c)
    println()

    for(c in 1..9) print(c)
    println()

    for(c in 1 until 9) print(c)
    println()

    for(c in 1..9 step 2) print(c)
}

fun test_params(name: String, age: Int = 18, status: String = "Single"){
    println("$name, $age, $status")
}

fun test_numbers(intList: List<Int>, position: Int = 0, multiplier: Int = 1){
    val result: Int = multiply(intList, position, multiplier)
    println(result)
}
fun multiply(intList: List<Int>, position: Int = 0, multiplier: Int = 1): Int {
    return intList[position] * multiplier
}





