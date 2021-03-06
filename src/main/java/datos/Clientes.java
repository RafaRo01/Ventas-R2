/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import javax.swing.JOptionPane;

/**
 *
 * @author Rafael Rosas
 */
public class Clientes extends javax.swing.JFrame {
 private final datosJDBC X;
    /**
     * Creates new form Admin
     */
    public Clientes() {
        setTitle("Clientes");
        initComponents();
        X= new datosJDBC();
        listar2();
        this.setLocationRelativeTo(null);
    }
     private void listar2(){
        tablaClientes.setModel(X.getDatos2());
    }
    
    //tablaClientes

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtClienID = new javax.swing.JTextField();
        txtClienApeMa = new javax.swing.JTextField();
        txtClienNom = new javax.swing.JTextField();
        txtClienApePa = new javax.swing.JTextField();
        txtClienDni = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtClienEdad = new javax.swing.JTextField();
        txtClienContra = new javax.swing.JTextField();
        txtClienTel = new javax.swing.JTextField();
        txtClienFechaNac = new javax.swing.JTextField();
        txtClienCorreo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtClienPaq = new javax.swing.JTextField();
        txtClienDir = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        comboBoxClientes = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();

        jRadioButton1.setText("jRadioButton1");

        jMenuItem1.setText("jMenuItem1");

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(153, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("ID:");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Ape. Pat:");

        jLabel5.setText("Ape. Mat:");

        jLabel6.setText("curp:");

        txtClienID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienIDActionPerformed(evt);
            }
        });

        txtClienApeMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienApeMaActionPerformed(evt);
            }
        });

        txtClienNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienNomActionPerformed(evt);
            }
        });

        txtClienApePa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienApePaActionPerformed(evt);
            }
        });

        txtClienDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienDniActionPerformed(evt);
            }
        });

        jLabel7.setText("Correo:");

        jLabel8.setText("Telefono");

        jLabel9.setText("Fecha Nacimiento:");

        jLabel10.setText("Edad");

        jLabel11.setText("Contrase??a:");

        txtClienEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienEdadActionPerformed(evt);
            }
        });

        txtClienContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienContraActionPerformed(evt);
            }
        });

        txtClienTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienTelActionPerformed(evt);
            }
        });

        txtClienFechaNac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienFechaNacActionPerformed(evt);
            }
        });

        txtClienCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienCorreoActionPerformed(evt);
            }
        });

        jLabel12.setText("Direcci??n:");

        jLabel13.setText("Paquete:");

        comboBoxClientes.setBackground(new java.awt.Color(204, 255, 204));
        comboBoxClientes.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        comboBoxClientes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Registrar", "Baja", "Limpiar", "Buscar", "Empleados", "Citas", "Menu" }));
        comboBoxClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxClientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(36, 36, 36)
                                .addComponent(txtClienID, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtClienNom, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtClienApeMa, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtClienApePa, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtClienDni, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtClienEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(61, 61, 61))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7)
                    .addComponent(jLabel11)
                    .addComponent(jLabel8)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtClienPaq, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtClienTel, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addComponent(txtClienContra, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addComponent(txtClienCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addComponent(txtClienFechaNac, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addComponent(txtClienDir)))
                .addGap(40, 40, 40)
                .addComponent(comboBoxClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtClienID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtClienTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtClienNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtClienFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtClienApePa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtClienCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtClienApeMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel11))
                    .addComponent(txtClienContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtClienDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel12)
                    .addComponent(txtClienDir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtClienEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtClienPaq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(0, 26, Short.MAX_VALUE))
        );

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setText("CLIENTES");

        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaClientes);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(jLabel1))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtClienIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienIDActionPerformed

    private void txtClienApeMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienApeMaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienApeMaActionPerformed

    private void txtClienNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienNomActionPerformed

    private void txtClienApePaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienApePaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienApePaActionPerformed

    private void txtClienDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienDniActionPerformed

    private void txtClienEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienEdadActionPerformed

    private void txtClienContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienContraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienContraActionPerformed

    private void txtClienTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienTelActionPerformed

    private void txtClienFechaNacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienFechaNacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienFechaNacActionPerformed

    private void txtClienCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienCorreoActionPerformed

    private void comboBoxClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxClientesActionPerformed
       //Registrar  Baja  Limpiar  Buscar Regresar
        String op;
        op = comboBoxClientes.getSelectedItem().toString();
        
        
        switch (op) {
        case "Registrar":
        Boolean guardar = true;
        String mensaje = "";   
        Integer id = Integer.parseInt(txtClienID.getText());
        String nombre = txtClienNom.getText();
        String pat = txtClienApePa.getText();
        String mat = txtClienApeMa.getText();
        String dni = txtClienDni.getText();
        String ed = txtClienEdad.getText();
        String tel =txtClienTel.getText();
        String fec = txtClienFechaNac.getText();
        String cor= txtClienCorreo.getText();
        String con= txtClienContra.getText();
        String dir = txtClienDir.getText();
        String paq= txtClienPaq.getText();
        if (nombre.length() == 0) {
            guardar = false;
            mensaje += "Escriba el nombre\n";
        }
        if (pat.length() == 0) {
            guardar = false;
            mensaje += "Escriba el apellido paterno, por favor\n";
        }
            if (guardar) {
            datosJDBC c= new datosJDBC(); 
            c.insertClien(id, nombre, pat, mat, dni, ed, tel, fec, cor, con, dir, paq);
            listar2();
          // c.insertClien(nombre, pat, mat, dni, ed, tel, fec, cor, con, dir, paq);
            //c.insertClientes(nombre, pat, mat, dni, ed, tel, fec, cor, con, dir, paq);
           //control.insertEmpleados(id, nombre, pat, mat, dni, fecha, sueldo, depa,ed,dir);
            } else {
            JOptionPane.showMessageDialog(null, mensaje);
        }

                    break;
                    
                case "Baja":
                datosJDBC sql = new datosJDBC();
                Integer cii = Integer.parseInt(txtClienID.getText());
                sql.eliminarClien(cii);
        
        listar2();
                    break;
                case "Limpiar":  
        txtClienID.setText("");
        txtClienNom.setText("");
        txtClienApePa.setText("");
        txtClienApeMa.setText("");
        txtClienDni.setText("");
        txtClienEdad.setText("");
        txtClienTel.setText("");
        txtClienFechaNac.setText("");
        txtClienCorreo.setText("");
        txtClienContra.setText("");
        txtClienDir.setText("");
        txtClienPaq.setText("");
                    break;
                    
                case "Buscar":
             datosJDBC  b = new datosJDBC();
        Integer cli = Integer.parseInt(txtClienID.getText());
        b.buscarCodclien(cli); 
                    break;
                case "Menu": 
                      AdminMain  am= new AdminMain ();
      am.setVisible(true);
      dispose();
                    break;
                    case "Empleados":
              Emp1  e= new Emp1();
      e.setVisible(true);
      dispose();
            break;
        case "Citas":
            Citas  cit= new Citas();
      cit.setVisible(true);
      dispose();
            break;
        }
    }//GEN-LAST:event_comboBoxClientesActionPerformed

    private void tablaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaClientesMouseClicked
        int seleccion = tablaClientes.rowAtPoint(evt.getPoint());
        txtClienID.setText(String.valueOf(tablaClientes.getValueAt(seleccion, 0)));
        txtClienNom.setText(String.valueOf(tablaClientes.getValueAt(seleccion, 1)));
        txtClienApePa.setText(String.valueOf(tablaClientes.getValueAt(seleccion, 2)));
        txtClienApeMa.setText(String.valueOf(tablaClientes.getValueAt(seleccion, 3)));
        txtClienDni.setText(String.valueOf(tablaClientes.getValueAt(seleccion, 4)));
        txtClienEdad.setText(String.valueOf(tablaClientes.getValueAt(seleccion, 5)));
        txtClienTel.setText(String.valueOf(tablaClientes.getValueAt(seleccion, 6)));
        txtClienFechaNac.setText(String.valueOf(tablaClientes.getValueAt(seleccion, 7)));
        txtClienCorreo.setText(String.valueOf(tablaClientes.getValueAt(seleccion, 8)));
        txtClienContra.setText(String.valueOf(tablaClientes.getValueAt(seleccion, 9)));
        txtClienDir.setText(String.valueOf(tablaClientes.getValueAt(seleccion, 10)));
        txtClienPaq.setText(String.valueOf(tablaClientes.getValueAt(seleccion, 11)));
        
    }//GEN-LAST:event_tablaClientesMouseClicked

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
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboBoxClientes;
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
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaClientes;
    private javax.swing.JTextField txtClienApeMa;
    private javax.swing.JTextField txtClienApePa;
    private javax.swing.JTextField txtClienContra;
    private javax.swing.JTextField txtClienCorreo;
    private javax.swing.JTextField txtClienDir;
    private javax.swing.JTextField txtClienDni;
    private javax.swing.JTextField txtClienEdad;
    private javax.swing.JTextField txtClienFechaNac;
    private javax.swing.JTextField txtClienID;
    private javax.swing.JTextField txtClienNom;
    private javax.swing.JTextField txtClienPaq;
    private javax.swing.JTextField txtClienTel;
    // End of variables declaration//GEN-END:variables
}
