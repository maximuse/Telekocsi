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

        for (Autok auto : autok) {
            if (auto.getIndulas().equals("Budapest") && auto.getCel().equals("Miskolc")) {
                db += auto.getFerohely();
            }
        }

        return db;
    }

    static String legtobbHely(ArrayList<Autok> autok) {
        int db = 0;
        String data = "";

        for (Autok auto : autok) {
            if (auto.getFerohely() > db) {
                db = auto.getFerohely();
                data = "(" + auto.getFerohely() + " db) a(z) " + auto.getIndulas() + "-" + auto.getCel();
            }
        }

        return data;
    }

    static ArrayList<String[]> talalat(ArrayList<Autok> autok, ArrayList<Igenyek> igenyek) {
        ArrayList<String[]> lista = new ArrayList<>();

        for (Igenyek igeny : igenyek) {
            for (Autok auto : autok) {
                if (igeny.getIndulas().equals(auto.getIndulas()) && igeny.getCel().equals(auto.getCel()) && igeny.getSzemelyek() == auto.getFerohely()) {
                    lista.add(new String[]{igeny.getAzonosito(), auto.getRendszam()});
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

        for (Igenyek igeny : igenyek) {
            for (Autok auto : autok) {
                if (igeny.getIndulas().equals(auto.getIndulas()) && igeny.getCel().equals(auto.getCel()) && igeny.getSzemelyek() == auto.getFerohely()) {
                    data = igeny.getAzonosito() + ": Rendszám: " + auto.getRendszam() + ", Telefonszám: " + auto.getTelefonszam();
                    break;
                }
                else {
                    data = igeny.getAzonosito() + ": Sajnos nem sikerült autót találni";
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