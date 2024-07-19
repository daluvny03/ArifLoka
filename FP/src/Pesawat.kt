class pesawat:ArifLoka(){
    var kembali=0
    var valid=1
    override fun pesawat() {
        while (valid==1) {
            println("selamat datang di arifloka tiket pesawat")
            println("jenis tiket pesawat yang tersedia  \n1.ekonomi\n2.bisnis\n3.first class\n4.ekonomi premium\n5.first blood")
            print("Masukkan tiket yang dipilih = ")
            kode = readLine()!!.toInt()
            if (kode == 1) {
                jenis = "Tiket pesawat class ekonomi"
                harga = 2000000
                valid = 0
            } else if (kode == 2) {
                jenis = "Tiket pesawat class bisnis"
                harga = 4000000
                valid = 0
            } else if (kode == 3) {
                jenis = "Tiket pesawat first class"
                harga = 6000000
                valid = 0
            } else if (kode == 4) {
                jenis = "Tiket pesawat class ekonomi premium"
                harga = 8000000
                valid = 0
            } else if (kode == 5) {
                jenis = "Tiket pesawat class first blood"
                harga = 12000000
                valid = 0
            } else {
                println("Tiket tidak tersedia")
                println("Silakan masukkan kode kembali dengan benar!")
                valid = 1
            }
        }
        print("Masukkan Tanggal = ")
        tanggal= readLine()!!.toString()
        println("tersedia $tsd $jenis")
        print("Berapa banyak tiket yang ingin dibeli = ")
        bnyk= readLine()!!.toInt()
        harga*=bnyk
        println("Harga yang harus dibayar = Rp."+harga)
        print("Masukkan uang = ")
        pembayar= readLine()!!.toInt()
        while (pembayar < harga) {
                println("Uang yang anda masukkan kurang harap masukkan uang yang benar!!!")
                print("Masukkan uang = ")
                pembayar = readLine()!!.toInt()

        }
        kembali = pembayar - harga
        println("Pembayaran Lunas")
        println("==============================NOTA TRANSAKSI===================================")
        println("Nama\t\t\t=$nama\nNo Induk Naga\t=$NINaga\nTanggal\t\t\t=$tanggal\nJenis Pesawat\t=$jenis\nHarga\t\t\t=$harga\nCash\t\t\t=$pembayar\nKembalian\t\t=$kembali")
        println("Terimakasih telah menggunakan jasa kami")
        println("=========================================")
        println("1. Kembali ke Menu|2. Keluar")
        print("Masukkan kode = ")
        kode= readLine()!!.toInt()
        if (kode==1){
            var kon=kontrol()
            kon.kon()
        }
    }
}