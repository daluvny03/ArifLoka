class pesananSaya:ArifLoka() {
    data class pesananSaya(var tanggal: String, var tanggalakhir: String, var jenis: String) {
        override fun toString(): String {
            return "Jenis: \t\t\t$jenis \nTanggal Masuk: \t$tanggal \nTanggal Keluar: $tanggalakhir "
        }
    }

    companion object {
        val data = mutableListOf(pesananSaya("22 mei 2022", "24 mei 2022", "villa mountain"))
    }

}