import java.util.Random; //Se importa la clase Random y todo su contenido.

public class App {

    public static void main(String[] args) throws Exception {
        //Ejemplo de uso del metodo generarKey
        generarKey(10); //Se le ingresa la longitud de la key que se desea generar.
    }

    public static String generarKey(int longitudKey) {
        System.out.println("-Generador básico de Keys Aleatorias-");

        Random generador = new Random(); //Se crea un objeto de la clase Random llamado generador.
        String keyGenerada = ""; //Variable donde se almacenara la key generada.

        String caracteres[] = { 
            "a","b","c","d","e","f","g","h","i","j",
            "k","l","m","n","o","p","q","r","s","t",
            "u","v","w","x","y","z",
            "A","B","C","D","E","F","G","H","I","J",
            "K","L","M","N","O","P","Q","R","S","T",
            "U","V","W","X","Y","Z",
            "0","1","2","3","4","5","6","7","8","9"
        }; //Arreglo de 62 indices, del 0 al 61 

        for (int i = 0; i < longitudKey; i++) {
            String caracterRandom = caracteres[generador.nextInt(0,62)]; //Genera un numero random del 0 al 61 y se lo asigna a la variable caracterRandom
            keyGenerada += caracterRandom; //Concatena el caracterRandom a la keyGenerada y se le agrega un caracter por cada iteracion.
        }

        System.out.println("Key generada:" + keyGenerada);
        return keyGenerada;   
    }

}