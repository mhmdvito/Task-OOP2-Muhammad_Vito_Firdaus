package Exercise4

fun main() {
    // Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
    // Buat di bawah sini

    try {
        // Contoh: Membagi dua angka
        val angkaPertama = 10
        val angkaKedua = 0
        val hasilBagi = angkaPertama / angkaKedua

        println("Hasil pembagian: $hasilBagi")

    } catch (e: ArithmeticException) {
        println("Error: Terjadi kesalahan aritmatika - Pembagian oleh nol tidak diperbolehkan.")
    }
}