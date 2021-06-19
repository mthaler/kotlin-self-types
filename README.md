# kotlin-self-types

Unfortunately Kotlin does not support self types, thus the following code will not work in Kotlin:

```kotlin
abstract class Shape(pos: Point) {

  var position: Point = pos
        internal set
        
  fun move(pos: Point): Self { // imaginary syntax for self type in
    position = pos
    return this
  }
  
  class Circle(pos: Point, val r: Double): Shape(pos)
  
  class Rect(pos: Point, val s: Size): Shape(pos)
}

val circle: Circle = Circle(Point(4.0, 3.0), 2.0).move(Point(5.0, 4.0))
```

