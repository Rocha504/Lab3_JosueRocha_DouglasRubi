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
            
            System.out.println("Claudia el username del SUDO es: Rocha504 y la contra es: 12345");
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
                        System.out.println("Tiendas:");
                        imprimir(locales);
                        System.out.println("Ingrese la pocision de la tienda que de la que desea comprar");
                        int tienda=leer.nextInt();
                        System.out.println("Ingrese la posicion del producto que desea comprar(Recuerde que las posiciones empiezan desde 0)");
                        int producto;
                        
                    }
                }
                if (username.equals("Rocha504") && password.equals("12345")) {
                    ArrayList<Personas> Personas = new ArrayList();
        int OpcionPrincipal = 0;
        while (OpcionPrincipal != 3) {
            System.out.println("   BIENVENIDO   ");
            System.out.println("1.•a)Administrar clientes");
            System.out.println("2.•Administrar empleados");
            System.out.println("3.•Salir");
            System.out.print("Ingrese la opcion deseada: ");
            OpcionPrincipal = leer.nextInt();
            switch (OpcionPrincipal) {
                case 1:
                    System.out.println("1.•agregar clientes");
                    System.out.println("2.•editar cliente");
                    System.out.println("3.•eliminar clientes");
                    System.out.println("4.• mostrar clientes");
                    System.out.print("Ingrese la opcion deseada: ");
                    int opcionCliente = 0;
                    switch (opcionCliente) {
                        case 1:
                            System.out.println("Ingrese su ID");
                            String ID = leer.next();
                            System.out.println("Ingrese su username");
                            String username1 = leer.next();
                            System.out.println("Ingrese su contraseña");
                            String password1 = leer.next();
                            System.out.println("Ingrese su correo");
                            String correo = leer.next();
                            System.out.println("Ingrese su nombre");
                            String nombre = leer.next();
                            System.out.println("Cuanto dinero tiene disponible?: ");
                            double dinero = leer.nextDouble();
                            ArrayList<Productos> carrito = new ArrayList();
                            Personas.add(new Clientes(dinero, carrito, ID, username, password, correo, nombre));
                            break;
                        case 2:
                            System.out.println("Ingrese el id de cliente:");
                            String IDA = leer.next();
                            int indiceActualizar = -1;
                            for (int i = 0; i < Personas.size(); i++) {
                                if (Personas.get(i).getId().equals(IDA)) {
                                    indiceActualizar = i;
                                }
                            }
                            if (indiceActualizar >= 0) {
                                System.out.println("Ingrese su username");
                                String usernameA = leer.next();
                                System.out.println("Ingrese su contraseña");
                                String passwordA = leer.next();
                                System.out.println("Ingrese su correo");
                                String correoA = leer.next();
                                System.out.println("Ingrese su nombre");
                                String nombreA = leer.next();
                                System.out.println("Cuanto dinero tiene disponible?: ");
                                double dineroA = leer.nextDouble();
                                Personas.get(indiceActualizar).setCorreo(correoA);
                                Personas.get(indiceActualizar).setNombre(nombreA);
                                Personas.get(indiceActualizar).setUsername(usernameA);
                                Personas.get(indiceActualizar).setPassword(passwordA);
                            } else {
                                System.out.println("Cliente no existe");
                            }
                            break;
                        case 3:
                            int indiceEliminar = -1;
                            System.out.println("Ingrese el id de cliente:");
                            String IDE = leer.next();
                            for (int i = 0; i < Personas.size(); i++) {
                                if (Personas.get(i).getId().equals(IDE)) {
                                    indiceEliminar = i;
                                }
                            }
                            if (indiceEliminar >= 0) {
                                Personas.remove(indiceEliminar);
                            } else {
                                System.out.println("Cliente no existe");
                            }
                            break;
                        case 4:
                             for (int i = 0; i < Personas.size(); i++) {
                                 System.out.println("Nombre: "+Personas.get(i).getNombre()+" Usuario: "+Personas.get(i).getUsername());
                            }
                            break;
                        default:
                            break;
                    }
                    break;
                case 2:
                        System.out.println("1.•agregar empleados");
                    System.out.println("2.•editar empleados");
                    System.out.println("3.•eliminar empleados");
                    System.out.println("4.• mostrar empleados");
                    System.out.print("Ingrese la opcion deseada: ");
                    int opcionEmpleado = 0;
                     switch (opcionEmpleado) {
                        case 1:
                              System.out.println("Ingrese el horario: ");
                            String horarios = leer.next();
                            System.out.println("Ingrese las ventas generadas");
                            int ventas = leer.nextInt();
                            System.out.println("Ingrese su ID");
                            String ID = leer.next();
                            System.out.println("Ingrese su username");
                            String username1 = leer.next();
                            System.out.println("Ingrese su contraseña");
                            String password1 = leer.next();
                            System.out.println("Ingrese su correo");
                            String correo = leer.next();
                            System.out.println("Ingrese su nombre");
                            String nombre = leer.next();
                            Personas.add(new Empleados(horarios, ventas, ID, username, password, correo, nombre));
                            break;
                        case 2:
                            System.out.println("Ingrese el id de empleado:");
                            String IDA = leer.next();
                            int indiceActualizar = -1;
                            for (int i = 0; i < Personas.size(); i++) {
                                if (Personas.get(i).getId().equals(IDA)) {
                                    indiceActualizar = i;
                                }
                            }
                            if (indiceActualizar >= 0) {
                                 String horarioAs = leer.next();
                            System.out.println("Ingrese las ventas generadas");
                            int ventasA = leer.nextInt();
                              System.out.println("Ingrese su username");
                            String usernameA = leer.next();
                            System.out.println("Ingrese su contraseña");
                            String passwordA = leer.next();
                            System.out.println("Ingrese su correo");
                            String correoA = leer.next();
                            System.out.println("Ingrese su nombre");
                            String nombreA = leer.next();
                            Empleados empleadoA = (Empleados) Personas.get(indiceActualizar);
                            
                                empleadoA.setCorreo(correoA);
                                empleadoA.setNombre(nombreA);
                                empleadoA.setUsername(usernameA);
                                empleadoA.setPassword(passwordA);
                                empleadoA.setHorario(horarioAs);
                                empleadoA.setVentas(ventasA);
                            } else {
                                System.out.println("Cliente no existe");
                            }
                            break;
                        case 3:
                            int indiceEliminar = -1;
                            System.out.println("Ingrese el id de cliente:");
                            String IDE = leer.next();
                            for (int i = 0; i < Personas.size(); i++) {
                                if (Personas.get(i).getId().equals(IDE)) {
                                    indiceEliminar = i;
                                }
                            }
                            if (indiceEliminar >= 0) {
                                Personas.remove(indiceEliminar);
                            } else {
                                System.out.println("Cliente no existe");
                            }
                            break;
                        case 4:
                             for (int i = 0; i < Personas.size(); i++) {
                                 System.out.println("Nombre: "+Personas.get(i).getNombre()+" Usuario: "+Personas.get(i).getUsername());
                            }
                            break;
                        default:
                            break;
                    }
                    break;
                case 3:
                    break;
                  
            }
        }

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
