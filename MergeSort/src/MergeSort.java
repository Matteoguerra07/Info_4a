public class MergeSort {
    int []arr;

    public MergeSort(int[] arr) {
        this.arr = arr;
    }


    public void divide (int sx, int dx){
        if (sx < dx){
            int mid = sx + (dx-sx)/2;
            divide (sx,mid);
            divide(mid+1, dx);
            merge(sx,mid,dx);
        }

    }

    public void merge (int sx,int mid, int dx){
        int n1 = mid-sx + 1;
        int n2 = dx - mid;

        int[]a_sx = new int[n1];
        int[]a_dx = new int[n2];

        for (int i = 0; i < n1; i++) {
            a_sx[i] = this.arr[sx + i];
        }
        for (int i = 0; i < n2; i++) {
            a_dx[i] = this.arr[mid + i + 1];
        }

        //indici per i 3 array
        int o_i = sx; //array "Padre"
        int dx_i = 0; //array destro
        int sx_i = 0; //array sinistro

        //Unisce gli elementi dell'array
        while (sx_i < n1 && dx_i < n2) {
            if (a_sx[sx_i] <= a_dx[dx_i]) {
                arr[o_i] = a_sx[sx_i];
                sx_i++;
            } else {
                arr[o_i] = a_dx[dx_i];
                dx_i++;
            }
            o_i++;
        }

        //copia gli elementi rimasti nel sub-array sinistro
        while(sx_i < n1){
            arr[o_i] = a_sx[sx_i];
            sx_i++;
            o_i++;
        }
        //copia gli elementi rimasti nel sub-array destro
        while(dx_i < n2){
            arr[o_i] = a_dx[dx_i];
            dx_i++;
            o_i++;
        }
    }
}
