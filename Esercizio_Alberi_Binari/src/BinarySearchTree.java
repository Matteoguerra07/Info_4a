public class BinarySearchTree extends Albero {


    public void insert(int val){
        if (radice == null){
            radice = new Nodo(val);
            conta_nodi++;
        } else {
            insertRic(val, radice);
        }
    }

    private void insertRic(int val, Nodo n){
        if(val < n.getVal()){
            if(n.getSinistra() == null){
                Nodo nuovo = new Nodo(val);
                n.setSinistra(nuovo);
                conta_nodi++;
            }
            else {
                insertRic(val, n.getSinistra());
            }
        } else if (val >= n.getVal()){
            if(n.getDestra() == null){
                Nodo nuovo = new Nodo(val);
                n.setDestra(nuovo);
                conta_nodi++;
            }
            else {
                insertRic(val, n.getDestra());
            }
        }

    }


    public int calcolaAltezza (){
        if(radice == null){ return -1;}
        return calcolaAltezza(radice) + 1;

    }

    private int calcolaAltezza (Nodo n){
        if (n.getSinistra() == null && n.getDestra() == null){return 0;}
        else if (n.getSinistra() != null && n.getDestra() == null) {
            return calcolaAltezza(n.getSinistra())+1;
        }
        else if (n.getSinistra() == null && n.getDestra() != null) {
            return calcolaAltezza(n.getDestra())+1;
        }
        else {
            int x = calcolaAltezza(n.getDestra());
            int y = calcolaAltezza(n.getSinistra());

            if (x < y) {
                return calcolaAltezza(n.getSinistra());
            }
            else {
                return calcolaAltezza(n.getDestra())+1;
            }
        }
    }

    public boolean isBalanced (){
        return isBalanced(radice) !=-2;
    }

    public int isBalanced (Nodo n){
        if (n == null) return -1;
        int left = isBalanced(n.getSinistra());
        if (left == -2) return -2;
        int right = isBalanced(n.getSinistra());
        if (right == -2) return -2;
        if(Math.abs(left - right) > 1) return -2;
        return 1 + Math.max(left, right);
    }

    public void isBST (){

    }

}
