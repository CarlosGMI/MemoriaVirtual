package Code;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Memoria 
{
    private int TmemoriaP;
    private int TmemoriaS;
    private int TamanoPag;
    private proceso Proceso;
    private pagina inicial;
    private pagina MarcoMemorP[];
    private pagina MarcoMemorS[];
    private proceso procesos[]=new proceso[100];
    private int MaMemoriPUAc;
    private int MaMemoriSUAc;
    private DefaultListModel modeloActivo;
    private DefaultListModel modeloBloqueado;
    private DefaultListModel modeloSuspendido;
    private DefaultListModel modeloBloqSusp;
    private JLabel tamDirLog, bitsDesp, bitsPag;
    private JTextField dirFisBin, dirFisHex;
    
    public Memoria(int TmemoriaP, int TmemoriaS, int TamanoPag, DefaultListModel modeloActivo, DefaultListModel modeloBloqueado,DefaultListModel modeloSuspendido,DefaultListModel modeloBloqSusp, JLabel tamDirLog, JLabel bitsDesp, JLabel bitsPag, JTextField dirFisBin, JTextField dirFisHex) 
    {
        this.TmemoriaP = TmemoriaP;
        this.TmemoriaS = TmemoriaS;
        this.TamanoPag = TamanoPag;
        this.modeloActivo = modeloActivo;
        this.modeloBloqueado = modeloBloqueado;
        this.modeloSuspendido = modeloSuspendido;
        this.modeloBloqSusp = modeloBloqSusp;
        this.tamDirLog = tamDirLog;
        this.bitsDesp = bitsDesp;
        this.bitsPag = bitsPag;
        this.dirFisBin = dirFisBin;
        this.dirFisHex = dirFisHex;
    }
    
    public void Instalacion()
    {
        System.out.println("se ha definodo el tamaño de las memorias y la pagina"); 
        System.out.println("MP:"+TmemoriaP);
        System.out.println("MS:"+TmemoriaS);
        System.out.println("TP:"+TamanoPag);
        InstalacionLL();
    }
    public void InstalacionLL()
    {
        MarcoMemorP= new pagina[TmemoriaP/TamanoPag];
        MarcoMemorS= new pagina [TmemoriaS/TamanoPag];
        for (int i = 0; i < MarcoMemorP.length; i++) 
        {
            inicial= new pagina("vacio",i);
            MarcoMemorP[i]=inicial;
        }
        for (int i = 0; i < MarcoMemorS.length; i++) 
        {
            inicial= new pagina("vacio",i);
            MarcoMemorS[i]=inicial;
        }
    }
    
    public void CrearProceso(String nombreP, int tamanoProc, int idProceso)
    {
        int tamano = tamanoProc/TamanoPag + ((tamanoProc % TamanoPag == 0) ? 0 : 1);
        System.out.println("TAMAÑO PROCESO: "+tamano);
        Proceso=new proceso(nombreP,tamanoProc,idProceso, TamanoPag);
        procesos[idProceso]=Proceso;
        Proceso.CrearPaginaProce();
        AlmacProcNuevo(Proceso);
    }
    
    public String ContarProcesosEnSistema()
    {
        int cont1=0;
        for (int i = 0; i < procesos.length; i++) 
        {
           
            if (procesos[i] != null) 
            {
                cont1++;
            }
        }
        return Integer.toString(cont1); 
    }
 
    public int ContarEspaciMemoriPrincD()
    {
        int contd=0;
        MaMemoriPUAc=0;
        for (int i = 0; i < MarcoMemorP.length; i++) 
        {
            if(MarcoMemorP[i].getNombreP().equalsIgnoreCase("vacio"))
            {
                contd++;
            }
            else
            {
                MaMemoriPUAc++;
            }
        }
        return contd;
    }
  
    public int ContarEspaciMemoriSecunD()
    {
        int contd=0;
        MaMemoriSUAc=0;
        for (int i = 0; i < MarcoMemorS.length; i++) 
        {
            if(MarcoMemorS[i].getNombreP().equalsIgnoreCase("vacio"))
            {
                contd++;
            }
            else
            {
                MaMemoriSUAc++;
            }
        }
        return contd;
    }

    public void AlmacProcNuevo(proceso Proceso)
    {
        int mitadPag = Proceso.getPaginasProce().length/2 + ((Proceso.getPaginasProce().length % 2 == 0) ? 0 : 1);
        System.out.println("REDONDEO: "+mitadPag); 
        if (this.ContarEspaciMemoriPrincD()!=0) 
        { 
            if (Proceso.getPaginasProce().length <= this.ContarEspaciMemoriPrincD()) 
            {
                for (int i = 0; i < Proceso.getPaginasProce().length; i++) 
                {
                    for (int j = 0; j < MarcoMemorP.length; j++) 
                    {
                        if(MarcoMemorP[j].getNombreP().equalsIgnoreCase("vacio"))
                        {
                            MarcoMemorP[j]=Proceso.getPaginasProce()[i];
                            Proceso.getPaginasProce()[i].setIdMarcos(j);
                            Proceso.getPaginasProce()[i].setTipoMemoria(true);
                            Proceso.getPaginasEnPrincipal().add(Proceso.getPaginasProce()[i]);
                            j=MarcoMemorP.length;
                        }
                    }
                }
                Proceso.setEstadoProc("Activo");
                modeloActivo.addElement(Proceso.getNombreP());
                modeloBloqueado.addElement(" ");
                modeloSuspendido.addElement(" ");
                modeloBloqSusp.addElement(" ");
            }
            else if(mitadPag <= this.ContarEspaciMemoriPrincD())
            {
                int m=0,n=0;
                for (m = 0 ; m <Proceso.getPaginasProce().length; m++) 
                {
                    for (int j = 0; j < MarcoMemorP.length; j++) 
                    {
                        if(MarcoMemorP[j].getNombreP().equalsIgnoreCase("vacio"))
                        {
                            MarcoMemorP[j]=Proceso.getPaginasProce()[m];
                            Proceso.getPaginasProce()[m].setIdMarcos(j);
                            Proceso.getPaginasProce()[m].setTipoMemoria(true);
                            Proceso.getPaginasEnPrincipal().add(Proceso.getPaginasProce()[m]);
                            j=MarcoMemorP.length;
                            n++;
                        }
                    }
                }
                for ( int i=n; i <Proceso.getPaginasProce().length; i++) 
                {
                    for (int j = 0; j < MarcoMemorS.length; j++) 
                    {
                        if(MarcoMemorS[j].getNombreP().equalsIgnoreCase("vacio"))
                        {
                            MarcoMemorS[j]=Proceso.getPaginasProce()[i];
                            Proceso.getPaginasProce()[i].setIdMarcos(j);
                            Proceso.getPaginasProce()[i].setTipoMemoria(false);
                            Proceso.getPaginasEnSecundaria().add(Proceso.getPaginasProce()[i]);
                            j=MarcoMemorS.length;
                        }
                    }
                }
                Proceso.setEstadoProc("Activo");
                modeloActivo.addElement(Proceso.getNombreP());
                modeloBloqueado.addElement(" ");
                modeloSuspendido.addElement(" ");
                modeloBloqSusp.addElement(" ");
                   
            }
            else
            {
                for (int i = 0; i <Proceso.getPaginasProce().length; i++) 
                {
                    for (int j = 0; j < MarcoMemorS.length; j++) 
                    {
                        if(MarcoMemorS[j].getNombreP().equalsIgnoreCase("vacio"))
                        {
                            MarcoMemorS[j]=Proceso.getPaginasProce()[i];
                            Proceso.getPaginasProce()[i].setIdMarcos(j);
                            Proceso.getPaginasProce()[i].setTipoMemoria(false);
                            Proceso.getPaginasEnSecundaria().add(Proceso.getPaginasProce()[i]);
                            j=MarcoMemorS.length;
                        }
                    }
                }
                Proceso.setEstadoProc("Suspendido");
                modeloSuspendido.addElement(Proceso.getNombreP());
                modeloActivo.addElement(" ");
                modeloBloqueado.addElement(" ");
                modeloBloqSusp.addElement(" ");
            } 
        }
        else
        {
            if (Proceso.getPaginasProce().length > this.ContarEspaciMemoriSecunD()) 
            {
                System.out.println("Memoria llena");
                JOptionPane.showMessageDialog(null, "Error! Memoria llena.");
            }
            else
            {
                for (int i = 0; i <Proceso.getPaginasProce().length; i++) 
                {
                    for (int j = 0; j < MarcoMemorS.length; j++) 
                    {
                        if(MarcoMemorS[j].getNombreP().equalsIgnoreCase("vacio"))
                        {
                            MarcoMemorS[j]=Proceso.getPaginasProce()[i];
                            Proceso.getPaginasProce()[i].setIdMarcos(j);
                            Proceso.getPaginasProce()[i].setTipoMemoria(false);
                            Proceso.getPaginasEnSecundaria().add(Proceso.getPaginasProce()[i]);
                            j=MarcoMemorS.length;
                        }
                    }
                }
                Proceso.setEstadoProc("Suspendido");
                modeloSuspendido.addElement(Proceso.getNombreP());
                modeloActivo.addElement(" ");
                modeloBloqueado.addElement(" ");
                modeloBloqSusp.addElement(" ");
            }
        }
        mostrar();
    } 

    public void suspenderProceso(int id,int actOBloq)
    {
        proceso p1 = procesos[id];
        if(p1.getPaginasEnPrincipal().size() > this.ContarEspaciMemoriSecunD())
        {
            System.out.println("Memoria secundaria llena");
            JOptionPane.showMessageDialog(null, "Error! Memoria secundaria llena.");
        }
        else
        {
            for(int i=0;i<p1.getPaginasEnPrincipal().size();i++)
            {
                MarcoMemorP[p1.getPaginasEnPrincipal().get(i).getIdMarcos()] = inicial;
                for (int j = 0; j < MarcoMemorS.length; j++) 
                {
                    if(MarcoMemorS[j].getNombreP().equalsIgnoreCase("vacio"))
                    {
                        MarcoMemorS[j]=p1.getPaginasEnPrincipal().get(i);
                        MarcoMemorS[j].setIdMarcos(j);
                        MarcoMemorS[j].setTipoMemoria(false);
                        p1.getPaginasEnSecundaria().add(MarcoMemorS[j]);
                        j=MarcoMemorS.length;
                    }
                }
            }
            p1.getPaginasEnPrincipal().clear();
            if(actOBloq == 1)
            {
                modeloActivo.setElementAt(" ", id);
                modeloSuspendido.setElementAt(p1.getNombreP(), id);
            }
            else if(actOBloq == 2)
            {
                modeloBloqueado.setElementAt(" ", id);
                modeloBloqSusp.setElementAt(p1.getNombreP(), id);
            }
          }
        this.mostrar();
    }
      
    public void reactivarProceso(int id, int suspOSuspBloq)
    {
        System.out.println("REACTIVANDO...");
        proceso p1 = procesos[id];
        int mitadPag = p1.getPaginasEnSecundaria().size()/2 + ((p1.getPaginasEnSecundaria().size() % 2 == 0) ? 0 : 1);
        if(ContarEspaciMemoriPrincD() == 0)
        {
            System.out.println("La memoria principal esta lléna");
            JOptionPane.showMessageDialog(null, "Error! La memoria principal está llena.");
        }
        else
        {
            if(p1.getPaginasEnSecundaria().size() <= this.ContarEspaciMemoriPrincD())
            {
                System.out.println("Condición 1");
                for(int i=0;i<p1.getPaginasEnSecundaria().size();i++)
                {
                    MarcoMemorS[p1.getPaginasEnSecundaria().get(i).getIdMarcos()] = inicial;
                    for (int j = 0; j < MarcoMemorP.length; j++) 
                    {
                        if(MarcoMemorP[j].getNombreP().equalsIgnoreCase("vacio"))
                        {
                            MarcoMemorP[j]=p1.getPaginasEnSecundaria().get(i);
                            MarcoMemorP[j].setIdMarcos(j);
                            MarcoMemorP[j].setTipoMemoria(true);
                            p1.getPaginasEnPrincipal().add(MarcoMemorP[j]);
                            j=MarcoMemorS.length;
                        }
                    }
                }
                p1.getPaginasEnSecundaria().clear();
                if(suspOSuspBloq == 1)
                {
                    modeloSuspendido.setElementAt(" ", id);
                    modeloActivo.setElementAt(p1.getNombreP(), id);
                }
                else if(suspOSuspBloq == 2)
                {
                    modeloBloqSusp.setElementAt(" ", id);
                    modeloBloqueado.setElementAt(p1.getNombreP(), id);
                }
            }
            else if(mitadPag <= this.ContarEspaciMemoriPrincD())
            {
                pagina paginaAux[] = new pagina[mitadPag];
                if(p1.getPaginasEnSecundaria().size()%2 == 0)
                {
                    for(int i= p1.getPaginasEnSecundaria().size()-1;i>mitadPag-1;i--)
                    {
                        MarcoMemorS[p1.getPaginasEnSecundaria().get(i).getIdMarcos()] = inicial;
                        for(int j=0;j<MarcoMemorP.length;j++)
                        {
                            if(MarcoMemorP[j].getNombreP().equalsIgnoreCase("vacio"))
                            {
                                MarcoMemorP[j]=p1.getPaginasEnSecundaria().get(i);
                                MarcoMemorP[j].setIdMarcos(j);
                                MarcoMemorP[j].setTipoMemoria(true);
                                p1.getPaginasEnPrincipal().add(MarcoMemorP[j]);
                                p1.getPaginasEnSecundaria().remove(i);
                                j=MarcoMemorS.length;
                            }
                        }
                    }
                }
                else
                {
                    for(int i= p1.getPaginasEnSecundaria().size()-1;i>=mitadPag-1;i--)
                    {
                        MarcoMemorS[p1.getPaginasEnSecundaria().get(i).getIdMarcos()] = inicial;
                        for(int j=0;j<MarcoMemorP.length;j++)
                        {
                            if(MarcoMemorP[j].getNombreP().equalsIgnoreCase("vacio"))
                            {
                                MarcoMemorP[j]=p1.getPaginasEnSecundaria().get(i);
                                MarcoMemorP[j].setIdMarcos(j);
                                MarcoMemorP[j].setTipoMemoria(true);
                                p1.getPaginasEnPrincipal().add(MarcoMemorP[j]);
                                p1.getPaginasEnSecundaria().remove(i);
                                j=MarcoMemorS.length;
                            }
                        }
                    }
                }
                if(suspOSuspBloq == 1)
                {
                    modeloSuspendido.setElementAt(" ", id);
                    modeloActivo.setElementAt(p1.getNombreP(), id);
                }
                else if(suspOSuspBloq == 2)
                {
                    modeloBloqSusp.setElementAt(" ", id);
                    modeloBloqueado.setElementAt(p1.getNombreP(), id);
                }
            }
            else
            {
                System.out.println("El proceso no puede reactivarse, memoria principal no disponible");
                JOptionPane.showMessageDialog(null, "Error! El proceso no puede reactivarse, memoria principal no disponible");
            }
        }
        this.mostrar();
    }
    
    public void eliminarProceso(int id)
    { 
        proceso p1 = procesos[id];
        if(p1.getPaginasEnPrincipal().size() > 0)
        {
            for(int i=0;i<p1.getPaginasEnPrincipal().size();i++)
            {
                MarcoMemorP[p1.getPaginasEnPrincipal().get(i).getIdMarcos()] = inicial;
            }
            p1.getPaginasEnPrincipal().clear();
        }
        if(p1.getPaginasEnSecundaria().size() > 0)
        {
            for(int i=0;i<p1.getPaginasEnSecundaria().size();i++)
            {
                MarcoMemorS[p1.getPaginasEnSecundaria().get(i).getIdMarcos()] = inicial;
            }
            p1.getPaginasEnSecundaria().clear();
        }
        this.mostrar(); 
    }
    
    public void traducirDirLogica(String dirLog, int idProceso)
    {
        tamDirLog.setText(Integer.toString(dirLog.length()));
        int bytesSistema = TamanoPag*1024; 
        int bitsDesplz = Math.getExponent(bytesSistema);
        bitsDesp.setText(Integer.toString(bitsDesplz));
        String cadena = dirLog.substring(0, (dirLog.length()-bitsDesplz));
        String cadena2 = dirLog.substring((dirLog.length()-bitsDesplz), dirLog.length());
        bitsPag.setText(Integer.toString(cadena.length()));
        //Transformando a decimal la dirección lógica dada
        int numPag = Integer.parseInt(cadena, 2);
        System.out.println("NUMERO DE PAGINA: "+numPag);
        int desplazamiento = Integer.parseInt(cadena2, 2);
        traduccion(idProceso, numPag, desplazamiento, cadena2);
    }
    
    public void traduccion(int id, int numPag, int desplazamiento, String desp)
    {
        proceso p1 = procesos[id];
        boolean encontrada = false;
        for(int i=0;i<p1.getPaginasProce().length;i++)
        {
            if(p1.getPaginasProce()[i].getIdPag() == numPag)
            {
                System.out.println("La página existe en el proceso");
                for(int j=0;j<p1.getPaginasEnPrincipal().size();j++)
                {
                    if(p1.getPaginasEnPrincipal().get(j).getIdPag() == numPag)
                    {
                        int marco = p1.getPaginasEnPrincipal().get(j).getIdMarcos();
                        System.out.println("La página se encuentra en memoria principal en el marco: "+marco);
                        JOptionPane.showMessageDialog(null, "La página se encuentra cargada en memoria principal");
                        String marcoBinario = Integer.toBinaryString(marco);
                        dirFisBin.setText(marcoBinario+"-"+desp);
                        String marcoHex = Integer.toHexString(marco);
                        String despHex = Integer.toHexString(desplazamiento);
                        dirFisHex.setText(marcoHex+"-"+despHex);
                        encontrada = true;
                        break;
                    }
                }
                if(encontrada == false)
                {
                    for(int x=0;x<p1.getPaginasEnSecundaria().size();x++)
                    {
                        if(p1.getPaginasEnSecundaria().get(x).getIdPag() == numPag)
                        {
                            int marco = p1.getPaginasEnSecundaria().get(x).getIdMarcos();
                            System.out.println("La página se encuentra en memoria secundaria en el marco: "+marco);
                            JOptionPane.showMessageDialog(null, "Fallo de página!");
                            encontrada = true;
                            break;
                        }
                    }
                    break;
                }
            }
        }
        if(encontrada == false)
        {
            JOptionPane.showMessageDialog(null, "Error! La página no existe en el proceso");
            System.out.println("La página no existe en el proceso");
        }
    }
  

    public void mostrar(){
        System.out.println("==============================");
        System.out.println("Secundaria");
        for (int i = 0; i < MarcoMemorS.length ; i++) {
            System.out.println(MarcoMemorS[i].getNombreP()+"...Marco: "+ MarcoMemorS[i].getIdMarcos()+"...Pág: "+MarcoMemorS[i].getIdPag());  
        }
        System.out.println("Principal:");
        for (int i = 0; i < MarcoMemorP.length ; i++) {
            System.out.println(MarcoMemorP[i].getNombreP()+"...Marco: "+ MarcoMemorP[i].getIdMarcos()+"...Pág: "+MarcoMemorP[i].getIdPag());  
        }
    
    }

    public pagina getInicial() {
        return inicial;
    }

    public void setInicial(pagina inicial) {
        this.inicial = inicial;
    }

    public pagina[] getMarcoMemorP() {
        return MarcoMemorP;
    }

    public void setMarcoMemorP(pagina[] MarcoMemorP) {
        this.MarcoMemorP = MarcoMemorP;
    }

    public pagina[] getMarcoMemorS() {
        return MarcoMemorS;
    }

    public void setMarcoMemorS(pagina[] MarcoMemorS) {
        this.MarcoMemorS = MarcoMemorS;
    }

    public DefaultListModel getModeloActivo() {
        return modeloActivo;
    }

    public void setModeloActivo(DefaultListModel modeloActivo) {
        this.modeloActivo = modeloActivo;
    }

    public DefaultListModel getModeloBloqueado() {
        return modeloBloqueado;
    }

    public void setModeloBloqueado(DefaultListModel modeloBloqueado) {
        this.modeloBloqueado = modeloBloqueado;
    }

    public DefaultListModel getModeloSuspendido() {
        return modeloSuspendido;
    }

    public void setModeloSuspendido(DefaultListModel modeloSuspendido) {
        this.modeloSuspendido = modeloSuspendido;
    }

    public DefaultListModel getModeloBloqSusp() {
        return modeloBloqSusp;
    }

    public void setModeloBloqSusp(DefaultListModel modeloBloqSusp) {
        this.modeloBloqSusp = modeloBloqSusp;
    }
    
    public proceso getProceso() {
        return Proceso;
    }

    public void setProceso(proceso Proceso) {
        this.Proceso = Proceso;
    }

    public int getTmemoriaP() {
        return TmemoriaP;
    }

    public void setTmemoriaP(int TmemoriaP) {
        this.TmemoriaP = TmemoriaP;
    }

    public int getTmemoriaS() {
        return TmemoriaS;
    }

    public void setTmemoriaS(int TmemoriaS) {
        this.TmemoriaS = TmemoriaS;
    }

    public int getTamanoPag() {
        return TamanoPag;
    }

    public void setTamanoPag(int TamanoPag) {
        this.TamanoPag = TamanoPag;
    }

    public proceso[] getProcesos() {
        return procesos;
    }

    public void setProcesos(proceso[] procesos) {
        this.procesos = procesos;
    }

    public int getMaMemoriPUAc() {
        return MaMemoriPUAc;
    }

    public void setMaMemoriPUAc(int MaMemoriPUAc) {
        this.MaMemoriPUAc = MaMemoriPUAc;
    }

    public int getMaMemoriSUAc() {
        return MaMemoriSUAc;
    }

    public void setMaMemoriSUAc(int MaMemoriSUAc) {
        this.MaMemoriSUAc = MaMemoriSUAc;
    }
}
