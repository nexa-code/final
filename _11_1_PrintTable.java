import java.util.*;

public class _11_1_PrintTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number you want table of: ");
        int num = sc.nextInt();
        sc.nextLine();

        for(int i=1; i<=10; i++){
            System.out.println(num+"X"+i+"="+(num*i));
        }
    }
}
