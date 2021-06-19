package com.mthaler.selftypes

fun main(args: Array<String>) {
    val circle = Circle(Point(4.0, 3.0), 2.0).move(Point(5.0, 4.0))
    circle.radius = 2.5
    println(circle)
    val rect = Rect(Point(4.5, 3.3), Size(3.0, 2.0)).move(Point(5.5, 4.5))
    rect.size = Size(3.5, 2.5)
    println(rect)
}