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
import sistema.modelo.Substituto;

/**
 *
 * @author karen
 */
public class IUCadastroSubstituto extends javax.swing.JDialog {
      private Controlador control = new Controlador();

    /**
     * Creates new form IUCadastroFuncionario
     */
    public IUCadastroSubstituto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        ContainerCadastro.setVisible(false);
       
        ComboCargaH.removeAllItems();
        ComboCargaH.addItem(Constantes.meioPeriodo);
        ComboCargaH.addItem(Constantes.integral);
        
        ComboTitulacao.addItem(Constantes.TitucaoDout);
        ComboTitulacao.addItem(Constantes.TitucaoGrad);
        ComboTitulacao.addItem(Constantes.TitucaoLivreD);
        ComboTitulacao.addItem(Constantes.TitucaoTitular);
        ComboTitulacao.addItem(Constantes.TitucaoMest);
        
        ComboNivel.removeAllItems();
        ComboNivel.addItem(Constantes.S1);
        ComboNivel.addItem(Constantes.S2);        
        
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
        ContainerCadastro = new javax.swing.JPanel();
        ComboNivel = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        ComboTitulacao = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        ComboCargaH = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        TextSalario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TextNome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TextCodigo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        ContainerCodigo = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        CampoBusca = new javax.swing.JTextField();
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
        jLabel1.setText("Cadastro de Funcionário - Substituto");

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

        ContainerCadastro.setBackground(new java.awt.Color(153, 153, 153));

        ComboNivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboNivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboNivelActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Bitstream Vera Serif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Nivel:");

        ComboTitulacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboTitulacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboTitulacaoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Bitstream Vera Serif", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Titulação:");

        ComboCargaH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboCargaH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboCargaHActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Bitstream Vera Serif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Carga Horaria:");

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
        jLabel4.setText("Código: ");

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setForeground(new java.awt.Color(153, 153, 153));
        jButton1.setText("Salvar");
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ContainerCadastroLayout = new javax.swing.GroupLayout(ContainerCadastro);
        ContainerCadastro.setLayout(ContainerCadastroLayout);
        ContainerCadastroLayout.setHorizontalGroup(
            ContainerCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContainerCadastroLayout.createSequentialGroup()
                .addContainerGap(106, Short.MAX_VALUE)
                .addGroup(ContainerCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(ContainerCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addGroup(ContainerCadastroLayout.createSequentialGroup()
                            .addGroup(ContainerCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(ContainerCadastroLayout.createSequentialGroup()
                                    .addGroup(ContainerCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel2))
                                    .addGap(50, 50, 50))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContainerCadastroLayout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                            .addGroup(ContainerCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TextNome, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TextCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TextSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ComboCargaH, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ComboTitulacao, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ComboNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(71, 71, 71))
        );
        ContainerCadastroLayout.setVerticalGroup(
            ContainerCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContainerCadastroLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(ContainerCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TextCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(ContainerCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(ContainerCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(TextSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(ContainerCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ComboCargaH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(30, 30, 30)
                .addGroup(ContainerCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboTitulacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(35, 35, 35)
                .addGroup(ContainerCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(29, 29, 29)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        getContentPane().add(ContainerCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 81, 640, 460));

        ContainerCodigo.setBackground(new java.awt.Color(102, 102, 102));

        jLabel8.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("Insira o código do departamento  : ");

        CampoBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoBuscaActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setForeground(new java.awt.Color(153, 153, 153));
        jButton2.setText("Procurar");
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ContainerCodigoLayout = new javax.swing.GroupLayout(ContainerCodigo);
        ContainerCodigo.setLayout(ContainerCodigoLayout);
        ContainerCodigoLayout.setHorizontalGroup(
            ContainerCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContainerCodigoLayout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(63, 63, 63)
                .addGroup(ContainerCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                    .addComponent(CampoBusca))
                .addGap(83, 83, 83))
        );
        ContainerCodigoLayout.setVerticalGroup(
            ContainerCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerCodigoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ContainerCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(CampoBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jButton2)
                .addContainerGap(347, Short.MAX_VALUE))
        );

        getContentPane().add(ContainerCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 640, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboCargaHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboCargaHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboCargaHActionPerformed

    private void ComboNivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboNivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboNivelActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String codigo = TextCodigo.getText();
        String nome = TextNome.getText();
        Double salario = (Double.parseDouble(TextSalario.getText()));
        int cargaH =   (int) ComboCargaH.getSelectedItem();
        String nivel = (String) ComboNivel.getSelectedItem();
        String titulacao = (String) ComboTitulacao.getSelectedItem();
        String codDep = CampoBusca.getText();
        
        control.addDocenteSub(codigo, nome, salario, titulacao, nivel, cargaH, codDep);
        jButton1.setEnabled(false);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TextCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextCodigoActionPerformed

    private void TextCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextCodigoFocusLost
        // TODO add your handling code here:
       String codigo = TextCodigo.getText();
       Substituto e = (Substituto) control.buscaFuncionario(codigo);
       if(e!=null){
            TextNome.setText(e.getNome());
            TextSalario.setText(Double.toString(e.calcularSalario()));
            ComboCargaH.setSelectedItem(e.getCargaHoraria());
            ComboTitulacao.setSelectedItem(e.getTitulacao());
            ComboNivel.setSelectedItem(e.getNivel());
            jButton1.setEnabled(false);
       }else{
            TextNome.setText("");
            TextSalario.setText("");
            ComboCargaH.setSelectedItem("");
            jButton1.setEnabled(true);

       }

    }//GEN-LAST:event_TextCodigoFocusLost

    private void TextSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextSalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextSalarioActionPerformed

    private void ComboTitulacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboTitulacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboTitulacaoActionPerformed

    private void CampoBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoBuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoBuscaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
           Departamento d = control.buscaDepartamentoD(CampoBusca.getText());
        if(d!=null){
             ContainerCadastro.setVisible(true);
             ContainerCodigo.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(null, "Departamento não encontrado");
        }        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(IUCadastroSubstituto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IUCadastroSubstituto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IUCadastroSubstituto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IUCadastroSubstituto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                IUCadastroSubstituto dialog = new IUCadastroSubstituto(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField CampoBusca;
    private javax.swing.JComboBox<String> ComboCargaH;
    private javax.swing.JComboBox<String> ComboNivel;
    private javax.swing.JComboBox<String> ComboTitulacao;
    private javax.swing.JPanel ContainerCadastro;
    private javax.swing.JPanel ContainerCodigo;
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}