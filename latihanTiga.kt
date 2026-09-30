//Latihan 3

fun main() {
    val skills = mutableSetOf("Kotlin", "Java")

    skills.add("Python")
    skills.add("Kotlin")

    println("Ukuran Set: ${skills.size}")
    println()

    println("Apakah 'Swift' ada di Set? ${"Swift" in skills}")
    println("Apakah 'Python' ada di Set? ${"Python" in skills}")
}
