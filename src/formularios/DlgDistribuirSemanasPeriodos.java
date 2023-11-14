/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import entidades.Macrociclo;
import interfaces.IPersistenciaFachada;
import javax.swing.JOptionPane;
import negocio.PersistenciaFachada;

/**
 *
 * @author x11_r
 */
public class DlgDistribuirSemanasPeriodos extends javax.swing.JFrame {

    IPersistenciaFachada persistencia;
    Macrociclo macrociclo;

    /**
     * Creates new form DlgDistribuirSemanasPeriodos
     */
    public DlgDistribuirSemanasPeriodos() {
        persistencia = PersistenciaFachada.getInstance();
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public DlgDistribuirSemanasPeriodos(Macrociclo macrociclo) {
        persistencia = PersistenciaFachada.getInstance();

        initComponents();
        this.macrociclo = macrociclo;
        setLocationRelativeTo(null);
        setVisible(true);
        TextFieldSemanasMacrociclo.setText(String.valueOf(macrociclo.getSemanasTotalesMacrociclo()));
        TextFieldSemanasPreparatorio.setText(String.valueOf(macrociclo.getSemanasPeriodoPreparatorio()));
        TextFieldSemanasCompetitivo.setText(String.valueOf(macrociclo.getSemanasPeriodoCompetitivo()));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        TextFieldPreparativo = new javax.swing.JTextField();
        TextFieldEtapaEspecial = new javax.swing.JTextField();
        TextFieldSemanasMacrociclo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        TextFieldPrecompetitivo = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        TextFieldCompetitivo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TextFieldSemanasPreparatorio = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        TextFieldSemanasCompetitivo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("%");

        jLabel2.setText("Semanas");

        jLabel3.setText("Periodo preparatorio:");

        jLabel4.setText("Periodo competitivo");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        TextFieldSemanasMacrociclo.setEditable(false);
        TextFieldSemanasMacrociclo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldSemanasMacrocicloActionPerformed(evt);
            }
        });

        jLabel5.setText("Semanas total del Macrociclo");

        jToggleButton1.setText("Guardar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Etapa General");

        jLabel7.setText("Etapa Especial");

        jLabel8.setText("Precompetitivo");

        jLabel9.setText("Competitivo");

        jLabel10.setText("Semanas asignadas a");

        TextFieldSemanasPreparatorio.setEditable(false);
        TextFieldSemanasPreparatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldSemanasPreparatorioActionPerformed(evt);
            }
        });

        jLabel11.setText("Semanas asignadas a ");

        TextFieldSemanasCompetitivo.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jToggleButton1)
                .addGap(163, 163, 163))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 145, Short.MAX_VALUE)
                                .addComponent(TextFieldPrecompetitivo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(TextFieldCompetitivo))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(TextFieldSemanasMacrociclo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(65, 65, 65))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(32, 32, 32)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 166, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TextFieldEtapaEspecial)
                            .addComponent(TextFieldPreparativo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextFieldSemanasPreparatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TextFieldSemanasCompetitivo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldSemanasMacrociclo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel10)
                    .addComponent(TextFieldSemanasPreparatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextFieldPreparativo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TextFieldEtapaEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel4)
                    .addComponent(TextFieldSemanasCompetitivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldPrecompetitivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldCompetitivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(35, 35, 35)
                .addComponent(jToggleButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        try {
            String preparativoText = TextFieldPreparativo.getText().trim();
            String etapaEspecialText = TextFieldEtapaEspecial.getText().trim();
            String precompetitivoText = TextFieldPrecompetitivo.getText().trim();
            String competitivoText = TextFieldCompetitivo.getText().trim();

            // Verificar que los campos no estén vacíos
            if (preparativoText.isEmpty() || etapaEspecialText.isEmpty() || precompetitivoText.isEmpty() || competitivoText.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ninguno de los campos puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                // Verificar que los campos solo contengan números válidos
                if (preparativoText.matches("\\d+") && etapaEspecialText.matches("\\d+") && precompetitivoText.matches("\\d+") && competitivoText.matches("\\d+")) {
                    int etapaGeneral = Integer.parseInt(preparativoText);
                    int etapaEspecial = Integer.parseInt(etapaEspecialText);
                    int precompetitivo = Integer.parseInt(precompetitivoText);
                    int competitivo = Integer.parseInt(competitivoText);

                    int semanasPreparatorio = Integer.parseInt(TextFieldSemanasPreparatorio.getText());
                    int semanasCompetitivo = Integer.parseInt(TextFieldSemanasCompetitivo.getText());

                    // Verificar que la suma de etapaGeneral y etapaEspecial sea igual a semanasPreparatorio
                    if (etapaGeneral + etapaEspecial == semanasPreparatorio) {
                        // Verificar que la suma de precompetitivo y competitivo sea igual a semanasCompetitivo
                        if (precompetitivo + competitivo == semanasCompetitivo) {
                            macrociclo.setSemanasPeriodoPrepEtapaGeneral(etapaGeneral);
                            macrociclo.setSemanasPeriodoPrepEtapaEspecial(etapaEspecial);
                            macrociclo.setSemanasPeriodoCompPrecompetitivo(precompetitivo);
                            macrociclo.setSemanasPeriodoCompCompetitivo(competitivo);

                            // Actualizar el objeto macrociclo en la base de datos
                            // persistencia.actualizarMacrociclo(macrociclo);
                            new DlgSeleccionarMediosFisicos(macrociclo);
                            dispose();
                        } else {
                            JOptionPane.showMessageDialog(this, "La suma de Precompetitivo y Competitivo debe ser igual a " + semanasCompetitivo + ".", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "La suma de Etapa General y Etapa Especial debe ser igual a " + semanasPreparatorio + ".", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Todos los campos deben contener valores numéricos válidos.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Todos los campos deben contener solo números enteros.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void TextFieldSemanasPreparatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldSemanasPreparatorioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldSemanasPreparatorioActionPerformed

    private void TextFieldSemanasMacrocicloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldSemanasMacrocicloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldSemanasMacrocicloActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextFieldCompetitivo;
    private javax.swing.JTextField TextFieldEtapaEspecial;
    private javax.swing.JTextField TextFieldPrecompetitivo;
    private javax.swing.JTextField TextFieldPreparativo;
    private javax.swing.JTextField TextFieldSemanasCompetitivo;
    private javax.swing.JTextField TextFieldSemanasMacrociclo;
    private javax.swing.JTextField TextFieldSemanasPreparatorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
