import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Magazyn {

    int nrZamowienia = 100;
    double nrFaktury = 10.2019;

    Scanner scanner = new Scanner(System.in);

    List<Hurtownia> listaProduktowDoZamowienia = new ArrayList<>();

    public void dodajZamowienie() {
        System.out.println("ile chcesz podać produktow?:");
        int ilosc = scanner.nextInt();


        for (int i = 0; i < ilosc; i++) {


            Hurtownia produkt = new Hurtownia();
            produkt.setProdukt(scanner.next());
            produkt.setIlosc(scanner.nextInt());
            produkt.getCenaProduktu();

            nrZamowienia += 1;
            nrFaktury += 1;
            listaProduktowDoZamowienia.add(produkt);

            System.out.println("nr zamowienia:" + nrZamowienia + listaProduktowDoZamowienia );


        }

    }

}
