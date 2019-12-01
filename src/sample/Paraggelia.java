package sample;

public class Paraggelia {
    private String eidos;
    private int posotita;
    private Double kostosTemaxiou;
    private Double kostosTemaxiwn;

    public Paraggelia(String eidos, int posotita, Double kostosTemaxiou) {
        this.eidos = eidos;
        this.posotita = posotita;
        this.kostosTemaxiou = kostosTemaxiou;
        ypologismosKostousTemaxiwn();
    }
    void ypologismosKostousTemaxiwn() {
        this.kostosTemaxiwn = posotita * kostosTemaxiou;
    }
    public String getEidos() {
        return eidos;
    }

    public int getPosotita() {
        return posotita;
    }

    public Double getKostosTemaxiou() {
        return kostosTemaxiou;
    }

    public Double getKostosTemaxiwn() {
        return kostosTemaxiwn;
    }
}
