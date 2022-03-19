package co.edu.cesde;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner InputData = new Scanner(System.in);
        System.out.println("RESTAURANTE MUERTE LENTA");
        int cant_hamb,cant_perros,cant_salch,cant_chor,cant_personas;
        int total_hamb,total_perros,total_salch,total_chor,total_compra;
        double descuento,totalfinal;
        double total;
        boolean propina = true;

        System.out.println("Cantidad de personas");
        cant_personas = InputData.nextInt();
        System.out.println("Hamburguesa");
        cant_hamb = InputData.nextInt();
        System.out.println("Perros");
        cant_perros = InputData.nextInt();
        System.out.println("Salchipapas");
        cant_salch = InputData.nextInt();
        System.out.println("Chorizos");
        cant_chor = InputData.nextInt();
        System.out.println("Desea agregar propina");
        propina = InputData.nextBoolean();


        total_hamb = cant_hamb * 10000;
        total_perros = cant_perros * 8000;
        total_salch = cant_salch * 6000;
        total_chor = cant_chor * 7000;

        total_compra = total_hamb + total_perros + total_salch + total_chor;


        if (total_compra > 200000)
            {
            descuento = total_compra * 0.10;
            total = total_compra - descuento;
            System.out.println("Se realizó un descuento por compras superiores a 200.000 COP  "+ total);
            }
            else
                if (cant_hamb >= 2 && cant_perros >= 2 && cant_salch >= 2 && cant_chor >= 2)
                    {
                    descuento = total_compra * 0.25;
                    total = total_compra - descuento;
                    System.out.println(total);
                    }
                else
                    if (propina)
                    {
                    descuento= total_compra * 0.20;
                    total = total_compra - descuento;
                    System.out.println(total);
                    }
                    else
                    {
                        System.out.println("El total de su compra es"+total_compra);
                    }









    }
}
