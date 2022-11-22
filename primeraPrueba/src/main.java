import java.sql.SQLOutput;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);


        cajeroAutomatico cuenta1 = new cajeroAutomatico("Wilson",500);
        cajeroAutomatico cuenta2 = new cajeroAutomatico("Daniela",600);


        int op=0,menu;
        double aux=0;




        do {
            System.out.println("\t ==[ MENU ]==");
            System.out.println("1.- DEPOSITAR");
            System.out.println("2.- RETIRAR");
            System.out.println("3.- SALIR");
            System.out.print("\nIngrese la opcion deseada : ");
            menu=sc.nextInt();

            switch (menu){
                case 1:
                    System.out.println("1 DEPOSITAR");
                    //INGRESO DE DINERO
                    System.out.print("Ingrese la cantidad a depositar: ");
                    aux=sc.nextDouble();

                    cuenta1.ingresar("Wilson",aux);
                    cuenta2.ingresar("Daniela",aux);
                    System.out.println(cuenta1);
                    break;

                case 2:
                    System.out.println(" 2 RETIRO");
                    //RETIRO DE DINERO
                    System.out.print("Ingrese la cantidad a retirar: ");
                    aux=sc.nextDouble();

                    cuenta1.retirar("Wilson",aux);
                    cuenta2.retirar("Daniela",aux);
                    System.out.println(cuenta2);
                    break;
            }

            System.out.print(" Desea continuar 1 --> SI  : ");
            op=sc.nextInt();

        }while(op != 2 );
        System.out.println("\nGracias por utilizar");

    }
}
