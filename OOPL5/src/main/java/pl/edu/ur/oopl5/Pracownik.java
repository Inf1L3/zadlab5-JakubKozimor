/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl5;

/**
 *
 * @author Jakub
 */
public class Pracownik {

    private String imie;
    private String nazwisko;
    private int wiek;
    private String stanowisko;

    public Pracownik(String imie, String nazwisko, int wiek, String stanowisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.stanowisko = stanowisko;
    }

    @Override
    public String toString() {
        return "Name=" + imie + "\nSurname=" + nazwisko + "\nAge=" + wiek + "\nPosition=" + stanowisko;
    }
}
