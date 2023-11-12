package id.ac.unand.fti.si.pbo;

public class MemberGold extends Member implements CanRequestCicilan, CanRequestDelivery {

    @Override
    public Integer hitungTotalBayar(Integer totalBelanja) {
        Integer diskon = 0;

        if (totalBelanja >= 500000 && totalBelanja <= 1000000) {
            diskon = 2;
        } else if (totalBelanja > 1000000 && totalBelanja <= 7000000) {
            diskon = 4;
        } else if (totalBelanja > 7000000) {
            diskon = 6;
        }

        this.totalBayar = totalBelanja - (totalBelanja * diskon / 100);

        return this.totalBayar;
    }


    @Override
    public Integer hitungCicilanPerBulan(Integer totalBelanja, Integer jmlBulan) {
        return hitungCicilanPerBulan(totalBelanja, jmlBulan);
    }

    @Override
    public Double hitungOngkir(Double jarakTujuan) {
        if(jarakTujuan > 7){
            jarakTujuan = (jarakTujuan - 6.3) * 1000.0;
            this.ongkir = Math.round(jarakTujuan * 10.0) / 10.0;
            
        }

        return this.ongkir;
    }
    
}
