/*
 * Returns the index of the alphabet for the given character.
 * Parameters:
 * - None.
 * Returns: The index of the alphabet (0 for 'a' or 'A', 1 for 'b' or 'B', etc.). Returns -1 for non-alphabetic characters.
*/ 
fun Char.alphabetIndex(): Int{
    return when (val intVal = this.code) {
        in 97..122 -> intVal - 97
        in 65..90 -> intVal - 65
        else -> -1
    }
}