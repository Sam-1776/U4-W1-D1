import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // ESERCIZIO 1
        System.out.println("Esercizio 1");
        String[] arrUno = {"a", "b", "c", "d", "e", "f"};
        int prodotto = moltiplica(3, 5);
        String mix = concatena("ciao", 3);
//        String[] arr = inserisciInArray( arrUno, "f");
        System.out.println("Il prodotto è: " + prodotto);
        System.out.println("La concatenazione è: " + mix);
//        System.out.println(arr);


        // ESERCIZIO 2
        System.out.println("Esercizio 2");
        System.out.println("Inserire tre stringhe");
        Scanner scanner = new Scanner(System.in);
        String primaStringa = scanner.nextLine();
        String secondaStringa = scanner.nextLine();
        String terzaStringa = scanner.nextLine();
        String stringaOrdinata = primaStringa + secondaStringa + terzaStringa;
        String stringaInversa = terzaStringa + secondaStringa + primaStringa;
        System.out.println("La stringa ordinata è: " + stringaOrdinata);
        System.out.println("La stringa inversa è: " + stringaInversa);


        // ESERCIZIO 3
        System.out.println("Esercizio 3");
        double pRettangolo = perimetrorettangolo( 3.2, 4.5);
        System.out.println("Inserire un numero");
        int n = scanner.nextInt();
        int r = pariDispari(n);
        double aTriangolo = perimetroTriangolo(3.1, 4.5, 5);
        System.out.println("Il perimetro del rettangolo è: " + pRettangolo);
        System.out.println("Il numero è: " + r);
        System.out.println("L'area del triangolo è: " + aTriangolo);
    }

    public static int moltiplica(int a, int b){
        return a*b;
    }

    public static String concatena (String x, int y){
        return x+y;
    }

//    public static String[] inserisciInArray (String[] x , String y){
//            x[6] = x[5];
//            x[5] = x[4];
//            x[3] = y;
//        return x;
//    }

    public static double perimetrorettangolo(double x , double y){
        double b = 2*x;
        double h = 2*y;
        return b+h;
    }

    public static int pariDispari (int x){
        if (x%2 == 0) {
            return 0;
        }else {
            return 1;
        }
    }

    public static double perimetroTriangolo(double x, double y, double z){
        double p = x+y+z;
        double A = Math.sqrt(p*(p-x)*(p-y)*(p-z));
        return A;
    }


}