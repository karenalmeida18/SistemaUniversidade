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
import sistema.modelo.Efetivo;
import sistema.modelo.Funcionario;

/**
 *
 * @author karen
 */
public class IUCadastroEfetivo extends javax.swing.JDialog {
    private Controlador control;

    /**
     * Creates new form IUCadastroFuncionario
     */
    public IUCadastroEfetivo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        control = new Controlador();

        CadastroContainer.setVisible(false);
        ComboArea.removeAllItems();
        ComboArea.addItem(Constantes.Bio);
        ComboArea.addItem(Constantes.Exatas);
        ComboArea.addItem(Constantes.Humanas);
        ComboArea.addItem(Constantes.Saude);
        
        ComboTitulacao.removeAllItems();
        ComboTitulacao.addItem(Constantes.TitucaoDout);
        ComboTitulacao.addItem(Constantes.TitucaoGrad);
        ComboTitulacao.addItem(Constantes.TitucaoLivreD);
        ComboTitulacao.addItem(Constantes.TitucaoTitular);
        ComboTitulacao.addItem(Constantes.TitucaoMest);
        
        ComboNivel.removeAllItems();
        ComboNivel.addItem(Constantes.D1);
        ComboNivel.addItem(Constantes.D2);
        ComboNivel.addItem(Constantes.D3);
        
        
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
        ContainerCodigo = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        CampoBusca = new javax.swing.JTextField();
        CadastroContainer = new javax.swing.JPanel();
        ComboNivel = new javax.swing.JComboBox<>();
        ComboTitulacao = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ComboArea = new javax.swing.JComboBox<>();
        TextSalario = new javax.swing.JTextField();
        TextNome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TextCodigo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setTitle("Cadastro de Técnico");
        setMinimumSize(new java.awt.Dimension(400, 410));
        setModal(true);
        setSize(new java.awt.Dimension(400, 410));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setFont(new java.awt.Font("Nimbus Sans Narrow", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Funcionário - Efetivo");

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
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 70));

        ContainerCodigo.setBackground(new java.awt.Color(102, 102, 102));
        ContainerCodigo.setForeground(new java.awt.Color(102, 102, 102));

