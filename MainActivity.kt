fun cekLulus(nilai: Int): String {
    return if (nilai >= 70) "Lulus" else "Tidak Lulus"
}

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
    val status = cekLulus(nilai)

    println("Nama: $nama")
    println("Nilai: $nilai")
    println("Grade: $grade")
    println("Status: $status")
}