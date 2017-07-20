package Code;

import java.util.ArrayList;

public class proceso 
{
    private String nombreP;
    private String lista;
    private int tamanoProc;
    private int numPag;
    private int idProceso;
    private int TamanoPag;
    private String estadoProc;
    private pagina paginasProce[];
    private pagina procesos;
    private ArrayList<pagina> paginasEnPrincipal = new ArrayList<pagina>();
    private ArrayList<pagina> paginasEnSecundaria = new ArrayList<pagina>();

    public proceso(String nombreP, int tamanoProc, int idProceso, int TamanoPag) {
        this.nombreP = nombreP;
        this.tamanoProc = tamanoProc;
        this.idProceso = idProceso;
        this.TamanoPag=TamanoPag;
    }

    public proceso() 
    {
        
    }
    
    public void CrearPaginaProce()
    {
        int paginas = tamanoProc/TamanoPag + ((tamanoProc % TamanoPag == 0) ? 0 : 1);
        paginasProce= new pagina[paginas];
        for (int i = 0; i < paginasProce.length; i++) 
        {
            paginasProce[i]= new pagina(nombreP,idProceso, i );
        }
    }

    public String getEstadoProc() {
        return estadoProc;
    }

    public void setEstadoProc(String estadoProc) {
        this.estadoProc = estadoProc;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getLista() {
        return lista;
    }

    public void setLista(String lista) {
        this.lista = lista;
    }

    public int getTamanoProc() {
        return tamanoProc;
    }

    public void setTamanoProc(int tamanoProc) {
        this.tamanoProc = tamanoProc;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    public int getIdProceso() {
        return idProceso;
    }

    public void setIdProceso(int idProceso) {
        this.idProceso = idProceso;
    }

    public int getTamanoPag() {
        return TamanoPag;
    }

    public void setTamanoPag(int TamanoPag) {
        this.TamanoPag = TamanoPag;
    }

    public pagina[] getPaginasProce() {
        return paginasProce;
    }

    public void setPaginasProce(pagina[] paginasProce) {
        this.paginasProce = paginasProce;
    }

    public pagina getProcesos() {
        return procesos;
    }

    public void setProcesos(pagina procesos) {
        this.procesos = procesos;
    }

    public ArrayList<pagina> getPaginasEnPrincipal() {
        return paginasEnPrincipal;
    }

    public void setPaginasEnPrincipal(ArrayList<pagina> paginasEnPrincipal) {
        this.paginasEnPrincipal = paginasEnPrincipal;
    }

    public ArrayList<pagina> getPaginasEnSecundaria() {
        return paginasEnSecundaria;
    }

    public void setPaginasEnSecundaria(ArrayList<pagina> paginasEnSecundaria) {
        this.paginasEnSecundaria = paginasEnSecundaria;
    }
}
