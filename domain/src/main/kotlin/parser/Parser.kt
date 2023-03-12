package parser

interface Parser<T, R> {
    fun parseText(source: T): R
}