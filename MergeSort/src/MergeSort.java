public class MergeSort {
    int []arr;

    public MergeSort(int[] arr) {
        this.arr = arr;
    }


    public void divide (int sx, int dx){
        if (sx < dx){
            int mid = sx + (int)((dx-sx)/2);
            divide (sx,mid);
            divide(mid+1, dx);
            merge(sx,mid,dx);
        }

    }

    public void merge (int sx,int mid, int dx){
        int n1 = mid-sx;
        int n2 = dx - mid + 1;

        int[]a_sx = new int[n1];
        int[]a_dx = new int[n2];

        for (int i = 0; i < n1; i++) {
            a_sx[i] = this.arr[mid+i+1];
        }
        for (int i = 0; i < n2; i++) {
            a_dx[i] = this.arr[mid+i+1];
        }
        int o_i = sx;
        int dx_i = 0;
        int sx_i = 0;

        while(sx_i < n1  && ){

        }
    }
}
