public class Unggas {
    int jumlahMakan;
    String warna;


    void makan(int jumlahMakan){
        System.out.println("Unggas ini makan sebanyak " + jumlahMakan + " kali");
    }

    void makan(int jumlahMakan, String warna){
        System.out.println("Unggas berwarna " + warna + " makan sebanyak " + jumlahMakan + " kali");
    }

    void makan(String warna, int jumlahMakan){
        System.out.println("Unggas berwarna " + warna + " makan sebanyak " + jumlahMakan + " kali");
    }

    void terbang(String terbang){
        System.out.println("Unggas ini " + terbang);
    }

    void berjalan(){
        System.out.println("Unggas ini berjalan");
    }

}
