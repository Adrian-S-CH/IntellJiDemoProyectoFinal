import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioFinal {
    static ArrayList<String> palabraSimilar = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer texto");
        String texto1 = sc.nextLine();
        System.out.println("Ingrese el segundo texto");
        String texto2 = sc.nextLine();


        String [] cadena1;
        String [] cadena2;
        try {
            cadena1 = separarPalabras(texto1);
            cadena2 = separarPalabras(texto2);
            comparar(cadena1,cadena2);
            mostrar(palabraSimilar);
        }catch (Exception e){
            System.out.println("Error");
        }
    }

    public static String[] separarPalabras (String texto){
        String [] textoPartido = texto.split(" ");
        return textoPartido;
    }

    public static void comparar (String [] texto1, String [] texto2){
        //Guardar la palabra similar en la posicion n,
        //pero este aumenta en 1 cuando encuentra una palabra similar
        for (int i = 0; i < texto1.length; i++) {
            for (int j = 0; j < texto2.length; j++) {
                if (texto1[i].equals(texto2[j])){
                    palabraSimilar.add(texto1[i]);
                }
            }
        }
    }
    public static void mostrar (ArrayList<String> palabra){
        for (int i = 0; i < palabra.size(); i++) {
            System.out.println("Palabras similares: " + palabra.get(i));
        }
    }
}