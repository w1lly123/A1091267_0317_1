import java.util.Scanner;

public class A1091267_0317_1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("請輸入n值:");
        int n=scanner.nextint();
        System.out.println("請輸入m值:");
        int m=scanner.nextint();
        int[][]array = new int[n][m];
        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                array[i][j]=(i+1)*(j+1);
            }
        }
        for(int[] row : array){
            for(int value : row){
                System.out.println(value + "");
            }
            System.out.println();
        }
    }

}
