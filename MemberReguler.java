package id.ac.unand.fti.si.pbo;

public class MemberReguler extends Member{

    @Override
    public Integer hitungTotalBayar(Integer totalBelanja) {
    Integer diskon = 0;

        if (totalBelanja >= 500000 && totalBelanja <= 1000000) {
            diskon = 1;
        } else if (totalBelanja > 1000000 && totalBelanja <= 7000000) {
            diskon = 2;
        } else if (totalBelanja > 7000000) {
            diskon = 3;
        }
        

        this.totalBayar = totalBelanja - (totalBelanja * diskon / 100);

        return this.totalBayar.intValue();
    }

    
}