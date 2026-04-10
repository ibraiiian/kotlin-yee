fun main() {
    print("Masukkan nama: ")
    val nama = readLine() ?: "User"

    print("Masukkan nilai: ")
    val nilai = readLine()?.toIntOrNull() ?: 0

    if (nilai >= 75) {
        println("Halo $nama, kamu LULUS 🎉")
    } else {
        println("Halo $nama, kamu TIDAK LULUS 😢")
    }
}