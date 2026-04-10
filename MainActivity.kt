fun hitungGrade(nilai: Int): String {
    return when {
        nilai >= 90 -> "A"
        nilai >= 80 -> "B"
        nilai >= 70 -> "C"
        else -> "D"
    }
}

fun main() {
    print("Masukkan nama: ")
    val nama = readLine() ?: "User"

    print("Masukkan nilai: ")
    val nilai = readLine()?.toIntOrNull() ?: 0

    val grade = hitungGrade(nilai)

    println("Halo $nama")
    println("Nilai kamu: $nilai")
    println("Grade kamu: $grade")
}