package controlador;

public class cls_notas {
    private int id_int;
    private String fecha_str;
    private float nota_flt;
    private String asignatura_str;
    private String observaciones_str;
    public cls_notas(int id_int, String fecha_str, float nota_flt, String asignatura_str, String observaciones_str) {
        this.id_int = id_int;
        this.fecha_str = fecha_str;
        this.nota_flt = nota_flt;
        this.asignatura_str = asignatura_str;
        this.observaciones_str = observaciones_str;
    }
    public int getId_int() {
        return id_int;
    }
    public void setId_int(int id_int) {
        this.id_int = id_int;
    }
    public String getFecha_str() {
        return fecha_str;
    }
    public void setFecha_str(String fecha_str) {
        this.fecha_str = fecha_str;
    }
    public float getNota_flt() {
        return nota_flt;
    }
    public void setNota_flt(float nota_flt) {
        this.nota_flt = nota_flt;
    }
    public String getAsignatura_str() {
        return asignatura_str;
    }
    public void setAsignatura_str(String asignatura_str) {
        this.asignatura_str = asignatura_str;
    }
    public String getObservaciones_str() {
        return observaciones_str;
    }
    public void setObservaciones_str(String observaciones_str) {
        this.observaciones_str = observaciones_str;
    }

}
