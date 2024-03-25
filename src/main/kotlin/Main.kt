fun main(args: Array<String>) {
    sentence("Barnie bakes brown bagels and buns")
    var numbers = Number(arrayOf(11,23,12,21))
    calculate(22)
    isPalindrome("wow")
}
fun sentence(word:String){
    var separate = word.split("")
    println(separate)
    // for (letter in word)

}
class Number(var value:Array<Int>) {
    fun numbers(nums: Array<Int>): Array<Int> {
        var result = numbers(nums).sum()
        println(result)
        var result2 = numbers(nums).average()
        println(result2)
        return nums
    }
}
fun calculate(radius:Int,num:Int=4/3,pi:Double=3.14159){
    var r = radius*radius*radius
    var volume = r*num*pi
    println(volume)
}
fun isPalindrome(word:String):Boolean{
    var x = word.reversed()
    println(x)
    if (x === word)
        println("true")
    else
        println("false")
    return true or false

}
