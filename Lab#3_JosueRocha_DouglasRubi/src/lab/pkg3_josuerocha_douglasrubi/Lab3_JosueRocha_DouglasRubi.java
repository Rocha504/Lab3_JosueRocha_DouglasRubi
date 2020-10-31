package lab.pkg3_josuerocha_douglasrubi;

import java.util.ArrayList;
import java.util.Collections;
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

        ArrayList locales = new ArrayList();
        ArrayList<Clientes> clientes = new ArrayList();
        Scanner leer = new Scanner(System.in);

        int op = 0;
        while (op != 3) {
            
            System.out.println("Clau el username del SUDO es: Rocha504 y la contra es: 12345");
            System.out.println("   BIENVENIDO   ");
            System.out.println("1.•Log in[Ingresar un usuario]");
            System.out.println("2.•Sign in[Crear un usuario]");
            System.out.println("3.•Salir");
            System.out.print("Ingrese la opcion deseada: ");
            op = leer.nextInt();
            if (op == 1) {
                System.out.println("Ingrese su nombre de usuario");
                String username = leer.next();
                System.out.println("Ingrese contraseña");
                String password = leer.next();
                for (Clientes i : clientes) {
                    String aux = i.getUsername();
                    String aux2 = i.getPassword();
                    if (username.equals(aux) && password.equals(aux2)) {
                        System.out.println("Bienvenido Cliente");
                        System.out.println();
                        System.out.println("Tiendas: ");
                        imprimir(locales);
                        
                    }
                }
                if (username.equals("Rocha504") && password.equals("12345")) {

                }

            } else if (op == 2) {
                System.out.println("Ingrese su ID");
                String ID = leer.next();
                System.out.println("Ingrese su username");
                String username = leer.next();
                System.out.println("Ingrese su contraseña");
                String password = leer.next();
                System.out.println("Ingrese su correo");
                String correo = leer.next();
                System.out.println("Ingrese su nombre");
                String nombre = leer.next();
                System.out.println("Cuanto dinero trajo?");
                double dinero = leer.nextDouble();
                ArrayList<Productos> carrito = new ArrayList();
                clientes.add(new Clientes(dinero, carrito, ID, username, password, correo, nombre));
            }

        }
    }
    public static void imprimir(ArrayList lista) {//metodo para imprimir las listas de manera mas ordenada
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("***************");
            System.out.println(i + "-" + lista.get(i));
        }
    }
}
