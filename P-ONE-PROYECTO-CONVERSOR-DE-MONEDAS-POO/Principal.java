import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner t = new Scanner(System.in);

        ImportAPI datos = new ImportAPI();
        DatosRequeridosApi datosr = datos.conversor(t.next(),t.next(),t.nextDouble());
        System.out.println(datosr);
    }
}
