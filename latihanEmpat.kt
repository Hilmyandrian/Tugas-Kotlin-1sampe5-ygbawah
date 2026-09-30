//Latihan 4

fun main() {
    val scores = mutableMapOf<Int, Int>(
        230101 to 85,
        230102 to 90,
        230103 to 78
    )

    scores[230101] = 95

    scores.remove(230103)

    println("Daftar Nilai Mahasiswa:")
    for ((nim, score) in scores) {
        println("NIM: $nim - Nilai: $score")
    }

    val nonExistentNim = 230199
    val result = scores[nonExistentNim]
    println("\nNilai untuk NIM $nonExistentNim: $result")
}
