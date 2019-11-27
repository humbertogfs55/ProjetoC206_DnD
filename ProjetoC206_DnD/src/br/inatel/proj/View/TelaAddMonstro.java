/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.proj.View;

import br.inatel.proj.Controller.ArquivoMesas;
import br.inatel.proj.Model.Mesa;
import br.inatel.proj.Model.Monstro;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author burns
 */
public class TelaAddMonstro extends javax.swing.JFrame {

    private ArquivoMesas arquivo = new ArquivoMesas();
    private Mesa mesa = new Mesa();//mesa herdada da tela de controle 
    private ArrayList<Mesa> mesas = new ArrayList();
    private ArrayList<Monstro> monstros = new ArrayList();
    private Monstro monstro = new Monstro();

    private int index1;
    private int index2;
    private String userName;
    private String mesaName;

    /**
     * Creates new form TelaAddMonstro
     */
    public TelaAddMonstro() {
        initComponents();
        this.setLocationRelativeTo(null);
        getRootPane().setDefaultButton(btn_salvar);

        this.userName = ArquivoMesas.autor;
        this.mesaName = ArquivoMesas.mesaName;
        this.mesas = arquivo.ler();
        findTable(ArquivoMesas.mesaName);
        this.index1 = this.mesas.indexOf(this.mesa);
        this.monstros = this.mesa.getMonstros();
        if (ArquivoMesas.isEdit) {
            this.monstro = ArquivoMesas.monstro;
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
        jPanel3 = new javax.swing.JPanel();
        lbl_nome = new javax.swing.JLabel();
        txt_nome = new javax.swing.JTextField();
        lbl_level = new javax.swing.JLabel();
        txt_lvl = new javax.swing.JTextField();
        lbl_race = new javax.swing.JLabel();
        txt_race = new javax.swing.JTextField();
        lbl_hp = new javax.swing.JLabel();
        txt_hp = new javax.swing.JTextField();
        lbl_armor = new javax.swing.JLabel();
        txt_armor = new javax.swing.JTextField();
        txt_movement = new javax.swing.JTextField();
        lbl_speed = new javax.swing.JLabel();
        lbl_iniciativa = new javax.swing.JLabel();
        txt_iniciativa = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txta_notas = new javax.swing.JTextArea();
        btn_salvar = new javax.swing.JButton();
        btn_Cancel = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        lbl_spellatk = new javax.swing.JLabel();
        lbl_spellDc = new javax.swing.JLabel();
        txt_spellatk = new javax.swing.JTextField();
        txt_spelldc = new javax.swing.JTextField();
        lbl_magia = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txta_magias = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Monstro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sylfaen", 0, 18))); // NOI18N

        lbl_nome.setFont(new java.awt.Font("Sylfaen", 0, 12)); // NOI18N
        lbl_nome.setText("Nome:");

        lbl_level.setFont(new java.awt.Font("Sylfaen", 0, 12)); // NOI18N
        lbl_level.setText("Nivel:");

        lbl_race.setFont(new java.awt.Font("Sylfaen", 0, 12)); // NOI18N
        lbl_race.setText("Raça:");

        lbl_hp.setFont(new java.awt.Font("Sylfaen", 0, 12)); // NOI18N
        lbl_hp.setText("Pontos de Vida:");

        lbl_armor.setFont(new java.awt.Font("Sylfaen", 0, 12)); // NOI18N
        lbl_armor.setText("C/ Armadura:");

        lbl_speed.setFont(new java.awt.Font("Sylfaen", 0, 12)); // NOI18N
        lbl_speed.setText("Movimento:");

        lbl_iniciativa.setFont(new java.awt.Font("Sylfaen", 0, 12)); // NOI18N
        lbl_iniciativa.setText("Iniciativa:");

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
                        .addComponent(lbl_iniciativa)
                        .addGap(11, 11, 11)
                        .addComponent(txt_iniciativa))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_hp)
                            .addComponent(lbl_armor)
                            .addComponent(lbl_speed))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_movement)
                            .addComponent(txt_hp, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                            .addComponent(txt_armor))))
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
                    .addComponent(lbl_armor)
                    .addComponent(txt_armor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_speed)
                    .addComponent(txt_movement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_iniciativa)
                    .addComponent(txt_iniciativa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 253, 210));

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

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 510, 380));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Magias", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sylfaen", 0, 18))); // NOI18N

        lbl_spellatk.setFont(new java.awt.Font("Sylfaen", 0, 12)); // NOI18N
        lbl_spellatk.setText("Spell atk");

        lbl_spellDc.setFont(new java.awt.Font("Sylfaen", 0, 12)); // NOI18N
        lbl_spellDc.setText("Spell DC");

        txt_spellatk.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        txt_spelldc.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        lbl_magia.setFont(new java.awt.Font("Sylfaen", 0, 12)); // NOI18N
        lbl_magia.setText("Magias:");

        txta_magias.setColumns(20);
        txta_magias.setRows(5);
        jScrollPane2.setViewportView(txta_magias);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(lbl_magia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addComponent(lbl_spellatk)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(lbl_spellDc)
                                .addGap(11, 11, 11)))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_spelldc, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                            .addComponent(txt_spellatk))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_spellatk)
                    .addComponent(txt_spellatk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_spellDc)
                    .addComponent(txt_spelldc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(lbl_magia)
                        .addGap(0, 33, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, 160));

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
            java.util.logging.Logger.getLogger(TelaAddMonstro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAddMonstro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAddMonstro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAddMonstro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAddMonstro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Cancel;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbl_armor;
    private javax.swing.JLabel lbl_hp;
    private javax.swing.JLabel lbl_iniciativa;
    private javax.swing.JLabel lbl_level;
    private javax.swing.JLabel lbl_magia;
    private javax.swing.JLabel lbl_nome;
    private javax.swing.JLabel lbl_race;
    private javax.swing.JLabel lbl_speed;
    private javax.swing.JLabel lbl_spellDc;
    private javax.swing.JLabel lbl_spellatk;
    private javax.swing.JTextField txt_armor;
    private javax.swing.JTextField txt_hp;
    private javax.swing.JTextField txt_iniciativa;
    private javax.swing.JTextField txt_lvl;
    private javax.swing.JTextField txt_movement;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JTextField txt_race;
    private javax.swing.JTextField txt_spellatk;
    private javax.swing.JTextField txt_spelldc;
    private javax.swing.JTextArea txta_magias;
    private javax.swing.JTextArea txta_notas;
    // End of variables declaration//GEN-END:variables

    private void salvar() {
        lerdados();
    }

    private void cancel() {
        TelaMonstros tela = new TelaMonstros();
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
        txt_nome.setText(monstro.getNome());
        txt_race.setText(monstro.getRace());
        txt_lvl.setText(monstro.getLevel() + "");
        txt_hp.setText(monstro.getHp());
        txt_armor.setText(monstro.getAc() + "");
        txt_movement.setText(monstro.getSpeed() + "");
        txt_iniciativa.setText(monstro.getInitiative());

        txt_spellatk.setText(monstro.getSpellatk());
        txt_spelldc.setText(monstro.getSpellDc());
        txta_magias.setText(monstro.getSpells());

        txta_notas.setText(monstro.getNotas());

    }

    private void findIndex() {
        for (Monstro monstro1 : this.monstros) {
            if (monstro1.getNome().equals(this.monstro.getNome())) {
                this.index2 = this.monstros.indexOf(monstro1);
            }
        }
    }

    private void lerdados() {
        if (!txt_nome.getText().equals("")) {
            monstro.setNome(txt_nome.getText());
            monstro.setRace(txt_race.getText());
            monstro.setLevel(txt_lvl.getText());
            monstro.setHp(txt_hp.getText());
            monstro.setAc(txt_armor.getText());
            monstro.setSpeed(txt_movement.getText());
            monstro.setInitiative(txt_iniciativa.getText());

            monstro.setSpellDc(txt_spelldc.getText());
            monstro.setSpellatk(txt_spellatk.getText());
            monstro.setSpells(txta_magias.getText());

            monstro.setNotas(txta_notas.getText());
            salvaMonstro();

        } else {
            JOptionPane.showMessageDialog(rootPane, "pelomenos o nome deve ser preenchido");
        }
    }

    private void salvaMonstro() {
        if (ArquivoMesas.isEdit) {
            this.monstros.set(index2, monstro);
            ArquivoMesas.isEdit = false;
        } else {
            this.monstros.add(monstro);
        }
        this.mesa.setMonstros(monstros);
        this.mesas.set(this.index1, this.mesa);
        arquivo.salvarArquivo(mesas);
        cancel();
    }
}
