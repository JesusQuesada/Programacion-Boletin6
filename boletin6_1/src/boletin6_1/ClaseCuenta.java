
package boletin6_1;

public class ClaseCuenta {
    //atributos
    private String nombreCliente, numeroCuenta;
    private double saldo;
    
    //constructores
    public ClaseCuenta(){
        
    }
    public ClaseCuenta(String nomCli, String numCuen, double saldo){
        nombreCliente = nomCli;
        numeroCuenta = numCuen;
    }
    
    //métodos de acceso
    public void setNombre(String nomCli){
        nombreCliente = nomCli;
        }
    public String getNombre(){
        return nombreCliente;
        }
    public void setCuenta(String numCuen){
        numeroCuenta = numCuen;
        }
    public String getCuenta(){
        return numeroCuenta;
        }
    public void setSaldo(double s){
        saldo = s;
        }
    public double getSaldo(){
        return saldo;
        }
    public void ingresoSaldo(ClaseCuenta cuenta, double ingreso){
        
        if (ingreso > 0){
            cuenta.setSaldo(cuenta.getSaldo()+ingreso);
            System.out.println("True ");
        }
        else
            System.out.println("False ");
        }
    public void reintegroSaldo(ClaseCuenta cuenta, double reintegro){
        if (cuenta.getSaldo()>reintegro){
            cuenta.setSaldo(cuenta.getSaldo()-reintegro);
            System.out.println("True ");
        }
        else
            System.out.println("False ");
        }
    public void mostrarDatos(){
        System.out.println("Nombre: " +nombreCliente+ "\nCuenta: " +numeroCuenta+ "\nSaldo: " +saldo);
    }
    public void transferencia(ClaseCuenta cuenta, ClaseCuenta cuenta2, double importe){
        cuenta.setSaldo(cuenta.getSaldo()+importe);
        cuenta2.setSaldo(cuenta.getSaldo()-importe);
        }
}
