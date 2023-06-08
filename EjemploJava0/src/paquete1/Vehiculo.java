package paquete1;

/**
 *
 * @author santy
 */
public class Vehiculo {
    private String tipo;
    private String matricula;
    private double valor;
    
    public Vehiculo(String t, String m, double v) {
        tipo = t;
        matricula = m;
        valor = v;
    }
    
    public void establecerTipo(String t) {
        tipo = t;
    }
    
    public void establecerMatricula(String m) {
        matricula = m;
    }
    
    public void establecerValor(double v) {
        valor = v;
    }
    
    public String obtenerTipo() {
        return tipo;
    }
    
    public String obtenerMatricula() {
        return matricula;
    }
    
    public double obtenerValor() {
        return valor;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Tipo de vehículo: %s\nMatrícula: %s\n"
                + "Valor: %.2f\n",tipo,matricula,valor);
        return cadena;
    }
    
}
