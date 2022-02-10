import java.util.Scanner;

public class addElement2 {
    public static void main(String[] args) {
        // write your code here
        int size;
        int[] arr;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhập độ dài của mảng:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Độ dài mảng không được quá 20");
        } while (size > 20);

        arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.print("Enter element " + (i + 1) + " : ");
            arr[i] = scanner.nextInt();
            i++;
        }
        System.out.print("Danh sách các phần tử trong mảng: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }
        System.out.println("");

        System.out.print("Nhập phần tử muốn thêm vào mảng: ");
        int elementAdd = scanner.nextInt();
        System.out.print("Nhập chỉ số của phần tử muốn thêm vào mảng: ");
        int indexAdd = scanner.nextInt();
        if(indexAdd <= -1 || indexAdd > arr.length + 1){
            System.out.print("Không thêm được phần tử vào mảng");
        }
        else{
            int[] newArr = new int[arr.length + 1];
            newArr[indexAdd] = elementAdd;
            for(int j = 0; j < indexAdd; j++){
                newArr[j] = arr[j];
            }
            for (int j = indexAdd + 1; j < newArr.length; j++) {
                newArr[j] = arr[j - 1];
            }
            arr = newArr;

            System.out.print("Danh sách các phần tử trong mảng mới: ");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + "\t");
            }
        }
    }
}
