package livecode;

abstract class Kamar {
    String tipe_kamar;
    int Harga_kamar;
    String nama_penyewa;
    
    abstract void tipe_kamar();
    abstract void Harga_kamar(int harga_kamar);
    abstract void nama_penyewa();

}
