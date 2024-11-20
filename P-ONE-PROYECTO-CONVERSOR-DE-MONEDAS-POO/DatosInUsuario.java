import  java.util.*;
public class DatosInUsuario {


    private String divisa;
    private double valorAConvertir;
    Scanner t = new Scanner(System.in);
    private String divisaAConvertir;



public  void datosEntradaUsuario(){
    System.out.println("Ingresa la divisa origen:");
    setDivisa(t.next());
    System.out.println("Ingresa la divisa destino: ");
    setDivisaAConvertir(t.next());
    System.out.println("Ingresa la cantidad a convertr: ");
    setValorAConvertir(t.nextDouble());

}


    public void setDivisa(String divisa) {
        this.divisa = divisa;

    }

    public void setValorAConvertir(double valorAConvertir) {
        this.valorAConvertir = valorAConvertir;
    }


    public void setDivisaAConvertir(String divisaAConvertir) {
        this.divisaAConvertir = divisaAConvertir;
    }

    public String getDivisa() {
        return divisa;
    }

    public double getValorAConvertir() {
        return valorAConvertir;
    }

    public String getDivisaAConvertir() {
        return divisaAConvertir;
    }
}
