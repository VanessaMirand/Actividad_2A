public class Ejer23 extends Base{

    public static void main (String [] args) {

        int llantas = 0;
        int costo = 0;
        String mensaje="";

        screen.println("Ingrese cantidad de llantas que desea comprar");
        llantas = keyboard.nextInt();

        if(llantas>=4) {
            costo=llantas*108000;
            mensaje ="Su compra aplica para el descuento, el costo el costo de las llantas es de $";

        }
        else{
            costo=llantas*120000;
            mensaje="A su compra no le aplica descuento, el costo de sus llantas es de $";
        }

        screen.println(mensaje + costo);


    }

    
    
}
