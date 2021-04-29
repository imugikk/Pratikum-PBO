public class Kucing extends Mamalia{
    void bertelur(int jumlahAnak){
        if(jumlahAnak == 0){
            System.out.println("Kucing ini tidak bertelur");
        }
        else{
            System.out.println("Kucing ini bertelur sebanyak " + jumlahAnak + " butir");
        }
    }

    void berjalan(){
        System.out.println("Kucing ini berjalan");
    }
}
