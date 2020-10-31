 
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
        ArrayList <Empleados> Empleados = new ArrayList();
        ArrayList locales=new ArrayList();
        ArrayList <Clientes> clientes=new ArrayList();
        Scanner Leer = new Scanner(System.in);
        boolean LogIn = false;
        int OpcionPrincipal = 0;
        while (OpcionPrincipal != 3) {
            System.out.println("   BIENVENIDO   ");
            System.out.println("1.•Log in[Ingresar un usuario]");
            System.out.println("2.•Sign in[Crear un usuario]");
            System.out.println("3.•Salir");
            System.out.print("Ingrese la opcion deseada: ");
            OpcionPrincipal = Leer.nextInt();
            int Opcion = 0;
            switch (OpcionPrincipal) {
                case 1:
                        System.out.println("1.•Empleados");
                        System.out.println("2.•Clientes");
                        System.out.println("3.•Salir");
                        System.out.print("Ingrese la opcion deseada: ");
                        Opcion = Leer.nextInt();
                        switch (Opcion) {
                            case 1:
                                if (Opcion==1){
                                    LogIn = true;
                                }else{
                                    while(Opcion !=1){
                                        System.out.println("[Log in]: Ingresa en tu cuenta");
                                        System.out.println("Ingresar nuevamente la opcion que desea ingresar: ");
                                        Opcion = Leer.nextInt();
                                    }
                                    LogIn = true;
                                }
                                while (LogIn){
                                    LogIn = false;
                                    System.out.println("Ingrese Usuario: ");
                                    String User = Leer.next();
                                    while(!User.equals("ClaudiaCortez")){
                                        System.out.println("El usuario que ingreso es incorreto");
                                        System.out.println("Vuelva ingresar el usuario: ");
                                        User = Leer.next();
                                    }
                                    System.out.println("Ingrese la contraseña: ");
                                    String Contraseña = Leer.next();
                                    while(!Contraseña.equals("KimetsuNoYaibai")){
                                        System.out.println("Ingreso la contraseña incorrecta");
                                        System.out.println("Vuelva ingresar la contraseña: ");
                                        Contraseña = Leer.next();
                                    }
                                    System.out.println("•Has ingresado excitosamente a tu usuario•");
                                }
                                break;
                            case 2:
                                if (Opcion==2){
                                    LogIn = true;
                                }else{
                                    while(Opcion !=2){
                                        System.out.println("[Sign in]: Ingresa en tu cuenta");
                                        System.out.println("Ingresar nuevamente la opcion que desea ingresar: ");
                                        Opcion = Leer.nextInt();
                                    }
                                    LogIn = true;
                                }
                                while (LogIn){
                                    LogIn = false;
                                    System.out.println("Ingrese Usuario: ");
                                    String User = Leer.next();
                                    while(!User.equals("DouglasRivera")){
                                        System.out.println("El usuario que ingreso es incorreto");
                                        System.out.println("Vuelva ingresar el usuario: ");
                                        User = Leer.next();
                                    }
                                    System.out.println("Ingrese la contraseña: ");
                                    String Contraseña = Leer.next();
                                    while(!Contraseña.equals("UnitedStatesOfSmach")){
                                        System.out.println("Ingreso la contraseña incorrecta");
                                        System.out.println("Vuelva ingresar la contraseña: ");
                                        Contraseña = Leer.next();
                                    }
                                    System.out.println("•Has ingresado excitosamente a tu usuario•");
                                }
                                break;
                        }
                case 2:
                    System.out.println("Saliendo.......");
            }
        }
    }
}
