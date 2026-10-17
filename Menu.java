package Menu;
import java.util.Scanner;

public class Menu {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion,cantidad;
        double precio = 0, subtotal;
        double total = 0;
        int MedicamentosVendidos = 0;
        do {
            
            System.out.println("seleccione una opcion del menu:!");
            System.out.println("1.paracetamo - C$30");
            System.out.println("2.ibuprofeno - C$45");
            System.out.println("3.vitamina c - C$60");
            System.out.println("4.ver total");
            System.out.println("5.salir");
            opcion = sc.nextInt();
            switch(opcion) {
                case 1:
                precio = 30;
                System.out.println("ingrese la cantidad de paracetamol:");
                cantidad = sc.nextInt();
                subtotal = precio * cantidad;
                total = total + subtotal;
                MedicamentosVendidos = MedicamentosVendidos + cantidad;
                System.out.println("unidades de paracetamol compradas es:" + cantidad);
                System.out.println("su precio es de: C$" + precio);
                System.out.println("su subtotal es: C$" + subtotal);
                System.out.println("su total en compra es: C$" + total);
                break;
                
                case 2:
                precio = 45;
                System.out.println("ingrese la cantidad de ibuprofeno:");
                cantidad = sc.nextInt();
                subtotal = precio * cantidad;
                total = total + subtotal;
                MedicamentosVendidos = MedicamentosVendidos + cantidad;
                System.out.println("unidades de ibuprofeno compradas es:" + cantidad);
                System.out.println("su precio es de: C$" + precio);
                System.out.println("su subtotal es de: C$" + subtotal);
                System.out.println("su total en compra es: C$" + total);
                break;
                
                case 3:
                precio = 60;
                System.out.println("ingrese la cantidad de vitamina c:");
                cantidad = sc.nextInt();
                subtotal = precio * cantidad;
                total = total + subtotal;
                MedicamentosVendidos = MedicamentosVendidos + cantidad;
                System.out.println("unidades de vitamina c compradas es:" + cantidad);
                System.out.println("su precio es de: C$" + precio);
                System.out.println("su subtotal es de: C$" + subtotal);
                System.out.println("su total en compra es: C$" + total);
                break;
                
                case 4:
                System.out.println("El total de su compra es: C$" +total);
                System.out.println("productos vendidos:" + MedicamentosVendidos);
                break;
                
                case 5:
                System.out.println("saliendo del sistema");
                break;
                
                default:
                System.out.println("opcion invalidad");
            }
        } while (opcion != 5);
                
    }
    
}
