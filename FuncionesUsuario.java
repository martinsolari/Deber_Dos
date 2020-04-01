
public class FuncionesUsuario {
    public int calculoDeImpuestos(Usuario user) {
        float valorAPagar = 0;
        if (user.getEdad() < 18) {
            valorAPagar = 0;
        } else if (user.getEdad() >= 18 && user.getEdad() <= 30) {
            valorAPagar = 2000;
        } else if (user.getEdad() >= 30 && user.getEdad() <= 65) {
            valorAPagar = 7000;
        } else if (user.getEdad() > 65 ) {
            valorAPagar = 2000;
        }
        float valorAPagarFinal =   valorAPagar - ((valorAPagar * (3 * user.getCantidadDeHijos())) /100) ;
        if (valorAPagarFinal  < (valorAPagar/2)) {
            valorAPagarFinal = valorAPagar/2;
        }
        // Se restará de ese pago la cantidad de hijos que posee el usuario x 3% (Nunca puede superar un 50% del total)
        return valorAPagarFinal;
    }
    //II. Cobro de sueldo: a un usuario se le agrega a su saldo la cantidad señalada por sus servicios laborales.
    public void cobroDeSueldo(Usuario user) {
        float valorAPagar = 0;
        if (user.getEdad() < 18) {
            valorAPagar = 0;
        } else if (user.getEdad() >= 18 && user.getEdad() <= 30) {
            valorAPagar = 2000;
        } else if (user.getEdad() >= 30 && user.getEdad() <= 65) {
            valorAPagar = 7000;
        } else if (user.getEdad() > 65 ) {
            valorAPagar = 2000;
        }
        float aumento = ((valorAPagar * (3 * user.getCantidadDeHijos())) /100);
        user.setSaldo(user.getSaldo() + aumento);
    }
}