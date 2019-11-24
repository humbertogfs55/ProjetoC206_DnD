/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.proj.View;

import br.inatel.proj.Controller.ArquivoMesas;
import br.inatel.proj.Model.Mesa;
import java.util.ArrayList;
import sun.security.jgss.spi.MechanismFactory;

/**
 *
 * @author burns
 */
public class TelaControleMesa extends javax.swing.JFrame {

    private ArquivoMesas arquivo;

    private Mesa mesa = new Mesa();//variavel mesa herdada da tela tela mesas
    private ArrayList<Mesa> mesas = new ArrayList();
    private static String userName;
    private static String mesaName;
    

    /**
     * Creates new form TelaControleMesa
     */
    public TelaControleMesa(String userName,String mesaName) {
        initComponents();
        this.setLocationRelativeTo(null);
        
        TelaControleMesa.userName = userName;
        TelaControleMesa.mesaName = mesaName;
        

        arquivo = new ArquivoMesas(TelaControleMesa.userName);
        mesas = arquivo.ler();
        findTable(mesaName);
       
        

        lbl_charcounter1.setText(this.mesa.getCharacters().size() + "");
        lbl_monstercounter.setText(this.mesa.getMonstros().size() + "");
        lbl_npcounter.setText(this.mesa.getNpcs().size() + "");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp_mesaph = new javax.swing.JPanel();
        btn_personagens = new javax.swing.JButton();
        btn_monstros = new javax.swing.JButton();
        btn_npcs = new javax.swing.JButton();
        btn_combate = new javax.swing.JButton();
        lbl_imagem = new javax.swing.JLabel();
        lbl_npcounter = new javax.swing.JLabel();
        lbl_charcounter1 = new javax.swing.JLabel();
        lbl_monstercounter = new javax.swing.JLabel();
        btn_voltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jp_mesaph.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "mesa_placeholder", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N

        btn_personagens.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_personagens.setText("Personagens");
        btn_personagens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_personagensActionPerformed(evt);
            }
        });

        btn_monstros.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_monstros.setText("Monstros");
        btn_monstros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_monstrosActionPerformed(evt);
            }
        });

        btn_npcs.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_npcs.setText("Npcs");
        btn_npcs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_npcsActionPerformed(evt);
            }
        });

        btn_combate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_combate.setText("Combate");
        btn_combate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_combateActionPerformed(evt);
            }
        });

        lbl_imagem.setText("imagem placeholder");

        lbl_npcounter.setText("npc counter");

        lbl_charcounter1.setText("player counter");

        lbl_monstercounter.setText("monster counter");

        btn_voltar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_voltar.setText("Voltar");
        btn_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_mesaphLayout = new javax.swing.GroupLayout(jp_mesaph);
        jp_mesaph.setLayout(jp_mesaphLayout);
        jp_mesaphLayout.setHorizontalGroup(
            jp_mesaphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_mesaphLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_mesaphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_mesaphLayout.createSequentialGroup()
                        .addGroup(jp_mesaphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_npcs)
                            .addComponent(btn_monstros))
                        .addGap(47, 47, 47)
                        .addGroup(jp_mesaphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_monstercounter)
                            .addComponent(lbl_npcounter)
                            .addGroup(jp_mesaphLayout.createSequentialGroup()
                                .addComponent(lbl_charcounter1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                .addComponent(lbl_imagem))))
                    .addGroup(jp_mesaphLayout.createSequentialGroup()
                        .addGroup(jp_mesaphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_personagens)
                            .addComponent(btn_combate)
                            .addComponent(btn_voltar))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jp_mesaphLayout.setVerticalGroup(
            jp_mesaphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_mesaphLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_mesaphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_mesaphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_personagens)
                        .addComponent(lbl_charcounter1))
                    .addComponent(lbl_imagem))
                .addGap(11, 11, 11)
                .addGroup(jp_mesaphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_npcs)
                    .addComponent(lbl_npcounter))
                .addGap(11, 11, 11)
                .addGroup(jp_mesaphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_monstros)
                    .addComponent(lbl_monstercounter))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_combate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(btn_voltar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jp_mesaph, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jp_mesaph, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_personagensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_personagensActionPerformed
        callChar();
    }//GEN-LAST:event_btn_personagensActionPerformed

    private void btn_npcsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_npcsActionPerformed
        callNpc();
    }//GEN-LAST:event_btn_npcsActionPerformed

    private void btn_monstrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_monstrosActionPerformed
        callMonster();
    }//GEN-LAST:event_btn_monstrosActionPerformed

    private void btn_combateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_combateActionPerformed
        callCombat();
    }//GEN-LAST:event_btn_combateActionPerformed

    private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed
        voltat();
    }//GEN-LAST:event_btn_voltarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaControleMesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaControleMesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaControleMesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaControleMesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaControleMesa(userName,mesaName).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_combate;
    private javax.swing.JButton btn_monstros;
    private javax.swing.JButton btn_npcs;
    private javax.swing.JButton btn_personagens;
    private javax.swing.JButton btn_voltar;
    private javax.swing.JPanel jp_mesaph;
    private javax.swing.JLabel lbl_charcounter1;
    private javax.swing.JLabel lbl_imagem;
    private javax.swing.JLabel lbl_monstercounter;
    private javax.swing.JLabel lbl_npcounter;
    // End of variables declaration//GEN-END:variables

    private void callChar() {
        TelaPersonagens telaChar = new TelaPersonagens(userName , mesaName);
        telaChar.setVisible(true);
        this.dispose();
    }

    private void callNpc() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void callMonster() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void callCombat() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void salvarDados(Mesa mesa) {
        mesas.add(mesa);
        System.out.println(arquivo.getAutor());
        for (Mesa mesa1 : mesas) {
            System.out.println(mesa1.getNome());
        }

        arquivo.salvarArquivo(mesas);

    }

    private void findTable(String aux) {
        boolean find = false;
        for (Mesa mesa1 : mesas) {
            if (mesa1.getNome().equals(aux)) {
                this.mesa = mesa1;
                find = true;

            }
        }
        if (!find) {
            System.out.println("wtf");
        }
    }

    private void voltat() {
        //unsuported
    }
}
