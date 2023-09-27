public class Demande {//a finir

    private Terminal origine;
    private Terminal destination;
    private int volume;

    public Demande(Terminal origine, Terminal destination, int volume) {
        this.origine = origine;
        this.destination = destination;
        this.volume = volume;
    }

    public Demande() {
        this.origine = new Terminal("dummy");
        this.destination = new Terminal("dummy");
        this.volume = 0;
    }

    public Terminal getOrigine() {
        return origine;
    }

    public void setOrigine(Terminal origine) {
        this.origine = origine;
    }

    public Terminal getDestination() {
        return destination;
    }

    public void setDestination(Terminal destination) {
        this.destination = destination;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
