import java.util.Scanner;
public class main {
    public static void main(String[] args) throws Exception {
        int a, toplam=0, i=1;
        double j=0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        a = inp.nextInt();

        while(i <= a){
            if((i % 3 == 0) && (i % 4== 0)){
                System.out.println(i);
                toplam +=i;
                j++;
            }
            i++;
        }
        System.out.println("3 ve 4 e tam bölünen sayıların ortalaması : " + toplam / j);
    }
}