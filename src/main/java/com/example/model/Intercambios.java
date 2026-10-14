public class Intercambios {

    private int IdIntercambio;
    private int IdUsuario;
    private int IdProducto;
    private String Estado;

    public Intercambios(int idIntercambio, int IdUsuario, int IdProducto, String Estado) {
        this.IdIntercambio = idIntercambio;
        this.IdUsuario = IdUsuario;
        this.IdProducto = IdProducto;
        this.Estado = Estado;
    }

    public int getIdIntercambio() {
        return IdIntercambio;
    }

    public void setIdIntercambio(int idIntercambio) {
        this.IdIntercambio = idIntercambio;
    }

    public int getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(int IdUsuario) {
        this.IdUsuario = IdUsuario;
    }

    public int getIdProducto() {
        return IdProducto;
    }

    public void setIdProducto(int IdProducto) {
        this.IdProducto = IdProducto;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

}
