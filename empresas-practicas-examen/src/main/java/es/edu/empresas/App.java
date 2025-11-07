package es.edu.empresas;

import es.edu.empresas.dao.ConnectionManager;
import es.edu.empresas.service.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int opcion;
                EmpresaService empresaSrv = new EmpresaService();
                AlumnoService alumnoSrv = new AlumnoService();
        do {
            System.out.println("\n--- GESTOR DE EMPRESAS Y ALUMNOS ---");
            System.out.println("1. Listar empresas");
            System.out.println("2. Añadir empresa");
            System.out.println("3. Modificar empresa");
            System.out.println("4. Listar alumnos (con empresa)");
            System.out.println("5. Añadir alumno");
            System.out.println("6. Eliminar alumno");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = Integer.parseInt(new Scanner(System.in).nextLine());
            switch (opcion) {
                case 1 -> empresaSrv.listar();
                case 2 -> empresaSrv.insertar();
                case 3 -> empresaSrv.modificar();
                case 4 -> alumnoSrv.listarConEmpresa();
                case 5 -> alumnoSrv.insertar();
                case 6 -> alumnoSrv.eliminar();
                case 0 -> System.out.println("Hasta luego.");
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
    }
}
