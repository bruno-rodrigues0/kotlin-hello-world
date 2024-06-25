fun main(args : Array<String>) {
  var x: Int = 5 // Declaração de variavel mutavel com tipo 
  val y: Int = 10 // Declaração de variavel imutavel com tipo

  println(x * y)

  println(sum(x, y))
  println(fibonacci_recursivo(10))

  println(fibonacci_iterativo(10))
}

fun sum(a: Int, b: Int): Int {
  return a + b
}

fun fibonacci_recursivo(n: Int): Int { // Fibonacci recursivo
  if (n <= 1) return n // Condição de parada
  return fibonacci_recursivo(n - 1) + fibonacci_recursivo(n - 2)
}

fun fibonacci_iterativo(n: Int): Int { // Fibonacci iterativo
  var a = 0; var b = 1; var c = 0

  for (i in 2..n) { // Laços de iteração no Kotlin
    c = a + b
    a = b
    b = c
  }
  return c
}
