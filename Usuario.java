public class Usuario {
    private String nombre;
    private String cedula;
    private int edad;
    private int cantidadDeHijos;
    private float saldo;
    //CONSTRUCTOR
public Usuario() {
    this.setNombre(null);
    this.setCedula(null);
    this.setEdad(0);
    this.setCantidadDeHijos(0);
    this.setSaldo(0);
}
//GETTERS:
public String getNombre() {
    return this.nombre;
}
public String getCedula() {
    return this.cedula;
}
public int getEdad() {
    return this.edad;
}
public int getCantidadDeHijos() {
    return thus.cantidadDeHijos;
}
public float getSaldo() {
    return this.saldo;
}
//SETTERS
public void setNombre(String unNombre) {
    this.nombre = unNombre;
}
public void setCedula(String cedula) {
    this.cedula = unaCedula;
}
public void setEdad(int unaEdad) {
    this.edad = unaEdad;
}
public void setCantidadDeHijos(int unaCantidadDeHijos) {
    this.cantidadDeHijos = unaCantidadDeHijos;
}
public void setSaldo(float unSaldo) {
    this.saldo = unSaldo;
}
}