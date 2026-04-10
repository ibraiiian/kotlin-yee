fun main() {
    print("Masukkan nilai: ")
    val nilai = readLine()?.toIntOrNull() ?: 0

    if (nilai >= 90) {
        println("Grade A")
    } else if (nilai >= 80) {
        println("Grade B")
    } else if (nilai >= 70) {
        println("Grade C")
    } else {
        println("Grade D")
    }
}