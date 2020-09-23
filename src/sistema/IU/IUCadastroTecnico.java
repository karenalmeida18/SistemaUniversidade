/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.IU;

import javax.swing.JOptionPane;
import sistema.controlador.Controlador;
import sistema.modelo.Constantes;
import sistema.modelo.Departamento;
import sistema.modelo.Funcionario;
import sistema.modelo.Tecnico;

/**
 *
 * @author karen
 */
public class IUCadastroTecnico extends javax.swing.JDialog {
            private Controlador control = new Controlador();

    /**
     * Creates new form IUCadastroFuncionario
     */
    public IUCadastroTecnico(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
       
        CadastroContainer.setVisible(false);

        ComboFunçao.removeAllItems();
        ComboFunçao.addItem("Assessor");
        ComboFunçao.addItem("Laboratóŕio");
        ComboFunçao.addItem("Secretário");
        
        ComboNivel.removeAllItems();
        ComboNivel.addItem(Constantes.T1);
        ComboNivel.addItem(Constantes.T2);
        
        
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
        jLabel1 = new javax.swing.JLabel();
        CadastroContainer = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        ComboNivel = new javax.swing.JComboBox<>();
        ComboFunçao = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        TextSalario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TextNome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TextCodigo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CadastroCodigo = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        CampoCodigo = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setTitle("Cadastro de Técnico");
        setMinimumSize(new java.awt.Dimension(400, 410));
        setModal(true);
        setSize(new java.awt.Dimension(400, 410));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Nimbus Sans Narrow", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Funcionário - Técnico");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(141, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(146, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 80));

        CadastroContainer.setBackground(new java.awt.Color(153, 153, 153));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setText("Salvar");
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ComboNivel.setBackground(new java.awt.Color(153, 153, 153));
        ComboNivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboNivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboNivelActionPerformed(evt);
            }
        });

        ComboFunçao.setBackground(new java.awt.Color(153, 153, 153));
        ComboFunçao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboFunçao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboFunçaoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Bitstream Vera Serif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Função :");

        TextSalario.setBackground(new java.awt.Color(153, 153, 153));
        TextSalario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        TextSalario.setForeground(new java.awt.Color(0, 0, 0));
        TextSalario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextSalarioActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Bitstream Vera Serif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Salário: ");

        TextNome.setBackground(new java.awt.Color(153, 153, 153));
        TextNome.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        TextNome.setForeground(new java.awt.Color(0, 0, 0));
        TextNome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextNomeActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Bitstream Vera Serif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Nome:");

        TextCodigo.setBackground(new java.awt.Color(153, 153, 153));
        TextCodigo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        TextCodigo.setForeground(new java.awt.Color(0, 0, 0));
        TextCodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextCodigo.setToolTipText("");
        TextCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextCodigoFocusLost(evt);
            }
        });
        TextCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextCodigoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Bitstream Vera Serif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Código : ");

        jLabel2.setFont(new java.awt.Font("Bitstream Vera Serif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Nivel :");

        javax.swing.GroupLayout CadastroContainerLayout = new javax.swing.GroupLayout(CadastroContainer);
        CadastroContainer.setLayout(CadastroContainerLayout);
        CadastroContainerLayout.setHorizontalGroup(
            CadastroContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CadastroContainerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(CadastroContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addGroup(CadastroContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel6)
                        .addComponent(jLabel5)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(CadastroContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ComboFunçao, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextNome, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(92, 92, 92))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CadastroContainerLayout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );
        CadastroContainerLayout.setVerticalGroup(
            CadastroContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CadastroContainerLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(CadastroContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(CadastroContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(44, 44, 44)
                .addGroup(CadastroContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TextSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(47, 47, 47)
                .addGroup(CadastroContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(CadastroContainerLayout.createSequentialGroup()
                        .addComponent(ComboFunçao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addGroup(CadastroContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ComboNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addGap(41, 41, 41)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        getContentPane().add(CadastroContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 640, 450));

        CadastroCodigo.setBackground(new java.awt.Color(102, 102, 102));

        jLabel7.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Insira o código do departamento : ");

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setText("Procurar");
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CadastroCodigoLayout = new javax.swing.GroupLayout(CadastroCodigo);
        CadastroCodigo.setLayout(CadastroCodigoLayout);
        CadastroCodigoLayout.setHorizontalGroup(
            CadastroCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CadastroCodigoLayout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(58, 58, 58)
                .addGroup(CadastroCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                    .addComponent(CampoCodigo))
                .addGap(56, 56, 56))
        );
        CadastroCodigoLayout.setVerticalGroup(
            CadastroCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastroCodigoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CadastroCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(CampoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(376, Short.MAX_VALUE))
        );

        getContentPane().add(CadastroCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 84, 640, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboFunçaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboFunçaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboFunçaoActionPerformed

    private void ComboNivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboNivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboNivelActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String codigo = TextCodigo.getText();
        String nome = TextNome.getText();
        String codDep = CampoCodigo.getText();
        Double salario = (Double.parseDouble(TextSalario.getText()));
        String funcao = (String) ComboFunçao.getSelectedItem();
        String nivel = (String) ComboNivel.getSelectedItem();
        
        control.addTecnico(funcao, codigo, nome, salario, nivel, codDep);
        jButton1.setEnabled(false);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TextCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextCodigoActionPerformed

    private void TextCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextCodigoFocusLost
        // TODO add your handling code here:
       String codigo = TextCodigo.getText();
       Tecnico t = (Tecnico) control.buscaFuncionario(codigo);
       if(t!=null){
            TextNome.setText(t.getNome());
            TextSalario.setText(Double.toString(t.calcularSalario()));
            ComboFunçao.setSelectedItem(t.getFuncao());
            jButton1.setEnabled(false);
       }else{
            TextNome.setText("");
            TextSalario.setText("");
            ComboFunçao.setSelectedItem("");
            jButton1.setEnabled(true);

       }

    }//GEN-LAST:event_TextCodigoFocusLost

    private void TextSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextSalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextSalarioActionPerformed

    private void TextNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextNomeActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         // TODO add your handling code here:
        Departamento d = control.buscaDepartamentoD(CampoCodigo.getText());
        if(d!=null){
             CadastroContainer.setVisible(true);
             CadastroCodigo.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(null, "Departamento não encontrado");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(IUCadastroTecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IUCadastroTecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IUCadastroTecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IUCadastroTecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                IUCadastroTecnico dialog = new IUCadastroTecnico(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CadastroCodigo;
    private javax.swing.JPanel CadastroContainer;
    private javax.swing.JTextField CampoCodigo;
    private javax.swing.JComboBox<String> ComboFunçao;
    private javax.swing.JComboBox<String> ComboNivel;
    private javax.swing.JTextField TextCodigo;
    private javax.swing.JTextField TextNome;
    private javax.swing.JTextField TextSalario;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
