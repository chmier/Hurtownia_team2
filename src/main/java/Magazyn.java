import java.util.*;

public class Magazyn {

    int nrZamowienia = 100;
    double nrFaktury = 10.2019;

    Scanner scanner = new Scanner(System.in);

    Map<Integer, Hurtownia> listaProduktowDoZamowienia = new HashMap<>();


    public Map<Integer, Hurtownia> dodajZamowienie() { //nowa HashMapa <value, key - obiekt>

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
        return listaProduktowDoZamowienia;
    }

    public void wyswietlZamowione() {
        for (Map.Entry<Integer, Hurtownia> entry : listaProduktowDoZamowienia.entrySet()) {      // j
            System.out.println("Nr zamówienia to : " + entry.getKey() + " | " + entry.getValue().getProdukt() + " | " + " ilość : " + entry.getValue().getIlosc());
        }
    }

    public void usunZamowienie() {
        System.out.println("Podaj nr zamówienia do usunięcia: ");

        boolean done = false;
        while (!done) {
            try {
                int nrDousuniecia = scanner.nextInt();
                if (!listaProduktowDoZamowienia.containsKey(nrDousuniecia)) {
                    throw new FileModuleNew("nie ma takiego nr zamowienia");

                }
                listaProduktowDoZamowienia.remove(nrDousuniecia);
                done = true;
            } catch (FileModuleNew fileModuleNew) {
               // fileModuleNew.printStackTrace();
                System.out.println("nie ma takiego zamowienia");
            } catch (InputMismatchException e) {
                System.out.println("Zły format");
            }

        }
    }
}

