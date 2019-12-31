package delegtion

import kotlin.reflect.KProperty


fun main() {
    plainComment()
    println("##### Polite String")
    politeComment()
}


class PoliteString(var content: String) {
    operator fun getValue(thisRef: Any?, property: KProperty<*>) =
        content.replace("stupid", "s*****")

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        content = value
    }
}

private fun politeComment() {
//    var comment: String by PoliteString("Some nice message")
    var comment: String by beignpolite("Some nice message")
    println(comment)

    comment = "This is stupid"
    println(comment)
    println("comment is of length: ${comment.length}")
}

private fun plainComment() {
    var comment: String = "Some nice message"
    println(comment)

    comment = "This is stupid"
    println(comment)
    println("comment is of length: ${comment.length}")
}

fun beignpolite(content: String) = PoliteString(content)

