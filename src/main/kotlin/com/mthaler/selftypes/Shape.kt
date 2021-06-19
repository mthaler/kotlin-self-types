package com.mthaler.selftypes

interface Shape {

    val position: Point
}

data class Circle(override val position: Point, val radius: Double): Shape