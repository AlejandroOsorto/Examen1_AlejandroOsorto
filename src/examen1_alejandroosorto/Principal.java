/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_alejandroosorto;

/**
 *
 * @author Alejandro
 */
public class Principal extends javax.swing.JFrame
{

    /**
     * Creates new form Principal
     */
    public Principal()
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        PanelPrincipal = new javax.swing.JTabbedPane();
        AddDatos = new javax.swing.JPanel();
        cuadroNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cuadroEdad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        ModDatos = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelPrincipal.setBackground(new java.awt.Color(103, 107, 110));
        PanelPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        PanelPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        PanelPrincipal.setOpaque(true);

        AddDatos.setBackground(new java.awt.Color(167, 175, 180));

        cuadroNombre.setBackground(new java.awt.Color(40, 44, 47));
        cuadroNombre.setForeground(new java.awt.Color(255, 255, 255));
        cuadroNombre.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cuadroNombreActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(40, 44, 47));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre: ");
        jLabel1.setOpaque(true);

        jLabel2.setBackground(new java.awt.Color(40, 44, 47));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Edad: ");
        jLabel2.setMaximumSize(new java.awt.Dimension(50, 16));
        jLabel2.setMinimumSize(new java.awt.Dimension(50, 16));
        jLabel2.setOpaque(true);
        jLabel2.setPreferredSize(new java.awt.Dimension(50, 16));

        cuadroEdad.setBackground(new java.awt.Color(40, 44, 47));
        cuadroEdad.setForeground(new java.awt.Color(255, 255, 255));
        cuadroEdad.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cuadroEdadActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(40, 44, 47));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Sexo:");
        jLabel3.setMaximumSize(new java.awt.Dimension(50, 16));
        jLabel3.setMinimumSize(new java.awt.Dimension(50, 16));
        jLabel3.setOpaque(true);
        jLabel3.setPreferredSize(new java.awt.Dimension(50, 16));

        jComboBox1.setBackground(new java.awt.Color(40, 44, 47));
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));
        jComboBox1.setOpaque(true);

        jButton1.setBackground(new java.awt.Color(40, 44, 47));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Añadir datos");
        jButton1.setOpaque(true);

        javax.swing.GroupLayout AddDatosLayout = new javax.swing.GroupLayout(AddDatos);
        AddDatos.setLayout(AddDatosLayout);
        AddDatosLayout.setHorizontalGroup(
            AddDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AddDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddDatosLayout.createSequentialGroup()
                        .addGroup(AddDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(AddDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AddDatosLayout.createSequentialGroup()
                                .addComponent(cuadroNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(84, 203, Short.MAX_VALUE))
                            .addGroup(AddDatosLayout.createSequentialGroup()
                                .addComponent(cuadroEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(AddDatosLayout.createSequentialGroup()
                        .addGroup(AddDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AddDatosLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton1))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        AddDatosLayout.setVerticalGroup(
            AddDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddDatosLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(AddDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cuadroNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cuadroEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AddDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        PanelPrincipal.addTab("Añadir datos", AddDatos);

        javax.swing.GroupLayout ModDatosLayout = new javax.swing.GroupLayout(ModDatos);
        ModDatos.setLayout(ModDatosLayout);
        ModDatosLayout.setHorizontalGroup(
            ModDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );
        ModDatosLayout.setVerticalGroup(
            ModDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 261, Short.MAX_VALUE)
        );

        PanelPrincipal.addTab("Modificar datos", ModDatos);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 261, Short.MAX_VALUE)
        );

        PanelPrincipal.addTab("Eliminar datos", jPanel4);

        jPanel3.setBackground(new java.awt.Color(170, 131, 55));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 261, Short.MAX_VALUE)
        );

        PanelPrincipal.addTab("Estadisticas", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cuadroNombreActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cuadroNombreActionPerformed
    {//GEN-HEADEREND:event_cuadroNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cuadroNombreActionPerformed

    private void cuadroEdadActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cuadroEdadActionPerformed
    {//GEN-HEADEREND:event_cuadroEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cuadroEdadActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddDatos;
    private javax.swing.JPanel ModDatos;
    private javax.swing.JTabbedPane PanelPrincipal;
    private javax.swing.JTextField cuadroEdad;
    private javax.swing.JTextField cuadroNombre;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}