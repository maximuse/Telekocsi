package hu.nyirszikszi;

public class Autok {
    private String indulas;
    private String cel;
    private String rendszam;
    private String telefonszam;
    private int ferohely;

    Autok(String indulas, String cel, String rendszam, String telefonszam, int ferohely) {
        this.indulas = indulas;
        this.cel = cel;
        this.rendszam = rendszam;
        this.telefonszam = telefonszam;
        this.ferohely = ferohely;
    }

    String getIndulas() {
        return indulas;
    }

    String getCel() {
        return cel;
    }

    String getRendszam() {
        return rendszam;
    }

    String getTelefonszam() {
        return telefonszam;
    }

    int getFerohely() {
        return ferohely;
    }

    @Override
    public String toString() {
        return "Autok{" +
                "indulas='" + indulas + '\'' +
                ", cel='" + cel + '\'' +
                ", rendszam='" + rendszam + '\'' +
                ", telefonszam='" + telefonszam + '\'' +
                ", ferohely=" + ferohely +
                '}';
    }
}