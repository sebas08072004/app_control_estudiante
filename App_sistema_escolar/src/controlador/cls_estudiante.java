package controlador;

public class cls_estudiante {
    private int id_int;
    private String nombre_str;
    private String contacto_str;
    private String curso_str;
    private String correo_str;
    private String sexo_str;
    public cls_estudiante(int id_int, String nombre_str, String contacto_str, String curso_str, String correo_str,
            String sexo_str) {
        this.id_int = id_int;
        this.nombre_str = nombre_str;
        this.contacto_str = contacto_str;
        this.curso_str = curso_str;
        this.correo_str = correo_str;
        this.sexo_str = sexo_str;
    }
    public int getId_int() {
        return id_int;
    }
    public void setId_int(int id_int) {
        this.id_int = id_int;
    }
    public String getNombre_str() {
        return nombre_str;
    }
    public void setNombre_str(String nombre_str) {
        this.nombre_str = nombre_str;
    }
    public String getContacto_str() {
        return contacto_str;
    }
    public void setContacto_str(String contacto_str) {
        this.contacto_str = contacto_str;
    }
    public String getCurso_str() {
        return curso_str;
    }
    public void setCurso_str(String curso_str) {
        this.curso_str = curso_str;
    }
    public String getCorreo_str() {
        return correo_str;
    }
    public void setCorreo_str(String correo_str) {
        this.correo_str = correo_str;
    }
    public String getSexo_str() {
        return sexo_str;
    }
    public void setSexo_str(String sexo_str) {
        this.sexo_str = sexo_str;
    }
    
}
