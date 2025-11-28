import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();


        Scanner input= new Scanner(System.in);
        //System.out.println("Inserire dimensione dell'array: ");
        //int n = input.nextInt();
        //int[] arr = new int[n];
        boolean running = true;

        while (running) {

            stampaMenu();
            int opzione = input.nextInt();

            switch (opzione) {
                case 1:
                    lista.add(input.nextInt());

                    //aggiungiElementi(arr);
                    break;
                case 2:
                    stampaArray(lista);
                    break;
                case 3:
                    int[] arr = convertiListaArray(lista);
                    MergeSort toSort = new MergeSort(arr);
                    toSort.divide(0, arr.length - 1);
                    break;
                case 4:
                    running = false;
                    break;
            }
        }

    }

    public static void stampaMenu (){
        System.out.println("\n");
        System.out.println("▶----------------------------◀");
        System.out.println("|    Algoritmo Merge Sort    |");
        System.out.println("▶----------------------------◀");
        System.out.println("\nSelezionare cosa si vuole fare: ");
        System.out.println("\t1️⃣Aggiungere gli elementi all'array.");
        System.out.println("\t2️⃣Visualizzare l'array.");
        System.out.println("\t3️⃣Ordinare l'array.");
        System.out.println("\t4️⃣Uscire dal programma.");
    }

    public static void aggiungiElementi (int[]arr){
        Scanner input= new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
    }



    public static void stampaArray(ArrayList<Integer> lista) {

        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i) + " ");
        }
        System.out.println();
    }

    public static int[] convertiListaArray (ArrayList<Integer> lista){
        int[] array = new int[lista.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = lista.get(i);
        }
        return array;
    }
}