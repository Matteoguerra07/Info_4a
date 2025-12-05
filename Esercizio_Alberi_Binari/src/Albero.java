public class Albero {
    public Nodo radice;
    public int altezza;
    public int conta_nodi;

    public Albero() {
        this.radice = null;
        this.altezza = 0;
    }



    public void aggiungi (int val){
        if (radice == null){
            radice = new Nodo(val);
            conta_nodi++;
        } else {
            aggiungiRic(val, radice);
        }

    }

    private void aggiungiRic (int val, Nodo n){
        if(val < n.getVal()){
            if(n.getSinistra() == null){
                Nodo nuovo = new Nodo(val);
                n.setSinistra(nuovo);
                conta_nodi++;
            }
            else {
                aggiungiRic(val, n.getSinistra());
            }
        } else if (val >= n.getVal()){
            if(n.getDestra() == null){
                Nodo nuovo = new Nodo(val);
                n.setDestra(nuovo);
                conta_nodi++;
            }
            else {
                aggiungiRic(val, n.getDestra());
            }
        }

    }


    public void inorder (){

    }

    private String inorderRic (Nodo n){

        String out = "";
        if(n != null){
            out += inorderRic(n.getDestra());
            out += n.getVal();
        }
        return out;
    }


    public void preorder (){

    }

    private void preorderRic(){

    }


    public void postorder (){

    }

    private void postorderRic (){

    }

    public String print (){
        String ret = "";

        return ret;
    }

    public boolean cerca (){
        boolean trovato = false;
        return trovato;
    }

    public int contafoglie  (){
        int conta = 0;
        Nodo n = radice;
        return conta;
    }

    private void contaFoglieRic (Nodo n, int conta){
        if(n.getDestra() == null && n.getSinistra() == null){
            conta++;
        }
        else  {
            if (n.getDestra() != null ){

            } else if (n.getDestra() == null && n.getSinistra() != null) {

            }
        }
    }

    public int conta_Nodi() {
        return conta_nodi;
    }
}
