package com.mthaler.selftypes

abstract class Shape(pos: Point) {

    var position: Point = pos
        internal set
}

class Circle(pos: Point, val r: Double): Shape(pos) {

    var radius: Double = r
        internal set

    override fun toString(): String {
        return "Circle(position=$position, radius=$radius)"
    }
}

class Rect(pos: Point, val s: Size): Shape(pos) {

    var size: Size = s
        internal set

    override fun toString(): String {
        return "Rect(position=$position, size=$size)"
    }
}

fun <T : Shape> T.move(value: Point) = apply { position = value }