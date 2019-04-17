package hu.nyirszikszi;

import java.io.RandomAccessFile;
import java.util.ArrayList;

class Actions {
    static ArrayList<Autok> autokBeolvas(String fajl) {
        ArrayList<Autok> lista = new ArrayList<>();

        try {
            RandomAccessFile raf = new RandomAccessFile(fajl, "r");
            String sor = raf.readLine();
            sor = raf.readLine();
            String[] szeletek;

            while(sor != null) {
                szeletek = sor.split(";");

                String indulas = szeletek[0];
                String cel = szeletek[1];
                String rendszam = szeletek[2];
                String telefonszam = szeletek[3];
                int ferohely = Integer.parseInt(szeletek[4]);

                lista.add(new Autok(indulas, cel, rendszam, telefonszam, ferohely));
                //lista.add(new Autok(szeletek[0], szeletek[1], szeletek[2], szeletek[3], Integer.parseInt(szeletek[4])));

                sor = raf.readLine();
            }

            raf.close();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return lista;
    }

    static ArrayList<Igenyek> igenyekBeolvas(String fajl) {
        ArrayList<Igenyek> lista = new ArrayList<>();

        try {
            RandomAccessFile raf = new RandomAccessFile(fajl, "r");
            String sor = raf.readLine();
            sor = raf.readLine();
            String[] szeletek;

            while(sor != null) {
                szeletek = sor.split(";");

                String azonosito = szeletek[0];
                String indulas = szeletek[1];
                String cel = szeletek[2];
                int szemelyek = Integer.parseInt(szeletek[3]);

                lista.add(new Igenyek(azonosito, indulas, cel, szemelyek));

                sor = raf.readLine();
            }

            raf.close();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return lista;
    }

    static int budapestMiskolcDb(ArrayList<Autok> autok) {
        int db = 0;

        for (int i = 0; i < autok.size(); i++) {
            if (autok.get(i).getIndulas().equals("Budapest") && autok.get(i).getCel().equals("Miskolc")) {
                db += autok.get(i).getFerohely();
            }
        }

        return db;
    }

    static String legtobbHely(ArrayList<Autok> autok) {
        int db = 0;
        String data = "";

        for (int i = 0; i < autok.size(); i++) {
            if (autok.get(i).getFerohely() > db) {
                db = autok.get(i).getFerohely();
                data = "(" + autok.get(i).getFerohely() + " db) a(z) " + autok.get(i).getIndulas() + "-" + autok.get(i).getCel();
            }
        }

        return data;
    }

    static ArrayList<String[]> talalat(ArrayList<Autok> autok, ArrayList<Igenyek> igenyek) {
        ArrayList<String[]> lista = new ArrayList<>();

        for (int i = 0; i < igenyek.size(); i++) {
            for (int j = 0; j < autok.size(); j++) {
                if (igenyek.get(i).getIndulas().equals(autok.get(j).getIndulas()) &&  igenyek.get(i).getCel().equals(autok.get(j).getCel()) &&  igenyek.get(i).getSzemelyek() == autok.get(j).getFerohely()) {
                    lista.add(new String[] {igenyek.get(i).getAzonosito(), autok.get(j).getRendszam()});
                    break;
                }
            }
        }

        return lista;
    }

    static void utasuzenetek(ArrayList<Autok> autok, ArrayList<Igenyek> igenyek, String fajl) {
        ArrayList<String> lista = new ArrayList<>();
        String data = "";
        String sor;

        for (int i = 0; i < igenyek.size(); i++) {
            for (int j = 0; j < autok.size(); j++) {
                if (igenyek.get(i).getIndulas().equals(autok.get(j).getIndulas()) &&  igenyek.get(i).getCel().equals(autok.get(j).getCel()) &&  igenyek.get(i).getSzemelyek() == autok.get(j).getFerohely()) {
                    data = igenyek.get(i).getAzonosito() + ": Rendszám: " + autok.get(j).getRendszam() + ", Telefonszám: " + autok.get(j).getTelefonszam();
                    break;
                }
                else {
                    data = igenyek.get(i).getAzonosito() + ": Sajnos nem sikerült autót találni";
                }
            }

            lista.add(data);
        }

        try {
            RandomAccessFile raf = new RandomAccessFile(fajl, "rw");
            for (String l : lista) {
                sor = l + "\r\n";
                raf.writeBytes(sor);
            }

            raf.close();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}