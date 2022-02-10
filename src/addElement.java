import java.util.Scanner;

public class addElement {
    public static void main(String[] args) {
        int [] arr;
        arr = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Element: ");
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] newArr;
        newArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length ; i++) {
            newArr[i] = arr[i]  ;
        }

        int x;
        int index =0;
        Scanner scannerX = new Scanner(System.in);
        System.out.println("Enter a number need add: ");
         x = scannerX.nextInt();
        for (int i = 0; i < arr.length ; i++) {
            if(x==arr[i]){
                System.out.println("index: " + i);
                index = i;
                break;
            }
        }
        newArr[index] = x;
        arr = newArr;
        for (int i = arr.length; i > index ; i--) {
            arr[i] = arr[i-1];
            System.out.println(arr[i]);
        }
        }

    }


