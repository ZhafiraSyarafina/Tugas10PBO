package id.ac.unand.fti.si.pbo;

public class App {
    public static void main(String[] args) {
        Integer jumlahBayar1, jumlahBayar2, jumlahBayar3, jumlahBayar4 = 0;

         //polymorphisme
         Member memberR = new MemberReguler();  // Membuat objek dari kelas member reguler
         Member memberS = new MemberSilver();   // Membuat objek dari kelas member silver
         Member memberG = new MemberGold();     // Membuat objek dari kelas member gold
         Member memberP = new MemberPlatinum(); // Membuat objek dari kelas member platinum
 
         jumlahBayar1 = memberR.hitungTotalBayar(400000);   //menghitung total belanja di member reguler
         jumlahBayar2 = memberS.hitungTotalBayar(500000);   //menghitung total belanja di member silver
         jumlahBayar3 = memberG.hitungTotalBayar(1100000);  //menghitung total belanja di member gold
         jumlahBayar4 = memberP.hitungTotalBayar(8000000);  //menghitung total belanja di member platinum
 
         //menampilkan jumlah bayar
         System.out.println("Total bayar member reguler: " + jumlahBayar1);
         System.out.println("Total bayar member silver: " + jumlahBayar2);
         System.out.println("Total bayar member gold: " + jumlahBayar3);
         System.out.println("Total bayar member platinum: " + jumlahBayar4);
 
    }
    
}
