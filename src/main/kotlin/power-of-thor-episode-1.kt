// https://www.codingame.com/training/easy/power-of-thor-episode-1
import java.util.*
import kotlin.math.sign

enum class Command(val x: Int, val y: Int) {
    N(0, -1), NE(1, -1), E(1, 0), SE(1, 1), S(0, 1), SW(-1, 1), W(-1, 0), NW(-1, -1);
}

fun cmd(x: Int, y: Int) : Command = Command.values().find { x == it.x && y ==it.y }!!

fun main() {

    val input = Scanner(System.`in`)
    val lightX = input.nextInt()
    val lightY = input.nextInt()
    var initialTx = input.nextInt()
    var initialTy = input.nextInt()

    while (true) {
        input.nextInt()

        val deltaX =  (lightX - initialTx).sign;
        val deltaY = (lightY - initialTy).sign;

        println(cmd(deltaX, deltaY))

        initialTx += deltaX
        initialTy += deltaY
    }
}