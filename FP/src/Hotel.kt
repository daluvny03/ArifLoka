class hotel:ArifLoka() {
    var kembali = 0
    var hari = 0
    var valid=1
    override fun hotel() {
        while (valid==1) {
            println("Selamat datang di arifloka hotel")
            println("jenis hotel yang tersedia\n1.Standart\n2.Superior\n3.VVIP\n4.Deluxe")
            print("Masukkan kamar yang disewa = ")
            kode = readLine()!!.toInt()
            when (kode) {
                1 -> {
                    jenis = "Kamar Standart"
                    harga = 800000
                    valid = 0
                }

                2 -> {
                    jenis = "Kamar Superior"
                    harga = 1600000
                    valid = 0
                }

                3 -> {
                    jenis = "Kamar VVIP"
                    harga = 2400000
                    valid = 0
                }

                4 -> {
                    jenis = "Kamar Deluxe"
                    harga = 5000000
                    valid = 0
                }

                else -> {
                    println("Kamar tidak tersedia. Silakan masukkan kode kembali dengan benar!")
                    valid = 1
                }
            }
        }
        print("Tanggal = ")
        tanggal = readLine()!!.toString()
        println("Tersedia $tsd $jenis")
        var tggl = tanggal.substring(0, 2).toInt()
        print("Berapa hari penyewaan = ")
        hari = readLine()!!.toInt()
        tggl += hari
        tanggalakhir = "$tggl${tanggal.substring(2, 11)}"
        harga *= hari
        println("Harga yang harus dibayar = Rp." + harga)
        while (pembayar < harga) {
                println("Uang yang anda masukkan kurang harap masukkan uang yang benar!!!")
                print("Masukkan uang = ")
                pembayar = readLine()!!.toInt()

        }
        kembali = pembayar - harga
        println("Pembayaran Lunas")
        println("==============================NOTA TRANSAKSI===================================")
        println("Nama\t\t\t=$nama\nNo Induk Naga\t=$NINaga\nTanggal\t\t\t=$tanggal-$tanggalakhir\nJenis Kamar\t=$jenis\nHarga\t\t\t=$harga\nCash\t\t\t=$pembayar\nKembalian\t\t=$kembali")
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