public class Ejer21 extends Base{


    public static void main (String [] args) {
        int num = 0;
        String mensaje = "";
        screen.println("Ingrese un numero entero");
        num = keyboard.nextInt();
        if (num > 0){ mensaje= "El numero es positivo";}
        else if (num < 0) {mensaje= "El numero es negativo";}
        else{mensaje="El numero es 0";}
        screen.println(mensaje);

    }
    
}
