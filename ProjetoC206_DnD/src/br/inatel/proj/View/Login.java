/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.proj.View;

import br.inatel.proj.Controller.ArquivoLogin;
import br.inatel.proj.Controller.ArquivoMesas;
import br.inatel.proj.Model.DungeonMaster;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author burns
 */
public class Login extends javax.swing.JFrame {

    private final ArquivoLogin arquivo = new ArquivoLogin();
    private ArrayList<DungeonMaster> dms = new ArrayList();

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        getRootPane().setDefaultButton(btn_login);

        dms = arquivo.ler();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new javax.swing.JPanel();
        lbl_loginTitle = new javax.swing.JLabel();
        lbl_loginName = new javax.swing.JLabel();
        lbl_loginSenha = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        btn_novoUser = new javax.swing.JButton();
        btn_login = new javax.swing.JButton();
        txt_senha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N

        lbl_loginTitle.setFont(new java.awt.Font("Sylfaen", 0, 36)); // NOI18N
        lbl_loginTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_loginTitle.setText("login");

        lbl_loginName.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        lbl_loginName.setText("Usuario");

        lbl_loginSenha.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        lbl_loginSenha.setText("Senha");

        btn_novoUser.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        btn_novoUser.setText("Novo Usuario");
        btn_novoUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoUserActionPerformed(evt);
            }
        });

        btn_login.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        btn_login.setText("Entrar");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(lbl_loginTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_loginName)
                            .addComponent(lbl_loginSenha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                            .addComponent(txt_senha))))
                .addContainerGap(95, Short.MAX_VALUE))
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addComponent(btn_novoUser)
                .addGap(16, 16, 16))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(lbl_loginTitle)
                .addGap(39, 39, 39)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_loginName)
                    .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_loginSenha)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(txt_senha)
                        .addGap(1, 1, 1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_login)
                    .addComponent(btn_novoUser))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_novoUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoUserActionPerformed
        novoUsuario();
    }//GEN-LAST:event_btn_novoUserActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        entrar();
    }//GEN-LAST:event_btn_loginActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_login;
    private javax.swing.JButton btn_novoUser;
    private javax.swing.JLabel lbl_loginName;
    private javax.swing.JLabel lbl_loginSenha;
    private javax.swing.JLabel lbl_loginTitle;
    private javax.swing.JPanel panel1;
    private javax.swing.JPasswordField txt_senha;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables

    private void limparCampos() {
        this.txt_usuario.setText("");
        this.txt_senha.setText("");
    }

    private void novoUsuario() {
        Cadastro cadastro = new Cadastro();
        cadastro.setVisible(true);
        this.dispose();
    }

    private void entrar() {
        DungeonMaster dm = new DungeonMaster();//cria uma variavel dm aux 
        String aux1 = txt_usuario.getText();
        String aux2 = txt_senha.getText();

        dm.setUserName(aux1);
        dm.setPassword(aux2);
        boolean flag = true;//inicializa flag com um valor que ativa o if(1),causando um erro

        if (checkInputs(dm)) {//encontrado um objeto user com senha e usuario confirmados

            ArquivoMesas.autor = dm.getUserName();
            TelaMesas telaPrincipal = new TelaMesas();    // Cria o menu
            telaPrincipal.setVisible(true);     // Chama a tela de menu
            this.dispose();
            flag = false;

        }

        if (flag) {//(1)
            // Caso esteja errado emite um Erro
            String msg = "Usuario e/ou senha inválidos!";
            String title = "Erro ao efetuar login!";
            int msgType = JOptionPane.ERROR_MESSAGE;
            JOptionPane.showMessageDialog(rootPane, msg, title, msgType);

            // Limpa os campos de texto
            limparCampos();
        }
    }

    private boolean checkInputs(DungeonMaster dm) {

        for (DungeonMaster dm1 : dms) {
            if (dm1.getUserName().equals(dm.getUserName()) && dm1.getPassword().equals(dm.getPassword())) {
                return true;
            }

        }

        return false;
    }

}
