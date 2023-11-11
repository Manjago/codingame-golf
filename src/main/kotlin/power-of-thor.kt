import java.util.*
import kotlin.math.sign
enum class C(val x:Int,val y:Int){N(0,-1),NE(1,-1),E(1,0),SE(1,1),S(0,1),SW(-1,1),W(-1,0),NW(-1,-1)}
fun c(x:Int,y:Int)=C.values().find{x==it.x && y==it.y}!!
fun main(){
val i = Scanner(System.`in`)
val a = i.nextInt()
val b = i.nextInt()
var x = i.nextInt()
var y = i.nextInt()
 while (true) {
i.nextInt()
val c = (a - x).sign
val d = (b - y).sign
println(c(c, d))    
x += c
y += d
}
}