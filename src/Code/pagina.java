package Code;

public class pagina 
{
    private boolean TipoMemoria; //Si es true está en memoria principal si no lo es está en memoria secundaria
    private int idPag;
    private int idProceso;
    private int idMarcos;
    private String NombreP;

    public pagina(String NombreP ,int idProceso,  int idPag )
    {
        this.idProceso = idProceso;
        this.NombreP = NombreP;
        this.idPag = idPag;
    }

    public pagina(String NombreP,int idPag) 
    {
        this.NombreP = NombreP;
        this.idPag=idPag;
    }
    

    public int getIdPag() {
        return idPag;
    }

    public void setIdPag(int idPag) {
        this.idPag = idPag;
    }

    public String getNombreP() {
        return NombreP;
    }

    public void setNombreP(String NombreP) {
        this.NombreP = NombreP;
    }

    public boolean isTipoMemoria() {
        return TipoMemoria;
    }

    public void setTipoMemoria(boolean TipoMemoria) {
        this.TipoMemoria = TipoMemoria;
    }

    public int getIdProceso() {
        return idProceso;
    }

    public void setIdProceso(int idProceso) {
        this.idProceso = idProceso;
    }

    public int getIdMarcos() {
        return idMarcos;
    }

    public void setIdMarcos(int idMarcos) {
        this.idMarcos = idMarcos;
    }
}
