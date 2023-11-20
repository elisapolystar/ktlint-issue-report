package fi.elisapolystar.ktlintissue

class Application

fun main(args: Array<String>) {
    val obj = DataClass(0, "", 0.0)
    val obj2 = DataClass(param1 = 0, param2 = "", param3 = 0.0)
    println(obj)
    doThings(0, "", 0.0)
    doThings(param1 = 9, param2 = "", param3 = 0.0)
}

private fun doThings(param1: Int, param2: String, param3: Double) {
    // NOP
}

data class DataClass(val param1: Int, val param2: String, val param3: Double)
