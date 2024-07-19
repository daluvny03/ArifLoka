class kereta:ArifLoka(){
    var kembali=0
    var valid=1
    override fun kereta() {
        while (valid==1) {
            println("Selamat datang di arifloka tiket kereta")
            println("jenis gerbong yang tersedia \n1.ekonomi\n2.bisnis\n3.VIP\n4.eksekutif\n5.luxury")
            print("Masukkan jenis gerbong = ")
            kode = readLine()!!.toInt()
            if (kode == 1) {
                jenis = "Tiket kereta class ekonomi"
                harga = 400000
                valid=0
            } else if (kode == 2) {
                jenis = "Tiket kereta class bisnis"
                harga = 600000
                valid=0
            } else if (kode == 3) {
                jenis = "Tiket kereta class VIP"
                harga = 800000
                valid=0
            } else if (kode == 4) {
                jenis = "Tiket kereta class eksekutif"
                harga = 1000000
                valid=0
            } else if (kode == 5) {
                jenis = "Tiket kereta class luxury"
                harga = 1500000
                valid=0
            } else {
                println("Gerbong tidak tersedia")
                println("Silakan masukkan kode kembali dengan benar!")
                valid = 1
            }
        }
        print("Masukkan Tanggal = ")
        tanggal= readLine()!!.toString()
        println("Tersedia $tsd $jenis")
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
        println("=============NOTA TRANSAKSI==============")
        println("Nama\t\t\t=$nama\nNo Induk Naga\t=$NINaga\nTanggal\t\t\t=$tanggal\nJenis Gerbong\t=$jenis\nHarga\t\t\t=$harga\nCash\t\t\t=$pembayar\nKembalian\t\t=$kembali")
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