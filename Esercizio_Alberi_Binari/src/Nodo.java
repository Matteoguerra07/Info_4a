public class Nodo {
    private int val;
    private Nodo sinistra;
    private Nodo destra;

    public Nodo(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public Nodo getSinistra() {
        return sinistra;
    }

    public Nodo getDestra() {
        return destra;
    }

    public void setSinistra(Nodo sinistra) {
        this.sinistra = sinistra;
    }

    public void setDestra(Nodo destra) {
        this.destra = destra;
    }
}
