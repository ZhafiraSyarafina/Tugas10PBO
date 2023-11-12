package id.ac.unand.fti.si.pbo;

public class MemberSilver extends Member implements CanRequestDelivery {

    @Override
    public Integer hitungTotalBayar(Integer totalBelanja) {
    Integer diskon = 0;

        if (totalBelanja >= 500000 && totalBelanja <= 1000000) {
            diskon = 1;
        } else if (totalBelanja > 1000000 && totalBelanja <= 7000000) {
            diskon = 3;
        } else if (totalBelanja > 7000000) {
            diskon = 5;
        }

        this.totalBayar = (totalBelanja - (totalBelanja * diskon / 100));

        return this.totalBayar; 
    }


    @Override
    public Double hitungOngkir(Double jarakTujuan) {
        if(jarakTujuan > 5){
            jarakTujuan =  jarakTujuan - 4.3;
            this.ongkir = jarakTujuan * 1500.0;
        }

        return this.ongkir;
    }

}
