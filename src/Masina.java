public class Masina {

    private int greutate;
    private int tractiune;
    private int nrUsi;
    private String culoare;
    private String marca;
    private int caiPutere;
    private int vitezaMaxima;

    public void setGreutate(int greutate) {
        this.greutate = greutate;
    }

    public void setTractiune(int tractiune) {
        this.tractiune = tractiune;
    }

    public void setNrUsi(int nrUsi) {
        this.nrUsi = nrUsi;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCaiPutere(int caiPutere) {
        this.caiPutere = caiPutere;
    }

    public void setVitezaMaxima(int vitezaMaxima) {
        this.vitezaMaxima = vitezaMaxima;
    }

    public int getGreutate() {
        return greutate;
    }

    public int getTractiune() {
        return tractiune;
    }

    public int getNrUsi() {
        return nrUsi;
    }

    public String getCuloare() {
        return culoare;
    }

    public String getMarca() {
        return marca;
    }

    public int getCaiPutere() {
        return caiPutere;
    }

    public int getVitezaMaxima() {
        return vitezaMaxima;
    }

    public Masina(){ }

    public int calculeazaConsum(int distanta, int litriDeCombustibilFolosit){

        if (distanta >= 1 && litriDeCombustibilFolosit >= 1 ) {
            return distanta/litriDeCombustibilFolosit;
        }
        else {
            return 10; // 10% consum
        }
    }
    public int calculeazaImpozit(){
        if (this.caiPutere > 50 && greutate > 100) {
            return (caiPutere * greutate) / 20; // x lei/an
        }
        else {
            return 99; // lei pe an
        }
    }
}
