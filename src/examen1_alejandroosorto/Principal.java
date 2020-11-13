package examen1_alejandroosorto;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
/**
 *
 * @author Alejandro
 */
public class Principal extends javax.swing.JFrame
{
    ArrayList lista = new ArrayList();
    ArrayList armas = new ArrayList();
    public Principal()
    {
        initComponents();
        
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) CB_Armas.getModel();
        
        modelo.addElement("Hacha");
        modelo.addElement("Pistola");
        modelo.addElement("Bate");
        modelo.addElement("Pala");
        modelo.addElement("Puños");
        
        
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        GrupoSexo = new javax.swing.ButtonGroup();
        PanelPrincipal = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        CB_Armas = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        CT_Porcentaje = new javax.swing.JTextField();
        btn_Arma = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        AddDatos = new javax.swing.JPanel();
        cuadroNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cuadroEdad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        CB_ListaArmas = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        ModDatos = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelPrincipal.setBackground(new java.awt.Color(103, 107, 110));
        PanelPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        PanelPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        PanelPrincipal.setOpaque(true);
        PanelPrincipal.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                PanelPrincipalMouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(131, 157, 175));

        jLabel5.setBackground(new java.awt.Color(38, 42, 44));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tipo de arma: ");
        jLabel5.setOpaque(true);

        CB_Armas.setBackground(new java.awt.Color(38, 42, 44));
        CB_Armas.setForeground(new java.awt.Color(255, 255, 255));
        CB_Armas.setBorder(null);
        CB_Armas.setOpaque(true);

        jLabel6.setBackground(new java.awt.Color(38, 42, 44));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Porcentaje de daño(%): ");
        jLabel6.setOpaque(true);

        CT_Porcentaje.setBackground(new java.awt.Color(38, 42, 44));
        CT_Porcentaje.setForeground(new java.awt.Color(255, 255, 255));
        CT_Porcentaje.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        btn_Arma.setBackground(new java.awt.Color(38, 42, 44));
        btn_Arma.setForeground(new java.awt.Color(255, 255, 255));
        btn_Arma.setText("Crear Arma");
        btn_Arma.setOpaque(true);
        btn_Arma.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btn_ArmaActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Seleccione un elemento de la lista");

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Ingrese un numero");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CT_Porcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CB_Armas, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7))
                    .addComponent(btn_Arma))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_Armas, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CT_Porcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)))
                .addGap(18, 18, 18)
                .addComponent(btn_Arma)
                .addContainerGap(142, Short.MAX_VALUE))
        );

        PanelPrincipal.addTab("Nueva Arma", jPanel1);

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
        cuadroNombre.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                cuadroNombreKeyTyped(evt);
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
        cuadroEdad.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                cuadroEdadKeyTyped(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(40, 44, 47));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Sexo:");
        jLabel3.setMaximumSize(new java.awt.Dimension(50, 16));
        jLabel3.setMinimumSize(new java.awt.Dimension(50, 16));
        jLabel3.setOpaque(true);
        jLabel3.setPreferredSize(new java.awt.Dimension(50, 16));

        jButton1.setBackground(new java.awt.Color(40, 44, 47));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Añadir datos");
        jButton1.setOpaque(true);
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });

        jRadioButton1.setBackground(new java.awt.Color(40, 44, 47));
        GrupoSexo.add(jRadioButton1);
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("M");
        jRadioButton1.setOpaque(true);

        jRadioButton2.setBackground(new java.awt.Color(40, 44, 47));
        GrupoSexo.add(jRadioButton2);
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("F");
        jRadioButton2.setOpaque(true);

        jLabel4.setBackground(new java.awt.Color(40, 44, 47));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Armas");
        jLabel4.setMaximumSize(new java.awt.Dimension(50, 16));
        jLabel4.setMinimumSize(new java.awt.Dimension(50, 16));
        jLabel4.setOpaque(true);
        jLabel4.setPreferredSize(new java.awt.Dimension(50, 16));

        CB_ListaArmas.setBackground(new java.awt.Color(40, 44, 47));
        CB_ListaArmas.setOpaque(true);

        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Si no se muestran armas, cree una en la pestaña \"Nueva Arma\"");

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Seleccione un elemento de la lista");

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Ingrese un nombre");

        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Ingrese una edad");

        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Seleccione un sexo");

        javax.swing.GroupLayout AddDatosLayout = new javax.swing.GroupLayout(AddDatos);
        AddDatos.setLayout(AddDatosLayout);
        AddDatosLayout.setHorizontalGroup(
            AddDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AddDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddDatosLayout.createSequentialGroup()
                        .addGroup(AddDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AddDatosLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton2))
                            .addComponent(jButton1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(AddDatosLayout.createSequentialGroup()
                        .addGroup(AddDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, AddDatosLayout.createSequentialGroup()
                                .addGroup(AddDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(AddDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(AddDatosLayout.createSequentialGroup()
                                        .addComponent(cuadroNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel10))
                                    .addGroup(AddDatosLayout.createSequentialGroup()
                                        .addComponent(cuadroEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(AddDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel12)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, AddDatosLayout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(AddDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addGroup(AddDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel11)
                                        .addComponent(CB_ListaArmas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addContainerGap(82, Short.MAX_VALUE))))
        );
        AddDatosLayout.setVerticalGroup(
            AddDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddDatosLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(AddDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cuadroNombre)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cuadroEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AddDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(AddDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_ListaArmas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        PanelPrincipal.addTab("Añadir datos", AddDatos);

        javax.swing.GroupLayout ModDatosLayout = new javax.swing.GroupLayout(ModDatos);
        ModDatos.setLayout(ModDatosLayout);
        ModDatosLayout.setHorizontalGroup(
            ModDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 507, Short.MAX_VALUE)
        );
        ModDatosLayout.setVerticalGroup(
            ModDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        PanelPrincipal.addTab("Modificar datos", ModDatos);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 507, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        PanelPrincipal.addTab("Eliminar datos", jPanel4);

        jPanel3.setBackground(new java.awt.Color(170, 131, 55));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 507, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        PanelPrincipal.addTab("Estadisticas", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_ArmaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btn_ArmaActionPerformed
    {//GEN-HEADEREND:event_btn_ArmaActionPerformed
        String tipo = CB_Armas.getSelectedItem().toString();
        double porcentajeDaño = Double.parseDouble(CT_Porcentaje.getText());
        armas.add(new Armas(tipo, porcentajeDaño));
        
    }//GEN-LAST:event_btn_ArmaActionPerformed

    private void PanelPrincipalMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_PanelPrincipalMouseClicked
    {//GEN-HEADEREND:event_PanelPrincipalMouseClicked
        // TODO add your handling code here:
        DefaultComboBoxModel modeloArmas = (DefaultComboBoxModel) CB_ListaArmas.getModel();
        for (int i = 0; i < armas.size(); i++)
        {
            modeloArmas.addElement(armas.get(i));
            armas.remove(i);
        }
    }//GEN-LAST:event_PanelPrincipalMouseClicked

    private void cuadroEdadKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_cuadroEdadKeyTyped
    {//GEN-HEADEREND:event_cuadroEdadKeyTyped
        char check = evt.getKeyChar();
        
        if (Character.isLetter(check)) 
        {
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane, "Ingrese numeros solamente");
        }
    }//GEN-LAST:event_cuadroEdadKeyTyped

    private void cuadroNombreKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_cuadroNombreKeyTyped
    {//GEN-HEADEREND:event_cuadroNombreKeyTyped
        char check = evt.getKeyChar();
        
        if (Character.isDigit(check)) 
        {
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane, "No puede ingresar numeros");
        }
    }//GEN-LAST:event_cuadroNombreKeyTyped

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
    private javax.swing.JComboBox<String> CB_Armas;
    private javax.swing.JComboBox<String> CB_ListaArmas;
    private javax.swing.JTextField CT_Porcentaje;
    private javax.swing.ButtonGroup GrupoSexo;
    private javax.swing.JPanel ModDatos;
    private javax.swing.JTabbedPane PanelPrincipal;
    private javax.swing.JButton btn_Arma;
    private javax.swing.JTextField cuadroEdad;
    private javax.swing.JTextField cuadroNombre;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    // End of variables declaration//GEN-END:variables
}
