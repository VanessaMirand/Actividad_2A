public class Ejer24 extends Base{

    public static void main (String [] args) {
        int est1 = 0;
        int est2 = 0;
        int est3 = 0;
        int estMay = 0;
        int estMed = 0;
        int estMen = 0;
        int aux = 0;


        screen.println("Ingrese la estatura en centimetros de la primera persona");
        est1 = keyboard.nextInt();

        screen.println("ingrese la estatura en centimetros de la segunda persona");
        est2 = keyboard.nextInt();

        screen.println("Ingrese la estatura en centimetros de la tercera persona");
        est3 = keyboard.nextInt();

        estMen = est1;
        estMay = est2;
        estMed = est3;

        if (estMen > estMay) {
            aux = estMen;
            estMen = estMay;
            estMay = aux;
        

        }

        if (estMay > estMed) {
            aux = estMay;
            estMay= estMed;
            estMed = aux;
        }

        if (estMen > estMay){
            aux = estMen;
            estMen = estMay;
            estMay = aux;

        }

        screen.println("Estaturas ordenadas ascendentemente");
        screen.println(estMen + "," + estMed + "," + estMay);
        

    






    }
    
}
