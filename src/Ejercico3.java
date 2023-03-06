public class Ejercico3 {

    public static void main(String[] args) {

        //for
        String[] texto = {"Hola", "mi nombre", "es", "Erick"};
        String concatenacion ="";
        for (int i = 0; i < texto.length; i++){
            concatenacion += texto[i] + " ";
        }
        System.out.println(concatenacion);


        // While
        String[] textos = {"Mi"," nombre es", " erick"};
        int i= 0;
        String concant = "";
        while (i<textos.length) {
            concant += textos[i];
            i++;
        }
        System.out.println(concant);

    }
}
