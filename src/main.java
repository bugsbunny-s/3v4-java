import java.util.Scanner;
public class main {
    public static void main(String[] args) throws Exception {
        int a, i = 1;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        a = inp.nextInt();

        while(i <= a){
            if((i % 3 == 0) && (i % 4== 0)){
                System.out.println(i);
            }
            i++;
        }
    }
}