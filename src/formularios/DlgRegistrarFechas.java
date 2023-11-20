/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import com.github.lgooddatepicker.components.DatePicker;
import com.github.lgooddatepicker.components.DatePickerSettings;
import com.github.lgooddatepicker.components.DateTimePicker;
import entidades.Macrociclo;
import interfaces.IPersistenciaFachada;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import negocio.PersistenciaFachada;

/**
 *
 * @author x11_r
 */
public class DlgRegistrarFechas extends javax.swing.JFrame {

    IPersistenciaFachada persistencia;
    Macrociclo macrociclo = new Macrociclo();
    Date fechaInicio;
    Date fechaFin;

    /**
     * Creates new form DlgRegistrarFechas
     */
    public DlgRegistrarFechas() {
        persistencia = PersistenciaFachada.getInstance();
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);

    }

    public DlgRegistrarFechas(Macrociclo macrociclo) {
        this.macrociclo = macrociclo;
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);

    }

    private void calcularYMostrarSemanasRedondeadas() throws Exception {
        fechaInicio = toDate(null, dateTimeInicio);

        fechaFin = toDate(null, dateTimeFin);

        if (fechaInicio != null && fechaFin != null) {
            long diferenciaEnMilisegundos = fechaFin.getTime() - fechaInicio.getTime();
            float semanas = (float) diferenciaEnMilisegundos / (1000 * 60 * 60 * 24 * 7);

            // Redondea hacia arriba
            int semanasRedondeadasTotales = (int) Math.ceil(semanas);

            TextFieldSemanasTotales.setText(Integer.toString(semanasRedondeadasTotales));
        }
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
        dateTimeInicio = new com.github.lgooddatepicker.components.DatePicker();
        jLabel1 = new javax.swing.JLabel();
        dateTimeFin = new com.github.lgooddatepicker.components.DatePicker();
        jLabel2 = new javax.swing.JLabel();
        TextFieldSemanasTotales = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TextPorcentajePreparativo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TextFieldPreparativo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TextPorcentajeCompetitivo = new javax.swing.JTextField();
        TextFieldCompetitivo = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        btnGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        dateTimeInicio.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Fecha Inicio");
        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jLabel2.setText("Fecha Fin");
        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        TextFieldSemanasTotales.setEditable(false);
        TextFieldSemanasTotales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldSemanasTotalesActionPerformed(evt);
            }
        });

        jLabel3.setText("Semanas Totales");
        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jLabel5.setText("Periodo preparativo");
        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        TextPorcentajePreparativo.setEditable(false);
        TextPorcentajePreparativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextPorcentajePreparativoActionPerformed(evt);
            }
        });

        jLabel7.setText("%");
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel6.setText("Semanas");
        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jLabel4.setText("Periodo competitivo");
        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        TextPorcentajeCompetitivo.setEditable(false);
        TextPorcentajeCompetitivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextPorcentajeCompetitivoActionPerformed(evt);
            }
        });

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BTN.CALCULAR.SEMANAS.png"))); // NOI18N
        jToggleButton1.setBorder(null);
        jToggleButton1.setBorderPainted(false);
        jToggleButton1.setContentAreaFilled(false);
        jToggleButton1.setFocusPainted(false);
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BTN.GUARDAR.png"))); // NOI18N
        btnGuardar.setBorder(null);
        btnGuardar.setBorderPainted(false);
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.setFocusPainted(false);
        btnGuardar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BTN.GUARDAR.CURSOR.png"))); // NOI18N
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(dateTimeFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(dateTimeInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(TextPorcentajeCompetitivo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TextFieldCompetitivo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(TextPorcentajePreparativo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(TextFieldPreparativo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TextFieldSemanasTotales, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jToggleButton1))))
                        .addGap(0, 101, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel6)
                        .addGap(241, 241, 241))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(dateTimeInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(dateTimeFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(TextFieldSemanasTotales, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TextPorcentajePreparativo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldPreparativo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TextFieldCompetitivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextPorcentajeCompetitivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGuardar)
                .addContainerGap(162, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
            fechaInicio = toDate(null, dateTimeInicio);
        } catch (Exception ex) {
            Logger.getLogger(DlgRegistrarFechas.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            fechaFin = toDate(null, dateTimeFin);
        } catch (Exception ex) {
            Logger.getLogger(DlgRegistrarFechas.class.getName()).log(Level.SEVERE, null, ex);
        }

// Supongamos que fechaInicio y fechaFin son objetos Date previamente asignados.
        long diferenciaEnMilisegundos = fechaFin.getTime() - fechaInicio.getTime();
        float semanas = (float) diferenciaEnMilisegundos / (1000 * 60 * 60 * 24 * 7);

// Redondea hacia arriba
        int semanasRedondeadasTotales = (int) Math.ceil(semanas);

        String preparativoText = TextFieldPreparativo.getText().trim();
        String competitivoText = TextFieldCompetitivo.getText().trim();

// Verificar que los campos no estén vacíos
        if (preparativoText.isEmpty() || competitivoText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Los campos de periodo preparativo y periodo competitivo no pueden estar vacíos.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                // Verificar que los campos solo contengan números enteros
                int periodoPreparativo = Integer.parseInt(preparativoText);
                int periodoCompetitivo = Integer.parseInt(competitivoText);

                int sumaPeriodos = periodoPreparativo + periodoCompetitivo;

                // Verificar que la suma sea igual a semanasRedondeadasTotales
                if (sumaPeriodos == semanasRedondeadasTotales) {
                    macrociclo = new Macrociclo("Macrociclo1","Judo", fechaInicio, fechaFin, semanasRedondeadasTotales, periodoPreparativo, periodoCompetitivo);

                    new DlgDistribuirSemanasPeriodos(macrociclo);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "La suma de los periodos de preparativo y competitivo debe ser igual a " + semanasRedondeadasTotales + ".", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Los campos de periodo preparativo y periodo competitivo deben contener valores numéricos(solo números enteros).", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void TextFieldSemanasTotalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldSemanasTotalesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldSemanasTotalesActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        if (dateTimeInicio != null && dateTimeFin != null) {
            if (dateTimeInicio.getDate() != null && dateTimeFin.getDate() != null) {
                try {
                    fechaInicio = toDate(null, dateTimeInicio);
                    fechaFin = toDate(null, dateTimeFin);

                    if (fechaInicio != null && fechaFin != null && fechaInicio.before(fechaFin)) {
                        long diferenciaEnMilisegundos = fechaFin.getTime() - fechaInicio.getTime();
                        float semanas = (float) diferenciaEnMilisegundos / (1000 * 60 * 60 * 24 * 7);

                        int semanasRedondeadasTotales = (int) Math.ceil(semanas);

                        TextFieldSemanasTotales.setText(Integer.toString(semanasRedondeadasTotales));
                    } else if (fechaInicio.equals(fechaFin)) {
                        // Manejar el caso en el que las fechas de inicio y fin son iguales.
                        JOptionPane.showMessageDialog(null, "La fecha de inicio y la fecha de fin son iguales", "Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        // Manejar el caso en el que las fechas no son válidas o si la fecha de inicio es posterior a la fecha de fin.
                        JOptionPane.showMessageDialog(null, "La fecha de inicio es posterior a la fecha de fin", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (Exception ex) {
                    Logger.getLogger(DlgRegistrarFechas.class.getName()).log(Level.SEVERE, null, ex);

                    // Mostrar un mensaje de error en caso de excepción
                    JOptionPane.showMessageDialog(null, "Se produjo un error al procesar las fechas", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                // Manejar el caso en el que una o ambas fechas no han sido seleccionadas.
                JOptionPane.showMessageDialog(null, "Una o ambas fechas no han sido seleccionadas. Por favor, seleccione ambas fechas.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }


    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void TextPorcentajePreparativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextPorcentajePreparativoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextPorcentajePreparativoActionPerformed

    private void TextPorcentajeCompetitivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextPorcentajeCompetitivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextPorcentajeCompetitivoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(DlgRegistrarFechas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DlgRegistrarFechas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DlgRegistrarFechas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DlgRegistrarFechas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DlgRegistrarFechas().setVisible(true);
            }
        });
    }

    public Date toDate(DateTimePicker dateTimePicker, DatePicker datePicker) {
        ZoneId defaultZoneId = ZoneId.systemDefault();

        if (dateTimePicker != null) {
            String date = dateTimePicker.getDatePicker().getDate().format(DateTimeFormatter.ofPattern("dd-MM-uuuu"));
            String hour = dateTimePicker.timePicker.getTime().toString();

            String dateS = date + " " + hour;
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy hh:mm");
            Date fecha = null;
            try {
                fecha = formatter.parse(dateS);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            return fecha;
        } else if (datePicker != null) {
            Date fecha = Date.from(datePicker.getDate().atStartOfDay(defaultZoneId).toInstant());
            return fecha;
        }
        return null; // Devuelve null si ninguna fecha ha sido seleccionada
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextFieldCompetitivo;
    private javax.swing.JTextField TextFieldPreparativo;
    private javax.swing.JTextField TextFieldSemanasTotales;
    private javax.swing.JTextField TextPorcentajeCompetitivo;
    private javax.swing.JTextField TextPorcentajePreparativo;
    private javax.swing.JButton btnGuardar;
    private com.github.lgooddatepicker.components.DatePicker dateTimeFin;
    private com.github.lgooddatepicker.components.DatePicker dateTimeInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
