package calculadora;
import java.util.Scanner;
public class TesteCalculadora {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int op=0;
        Numeros calculadora = new Numeros();
        do {
            System.out.println("Menu\n 1.Somar\n" +
                            "2.Subtrair\n" +
                            "3.Multiplicar\n" +
                            "4.Dividir\n "+
                            "5.Encerrar");
            op = ent.nextInt();
            if (op==5)
                break;
            System.out.println("Número 1: ");
            calculadora.n1=ent.nextInt();
            System.out.println("Número 2: ");
            calculadora.n2=ent.nextInt();
            System.out.println("Resultado: "+calculadora.calcular(op));
        }while (op!=5);
    }
}
