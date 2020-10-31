/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg3_josuerocha_douglasrubi;

import java.util.ArrayList;
import java.util.Scanner;
import static lab.pkg3_josuerocha_douglasrubi.Josue.leer;

/**
 *
 * @author famii
 */
public class SODO {

    Scanner leer = new Scanner(System.in);
    //Agregar
    ArrayList<Clientes> Clientes = new ArrayList();

    public SODO() {
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
                            String username = leer.next();
                            System.out.println("Ingrese su contraseña");
                            String password = leer.next();
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
                            String username = leer.next();
                            System.out.println("Ingrese su contraseña");
                            String password = leer.next();
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
}
