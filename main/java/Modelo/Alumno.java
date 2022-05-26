
package Modelo;

/**
 *
 * @author usuario
 */
public class Alumno {
    private int codigo;
    private String nombre;
    private int aleas;
    private String correo;
    private int telefono;

    public Alumno(int codigo, String nombre, int aleas, String correo, int telefono) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.aleas = aleas;
        this.correo = correo;
        this.telefono = telefono;
    }

    public Alumno(String nombre, int aleas, String correo, int telefono) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAleas() {
        return aleas;
    }

    public void setAleas(int aleas) {
        this.aleas = aleas;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
  
    
}
