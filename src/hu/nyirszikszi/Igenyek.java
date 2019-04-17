package hu.nyirszikszi;

public class Igenyek {
    private String azonosito;
    private String indulas;
    private String cel;
    private int szemelyek;

    Igenyek(String azonosito, String indulas, String cel, int szemelyek) {
        this.azonosito = azonosito;
        this.indulas = indulas;
        this.cel = cel;
        this.szemelyek = szemelyek;
    }

    String getAzonosito() {
        return azonosito;
    }

    String getIndulas() {
        return indulas;
    }

    String getCel() {
        return cel;
    }

    int getSzemelyek() {
        return szemelyek;
    }

    @Override
    public String toString() {
        return "Igenyek{" +
                "azonosito='" + azonosito + '\'' +
                ", indulas='" + indulas + '\'' +
                ", cel='" + cel + '\'' +
                ", szemelyek=" + szemelyek +
                '}';
    }
}