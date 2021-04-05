import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static PopisZadataka popisZadataka = new PopisZadataka();

    public static void main(String[] args) {

        boolean prekiniProgram = true;
        int izbor = 0;
        izbornik();
        while (prekiniProgram){
            System.out.println("Unesi svoj izbor:");
            izbor = Integer.valueOf(scanner.nextLine());

            switch (izbor){
                case 0:
                    popisZadataka.ispisZadataka();
                    break;
                case 1:
                    dodajZadatak();
                    break;
                case 2:
                    ukloniZadatak();
                    break;
                case 3:
                    prekiniProgram = false;
                    break;
                default:
                    System.out.println("Nepoznat unos!");
                    break;
            }
        }


    }
    public static void izbornik(){
        System.out.println(" Pritisni: ");
        System.out.println(" 0 - Ispis dnevnih zadataka");
        System.out.println(" 1 - Dodaj novi dnevni zadatak");
        System.out.println(" 2 - Ukloni zadatak");
        System.out.println(" 3 - Prekini program");
    }

    public static void dodajZadatak(){
        System.out.println("Koji zadatak želiš dodati:");
        String noviZadatak = scanner.nextLine();
        popisZadataka.dodajZadatak(noviZadatak);
    }

    public static void ukloniZadatak(){
        System.out.println("Unesi broj zadatka kojeg želiš ukloniti:");
        int obrisiZadatak = Integer.valueOf(scanner.nextLine());
        popisZadataka.ukloniZadatak(obrisiZadatak);
    }
}
