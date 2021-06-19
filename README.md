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

There are various approaches to emulate self types, e.g. using self-referencing generics. The sample code uses Kotlin extension functions to emulate self types.

## Limitations

It would be much cleaner to use immutable data classes to model shapes. However, it is not possible to implement a generic extension function that returns a new shape with an updated position because copy methods are only implemented for data classes extending the abstract Shape class. We could write a `move` extension function for each concrete implementation of the abstract Shape class to achieve an immutable version of the example code.
