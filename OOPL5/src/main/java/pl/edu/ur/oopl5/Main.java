package pl.edu.ur.oopl5;

public class Main {

    public static void main(String[] args) {
        // TODO zad 3, 5, 6
        //zad 3
        Stos stos = new Stos();
        for (int i = 0; i < 50; i++) {
            stos.Push((int) Math.random());
        }
        for (int i = 0; i < 50; i++) {
            System.out.println(i + 1 + "." + stos.Pop());
        }
             

        //zad5
        Firma newFirma = new Firma();
        newFirma.setPracownikOnIndex(0);
        newFirma.writePracownik();
        
        //zad6
         Liczba a = new Liczba("2");
       a.conv();
       a.wypisz();
        System.out.println(a.mnoz(3));
        System.out.println(a.silnia());
    }
    }


