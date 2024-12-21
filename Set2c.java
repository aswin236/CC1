import java.util.Scanner;
public class Set2c {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input:");
        String fn=scan.nextLine();
        String ln=scan.nextLine();
        int n=scan.nextInt();
        for (int i=1; i<=n; i++){
            System.out.println(fn+ln);
        }
    }
}
