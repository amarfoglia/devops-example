package it.unibo.example

class Logger(private val name: String) {
  fun print(out: String): Unit = println("[${name}] -> $out")
}
