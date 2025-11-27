import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Inserire dimensione dell'array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        boolean running = true;

        while (running) {

            stampaMenu();
            int opzione = input.nextInt();

            switch (opzione) {
                case 1:
                    aggiungiElementi(arr);
                    break;
                case 2:
                    stampaArray(arr);
                    break;
                case 3:
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

    public static void stampaArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}