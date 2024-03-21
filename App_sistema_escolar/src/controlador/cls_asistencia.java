package controlador;
public class cls_asistencia {
    private int idInt;
    private String fechaStr;
    private String horaStr;
    public cls_asistencia(int idInt, String fechaStr, String horaStr) {
        this.idInt = idInt;
        this.fechaStr = fechaStr;
        this.horaStr = horaStr;
    }
    public int getIdInt() {
        return idInt;
    }
    public void setIdInt(int idInt) {
        this.idInt = idInt;
    }
    public String getFechaStr() {
        return fechaStr;
    }
    public void setFechaStr(String fechaStr) {
        this.fechaStr = fechaStr;
    }
    public String getHoraStr() {
        return horaStr;
    }
    public void setHoraStr(String horaStr) {
        this.horaStr = horaStr;
    }
    
}