/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package restaurante;

/**
 *
 * @author rider
 */
import java.util.Scanner;

public class Restaurante {

    public static void main(String[] args) {
        
        String[] opciones = {"Platillos para el desayuno", "Platillos para la comida", "Platillos para la cena", "Bebidas", "Postres"};
        String[][] platillos = {{"Huevos revueltos", "Chilaquiles", "Pan dulce", "Café"}, {"Tacos al pastor", "Milanesa", "Sopa de tortilla", "Refresco"}, {"Sushi", "Pasta", "Carne asada", "Vino tinto"}, {"Agua fresca", "Jugo natural", "Cerveza", "Café americano"}, {"Pastel de chocolate", "Flan", "Gelatina", "Helado"}};
        double[][] precios = {{50.0, 40.0, 15.0, 20.0}, {25.0, 35.0, 30.0, 15.0}, {100.0, 80.0, 120.0, 200.0}, {10.0, 15.0, 25.0, 20.0}, {30.0, 25.0, 20.0, 35.0}};
        
        
        for (int i = 0; i < opciones.length; i++) {
            System.out.println(opciones[i] + ":");
            for (int j = 0; j < platillos[i].length; j++) {
                System.out.println(platillos[i][j] + " - $" + precios[i][j]);
            }
        }
        
        
        Scanner sc = new Scanner(System.in);
        String opcion = "";
        double total = 0.0;
        while (!opcion.equals("Salir") && !opcion.equals("Cancelar")) {
            System.out.println("Escriba el nombre del platillo que desea ordenar o escriba 'Salir' para terminar de ordenar o 'Cancelar' para cancelar la orden:");
            opcion = sc.nextLine();
            if (!opcion.equals("Salir") && !opcion.equals("Cancelar")) {
                System.out.println("Escriba la cantidad que desea ordenar:");
                int cantidad = Integer.parseInt(sc.nextLine());
                for (int i = 0; i < platillos.length; i++) {
                    for (int j = 0; j < platillos[i].length; j++) {
                        if (opcion.equals(platillos[i][j])) {
                            double subtotal = precios[i][j] * cantidad;
                            System.out.println(cantidad + " " + platillos[i][j] + " - $" + subtotal);
                            total += subtotal;
                        }
                    }
                }
            }
        }
        
        
        System.out.println("Restaurante 'El Buen Sabor'");
        System.out.println("------------------------------");
        System.out.println("Orden del cliente:");
        System.out.println("Total: $" + total);
        System.out.println("------------------------------");
        System.out.println("¡Gracias por su visita!");
    }

}