        jLabel8.setFont(new java.awt.Font("Bitstream Vera Serif", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("Insira o código do departamento : ");

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setForeground(new java.awt.Color(153, 153, 153));
        jButton2.setText("Procurar");
        jButton2.setBorder(null);
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
                .addGap(64, 64, 64)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(ContainerCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                    .addComponent(CampoBusca))
                .addGap(62, 62, 62))
        );
        ContainerCodigoLayout.setVerticalGroup(
            ContainerCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerCodigoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(ContainerCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(CampoBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(ContainerCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 71, 640, 460));

        CadastroContainer.setBackground(new java.awt.Color(153, 153, 153));

        ComboNivel.setBackground(new java.awt.Color(102, 102, 102));
        ComboNivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboNivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboNivelActionPerformed(evt);
            }
        });

        ComboTitulacao.setBackground(new java.awt.Color(102, 102, 102));
        ComboTitulacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboTitulacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboTitulacaoActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setForeground(new java.awt.Color(153, 153, 153));
        jButton1.setText("Salvar");
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Bitstream Vera Serif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Nivel:");

        jLabel7.setFont(new java.awt.Font("Bitstream Vera Serif", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Titulação:");

        jLabel3.setFont(new java.awt.Font("Bitstream Vera Serif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Area:");

        ComboArea.setBackground(new java.awt.Color(102, 102, 102));
        ComboArea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboAreaActionPerformed(evt);
            }
        });

        TextSalario.setBackground(new java.awt.Color(153, 153, 153));
        TextSalario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        TextSalario.setForeground(new java.awt.Color(0, 0, 0));
        TextSalario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextSalario.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        TextSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextSalarioActionPerformed(evt);
            }
        });

        TextNome.setBackground(new java.awt.Color(153, 153, 153));
        TextNome.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        TextNome.setForeground(new java.awt.Color(0, 0, 0));
        TextNome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextNome.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setFont(new java.awt.Font("Bitstream Vera Serif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Nome:");

        TextCodigo.setBackground(new java.awt.Color(153, 153, 153));
        TextCodigo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        TextCodigo.setForeground(new java.awt.Color(0, 0, 0));
        TextCodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextCodigo.setToolTipText("");
        TextCodigo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
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

        jLabel4.setFont(new java.awt.Font("Bitstream Vera Sans", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Código: ");

        jLabel6.setFont(new java.awt.Font("Bitstream Vera Serif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Salário: ");

        javax.swing.GroupLayout CadastroContainerLayout = new javax.swing.GroupLayout(CadastroContainer);
        CadastroContainer.setLayout(CadastroContainerLayout);
        CadastroContainerLayout.setHorizontalGroup(
            CadastroContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastroContainerLayout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addGroup(CadastroContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(CadastroContainerLayout.createSequentialGroup()
                        .addGroup(CadastroContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7)
                            .addComponent(jLabel2))
                        .addGap(29, 29, 29)
                        .addGroup(CadastroContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ComboArea, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ComboTitulacao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TextNome)
                            .addComponent(TextSalario)
                            .addGroup(CadastroContainerLayout.createSequentialGroup()
                                .addComponent(TextCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(ComboNivel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(165, 165, 165))
        );
        CadastroContainerLayout.setVerticalGroup(
            CadastroContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CadastroContainerLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(CadastroContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(TextCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(CadastroContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TextNome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(CadastroContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TextSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(CadastroContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ComboArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(34, 34, 34)
                .addGroup(CadastroContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboTitulacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(32, 32, 32)
                .addGroup(CadastroContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        getContentPane().add(CadastroContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 45, 640, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String codigo = TextCodigo.getText();
        String nome = TextNome.getText();
        Double salario = (Double.parseDouble(TextSalario.getText()));
        String area = (String) ComboArea.getSelectedItem();
        String nivel = (String) ComboNivel.getSelectedItem();
        String titulacao = (String) ComboTitulacao.getSelectedItem();
        String codDep = CampoBusca.getText();

        control.addDocenteEfetivo(codigo, nome, salario,titulacao, nivel, area, codDep);
        jButton1.setEnabled(false);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void ComboTitulacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboTitulacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboTitulacaoActionPerformed

    private void ComboNivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboNivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboNivelActionPerformed

    private void ComboAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboAreaActionPerformed

    private void TextSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextSalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextSalarioActionPerformed

    private void TextCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextCodigoActionPerformed

    private void TextCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextCodigoFocusLost
        // TODO add your handling code here:
        String codigo = TextCodigo.getText();
        Efetivo e = null;
        Funcionario f =  control.buscaFuncionario(codigo);
        if(f instanceof Efetivo) e = (Efetivo) f;
        if(e!=null){
            TextNome.setText(e.getNome());
            TextSalario.setText(Double.toString(e.calcularSalario()));
            ComboArea.setSelectedItem(e.getArea());
            ComboTitulacao.setSelectedItem(e.getTitulacao());
            ComboNivel.setSelectedItem(e.getNivel());
            jButton1.setEnabled(false);
        }else{
            TextNome.setText("");
            TextSalario.setText("");
            ComboArea.setSelectedItem("");
            jButton1.setEnabled(true);

        }
    }//GEN-LAST:event_TextCodigoFocusLost

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Departamento d = control.buscaDepartamentoD(CampoBusca.getText());
        if(d!=null){
             CadastroContainer.setVisible(true);
             ContainerCodigo.setVisible(false);
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
            java.util.logging.Logger.getLogger(IUCadastroEfetivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IUCadastroEfetivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IUCadastroEfetivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IUCadastroEfetivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                IUCadastroEfetivo dialog = new IUCadastroEfetivo(new javax.swing.JFrame(), true);
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
    private javax.swing.JPanel CadastroContainer;
    private javax.swing.JTextField CampoBusca;
    private javax.swing.JComboBox<String> ComboArea;
    private javax.swing.JComboBox<String> ComboNivel;
    private javax.swing.JComboBox<String> ComboTitulacao;
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
