/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl5;

import java.util.Scanner;

/**
 *
 * @author Jakub
 */
public class Firma {

    private Pracownik[] pracownikTab = new Pracownik[100];

    public Firma() {
        for (int i = 0; i < this.pracownikTab.length; i++) {
            this.pracownikTab[i] = new Pracownik("", "", 0, "");
        }
    }

    public void setPracownikOnIndex(int index) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj imie: ");
        String name = input.nextLine();
        System.out.println("Podaj nazwisko: ");
        String surname = input.nextLine();
        System.out.println("Podaj pozycje: ");
        String position = input.nextLine();
        System.out.println("Podaj wiek: ");
        int age = input.nextInt();
        this.pracownikTab[index] = new Pracownik(name, surname, age, position);
    }

    public void writePracownik() {
        for (int i = 0; i < pracownikTab.length; i++) {
            System.out.println("---");
            System.out.println(pracownikTab[i].toString());
        }
        System.out.println("---");
    }

  
}
