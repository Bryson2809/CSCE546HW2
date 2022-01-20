/**
 * James Carroll
 * January 19, 2022
 */

import kotlin.math.*
import kotlin.system.exitProcess

private var a = 0.0
private var b = 0.0
private var c = 0.0
private var x1 = 0.0
private var x2 = 0.0

fun main(args: Array<String>) {
    while (true)
    {
        checkCommand()
        setVariables()
        solveEquation(a, b, c)
        printResults()
    }
}

fun checkCommand()
{
    println("Would you like to solve a problem 's' or quit the program 'q'?")
    val userChoice = readLine()
    if (userChoice == "q" || userChoice == "Q")
        exitProcess(0)
    else if (userChoice != "s" || userChoice != "S")
        checkCommand()
}

fun setVariables()
{
    println("Enter the 'a' value")
    val line = readLine()
    val doubleA = line?.toDouble()
    println("Enter the 'b' value")
    b = Double.valueOf(readLine())
    println("Enter the 'c' value")
    c = Double.valueOf(readLine())
}

fun solveEquation(a: Double, b: Double, c: Double)
{
    x1 = (((-b + sqrt(((b*b) - (4*a*c)).toDouble())) / (2*a)))
    x2 = (((-b - sqrt(((b*b) - (4*a*c)).toDouble())) / (2*a)))
}

fun printResults()
{

}

