import java.util.Scanner;//kalkulator 

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int A;
        int B;
        char ZNAK; 

        System.out.print("Podaj wartosc A: ");
        A = scanner.nextInt();
        System.out.print("Podaj wartosc B: ");
        B = scanner.nextInt();

        System.out.print("Wybierz operację (+, -, *, /) : ");
        ZNAK = scanner.next().charAt(0);

        int wynik = 0;
        switch (ZNAK) {
            case '+':
                wynik = A + B;
                break;
            case '-':
                wynik = A - B;
                break;
            case '*':
                wynik = A * B;
                break;
            case '/':
                wynik = A / B;
                break;
            default:
                System.out.println("Niepoprawna operacja");
                break;
        }

        System.out.printf("Wynik operacji to: %d \n", wynik);
    }

}