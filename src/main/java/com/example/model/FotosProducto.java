public class FotosProducto {

    private int IdFoto;
    private int IdProducto;
    private String UrlFoto;

    public FotosProducto(int idFoto, int IdProducto, String UrlFoto) {
        this.IdFoto = idFoto;
        this.IdProducto = IdProducto;
        this.UrlFoto = UrlFoto;
    }

    public int getIdFoto() {
        return IdFoto;
    }

    public void setIdFoto(int idFoto) {
        this.IdFoto = idFoto;
    }

    public int getIdProducto() {
        return IdProducto;
    }

    public void setIdProducto(int IdProducto) {
        this.IdProducto = IdProducto;
    }

    public String getUrlFoto() {
        return UrlFoto;
    }

    public void setUrlFoto(String UrlFoto) {
        this.UrlFoto = UrlFoto;
    }

}
