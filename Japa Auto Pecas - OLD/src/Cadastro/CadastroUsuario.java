/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Cadastro;

import Conexao.AcessoBD;
import Gerenciamento.*;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Henrique
 */
public final class CadastroUsuario extends javax.swing.JFrame {

    String seta_look = "com.sun.java.swing.plaf.windows.WindowsLookAndFeel";
    AcessoBD db = new AcessoBD("japa");

    public CadastroUsuario() {
        initComponents();
        setLocationRelativeTo(null);
        lookandfeel();
        pesquisarTabela();
        setarIcone();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pa_principal = new javax.swing.JPanel();
        la_nome = new javax.swing.JLabel();
        la_primeiro = new javax.swing.JLabel();
        la_cpf = new javax.swing.JLabel();
        tf_nome = new javax.swing.JTextField();
        la_rg = new javax.swing.JLabel();
        tf_setor = new javax.swing.JTextField();
        la_end = new javax.swing.JLabel();
        la_tel = new javax.swing.JLabel();
        bo_salvar = new javax.swing.JButton();
        bo_limpar = new javax.swing.JButton();
        bo_cancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_usuario = new javax.swing.JTable();
        la_tel1 = new javax.swing.JLabel();
        bo_deletarRegistro = new javax.swing.JButton();
        bo_pesquisarNovamente = new javax.swing.JButton();
        la_rg1 = new javax.swing.JLabel();
        tf_usuario = new javax.swing.JTextField();
        cb_nivel = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        tf_senha1 = new javax.swing.JPasswordField();
        tf_senha2 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciamento de Caçambas - Cadastro de Usuários");
        setMinimumSize(new java.awt.Dimension(650, 470));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        pa_principal.setMaximumSize(new java.awt.Dimension(640, 440));
        pa_principal.setMinimumSize(new java.awt.Dimension(640, 440));
        pa_principal.setPreferredSize(new java.awt.Dimension(640, 440));

        la_nome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        la_nome.setText("Nome:");
        la_nome.setFocusable(false);

        la_primeiro.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        la_primeiro.setText("Cadastro de Usuários");

        la_cpf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        la_cpf.setText("Digite a senha:");
        la_cpf.setFocusable(false);

        tf_nome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        la_rg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        la_rg.setText("Digite sua senha novamente:");
        la_rg.setFocusable(false);

        tf_setor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        la_end.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        la_end.setText("Setor:");
        la_end.setFocusable(false);

        la_tel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        la_tel.setText("Nível de Acesso:");
        la_tel.setFocusable(false);

        bo_salvar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bo_salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Icones/accept.png"))); // NOI18N
        bo_salvar.setText("Salvar");
        bo_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bo_salvarActionPerformed(evt);
            }
        });

        bo_limpar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bo_limpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Icones/bin_closed.png"))); // NOI18N
        bo_limpar.setText("Limpar Dados");
        bo_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bo_limparActionPerformed(evt);
            }
        });

        bo_cancel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bo_cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Icones/cancel.png"))); // NOI18N
        bo_cancel.setText("Cancelar");
        bo_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bo_cancelActionPerformed(evt);
            }
        });

        ta_usuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Usuário", "Setor", "Acesso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ta_usuario);

        la_tel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        la_tel1.setText("Lista de Usuários Cadastrados:");
        la_tel1.setFocusable(false);

        bo_deletarRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Icones/delete.png"))); // NOI18N
        bo_deletarRegistro.setText("Deletar Registro Selecionado");
        bo_deletarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bo_deletarRegistroActionPerformed(evt);
            }
        });

        bo_pesquisarNovamente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Icones/SearchIcons/zoom.png"))); // NOI18N
        bo_pesquisarNovamente.setText("Pesquisar Novamente");
        bo_pesquisarNovamente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bo_pesquisarNovamenteActionPerformed(evt);
            }
        });

        la_rg1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        la_rg1.setText("Usuário:");
        la_rg1.setFocusable(false);

        tf_usuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        cb_nivel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administrativo", "Gerente" }));
        cb_nivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_nivelActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Icones/key.png"))); // NOI18N
        jButton1.setText("Resetar senha");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pa_principalLayout = new javax.swing.GroupLayout(pa_principal);
        pa_principal.setLayout(pa_principalLayout);
        pa_principalLayout.setHorizontalGroup(
            pa_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pa_principalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pa_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pa_principalLayout.createSequentialGroup()
                        .addGroup(pa_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(la_cpf)
                            .addComponent(la_nome)
                            .addComponent(la_end))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pa_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_setor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pa_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tf_nome, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                                .addComponent(tf_senha1)))
                        .addGroup(pa_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pa_principalLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(pa_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(la_rg1)
                                    .addComponent(la_rg))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(pa_principalLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(la_tel)
                                .addGap(86, 86, 86)))
                        .addGroup(pa_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_senha2, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addComponent(tf_usuario))
                        .addGap(142, 142, 142))
                    .addGroup(pa_principalLayout.createSequentialGroup()
                        .addGroup(pa_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bo_salvar)
                            .addComponent(la_tel1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pa_principalLayout.createSequentialGroup()
                        .addGroup(pa_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(la_primeiro)
                            .addGroup(pa_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(pa_principalLayout.createSequentialGroup()
                                    .addComponent(bo_limpar)
                                    .addGap(135, 135, 135)
                                    .addComponent(bo_cancel))
                                .addGroup(pa_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pa_principalLayout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(bo_deletarRegistro)
                                        .addGap(80, 80, 80)
                                        .addComponent(bo_pesquisarNovamente))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(cb_nivel, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 10, Short.MAX_VALUE))))
        );
        pa_principalLayout.setVerticalGroup(
            pa_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pa_principalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(la_primeiro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pa_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(la_nome)
                    .addComponent(tf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(la_rg1)
                    .addComponent(tf_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pa_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(la_cpf)
                    .addComponent(tf_senha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(la_rg)
                    .addComponent(tf_senha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pa_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_nivel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pa_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(la_end)
                        .addComponent(tf_setor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(la_tel)))
                .addGap(18, 18, 18)
                .addGroup(pa_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bo_salvar)
                    .addComponent(bo_limpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bo_cancel))
                .addGap(18, 18, 18)
                .addComponent(la_tel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pa_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bo_deletarRegistro)
                    .addComponent(bo_pesquisarNovamente)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pa_principal, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pa_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        fecharTela();
    }//GEN-LAST:event_formWindowClosing

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
       db.finalizaBD();
    }//GEN-LAST:event_formWindowClosed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int codigo = (int)    ta_usuario.getModel().getValueAt(ta_usuario.getSelectedRow() ,0);

        resetarSenha(codigo, "1234");
        JOptionPane.showMessageDialog(null, "A senha foi resetada para 1234\n"
            + "O usuário deverá alterar a senha no primeiro acesso.");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cb_nivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_nivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_nivelActionPerformed

    private void bo_pesquisarNovamenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bo_pesquisarNovamenteActionPerformed
        // TODO add your handling code here:

        pesquisarTabela();
    }//GEN-LAST:event_bo_pesquisarNovamenteActionPerformed

    private void bo_deletarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bo_deletarRegistroActionPerformed
        // TODO add your handling code here:
        deletarRegistro();
        pesquisarTabela();
    }//GEN-LAST:event_bo_deletarRegistroActionPerformed

    private void bo_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bo_cancelActionPerformed
        tf_nome.requestFocus();
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja sair do cadastro?", "Invicta Code", JOptionPane.INFORMATION_MESSAGE);
        if (opcao == 0) {
            chamarInicial();
            dispose();
        }
    }//GEN-LAST:event_bo_cancelActionPerformed

    private void bo_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bo_limparActionPerformed
        limparDados();
    }//GEN-LAST:event_bo_limparActionPerformed

    private void bo_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bo_salvarActionPerformed
        gravarBanco();
    }//GEN-LAST:event_bo_salvarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bo_cancel;
    private javax.swing.JButton bo_deletarRegistro;
    private javax.swing.JButton bo_limpar;
    private javax.swing.JButton bo_pesquisarNovamente;
    private javax.swing.JButton bo_salvar;
    private javax.swing.JComboBox cb_nivel;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel la_cpf;
    private javax.swing.JLabel la_end;
    private javax.swing.JLabel la_nome;
    private javax.swing.JLabel la_primeiro;
    private javax.swing.JLabel la_rg;
    private javax.swing.JLabel la_rg1;
    private javax.swing.JLabel la_tel;
    private javax.swing.JLabel la_tel1;
    private javax.swing.JPanel pa_principal;
    private javax.swing.JTable ta_usuario;
    private javax.swing.JTextField tf_nome;
    private javax.swing.JPasswordField tf_senha1;
    private javax.swing.JPasswordField tf_senha2;
    private javax.swing.JTextField tf_setor;
    private javax.swing.JTextField tf_usuario;
    // End of variables declaration//GEN-END:variables

    void chamarInicial() {
        //Chama a home do sistema
        TelaInicial ti = new TelaInicial();
        ti.setVisible(true);
    }

    void gravarBanco() {
        if (tf_senha1.getText().equals(tf_senha2.getText())) {
            String nome = tf_nome.getText();
            String user = tf_usuario.getText();
            String senha1 = tf_senha1.getText();
            String setor = tf_setor.getText();
            int acesso = cb_nivel.getSelectedIndex();
            System.out.println(acesso);



            String sql = "Insert Into usuario (usu_nome, usu_usuario, usu_senha,"
                    + "usu_setor, usu_acesso) Values ('" + nome + "', '" + user + "','" + senha1 + "',"
                    + "'" + setor + "','" + acesso + "');";
            db.updateBase(sql);
            pesquisarTabela();

        } else {
            JOptionPane.showMessageDialog(null, "As senhas não correspondem");
        }
        limparDados();
    }

    void limparDados() {
        tf_nome.setText("");
        tf_usuario.setText("");
        tf_senha1.setText("");
        tf_senha2.setText("");
        tf_setor.setText("");
        cb_nivel.setSelectedIndex(0);
        tf_nome.requestFocus();
    }

    public void lookandfeel() {
        try {
            UIManager.setLookAndFeel(seta_look);
            SwingUtilities.updateComponentTreeUI(this);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException erro) {
            JOptionPane.showMessageDialog(null, erro);
        }
    }

    void deletarRegistro() {
        int selecao = (int) ta_usuario.getModel().getValueAt(ta_usuario.getSelectedRow(), 0);
        int a = JOptionPane.showConfirmDialog(null, "Deseja deletar o registro?", "Invicta Code", JOptionPane.YES_NO_CANCEL_OPTION);
        if (a == 0) {
            String sql = "DELETE FROM usuario WHERE usu_id=" + selecao + ";";
            db.updateBase(sql);

        }

        ta_usuario.requestFocus();
    }

    void pesquisarTabela() {
        String pesquisar;

        DefaultTableModel modelo = (DefaultTableModel) ta_usuario.getModel();
        modelo.setNumRows(0);

        ta_usuario.getColumnModel().getColumn(0).setPreferredWidth(50);
        ta_usuario.getColumnModel().getColumn(1).setPreferredWidth(200);
        ta_usuario.getColumnModel().getColumn(2).setPreferredWidth(150);
        ta_usuario.getColumnModel().getColumn(3).setPreferredWidth(100);
        ta_usuario.getColumnModel().getColumn(4).setPreferredWidth(100);
//        ta_usuario.getColumnModel().getColumn(5).setPreferredWidth(100);
        //Dependendo a quantidade de campos você vai incluindo as colunas.

        try {
            ResultSet resultado = db.consultaTable("SELECT * FROM usuario ORDER BY usu_usuario");
            while (resultado.next()) //Aqui você adiciona os campos do banco de dados no jTable.
            {
                //System.out.println(resultado.getInt("ano"));
                modelo.addRow
                (new Object[]
                    {
                        resultado.getInt("usu_id"), 
                        resultado.getString("usu_nome"), 
                        resultado.getString("usu_usuario"), 
                        resultado.getString("usu_setor"), 
                        resultado.getString("usu_acesso")
                    }
                );
                
            }
            resultado.first();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao listar a tabela " + erro);
        }
    }

    void resetarSenha(int cod, String senha) {

        String sql = "UPDATE usuario SET usu_senha='"
                + senha + "' WHERE usu_id = " + cod + "";

        db.updateBase(sql);

    }

    void fecharTela() {
      int opcao = JOptionPane.showConfirmDialog
        (null, "Deseja sair do cadastro?", "Invicta Code", JOptionPane.INFORMATION_MESSAGE);
        if(opcao == 0)
        {
            chamarInicial();
            dispose();
        }
        else
        {
            chamarMesma();
        }  
    }

    void chamarMesma() {
        CadastroUsuario cu = new CadastroUsuario();
        cu.setVisible(true);
    }

    void setarIcone()
    {
        URL url = this.getClass().getResource("cubo_grande.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
    }
}
