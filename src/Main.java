import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("*****************************************");
        System.out.println("Sea bienvenido/a al Converso de Moenda = ");


        System.out.println("1) Dólar =>> Peso argentino");
        System.out.println("2) Peso argentino=>>Dólar");
        System.out.println("3) Dólar =>> Real brasileno");
        System.out.println("4) Real brasileno  =>>Dólar ");
        System.out.println("5) Dólar =>> Peso colombiano");
        System.out.println("6) Peso colombiano =>> Dólar");
        System.out.println("7) Salir");

        String monedaOrigen = "";
        String monedaObjetivo = "";
        double amount = 0;
        Scanner lectura = new Scanner(System.in);
        ConversorDeMonedas conversor = new ConversorDeMonedas();
        System.out.println("elija una opción valida");
        var opcion = Integer.valueOf(lectura.nextLine());
        if (opcion == 7) {
            System.out.println("Saliste del programa");
        } else {
            if (opcion == 1) {
                monedaOrigen = "USD";
                monedaObjetivo = "ARS";
            } else if (opcion == 2) {
                monedaOrigen = "ARS";
                monedaObjetivo = "USD";
            } else if (opcion == 3) {
                monedaOrigen = "USD";
                monedaObjetivo = "BRL";
            } else if (opcion == 4) {
                monedaOrigen = "BRL";
                monedaObjetivo = "USD";
            } else if (opcion == 5) {
                monedaOrigen = "USD";
                monedaObjetivo = "COP";
            } else if (opcion == 6) {
                monedaOrigen = "COP";
                monedaObjetivo = "USD";
            }
            System.out.println("Ingrese el valor que desea convertir: ");
            amount = Double.parseDouble(lectura.nextLine());
            try {
                ResultadoConversion resultado = conversor.cambiarMoneda(monedaOrigen, monedaObjetivo, amount);
                System.out.println("El valor: "+amount+" ("+resultado.base_code() +")Corresponde al valor final de =>>> "+resultado.conversion_result()+"("+resultado.target_code()+")");
            } catch (Exception e) {
                System.out.println("Error");
            }
        }
    }

};
