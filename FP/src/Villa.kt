class villa:ArifLoka(){
    var kembali=0
    var hari=0
    var valid=1
    override fun villa() {
        while (valid==1) {
            println("selamast datang di arifloka villa")
            println("jenis villa yang tersedia\n1.villa mountain\n2.villa beach\n3.resort villa\n4.rural villa\n5.luxury villa")
            print("Masukkan villa yang ingin disewa = ")
            kode = readLine()!!.toInt()
            if (kode == 1) {
                jenis = "Villa mountain"
                harga = 10000000
                valid = 0
            } else if (kode == 2) {
                jenis = "Villa beach"
                harga = 50000000
                valid = 0
            } else if (kode == 3) {
                jenis = "Resort villa"
                harga = 75000000
                valid = 0
            } else if (kode == 4) {
                jenis = "Rural villa"
                harga = 100000000
                valid = 0
            } else if (kode == 5) {
                jenis = "Luxury villa"
                harga = 1000000000
                valid = 0
            } else {
                println("Villa todak tersedia")
                println("Silakan masukkan kode kembali dengan benar!")
                valid = 1
            }
        }
        print("Masukkan Tanggal = ")
        tanggal= readLine()!!.toString()
        var tggl=tanggal.substring(0, 2).toInt()
        println("Tersedia $tsd $jenis")
        print("Berapa hari penyewaan = ")
        hari= readLine()!!.toInt()
        tggl+=hari
        tanggalakhir="$tggl${tanggal.substring(2,11)}"
        harga*=hari
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
        println("Nama\t\t\t=$nama\nNo Induk Naga\t=$NINaga\nTanggal\t\t\t=$tanggal-$tanggalakhir\nJenis Villa\t=$jenis\nHarga\t\t\t=$harga\nCash\t\t\t=$pembayar\nKembalian\t\t=$kembali")
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