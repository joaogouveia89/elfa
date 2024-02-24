/* Counts the number of integers divisible by a given number (k) in the range.
 * Parameters:
 * - k: The divisor to check for divisibility.
 * Returns: The number of integers within the range that are divisible by k.
*/
fun IntRange.countDivisorsByK(k: Int): Int {
    val countDivisibleB = this.last / k
    val countDivisibleA = this.first / k

    val count = countDivisibleB - countDivisibleA

    return if (this.first % k == 0) count + 1 else count
}