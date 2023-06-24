package sorting;

public class Sorting {
    static void Print(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
    static void Selection_sort(int arr[], int n){
        for (int i = 0; i < n - 1; i++) {
            int mini = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[mini]) {
                    mini = j;
                }
            }
            //swap
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }

        System.out.println("After selection sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void Bubble_sort(int arr[], int n){
       for(int i=n-1;i>=0;i--){
        for(int j=0;j<=i-1;j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j]= arr[j+1];
                arr[j+1]=temp;
            }
        }
        
       }
       Print(arr,n);
    }
    static void Insertion_sort(int arr[], int n){
        for(int i=0;i<n-1;i++){
            int j=i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        System.out.println();
        Print(arr,n);
    }
    public static void main(String[] args) {
        int arr[] = {1, 46, 24, 52, 20, 9};
        int n = arr.length;
        Selection_sort(arr, n);
         Bubble_sort(arr,n);
         Insertion_sort(arr,n);
    }
}
