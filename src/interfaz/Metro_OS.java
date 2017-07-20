package interfaz;

import Code.Memoria;
import Code.pagina;
import Code.proceso;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

public class Metro_OS extends javax.swing.JFrame {

    private Memoria memoria;
    private int idProceso=0;
    private boolean activo = false, bloqueado = false, suspendido = false, suspBloq = false;
    DefaultListModel modeloActivo;
    DefaultListModel modeloBloqueado;
    DefaultListModel modeloSuspendido;
    DefaultListModel modeloBloqSusp;
    
    public Metro_OS() 
    {
        initComponents();
        modeloActivo = new DefaultListModel();
        listaActivo.setModel(modeloActivo);
        modeloBloqueado = new DefaultListModel();
        listaBloqueado.setModel(modeloBloqueado);
        modeloSuspendido = new DefaultListModel();
        listaSuspendidos.setModel(modeloSuspendido);
        modeloBloqSusp = new DefaultListModel();
        listaSuspBloq.setModel(modeloBloqSusp);
        this.traducir.setEnabled(false);
        this.reactivarProces.setEnabled(false);
        this.BloquearProc.setEnabled(false);
        this.desbloquearProc.setEnabled(false);
        this.suspenderProceso.setEnabled(false);
        this.eliminarProces.setEnabled(false);
        this.ButtonCrearProces.setEnabled(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TxtTamanoMemoriP = new javax.swing.JTextField();
        TxtTamanoMemoriS = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TxtTamanopaginas = new javax.swing.JTextField();
        ButtonInstalar = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtNombreProceso = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTamanoProceso = new javax.swing.JTextField();
        ButtonCrearProces = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        numProcCreados = new javax.swing.JLabel();
        numProcSistema = new javax.swing.JLabel();
        numMarcosDispoMemoriPrincipal = new javax.swing.JLabel();
        numMarcosDispoMemoriSecundaria = new javax.swing.JLabel();
        numMarcosDispoUtilizadosActualmentMemoriaPrincial = new javax.swing.JLabel();
        numMarcosUtilizActualMemoriSecundaria = new javax.swing.JLabel();
        MrmoriaPrincipalDisponible = new javax.swing.JLabel();
        MemoriaSecundariDispon = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        BloquearProc = new javax.swing.JButton();
        desbloquearProc = new javax.swing.JButton();
        suspenderProceso = new javax.swing.JButton();
        reactivarProces = new javax.swing.JButton();
        eliminarProces = new javax.swing.JButton();
        PanelMP = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaActivo = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaBloqueado = new javax.swing.JList();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaSuspendidos = new javax.swing.JList();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        listaSuspBloq = new javax.swing.JList();
        jLabel17 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        direccionLogica = new javax.swing.JTextField();
        traducir = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        dirFisicaBin = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        DirFisHex = new javax.swing.JTextField();
        IDdelProcesoDL = new javax.swing.JLabel();
        CAntidadPagiDL = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        tamDireccionLogica = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        bitsPag = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        bitsDesp = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Instalación", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13))); // NOI18N

        jLabel1.setText("Tamaño de la Memoria Principal:");

        TxtTamanoMemoriP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtTamanoMemoriPActionPerformed(evt);
            }
        });

        TxtTamanoMemoriS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtTamanoMemoriSActionPerformed(evt);
            }
        });

        jLabel2.setText("Tamaño de la Memoria Secundaria:");

        jLabel3.setText("Tamaño de las páginas:");

        TxtTamanopaginas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtTamanopaginasActionPerformed(evt);
            }
        });

        ButtonInstalar.setText("Instalar");
        ButtonInstalar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonInstalarActionPerformed(evt);
            }
        });

        jLabel18.setText("Kb");

        jLabel19.setText("Kb");

        jLabel20.setText("Kb");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TxtTamanopaginas, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                    .addComponent(TxtTamanoMemoriS, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TxtTamanoMemoriP, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(26, 26, 26)
                        .addComponent(ButtonInstalar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel18))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TxtTamanoMemoriP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TxtTamanoMemoriS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(ButtonInstalar))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TxtTamanopaginas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Crear Procesos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13))); // NOI18N

        jLabel4.setText("Nombre:");

        txtNombreProceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreProcesoActionPerformed(evt);
            }
        });

        jLabel5.setText("Tamaño:");

        txtTamanoProceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTamanoProcesoActionPerformed(evt);
            }
        });

        ButtonCrearProces.setText("Crear");
        ButtonCrearProces.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCrearProcesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNombreProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTamanoProceso)))
                .addContainerGap(90, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ButtonCrearProces, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNombreProceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(ButtonCrearProces)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTamanoProceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Registro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13))); // NOI18N

        jLabel6.setText("Número de procesos creados:");

        jLabel7.setText("Número de procesos en sistema:");

        jLabel8.setText("Número de marcos de página disponibles en memoria principal:");

        jLabel9.setText("Número de marcos de página disponibles en memoria secundaria:");

        jLabel10.setText("Número de marcos de página en memoria principal utilizados en la actualidad:");

        jLabel11.setText("Número de marcos de página en memoria secundaria utilizados en la actualidad:");

        jLabel12.setText("Memoria principal disponible:");

        jLabel13.setText("Memoria secundaria disponible:");

        numProcCreados.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        numProcCreados.setText("0");

        numProcSistema.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        numProcSistema.setText("0");

        numMarcosDispoMemoriPrincipal.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        numMarcosDispoMemoriPrincipal.setText("0");

        numMarcosDispoMemoriSecundaria.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        numMarcosDispoMemoriSecundaria.setText("0");

        numMarcosDispoUtilizadosActualmentMemoriaPrincial.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        numMarcosDispoUtilizadosActualmentMemoriaPrincial.setText("0");

        numMarcosUtilizActualMemoriSecundaria.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        numMarcosUtilizActualMemoriSecundaria.setText("0");

        MrmoriaPrincipalDisponible.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        MrmoriaPrincipalDisponible.setText("0");

        MemoriaSecundariDispon.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        MemoriaSecundariDispon.setText("0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(numProcCreados))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numProcSistema))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numMarcosDispoMemoriPrincipal))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numMarcosDispoMemoriSecundaria))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numMarcosDispoUtilizadosActualmentMemoriaPrincial))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numMarcosUtilizActualMemoriSecundaria))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MrmoriaPrincipalDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addGap(9, 9, 9)
                            .addComponent(MemoriaSecundariDispon))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(numProcCreados))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(numProcSistema))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(numMarcosDispoMemoriPrincipal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(numMarcosDispoMemoriSecundaria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(numMarcosDispoUtilizadosActualmentMemoriaPrincial))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(numMarcosUtilizActualMemoriSecundaria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(MrmoriaPrincipalDisponible))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(MemoriaSecundariDispon))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Estados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13))); // NOI18N

        BloquearProc.setText("Bloquear");
        BloquearProc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BloquearProcActionPerformed(evt);
            }
        });

        desbloquearProc.setText("Desbloquear");
        desbloquearProc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desbloquearProcActionPerformed(evt);
            }
        });

        suspenderProceso.setText("Suspender");
        suspenderProceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suspenderProcesoActionPerformed(evt);
            }
        });

        reactivarProces.setText("Reactivar");
        reactivarProces.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reactivarProcesActionPerformed(evt);
            }
        });

        eliminarProces.setText("Eliminar");
        eliminarProces.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarProcesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(desbloquearProc)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(suspenderProceso, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                            .addComponent(BloquearProc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(reactivarProces, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                            .addComponent(eliminarProces, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BloquearProc)
                    .addComponent(eliminarProces))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reactivarProces)
                    .addComponent(suspenderProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desbloquearProc))
        );

        PanelMP.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Memoria Principal", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13))); // NOI18N

        listaActivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaActivoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listaActivo);

        listaBloqueado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaBloqueadoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(listaBloqueado);

        jLabel14.setText("Activos");

        jLabel15.setText("Bloqueados");

        javax.swing.GroupLayout PanelMPLayout = new javax.swing.GroupLayout(PanelMP);
        PanelMP.setLayout(PanelMPLayout);
        PanelMPLayout.setHorizontalGroup(
            PanelMPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136))
        );
        PanelMPLayout.setVerticalGroup(
            PanelMPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelMPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(PanelMPLayout.createSequentialGroup()
                        .addGroup(PanelMPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Memoria Secundaria", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13))); // NOI18N

        listaSuspendidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaSuspendidosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(listaSuspendidos);

        jLabel16.setText("Suspendidos");

        listaSuspBloq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaSuspBloqMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(listaSuspBloq);

        jLabel17.setText("Bloqueados/Suspendidos");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3))
                        .addContainerGap())))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Direcciones Lógicas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13))); // NOI18N

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel21.setText("ID del proceso:");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel22.setText("Cantidad de páginas:");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel23.setText("Introduzca la dirección lógica:");

        traducir.setText("Traducir");
        traducir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                traducirMouseClicked(evt);
            }
        });
        traducir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                traducirActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel24.setText("Dirección fisica en binario:");

        dirFisicaBin.setEditable(false);

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel25.setText("Dirección fisica en hexadecimal:");

        DirFisHex.setEditable(false);

        IDdelProcesoDL.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        IDdelProcesoDL.setText("X");

        CAntidadPagiDL.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CAntidadPagiDL.setText("X");

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel28.setText("Tamaño dirección lógica:");

        tamDireccionLogica.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tamDireccionLogica.setText("X");

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel30.setText("Bits necesarios para el número de página:");

        bitsPag.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bitsPag.setText("X");

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel32.setText("Bits necesario para el desplazamiento:");

        bitsDesp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bitsDesp.setText("X");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bitsPag))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tamDireccionLogica))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel32))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bitsDesp)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(direccionLogica)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel22)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CAntidadPagiDL))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel21)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(IDdelProcesoDL)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addComponent(dirFisicaBin, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DirFisHex, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(traducir)
                        .addGap(81, 81, 81))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel25)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel24)
                .addGap(57, 57, 57))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(IDdelProcesoDL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(CAntidadPagiDL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(tamDireccionLogica))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(bitsPag))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(bitsDesp))
                .addGap(51, 51, 51)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(direccionLogica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(traducir)
                .addGap(87, 87, 87)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dirFisicaBin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DirFisHex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelMP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PanelMP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtTamanoMemoriPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtTamanoMemoriPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtTamanoMemoriPActionPerformed

    private void TxtTamanoMemoriSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtTamanoMemoriSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtTamanoMemoriSActionPerformed

    private void TxtTamanopaginasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtTamanopaginasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtTamanopaginasActionPerformed

    private void txtNombreProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreProcesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreProcesoActionPerformed

    private void txtTamanoProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTamanoProcesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTamanoProcesoActionPerformed

    private void ButtonCrearProcesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCrearProcesActionPerformed

        memoria.CrearProceso(txtNombreProceso.getText(), Integer.parseInt(txtTamanoProceso.getText()), idProceso);
        idProceso++;
        txtNombreProceso.setText("");
        txtTamanoProceso.setText("");
        numProcCreados.setText(Integer.toString(idProceso));//muestra la cantidad de procesos Creados
        numProcSistema.setText(memoria.ContarProcesosEnSistema());//cuenta los procesos en sistema y los muestra
        numMarcosDispoMemoriPrincipal.setText(Integer.toString(memoria.ContarEspaciMemoriPrincD()));
        numMarcosDispoMemoriSecundaria.setText(Integer.toString(memoria.ContarEspaciMemoriSecunD()));
        numMarcosDispoUtilizadosActualmentMemoriaPrincial.setText(Integer.toString(memoria.getMaMemoriPUAc()));
        numMarcosUtilizActualMemoriSecundaria.setText(Integer.toString(memoria.getMaMemoriSUAc()));
        //tamaño total memoria P
        int x=memoria.ContarEspaciMemoriPrincD() * memoria.getTamanoPag();
        MrmoriaPrincipalDisponible.setText(Integer.toString(x));
        //Tamano total memoria S
        int y=memoria.ContarEspaciMemoriSecunD() * memoria.getTamanoPag();
        MemoriaSecundariDispon.setText(Integer.toString(y));
    }//GEN-LAST:event_ButtonCrearProcesActionPerformed

    private void BloquearProcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BloquearProcActionPerformed
        int index = listaActivo.getSelectedIndex();
        activo = false;
        memoria.getProcesos()[index].setEstadoProc("Bloqueado");
        modeloActivo.setElementAt(" ", index);
        modeloBloqueado.setElementAt(memoria.getProcesos()[index].getNombreP(),index);
        //actualizando etiquetas
        numMarcosDispoMemoriPrincipal.setText(Integer.toString(memoria.ContarEspaciMemoriPrincD()));
        numMarcosDispoMemoriSecundaria.setText(Integer.toString(memoria.ContarEspaciMemoriSecunD()));
        numMarcosDispoUtilizadosActualmentMemoriaPrincial.setText(Integer.toString(memoria.getMaMemoriPUAc()));
        numMarcosUtilizActualMemoriSecundaria.setText(Integer.toString(memoria.getMaMemoriSUAc()));
         //tamaño total memoria P
        int x=memoria.ContarEspaciMemoriPrincD() * memoria.getTamanoPag();
        MrmoriaPrincipalDisponible.setText(Integer.toString(x));
        //Tamano total memoria S
        int y=memoria.ContarEspaciMemoriSecunD() * memoria.getTamanoPag();
        MemoriaSecundariDispon.setText(Integer.toString(y));
    }//GEN-LAST:event_BloquearProcActionPerformed

    private void desbloquearProcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desbloquearProcActionPerformed
        int index = listaBloqueado.getSelectedIndex();
        activo = false;
        bloqueado = false;
        memoria.getProcesos()[index].setEstadoProc("Activo");
        modeloBloqueado.setElementAt(" ", index);
        modeloActivo.setElementAt(memoria.getProcesos()[index].getNombreP(), index);
        //actualizando etiquetas
        numMarcosDispoMemoriPrincipal.setText(Integer.toString(memoria.ContarEspaciMemoriPrincD()));
        numMarcosDispoMemoriSecundaria.setText(Integer.toString(memoria.ContarEspaciMemoriSecunD()));
        numMarcosDispoUtilizadosActualmentMemoriaPrincial.setText(Integer.toString(memoria.getMaMemoriPUAc()));
        numMarcosUtilizActualMemoriSecundaria.setText(Integer.toString(memoria.getMaMemoriSUAc()));
         //tamaño total memoria P
        int x=memoria.ContarEspaciMemoriPrincD() * memoria.getTamanoPag();
        MrmoriaPrincipalDisponible.setText(Integer.toString(x));
        //Tamano total memoria S
        int y=memoria.ContarEspaciMemoriSecunD() * memoria.getTamanoPag();
        MemoriaSecundariDispon.setText(Integer.toString(y));
    }//GEN-LAST:event_desbloquearProcActionPerformed

    private void suspenderProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suspenderProcesoActionPerformed
        if(activo == true)
        {
            System.out.println("ACTIVO TRUE");
            int index = listaActivo.getSelectedIndex();
            memoria.suspenderProceso(index,1);
            activo = false;
        } 
        if(bloqueado == true)
        {
            System.out.println("BLOQUEADO TRUE");
            int index = listaBloqueado.getSelectedIndex();
            memoria.suspenderProceso(index,2);
            bloqueado = false;
        }
        numMarcosDispoMemoriPrincipal.setText(Integer.toString(memoria.ContarEspaciMemoriPrincD()));
        numMarcosDispoMemoriSecundaria.setText(Integer.toString(memoria.ContarEspaciMemoriSecunD()));
        numMarcosDispoUtilizadosActualmentMemoriaPrincial.setText(Integer.toString(memoria.getMaMemoriPUAc()));
        numMarcosUtilizActualMemoriSecundaria.setText(Integer.toString(memoria.getMaMemoriSUAc()));
         //tamaño total memoria P
        int x=memoria.ContarEspaciMemoriPrincD() * memoria.getTamanoPag();
        MrmoriaPrincipalDisponible.setText(Integer.toString(x));
        //Tamano total memoria S
        int y=memoria.ContarEspaciMemoriSecunD() * memoria.getTamanoPag();
        MemoriaSecundariDispon.setText(Integer.toString(y));
    }//GEN-LAST:event_suspenderProcesoActionPerformed

    private void reactivarProcesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reactivarProcesActionPerformed
        if(suspendido == true)
        {
            memoria.reactivarProceso(listaSuspendidos.getSelectedIndex(),1);
            suspendido = false;
        }
        if(suspBloq == true)
        {
            memoria.reactivarProceso(listaSuspBloq.getSelectedIndex(),2);
            suspBloq = false;
        }
        numMarcosDispoMemoriPrincipal.setText(Integer.toString(memoria.ContarEspaciMemoriPrincD()));
        numMarcosDispoMemoriSecundaria.setText(Integer.toString(memoria.ContarEspaciMemoriSecunD()));
        numMarcosDispoUtilizadosActualmentMemoriaPrincial.setText(Integer.toString(memoria.getMaMemoriPUAc()));
        numMarcosUtilizActualMemoriSecundaria.setText(Integer.toString(memoria.getMaMemoriSUAc()));
         //tamaño total memoria P
        int x=memoria.ContarEspaciMemoriPrincD() * memoria.getTamanoPag();
        MrmoriaPrincipalDisponible.setText(Integer.toString(x));
        //Tamano total memoria S
        int y=memoria.ContarEspaciMemoriSecunD() * memoria.getTamanoPag();
        MemoriaSecundariDispon.setText(Integer.toString(y));
    }//GEN-LAST:event_reactivarProcesActionPerformed

    private void eliminarProcesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarProcesActionPerformed
        if(activo == true)
        {
            memoria.eliminarProceso(listaActivo.getSelectedIndex());
            memoria.getProcesos()[listaActivo.getSelectedIndex()] = null;
            modeloActivo.setElementAt(" ", listaActivo.getSelectedIndex());
            modeloBloqueado.setElementAt(" ", listaActivo.getSelectedIndex());
            modeloSuspendido.setElementAt(" ", listaActivo.getSelectedIndex());
            modeloBloqSusp.setElementAt(" ", listaActivo.getSelectedIndex());
        }
        else if(bloqueado == true)
        {
            memoria.eliminarProceso(listaBloqueado.getSelectedIndex());
            memoria.getProcesos()[listaBloqueado.getSelectedIndex()] = null;
            modeloActivo.setElementAt(" ", listaBloqueado.getSelectedIndex());
            modeloBloqueado.setElementAt(" ", listaBloqueado.getSelectedIndex());
            modeloSuspendido.setElementAt(" ", listaBloqueado.getSelectedIndex());
            modeloBloqSusp.setElementAt(" ", listaBloqueado.getSelectedIndex());
        }
        else if(suspendido == true)
        {
            memoria.eliminarProceso(listaSuspendidos.getSelectedIndex());
            memoria.getProcesos()[listaSuspendidos.getSelectedIndex()] = null;
            modeloActivo.setElementAt(" ", listaSuspendidos.getSelectedIndex());
            modeloBloqueado.setElementAt(" ", listaSuspendidos.getSelectedIndex());
            modeloSuspendido.setElementAt(" ", listaSuspendidos.getSelectedIndex());
            modeloBloqSusp.setElementAt(" ", listaSuspendidos.getSelectedIndex());
        }
        else if(suspBloq == true)
        {
            memoria.eliminarProceso(listaSuspBloq.getSelectedIndex());
            memoria.getProcesos()[listaSuspBloq.getSelectedIndex()] = null;
            modeloActivo.setElementAt(" ", listaSuspBloq.getSelectedIndex());
            modeloBloqueado.setElementAt(" ", listaSuspBloq.getSelectedIndex());
            modeloSuspendido.setElementAt(" ", listaSuspBloq.getSelectedIndex());
            modeloBloqSusp.setElementAt(" ", listaSuspBloq.getSelectedIndex());
        }
        numProcSistema.setText(memoria.ContarProcesosEnSistema());//cuenta los procesos en sistema y los muestra
        numMarcosDispoMemoriPrincipal.setText(Integer.toString(memoria.ContarEspaciMemoriPrincD()));
        numMarcosDispoMemoriSecundaria.setText(Integer.toString(memoria.ContarEspaciMemoriSecunD()));
        numMarcosDispoUtilizadosActualmentMemoriaPrincial.setText(Integer.toString(memoria.getMaMemoriPUAc()));
        numMarcosUtilizActualMemoriSecundaria.setText(Integer.toString(memoria.getMaMemoriSUAc()));
         //tamaño total memoria P
        int x=memoria.ContarEspaciMemoriPrincD() * memoria.getTamanoPag();
        MrmoriaPrincipalDisponible.setText(Integer.toString(x));
        //Tamano total memoria S
        int y=memoria.ContarEspaciMemoriSecunD() * memoria.getTamanoPag();
        MemoriaSecundariDispon.setText(Integer.toString(y));
    }//GEN-LAST:event_eliminarProcesActionPerformed

    private void ButtonInstalarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonInstalarActionPerformed

        int TmemoriaP= Integer.parseInt(this.TxtTamanoMemoriP.getText());
        int TamanoPag = Integer.parseInt(this.TxtTamanopaginas.getText());
        int TmemoriaS= Integer.parseInt(this.TxtTamanoMemoriS.getText());
        this.memoria = new Memoria( TmemoriaP,  TmemoriaS,  TamanoPag, this.modeloActivo,this.modeloBloqueado,this.modeloSuspendido,this.modeloBloqSusp,this.tamDireccionLogica,this.bitsDesp,this.bitsPag,this.dirFisicaBin,this.DirFisHex);
        memoria.Instalacion();
        TxtTamanoMemoriP.setText("");
        TxtTamanopaginas.setText("");
        TxtTamanoMemoriS.setText("");
        ButtonInstalar.setEnabled(false);
        traducir.setEnabled(true);
        this.ButtonCrearProces.setEnabled(true);
        MemoriaSecundariDispon.setText(Integer.toString(TmemoriaS));
        MrmoriaPrincipalDisponible.setText(Integer.toString(TmemoriaP));
    }//GEN-LAST:event_ButtonInstalarActionPerformed

    private void listaActivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaActivoMouseClicked
        this.reactivarProces.setEnabled(false);
        this.BloquearProc.setEnabled(true);
        this.desbloquearProc.setEnabled(false);
        this.suspenderProceso.setEnabled(true);
        this.eliminarProces.setEnabled(true);
        activo = true;
        int index = listaActivo.getSelectedIndex();
        IDdelProcesoDL.setText(Integer.toString(index));
        CAntidadPagiDL.setText(Integer.toString(memoria.getProcesos()[index].getPaginasProce().length));
        
    }//GEN-LAST:event_listaActivoMouseClicked

    private void listaBloqueadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaBloqueadoMouseClicked
        this.reactivarProces.setEnabled(false);
        this.BloquearProc.setEnabled(false);
        this.desbloquearProc.setEnabled(true);
        this.suspenderProceso.setEnabled(true);
        this.eliminarProces.setEnabled(true);
        bloqueado = true;
        int index = listaBloqueado.getSelectedIndex();
        IDdelProcesoDL.setText(Integer.toString(index));
        CAntidadPagiDL.setText(Integer.toString(memoria.getProcesos()[index].getPaginasProce().length));
    }//GEN-LAST:event_listaBloqueadoMouseClicked

    private void listaSuspendidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaSuspendidosMouseClicked
        this.reactivarProces.setEnabled(true);
        this.BloquearProc.setEnabled(false);
        this.desbloquearProc.setEnabled(false);
        this.suspenderProceso.setEnabled(false);
        this.eliminarProces.setEnabled(true);
        suspendido = true;
        int index = listaSuspendidos.getSelectedIndex();
        IDdelProcesoDL.setText(Integer.toString(index));
        CAntidadPagiDL.setText(Integer.toString(memoria.getProcesos()[index].getPaginasProce().length));
    }//GEN-LAST:event_listaSuspendidosMouseClicked

    private void listaSuspBloqMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaSuspBloqMouseClicked
        this.reactivarProces.setEnabled(true);
        this.BloquearProc.setEnabled(false);
        this.desbloquearProc.setEnabled(false);
        this.suspenderProceso.setEnabled(false);
        this.eliminarProces.setEnabled(true);
        suspBloq = true;
        int index = listaSuspBloq.getSelectedIndex();
        IDdelProcesoDL.setText(Integer.toString(index));
        CAntidadPagiDL.setText(Integer.toString(memoria.getProcesos()[index].getPaginasProce().length));
    }//GEN-LAST:event_listaSuspBloqMouseClicked

    private void traducirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_traducirMouseClicked
        if(IDdelProcesoDL.getText() == "X" || direccionLogica.getText().isEmpty() || direccionLogica.getText().length() != 16)
        {
            System.out.println("Error! Selecciona un proceso o escribe una dirección lógica");
            JOptionPane.showMessageDialog(null, "Error! Selecciona un proceso o escribe una dirección lógica");
        } 
        else
        {
            memoria.traducirDirLogica(direccionLogica.getText(),Integer.parseInt(IDdelProcesoDL.getText()));
        }
    }//GEN-LAST:event_traducirMouseClicked

    private void traducirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_traducirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_traducirActionPerformed

    public static void main(String args[]) {
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Metro_OS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Metro_OS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Metro_OS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Metro_OS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new Metro_OS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BloquearProc;
    private javax.swing.JButton ButtonCrearProces;
    private javax.swing.JButton ButtonInstalar;
    private javax.swing.JLabel CAntidadPagiDL;
    private javax.swing.JTextField DirFisHex;
    private javax.swing.JLabel IDdelProcesoDL;
    private javax.swing.JLabel MemoriaSecundariDispon;
    private javax.swing.JLabel MrmoriaPrincipalDisponible;
    private javax.swing.JPanel PanelMP;
    private javax.swing.JTextField TxtTamanoMemoriP;
    private javax.swing.JTextField TxtTamanoMemoriS;
    private javax.swing.JTextField TxtTamanopaginas;
    private javax.swing.JLabel bitsDesp;
    private javax.swing.JLabel bitsPag;
    private javax.swing.JButton desbloquearProc;
    private javax.swing.JTextField dirFisicaBin;
    private javax.swing.JTextField direccionLogica;
    private javax.swing.JButton eliminarProces;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList listaActivo;
    private javax.swing.JList listaBloqueado;
    private javax.swing.JList listaSuspBloq;
    private javax.swing.JList listaSuspendidos;
    private javax.swing.JLabel numMarcosDispoMemoriPrincipal;
    private javax.swing.JLabel numMarcosDispoMemoriSecundaria;
    private javax.swing.JLabel numMarcosDispoUtilizadosActualmentMemoriaPrincial;
    private javax.swing.JLabel numMarcosUtilizActualMemoriSecundaria;
    private javax.swing.JLabel numProcCreados;
    private javax.swing.JLabel numProcSistema;
    private javax.swing.JButton reactivarProces;
    private javax.swing.JButton suspenderProceso;
    private javax.swing.JLabel tamDireccionLogica;
    private javax.swing.JButton traducir;
    private javax.swing.JTextField txtNombreProceso;
    private javax.swing.JTextField txtTamanoProceso;
    // End of variables declaration//GEN-END:variables
}
