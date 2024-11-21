import java.util.Scanner;

public class SignUp {
    public static void main(String[] args) {
        //Vamos a crear un formulario de registro
        Scanner scanner = new Scanner(System.in);
        //Los datos que debes pedir al usuario son:
        //1. Nombre
        //2. Apellido
        //3. Nombre de usuario
        //4. Contraseña
        System.out.println("Hola, ¿Cómo te llamas?");
        String name = scanner.nextLine();
        System.out.println();
        System.out.println("¿Cuál es tu apellido?");
        String lastName = scanner.nextLine();
        System.out.println();
        System.out.println("Escribe tu nombre de usuario:");
        String userName = scanner.nextLine();
        System.out.println();
        System.out.println("Escribe tu contraseña:");
        String password = scanner.nextLine();
        System.out.println();
        //Añade una nueva línea antes de mostrar la siguiente pregunta.
        System.out.println("Hola, " + name + ", tu nombre de usuario es " + userName + " y tu contraseña " + password + ", gracias por registrarte.");
        //Imprimir el siguiente resultado:
        //Hola <nombre> <apellido>, tu nombre de usuario es <usuario> y tu contraseña es <contraseña>, gracias por registrarte.
        //Añade una nueva línea antes de mostrar la respuesta
    }
}