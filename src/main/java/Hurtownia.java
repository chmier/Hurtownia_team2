public class Hurtownia {



    private String produkt;
    private int ilosc;
    private double cenaProduktu;

    public Hurtownia(String produkt, int ilosc, double cenaProduktu) {
        this.produkt = produkt;
        this.ilosc = ilosc;
        this.cenaProduktu = cenaProduktu;
    }

    public Hurtownia() {
    }


    public String getProdukt() {
        return produkt;
    }

    public void setProdukt(String produkt) {
        this.produkt = produkt;
    }

    public int getIlosc() {
        return ilosc;
    }

    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
    }

    public double getCenaProduktu() {
        return cenaProduktu;
    }

    public void setCenaProduktu(double cenaProduktu) {
        this.cenaProduktu = cenaProduktu;
    }
}
