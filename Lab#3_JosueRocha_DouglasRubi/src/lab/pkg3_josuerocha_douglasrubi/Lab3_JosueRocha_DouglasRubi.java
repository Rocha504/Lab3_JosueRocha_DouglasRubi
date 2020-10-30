 
package lab.pkg3_josuerocha_douglasrubi;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Douglas y Josue
 */
public class Lab3_JosueRocha_DouglasRubi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        ArrayList Empleados = new ArrayList();
        ArrayList Productos = new ArrayList();
        ArrayList Gerente = new ArrayList();
        int OpcionPrincipal = 0;
        while (OpcionPrincipal != 4) {
            System.out.println("   BIENVENIDO   ");
            System.out.println("1.•Locales");
            System.out.println("2.•Login Personas");
            System.out.println("3.•Productos");
            System.out.println("4.•Salir");
            System.out.print("Ingrese la opcion deseada: ");
            OpcionPrincipal = Leer.nextInt();
            int Opcion = 0;
            switch (OpcionPrincipal) {
                case 1:
                        System.out.println("1.•Tiendas");
                        System.out.println("2.•Quiosco");
                        System.out.println("3.•Restaurantes");
                        System.out.print("Ingrese la opcion deseada: ");
                        Opcion = Leer.nextInt();
                        switch (Opcion) {
                            case 1: 
                                
                                break;
                            case 2:
                                
                                break;
                            case 3:
                                
                                break;
                        }
                case 2:
                        System.out.println("1.•Empleados");
                        System.out.println("2.•Clientes");
                        System.out.println("3.•Salir");
                        System.out.print("Ingrese la opcion deseada: ");
                        Opcion = Leer.nextInt();
                        switch (Opcion) {
                            case 1:
                                System.out.println("Usted es el empleado");
                                break;
                            case 2:
                                System.out.println("Usted es Cliente");
                                break;
                        }
                case 3:
                        System.out.println("1.•Ropa");
                        System.out.println("2.•Juguetes");
                        System.out.println("3.•Comida");
                        System.out.print("Ingrese la opcion deseada: ");
                        Opcion = Leer.nextInt();
                        switch (Opcion) {
                            case 1:
                                
                                break;
                            case 2:
                                
                                break;
                            case 3:
                                
                                break;
                        }
                case 4:
                    System.out.println("Saliendo.......");
            }
        }
    }
}
