package id.ac.unand.fti.si.pbo;

public class MemberPlatinum extends Member implements CanDeposit, CanRequestCicilan, CanRequestDelivery {
    Integer saldo = 0;

    @Override
    public Integer deposit(Integer totalDeposit) {
        this.saldo += totalDeposit;
        return this.saldo;
    }

    @Override
    public Integer tarikTunai(Integer totalTarikTunai) {
        this.saldo -= totalTarikTunai;
        return this.saldo;
    }

    @Override
    public Integer getSaldo() {
        return getSaldo();
    }

    public Integer cekSaldo(){
        return this.saldo;
    }

    @Override
    public Integer hitungTotalBayar(Integer totalBelanja) {
        Integer diskon = 0;

        if (totalBelanja >= 500000 && totalBelanja <= 1000000) {
            diskon = 3;
        } else if (totalBelanja > 1000000 && totalBelanja <= 7000000) {
            diskon = 5;
        } else if (totalBelanja > 7000000 ) {
            diskon = 7;
        }

        this.totalBayar = totalBelanja - (totalBelanja * diskon / 100);
        
        return this.totalBayar;
    }
    @Override
    public Integer hitungCicilanPerBulan(Integer totalBelanja, Integer totalBulan) {
        return hitungCicilanPerBulan(totalBelanja, totalBulan);
    }

    @Override
    public Double hitungOngkir(Double jarakTujuan) {
        if(jarakTujuan > 10){
            jarakTujuan = (jarakTujuan - 9.3) * 1000.0;
            this.ongkir = Math.round(jarakTujuan * 10.0) / 10.0;
            
        }

        return this.ongkir;
    }
    
}
