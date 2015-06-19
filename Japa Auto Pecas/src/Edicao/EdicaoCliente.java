/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Edicao;

import Cadastro.CadastroCliente;
import Conexao.AcessoBD;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Henrique
 */
public final class EdicaoCliente extends javax.swing.JFrame {

    /**
     * Creates new form EdicaoPatio
     */
    public EdicaoCliente() {
        
    }
    
    AcessoBD db = new AcessoBD("japa");
    
    
    public EdicaoCliente(int codigo, String nome, String cnpj,
            String nome_fantasia, String cidade, String nome_responsavel) {
        initComponents();
        setLocationRelativeTo(null);
        setarIcone();
        tf_codigo.setText(""+codigo);
        tf_nome.setText(nome);
        tf_cnpj.setText(cnpj);
        tf_nome_fantasia.setText(nome_fantasia);
        tf_cidade.setText(cidade);
        tf_responsavel_compras.setText(nome_responsavel);
    
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
        la_codigo = new javax.swing.JLabel();
        tf_codigo = new javax.swing.JTextField();
        bo_salvar = new javax.swing.JButton();
        la_principal = new javax.swing.JLabel();
        tf_cnpj = new javax.swing.JTextField();
        la_rg = new javax.swing.JLabel();
        tf_nome_fantasia = new javax.swing.JTextField();
        la_cpf = new javax.swing.JLabel();
        bo_descartar = new javax.swing.JButton();
        la_nome1 = new javax.swing.JLabel();
        tf_nome = new javax.swing.JTextField();
        tf_responsavel_compras = new javax.swing.JTextField();
        la_telefone = new javax.swing.JLabel();
        la_la_endereco = new javax.swing.JLabel();
        tf_cidade = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edição de Clientes");
        setMinimumSize(new java.awt.Dimension(360, 235));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setMaximumSize(new java.awt.Dimension(312, 183));
        jPanel1.setMinimumSize(new java.awt.Dimension(312, 183));

        la_codigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        la_codigo.setText("Código:");

        tf_codigo.setEnabled(false);
        tf_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_codigoActionPerformed(evt);
            }
        });

        bo_salvar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bo_salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Icones/accept.png"))); // NOI18N
        bo_salvar.setText("Salvar");
        bo_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bo_salvarActionPerformed(evt);
            }
        });

        la_principal.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        la_principal.setText("Editar Cliente");

        la_rg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        la_rg.setText("CNPJ:");
        la_rg.setFocusable(false);

        la_cpf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        la_cpf.setText("Nome Fantasia:");
        la_cpf.setFocusable(false);

        bo_descartar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bo_descartar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Icones/bin_closed.png"))); // NOI18N
        bo_descartar.setText("Descartar");
        bo_descartar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bo_descartarActionPerformed(evt);
            }
        });

        la_nome1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        la_nome1.setText("Nome:");
        la_nome1.setFocusable(false);

        la_telefone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        la_telefone.setText("Nome Responsavel:");
        la_telefone.setFocusable(false);

        la_la_endereco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        la_la_endereco.setText("Cidade:");
        la_la_endereco.setFocusable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(la_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(la_cpf)
                            .addComponent(la_rg)
                            .addComponent(la_codigo)
                            .addComponent(la_nome1)
                            .addComponent(la_telefone)
                            .addComponent(la_la_endereco))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_nome)
                            .addComponent(tf_codigo)
                            .addComponent(tf_cnpj)
                            .addComponent(tf_nome_fantasia)
                            .addComponent(tf_cidade)
                            .addComponent(tf_responsavel_compras)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(bo_salvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bo_descartar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(la_principal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(la_codigo)
                    .addComponent(tf_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(la_nome1)
                    .addComponent(tf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(la_rg)
                    .addComponent(tf_cnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(la_cpf)
                    .addComponent(tf_nome_fantasia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(la_la_endereco)
                    .addComponent(tf_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(la_telefone)
                    .addComponent(tf_responsavel_compras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bo_salvar)
                    .addComponent(bo_descartar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_codigoActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try {
            chamarCliente();
        } catch (ClassNotFoundException | ParseException ex) {
            Logger.getLogger(EdicaoCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();
    }//GEN-LAST:event_formWindowClosing

    private void bo_descartarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bo_descartarActionPerformed
        try {
            chamarCliente();
        } catch (ClassNotFoundException | ParseException ex) {
            Logger.getLogger(EdicaoCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();
    }//GEN-LAST:event_bo_descartarActionPerformed

    private void bo_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bo_salvarActionPerformed
        int      codigo   = Integer.parseInt(tf_codigo.getText());
       //  Dados Empresa
        String nome              = tf_nome.getText();
        String cnpj              = tf_cnpj.getText();
        String nome_fantasia     = tf_nome_fantasia.getText();
        String cidade            = tf_cidade.getText();
        String nome_responsavel  = tf_responsavel_compras.getText();
       
        
        String sql = "UPDATE cliente SET "
                + "cli_nome='"+nome+"', "
                + "cli_cnpj='"+cnpj+"', "
                + "cli_nome_fantasia='"+nome_fantasia+"', "
                + "cli_cidade='"+cidade+"', "
                + "cli_nome_responsavel='"+nome_responsavel+"'"
                + " WHERE cli_id = "+codigo+"";

        db.updateBase(sql);
       
        dispose();
        try {
            chamarCliente();
        } catch (ClassNotFoundException | ParseException ex) {
            Logger.getLogger(EdicaoCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bo_salvarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        db.finalizaBD();
    }//GEN-LAST:event_formWindowClosed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EdicaoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EdicaoCliente().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bo_descartar;
    private javax.swing.JButton bo_salvar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel la_codigo;
    private javax.swing.JLabel la_cpf;
    private javax.swing.JLabel la_la_endereco;
    private javax.swing.JLabel la_nome1;
    private javax.swing.JLabel la_principal;
    private javax.swing.JLabel la_rg;
    private javax.swing.JLabel la_telefone;
    private javax.swing.JTextField tf_cidade;
    private javax.swing.JTextField tf_cnpj;
    private javax.swing.JTextField tf_codigo;
    private javax.swing.JTextField tf_nome;
    private javax.swing.JTextField tf_nome_fantasia;
    private javax.swing.JTextField tf_responsavel_compras;
    // End of variables declaration//GEN-END:variables
    void chamarCliente() throws ClassNotFoundException, ParseException
    {
        CadastroCliente cc = new CadastroCliente();
        cc.setVisible(true);
        dispose();
    }
    
    void setarIcone()
    {
        URL url = this.getClass().getResource("cubo_grande.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
    }
    
}
