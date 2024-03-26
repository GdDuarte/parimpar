import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int num;
        num = sc.nextInt();
        if(num % 2 == 0){
            System.out.println("PAR");
        }else{
            System.out.println("IMPAR");
        }
    sc.close();

    }
}
