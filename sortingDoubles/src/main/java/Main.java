public class Main {
    public static void main(String[] args) {
        double[] list = {3.1, 9.2, 1.1, 0.0001, Math.PI, 9.3, 2.1, 1.4};
        int n = list.length;
        insertionSort(list, n);
        print(list, n);
        oddCounter(9);
    }
public static void oddCounter(int n){
        for(int i = 0;i<n;i++){
            System.out.println("i is " + i);
            for(int j = i; j<n; j++){
                System.out.println("\t j is " + j);
            }
        }

}
    public static void insertionSort(double[] list, int n) {
        for (int i = 1; i < n; i++) {
            double nextValueToInsert = list[i];
            int j = i - 1;

            while (j >= 0 && list[j] > nextValueToInsert) {
                list[j + 1] = list[j];
                j = j - 1;
            }
            list[j + 1] = nextValueToInsert;
        }
    }
    public static void print(double[] list, int n){
        System.out.printf("-------------- %d items ------------------\n", n);
        for(int i=0;i<n;i++){
            System.out.printf("[%d] %f\n", i, list[i]);
        }
    }

}
