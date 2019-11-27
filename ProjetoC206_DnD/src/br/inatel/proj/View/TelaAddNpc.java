/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.proj.View;

import br.inatel.proj.Controller.ArquivoMesas;
import br.inatel.proj.Model.Mesa;
import br.inatel.proj.Model.Monstro;
import br.inatel.proj.Model.Npc;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author burns
 */
public class TelaAddNpc extends javax.swing.JFrame {

    private ArquivoMesas arquivo = new ArquivoMesas();
    private Mesa mesa = new Mesa();//mesa herdada da tela de controle 
    private ArrayList<Mesa> mesas = new ArrayList();
    private ArrayList<Npc> npcs = new ArrayList();
    private Npc npc = new Npc();

    private int index1;
    private int index2;
    private String userName;
    private String mesaName;

    /**
     * Creates new form TelaAddNpc
     */
    public TelaAddNpc() {
        initComponents();
        this.setLocationRelativeTo(null);
        getRootPane().setDefaultButton(btn_salvar);

        this.userName = ArquivoMesas.autor;
        this.mesaName = ArquivoMesas.mesaName;
        this.mesas = arquivo.ler();
        findTable(ArquivoMesas.mesaName);
        this.index1 = this.mesas.indexOf(this.mesa);
        this.npcs = this.mesa.getNpcs();
        if (ArquivoMesas.isEdit) {
            this.npc = ArquivoMesas.npc;
            initForEdit();
            findIndex();

        }

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
        jPanel7 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txta_notas = new javax.swing.JTextArea();
        btn_salvar = new javax.swing.JButton();
        btn_Cancel = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lbl_nome = new javax.swing.JLabel();
        txt_nome = new javax.swing.JTextField();
        lbl_level = new javax.swing.JLabel();
        txt_lvl = new javax.swing.JTextField();
        lbl_race = new javax.swing.JLabel();
        txt_race = new javax.swing.JTextField();
        lbl_hp = new javax.swing.JLabel();
        txt_hp = new javax.swing.JTextField();
        lbl_background = new javax.swing.JLabel();
        txt_backG = new javax.swing.JTextField();
        txt_alignment = new javax.swing.JTextField();
        lbl_alinhamento = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Notas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sylfaen", 0, 18))); // NOI18N

        txta_notas.setColumns(20);
        txta_notas.setRows(5);
        jScrollPane3.setViewportView(txta_notas);

        btn_salvar.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        btn_salvar.setText("salvar");
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });

        btn_Cancel.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        btn_Cancel.setText("Cancelar");
        btn_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(0, 283, Short.MAX_VALUE)
                        .addComponent(btn_salvar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Cancel)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 15, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 510, 380));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Monstro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sylfaen", 0, 18))); // NOI18N

        lbl_nome.setFont(new java.awt.Font("Sylfaen", 0, 12)); // NOI18N
        lbl_nome.setText("Nome:");

        lbl_level.setFont(new java.awt.Font("Sylfaen", 0, 12)); // NOI18N
        lbl_level.setText("Nivel:");

        lbl_race.setFont(new java.awt.Font("Sylfaen", 0, 12)); // NOI18N
        lbl_race.setText("Raça:");

        lbl_hp.setFont(new java.awt.Font("Sylfaen", 0, 12)); // NOI18N
        lbl_hp.setText("Pontos de Vida:");

        lbl_background.setFont(new java.awt.Font("Sylfaen", 0, 12)); // NOI18N
        lbl_background.setText("Antecedentes:");

        lbl_alinhamento.setFont(new java.awt.Font("Sylfaen", 0, 12)); // NOI18N
        lbl_alinhamento.setText("Alinhamento:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lbl_nome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_nome))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_race)
                            .addComponent(lbl_level))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_lvl)
                            .addComponent(txt_race)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_hp)
                            .addComponent(lbl_background)
                            .addComponent(lbl_alinhamento))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_alignment)
                            .addComponent(txt_hp, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                            .addComponent(txt_backG))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nome)
                    .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_race)
                    .addComponent(txt_race, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_level)
                    .addComponent(txt_lvl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_hp)
                    .addComponent(txt_hp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_background)
                    .addComponent(txt_backG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_alinhamento)
                    .addComponent(txt_alignment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 280, 190));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/inatel/proj/Imagens/InlineR_Ampersand.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
        salvar();
    }//GEN-LAST:event_btn_salvarActionPerformed

    private void btn_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelActionPerformed
        cancel();
    }//GEN-LAST:event_btn_CancelActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAddNpc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAddNpc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAddNpc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAddNpc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAddNpc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Cancel;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbl_alinhamento;
    private javax.swing.JLabel lbl_background;
    private javax.swing.JLabel lbl_hp;
    private javax.swing.JLabel lbl_level;
    private javax.swing.JLabel lbl_nome;
    private javax.swing.JLabel lbl_race;
    private javax.swing.JTextField txt_alignment;
    private javax.swing.JTextField txt_backG;
    private javax.swing.JTextField txt_hp;
    private javax.swing.JTextField txt_lvl;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JTextField txt_race;
    private javax.swing.JTextArea txta_notas;
    // End of variables declaration//GEN-END:variables

    private void salvar() {
        lerdados();
    }

    private void cancel() {
        TelaNpc tela = new TelaNpc();
        tela.setVisible(true);
        this.dispose();
    }

    private void findTable(String aux) {
        boolean find = false;
        for (Mesa mesa1 : this.mesas) {
            if (mesa1.getNome().equals(aux)) {
                this.mesa = mesa1;
                find = true;

            }
        }

        if (!find) {
            System.out.println("wtf");
        }
    }

    private void initForEdit() {
        txt_nome.setText(npc.getNome());
        txt_race.setText(npc.getRace());
        txt_lvl.setText(npc.getNivel());
        txt_hp.setText(npc.getHp());
        txt_backG.setText(npc.getBackGround());
        txt_alignment.setText(npc.getAlignment());

        txta_notas.setText(npc.getNotas());
    }

    private void findIndex() {
        for (Npc npc1 : this.npcs) {
            if (npc1.getNome().equals(this.npc.getNome())) {
                this.index2 = this.npcs.indexOf(npc1);
            }
        }
    }

    private void lerdados() {
        if (!txt_nome.getText().equals("")) {
            npc.setNome(txt_nome.getText());
            npc.setRace(txt_race.getText());
            npc.setNivel(txt_lvl.getText());
            npc.setHp(txt_hp.getText());
            npc.setBackGround(txt_backG.getText());
            npc.setAlignment(txt_alignment.getText());

            npc.setNotas(txta_notas.getText());
            salvaNpc();

        } else {
            JOptionPane.showMessageDialog(rootPane, "pelomenos o nome deve ser preenchido");

        }
    }

    private void salvaNpc() {
        if (ArquivoMesas.isEdit) {
            this.npcs.set(index2, this.npc);
            ArquivoMesas.isEdit = false;
        } else {
            this.npcs.add(this.npc);
        }
        this.mesa.setNpcs(this.npcs);
        this.mesas.set(this.index1, this.mesa);
        arquivo.salvarArquivo(mesas);
        cancel();
    }
}
