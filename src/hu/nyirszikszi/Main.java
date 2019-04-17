package hu.nyirszikszi;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Autok> autok = Actions.autokBeolvas("autok.csv");
        /*for (Autok a: autok) {
            System.out.println(a);
        }*/
        ArrayList<Igenyek> igenyek = Actions.igenyekBeolvas("igenyek.csv");
        /*for (Igenyek i: igenyek) {
            System.out.println(i);
        }*/

        System.out.println("2. feladat\n" + autok.size() + " autós hirdet fuvart\n");

        System.out.println("3. feladat\nÖsszesen " + Actions.budapestMiskolcDb(autok) + " férőhelyet hirdettek az autósok Budapestről Miskolcra\n");

        System.out.println("4. feladat\nA legtöbb férőhelyet " + Actions.legtobbHely(autok) + " útvonalon ajánlották fel a hirdetők\n");

        System.out.println("5. feladat");
        ArrayList<String[]> talalat = Actions.talalat(autok, igenyek);
        for (String[] t: talalat) {
            System.out.println(t[0] + " => " + t[1]);
        }

        Actions.utasuzenetek(autok, igenyek, "utasuzenetek.txt");
    }
}