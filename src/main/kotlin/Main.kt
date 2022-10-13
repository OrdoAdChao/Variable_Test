fun main(){

    println("Расчет объема параллелепипеда по формуле \"V = a * b * h\"")
    println("Введите a (длину)")
    val long = readLine()!!.toInt()
    println("Введите b (ширину)")
    val width = readLine()!!.toInt()
    println("Введите h (высоту)")
    val height = readLine()!!.toInt()

    val volume = long * width * height

    println("Результат: $volume")
}