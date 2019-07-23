import java.util.*;

public class Magazyn {

    int nrZamowienia = 100;
    double nrFaktury = 10.2019;

    Scanner scanner = new Scanner(System.in);

    HashMap<Integer, Hurtownia> listaProduktowDoZamowienia = new HashMap<>();


    public void dodajZamowienie() {
        System.out.println("ile chcesz podać produktow?:");
        int ilosc = scanner.nextInt();


        for (int i = 0; i < ilosc; i++) {

            Hurtownia produkt = new Hurtownia();
            System.out.println("Podaj produkt do zamówienia: ");
            produkt.setProdukt(scanner.next());
            System.out.println("Podaj ilosc towaru: ");
            produkt.setIlosc(scanner.nextInt());
            produkt.getCenaProduktu();

            nrZamowienia += 1;
            listaProduktowDoZamowienia.put(nrZamowienia, produkt);
        }
        for(Map.Entry<Integer, Hurtownia> entry : listaProduktowDoZamowienia.entrySet()) {
            System.out.println("Nr zamówienia to : " + entry.getKey() + " | " + entry.getValue().getProdukt() + " | " + " ilość : " +  entry.getValue().getIlosc());
        }

    }
}

