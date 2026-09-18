import java.util.Scanner;
class BubbleSort {
    static void bubbleSort(int arr[],int n) {
        int i,j,temp;
        boolean swapped;

        for(i=0;i<n-1;i++) {
            swapped=false;
            for(j=0;j<n-i-1;j++) {
                if(arr[j]>arr[j+1]) {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if(swapped==false) {
                break;
            }
        }
        
    

    }
    static void printArray(int arr[],int n) {
            for(int i=0;i<n;i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    public static void main(String args[]) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number of elements in the array:");
            int n=sc.nextInt();
            int arr[]=new int[n];
            System.out.println("Enter the elements of the array:");
            for(int i=0;i<n;i++) {
                arr[i]=sc.nextInt();
            }
            bubbleSort(arr,n);
            System.out.println("Sorted array:");
            printArray(arr,n);
}}