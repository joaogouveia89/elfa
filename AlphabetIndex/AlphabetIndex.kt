
fun Char.alphabetIndex(): Int{
    return when (val intVal = this.code) {
        in 97..122 -> intVal - 97
        in 65..90 -> intVal - 65
        else -> -1
    }
}