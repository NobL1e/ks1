package org.example

fun main() {
// Кол-во заказов
val numberOfOrders: Int = 75

// Текст благодарности
val thankYouMessage: String = "Спасибо за ваш заказ!"

    // Вывод значений переменных
    println("Количество заказов: $totalOrders")
    println("Сообщение с благодарностью: $thankYouMessage")

    // Переменная для хранения кол-тва работников
    // var numberOfEmployees: Int = 2000
    // println("Количество работников: $numberOfEmployees")

    // Увольнение работника и обновление значения
    numberOfEmployees = 1999 //всего работников
    println("Новое количество работников: $numberOfEmployees")


    // Год полета такой же- используем val
    val year: Int = 1961
    // Час и мин взлета и посадки меняются,используем var
    var hour: Int = 9
    var minute: Int = 7
    println(year)
    println(hour)
    println(minute)
    // Изменение на время посадки
    hour = 10
    minute = 55
    // Вывод времени
    print(hour)
    print(":")
    print(minute)

    // Выбираем тип данных кот. занимает наименьшее место в памяти
    val length: Long = 40_868_600_000L
    val age: Byte = 27
    val partOfDay: Float = 0.075f
    val seconds: Short = 6480
    val partOfYear: Double = 2.0547945205479453E-4
    val apogee: Int = 327000
    println(length)
    println(age)
    println(partOfDay)
    println(seconds)
    println(partOfYear)
    println(apogee)
}