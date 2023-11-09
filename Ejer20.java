
public class Ejer20 extends Base{

    public static void main (String [] args) {

        int num = 0;
        int res = 0;
        String mensaje = "";
        screen.println ("Ingrese un numero entero");
        num = keyboard.nextInt();
        res = (num % 2);

        if (res == 0) {
            mensaje ="El numero ingresado es par";

        }
        else {
            mensaje="El numero ingresado es impar";

        }
        screen.println (mensaje);

    }

}
