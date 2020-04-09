import java.util.Scanner;

public class Solve {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int myArr [] = {1,2,3,4,5,6,7,8,9};

        System.out.println("Mời nhập phần tử cần xóa:");
        int n = scanner.nextInt();
        deleIndex(myArr,n);


    }

    public static void deleIndex(int arr[],int number){
        int index = 0;
        int n =arr.length;
        for (int i= 0;i<n;i++){
            if (number!=arr[i]){
                arr [index] =arr[i];
                index++;
            }
        }
        n =index;
        System.out.println("Mang con lai khi xoa "+number+" :");
        for (int i =0;i<n;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}
