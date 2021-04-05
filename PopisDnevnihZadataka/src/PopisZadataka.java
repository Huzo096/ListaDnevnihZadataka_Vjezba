import java.util.ArrayList;

public class PopisZadataka {
    private ArrayList<String> listaZadataka;

    public PopisZadataka(){
        this.listaZadataka = new ArrayList<String>();
    }

    public void dodajZadatak(String zadatak){
        listaZadataka.add(zadatak);
    }
    public void ispisZadataka(){
        int i = 1;
        for (String zadatak : listaZadataka){
            System.out.println(i + ": " + zadatak);
            i++;
        }
        if(listaZadataka.size() < 1){
            System.out.println("Trenutačno nema zadataka!");
        }
    }

    /*
        'brojZadatka -1' ... zato jer program sortira zadatke od 0, dok korisnici obično percipiraju sortiranje od 1
        NPR: kada bi imali  kao parametar samo 'brojZadatka', ukoliko bi korisnik unio da želi izbrisati zadatak broj 4,
        program bi zapravo izbrisao zadatak koji je u korisnikovoj percepciji spremljen pod zadatak broj 5
     */
    public void ukloniZadatak(int brojZadatka){
        listaZadataka.remove(brojZadatka -1);
    }

}
