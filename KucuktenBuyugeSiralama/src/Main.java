import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Birinci sayıyı giriniz :");
        int ilk = input.nextInt();
        System.out.println(" ikinci sayıyı giriniz :");
        int ikinci = input.nextInt();
        System.out.println("üçüncü sayıyı giriniz :");
        int ucuncu = input.nextInt();



        if (ilk < ikinci && ilk < ucuncu) {
            if (ikinci < ucuncu) {
                System.out.println("A<B<C");
            } else {
                System.out.println("A<C<B");
            }
        } else if (ikinci < ilk && (ikinci < ucuncu)) {
            if (ilk < ucuncu) {
                System.out.println("B<A<C");
            } else {
                System.out.println("B<C<A");
            }



                if (ilk < ikinci) {
                    System.out.println("C<A<B");
                } else {
                    System.out.println("C<B<A");
                }

        }

    }
    }