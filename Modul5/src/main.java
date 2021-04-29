public class main
{
    public static void main(String args[])
    {
        //Contoh overloading
        Ayam a = new Ayam();
        a.makan(3);
        a.makan(2, "kuning");

        //Contoh overriding
        Unggas hewan = new Burung();
        hewan.terbang("terbang");

        //Upcasting menggunakan class Unggas => Ayam, Bebek, Burung
        Unggas duck = new Bebek();
        duck.terbang("tidak bisa terbang");
        duck.berjalan(); // method ini tidak ada di class child. tapi ada di class parent. jadi kalau diclass parent dihapus maka error.

        //Downcasting menggunakan class Mamalia => Kucing
        Mamalia hewan1 = new Kucing();

        Kucing kite = (Kucing) hewan1;
        kite.bertelur(0);
        kite.berjalan();
    }
}
