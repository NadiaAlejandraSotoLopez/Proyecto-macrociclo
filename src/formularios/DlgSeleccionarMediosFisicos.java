/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import entidades.Macrociclo;
import entidades.MedioFisico;
import interfaces.IPersistenciaFachada;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.ListModel;
import negocio.PersistenciaFachada;

/**
 *
 * @author x11_r
 */
public class DlgSeleccionarMediosFisicos extends javax.swing.JFrame {

    IPersistenciaFachada persistencia;
    Macrociclo macrociclo;
    List<MedioFisico> mediosFisicos;
    String[] medios = new String[]{"RAG (KM)", "RAE (MIN)", "VEL.GENERAL(MTROS)", "VEL. ESPECIAL(SEG)", "RES. VEL.GEN(MTROS)", "RES.VEL.ESP(MIN)", "FUERZA. GEN(REP)", "FUERZA.ESP(REP)", "COORDINACION tecnica(REP)", "FLEXIBILIDAD(MIN)"};

    /**
     * Creates new form DlgSeleccionarMediosFisicos
     */
    public DlgSeleccionarMediosFisicos() {
        persistencia = PersistenciaFachada.getInstance();
        initComponents();

    }

    public DlgSeleccionarMediosFisicos(Macrociclo macrociclo) {
        persistencia = PersistenciaFachada.getInstance();
        this.mediosFisicos = new ArrayList<>(); // Inicializa la lista aquí

        initComponents();
        this.macrociclo = macrociclo;
        setLocationRelativeTo(null);
        setVisible(true);
        TextFieldNombreMacro.setText(macrociclo.getNombre());
        ListMediosFisicos.setListData(medios);
        ListMediosFisicos.setEnabled(false);
        TextFieldDeporte.setText(macrociclo.getDeporte());

    }

    private void guardarTodosLosMediosFisicos() {
        // Limpia la lista de mediosFisicos si ya contiene elementos
        mediosFisicos.clear();

        ListModel<String> listModel = ListMediosFisicos.getModel();

        for (int i = 0; i < listModel.getSize(); i++) {
            String medioSeleccionado = listModel.getElementAt(i);

            MedioFisico medioFisico = new MedioFisico();
            medioFisico.setNombre(medioSeleccionado);
            mediosFisicos.add(medioFisico);
        }
        macrociclo.setMediosFisicos(mediosFisicos);
        persistencia.registrarMacrociclo(macrociclo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        TextFieldNombreMacro = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        TextFieldDeporte = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListMediosFisicos = new javax.swing.JList<>();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(600, 600));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Identificador del Macrociclo");

        TextFieldNombreMacro.setEditable(false);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Medios Físicos para el deporte:");

        TextFieldDeporte.setEditable(false);
        TextFieldDeporte.setText(" ");
        TextFieldDeporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldDeporteActionPerformed(evt);
            }
        });

        ListMediosFisicos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(ListMediosFisicos);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BTN.CALCULARV.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setFocusPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 150, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TextFieldNombreMacro, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TextFieldDeporte, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(173, 173, 173))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(95, 95, 95))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TextFieldNombreMacro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldDeporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(196, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        guardarTodosLosMediosFisicos();

        new DlgCalcularVolumenMacroEtapa(macrociclo);

        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void TextFieldDeporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldDeporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldDeporteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> ListMediosFisicos;
    private javax.swing.JTextField TextFieldDeporte;
    private javax.swing.JTextField TextFieldNombreMacro;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
