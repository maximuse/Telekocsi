package hu.nyirszikszi;

public class Autok {
    private String indulas;
    private String cel;
    private String rendszam;
    private String telefonszam;
    private int ferohely;

    public Autok(String indulas, String cel, String rendszam, String telefonszam, int ferohely) {
        this.indulas = indulas;
        this.cel = cel;
        this.rendszam = rendszam;
        this.telefonszam = telefonszam;
        this.ferohely = ferohely;
    }

    public String getIndulas() {
        return indulas;
    }

    public void setIndulas(String indulas) {
        this.indulas = indulas;
    }

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }

    public String getRendszam() {
        return rendszam;
    }

    public void setRendszam(String rendszam) {
        this.rendszam = rendszam;
    }

    public String getTelefonszam() {
        return telefonszam;
    }

    public void setTelefonszam(String telefonszam) {
        this.telefonszam = telefonszam;
    }

    public int getFerohely() {
        return ferohely;
    }

    public void setFerohely(int ferohely) {
        this.ferohely = ferohely;
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