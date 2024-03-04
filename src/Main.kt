
fun main() {
    val array : IntArray = intArrayOf(5,7,9,12,19)
    val target = 28

    val arrayReturned = twoSum(array, target)
    println(arrayReturned)
}

fun twoSum(array: IntArray, target: Int): List<Int>? {
    val map = HashMap<Int, Int>()
    for (i in array.indices) {
        val complement = target - array[i]
        if (map.containsKey(complement)) {
            return listOf(map[complement]!!, i)
        }
        map[array[i]] = i
    }
    return null
}


