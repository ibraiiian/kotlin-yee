fun main() {
    print("Masukkan nama: ")
    val nama = readLine() ?: "User"

    print("Masukkan nilai: ")
    val nilai = readLine()?.toIntOrNull() ?: 0

    if (nilai >= 90) {
        println("Halo $nama, Grade A")
    } else if (nilai >= 80) {
        println("Halo $nama, Grade B")
    } else if (nilai >= 70) {
        println("Halo $nama, Grade C")
    } else {
        println("Halo $nama, Grade D")
    }
}