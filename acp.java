import java.util.Scanner;

class BubbleSortMerge {

    static void bubbleSort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped)
                break;
        }
    }

    static int[] merge(int a[], int b[]) {
        int c[] = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++)
            c[i] = a[i];

        for (int i = 0; i < b.length; i++)
            c[a.length + i] = b[i];

        bubbleSort(c);
        return c;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        System.out.print("Enter size of second array: ");
        int m = sc.nextInt();

        int b[] = new int[m];

        System.out.println("Enter elements of second array:");
        for (int i = 0; i < m; i++)
            b[i] = sc.nextInt();

        bubbleSort(a);
        bubbleSort(b);

        int c[] = merge(a, b);

        System.out.println("First sorted array:");
        for (int x : a)
            System.out.print(x + " ");

        System.out.println("\nSecond sorted array:");
        for (int x : b)
            System.out.print(x + " ");

        System.out.println("\nMerged sorted array:");
        for (int x : c)
            System.out.print(x + " ");

        sc.close();
    }
}