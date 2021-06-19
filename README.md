# kotlin-self-types

Unfortunately Kotlin does not support self types, thus the following code will not work in Kotlin:

```kotlin
abstract class Shape(pos: Point) {

  var position: Point = pos
        internal set
        
  fun move(pos: Point): Self {
    position = pos
    return this
  }
  
  class Circle(pos: Point, val r: Double): Shape(pos)
  
  class Rect(pos: Point, val s: Size): Shape(pos)
}
```

Example code demonstrating how to emulate self types with Kotlin
