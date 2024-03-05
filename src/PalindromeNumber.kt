fun main(){
    val num = 2132;
    println("The number $num is palindrome: ${isPalindrome(num)} ")
}

fun isPalindrome(x: Int) : Boolean {
    return reverseNumber(x) == x
}

fun reverseNumber(_num : Int) : Int{
    var num = _num
    var i = 0
    while (num > 0) {
        i *= 10
        i += (num % 10)
        num /= 10
    }
    return i
}

