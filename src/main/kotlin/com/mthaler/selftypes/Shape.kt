package com.mthaler.selftypes

interface Shape {

    val position: Point
}

data class Circle(override val position: Point, val radius: Double): Shape {

    fun withRadius(radius: Double): Circle = copy(radius = radius)
}

data class Rect(override val position: Point, val size: Size): Shape {

    fun withSize(size: Size): Rect = copy(size = size)
}