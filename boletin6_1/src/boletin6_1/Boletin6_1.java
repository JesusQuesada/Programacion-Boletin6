
package boletin6_1;

public class Boletin6_1 {

    public static void main(String[] args) {
        ClaseCuenta cuenta1 = new ClaseCuenta();
        cuenta1.setNombre("Rodrigo Fuentes");
        cuenta1.setCuenta("BBVA");
        cuenta1.setSaldo(1500);
        cuenta1.mostrarDatos();
        cuenta1.ingresoSaldo(cuenta1,200);
        cuenta1.mostrarDatos();
        cuenta1.reintegroSaldo(cuenta1,500);
        cuenta1.mostrarDatos();
        ClaseCuenta cuenta2 = new ClaseCuenta();
        cuenta2.setNombre("Carmen Fuentes");
        cuenta2.setCuenta("Popular");
        cuenta2.setSaldo(2000);
        cuenta2.mostrarDatos();
        cuenta2.transferencia(cuenta1, cuenta2, 800);
        cuenta1.mostrarDatos();
        cuenta2.mostrarDatos();
        
    }
    
}
