public class Productos {

    private int idProducto; // para que sea autogenerado por la BD
    private int IdUsuario;
    private String NombreProducto;
    private String Descripcion;
    private int IdCategoria;
    private String Estado;

    public Productos(int idProducto, int IdUsuario, String NombreProducto, String Descripcion, int IdCategoria, String Estado) {
        this.idProducto = idProducto;
        this.IdUsuario = IdUsuario;
        this.NombreProducto = NombreProducto;
        this.Descripcion = Descripcion;
        this.IdCategoria = IdCategoria;
        this.Estado = Estado;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(int IdUsuario) {
        this.IdUsuario = IdUsuario;
    }

    public String getNombreProducto() {
        return NombreProducto;
    }

    public void setNombreProducto(String NombreProducto) {
        this.NombreProducto = NombreProducto;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getIdCategoria() {
        return IdCategoria;
    }

    public void setIdCategoria(int IdCategoria) {
        this.IdCategoria = IdCategoria;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    @Override
    public String toString() {
        return "Productos [idProducto=" + idProducto + ", IdUsuario=" + IdUsuario + ", NombreProducto=" + NombreProducto + ", Descripcion=" + Descripcion + ", IdCategoria=" + IdCategoria + ", Estado=" + Estado + "]";
    }
}
