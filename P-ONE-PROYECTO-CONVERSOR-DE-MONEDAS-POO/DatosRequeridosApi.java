public record DatosRequeridosApi(String base_code, String target_code, double conversion_rate, double conversion_result) {
// Esta clase record ya contiene todos los getters y setters, to string y demas metodos que se necesitan realizar simplificando el codigo


    // Cambiamos el metodo to string de record
    @Override
    public String toString() {
        return "Datos de cambio: [" +
                "Divisa Origen: '" + base_code + '\'' +
                ", Divisa Destino: '" + target_code + '\'' +
                ", Precio de divisa origen actual: " + conversion_rate +
                ", Conversion de moneda: " + conversion_result +
                ']';
    }
}
