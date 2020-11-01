//import kotlin.math.min
//
//
//fun main() {
//    val point1: Point = Point()
//    val point2:Point=Point()
//    point1.x = 4f
//    point1.y = 4f
//    point2.x=1f
//    point2.y=6f
//    println(point1.toString())
//    println(point1.equals(point2))
//    println(point1.symmetrical())
//    val fraction1:Fraction=Fraction(5f,6f)
//    val fraction2:Fraction=Fraction(4f,3f)
//    fraction1.n=5f
//    fraction1.d=10f
//    fraction2.n=15f
//    fraction2.d=10f
//    println(fraction1.fractionMultiplication(fraction2))
//    println(fraction1.fractionDetermination())
//    println(fraction1.SubtractionOFractions(fraction2))
//    println(fraction1.AssambelingOFractions(fraction2))
//    println(fraction1.fractionDivision(fraction2))
//}
//
//
//class Point() {
// var x:Float=0f
// var y:Float=0f
//
//    fun equals(other:Point) {
//        if (x ==other.x && y==other.y) {
//
//            println("point one  is the same as point two. ")
//
//        } else {
//            println("point1 is not the same as point2 ")
//
//        }
//
//    }
//
//    fun symmetrical() {
//        x =x * -1
//        y = y
//
//        println("new coordinates are: $x,$y")
//
//
//    }
//
//    override fun toString(): String{
//        return "$x,$y"
//    }
//
//
//
//
//
//
//    }
//class Fraction(n:Float,d:Float) {
//    var d = 0f
//    var n = 0f
//    fun fractionMultiplication(other: Fraction) {
//        var z = n * other.n
//        var b = d * other.d
//        println("$z/$b")
//    }
//
//    fun fractionDetermination() {
//        var k = min(n, d)
//        for (t in k.toInt() downTo 1) {
//            if (n.toInt() % t == 0 && d.toInt() % t == 0) {
//                d = d / t
//                n = n / t
//                break
//
//
//            }
//        }
//        println("$n/$d")
//    }
//
//    fun SubtractionOFractions(other: Fraction) {
//        if (d == other.d) {
//            println("$n-${other.n}/$d")
//        } else {
//            var l = n*other.d-other.n*d
//            var r = d * other.d
//            var f = min(r, l)
//            for (q in f.toInt() downTo 0) {
//                if (l.toInt() % q == 0 && r.toInt() % q == 0) {
//                    l=l/q
//                    r=r/q
//                    break
//
//                }
//
//
//            }
//            println("$l/$r")
//
//
//        }
//
//    }
//    fun AssambelingOFractions(other: Fraction) {
//        if (d == other.d) {
//            println("$n+${other.n}/$d")
//        } else {
//            var l = d * other.n + other.d * n
//            var r = d * other.d
//            var f = min(r, l)
//            for (q in f.toInt() downTo 0) {
//                if (l.toInt() % q == 0 && r.toInt() % q == 0) {
//                    l=l/q
//                    r=r/q
//                    break
//
//                }
//
//
//            }
//            println("$l/$r")
//
//
//        }
//
//    }
//    fun fractionDivision(other: Fraction) {
//        var z = n * other.d
//        var b = d * other.n
//        println("$z/$b")
//    }
//}
//
//
//
//
//



















