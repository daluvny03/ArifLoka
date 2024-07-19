class kontrol(){
    fun tol(){
        var arif=ArifLoka()
        arif.show()
        println("Selamat datang di arifloka")
        println("kami menyediakan layanan pembelian tiket pesawat, kereta api, penyewaan hotel dan villa")
    }
    fun kon() {
        var arif=ArifLoka()
        println("Menu yang tersedia = ")
        println("1. Tiket kereta")
        println("2. Tiket pesawat")
        println("3. Tiket hotel")
        println("4. Tiket villa")
        println("5. Pesanan Saya")
        print("Masukkan menu yang dipilih = ")
        arif.kode = readLine()!!.toInt()
        println("===================================")
        do {
            if (arif.kode == 1) {
                var kereta = kereta()
                kereta.kereta()
            } else if (arif.kode == 2) {
                var pesawat=pesawat()
                pesawat.pesawat()
            } else if (arif.kode == 3) {
                var hotel=hotel()
                hotel.hotel()
            } else if (arif.kode == 4) {
                var villa=villa()
                villa.villa()
            }
            else if(arif.kode==5){
                println(pesananSaya.data.joinToString(separator = "\n"))
                println("=========================================")
                println("1.Kembali ke menu|2.keluar")
                print("Masukkan kode = ")
                arif.kode= readLine()!!.toInt()
                if (arif.kode==1){
                    var kon=kontrol()
                    kon.kon()
                }
            }else {
                print("Silakan masukkan kode yang benar")
            }
        } while (arif.kode == 6)
    }
}