/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.proj.View;

import br.inatel.proj.Controller.ArquivoMesas;
import br.inatel.proj.Model.Mesa;
import br.inatel.proj.Model.Chara;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author burns
 */
public class TelaPersonagens extends javax.swing.JFrame {

    private ArquivoMesas arquivo;

    private static Mesa mesa = new Mesa();//mesa herdada da tela de controle 
    private ArrayList<Mesa> mesas = new ArrayList();

    private ArrayList<Chara> chars = new ArrayList();
    private DefaultListModel dlm = new DefaultListModel();
    private Chara achar = new Chara();
    private int index;

    /**
     * Creates new form TelaPersonagens
     */
    public TelaPersonagens(Mesa mesa) {
        initComponents();
        this.setLocationRelativeTo(null);
        arquivo = new ArquivoMesas(this.mesa.getUserName());
        this.mesa = mesa;
        chars = mesa.getCharacters();

        this.mesas = arquivo.ler();

        //preenchendo a lista
        listar();

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
        jScrollPane1 = new javax.swing.JScrollPane();
        jList_chars = new javax.swing.JList<>();
        lbl_imgPersonagens = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txta_interface = new javax.swing.JTextArea();
        btn_Addchar = new javax.swing.JButton();
        btn_showChar = new javax.swing.JButton();
        btn_showCombat = new javax.swing.JButton();
        btn_showAtributes = new javax.swing.JButton();
        btn_voltar = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        btn_excluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Personagens", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N

        jList_chars.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jList_chars.setModel(dlm
        );
        jScrollPane1.setViewportView(jList_chars);

        lbl_imgPersonagens.setText("img placeholder");

        txta_interface.setColumns(20);
        txta_interface.setRows(5);
        jScrollPane2.setViewportView(txta_interface);

        btn_Addchar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btn_Addchar.setText("Adicionar Personagem");
        btn_Addchar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddcharActionPerformed(evt);
            }
        });

        btn_showChar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btn_showChar.setText("Info Ceral");
        btn_showChar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_showCharActionPerformed(evt);
            }
        });

        btn_showCombat.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btn_showCombat.setText("Info Combate");
        btn_showCombat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_showCombatActionPerformed(evt);
            }
        });

        btn_showAtributes.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btn_showAtributes.setText("Info Atributos");
        btn_showAtributes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_showAtributesActionPerformed(evt);
            }
        });

        btn_voltar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btn_voltar.setText("Voltar");
        btn_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarActionPerformed(evt);
            }
        });

        btn_editar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btn_editar.setText("Editar");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        btn_excluir.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btn_excluir.setText("Excluir");
        btn_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_showAtributes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_showCombat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_showChar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_voltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Addchar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_imgPersonagens)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_editar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_excluir)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_showChar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_showCombat)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_showAtributes)
                                .addGap(73, 73, 73))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn_editar)
                                    .addComponent(btn_excluir))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(lbl_imgPersonagens)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_voltar)
                            .addComponent(btn_Addchar))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_showAtributesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_showAtributesActionPerformed
        showAtributos();
    }//GEN-LAST:event_btn_showAtributesActionPerformed

    private void btn_AddcharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddcharActionPerformed
        callAddChar();
    }//GEN-LAST:event_btn_AddcharActionPerformed

    private void btn_showCharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_showCharActionPerformed
        showGeral();
    }//GEN-LAST:event_btn_showCharActionPerformed

    private void btn_showCombatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_showCombatActionPerformed
        showCombate();
    }//GEN-LAST:event_btn_showCombatActionPerformed

    private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed
        voltar();
    }//GEN-LAST:event_btn_voltarActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        editar();
    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirActionPerformed
        exluir();
    }//GEN-LAST:event_btn_excluirActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPersonagens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPersonagens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPersonagens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPersonagens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPersonagens(mesa).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Addchar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_excluir;
    private javax.swing.JButton btn_showAtributes;
    private javax.swing.JButton btn_showChar;
    private javax.swing.JButton btn_showCombat;
    private javax.swing.JButton btn_voltar;
    private javax.swing.JList<String> jList_chars;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_imgPersonagens;
    private javax.swing.JTextArea txta_interface;
    // End of variables declaration//GEN-END:variables

    private void callAddChar() {
        TelaAddChar telaAddC = new TelaAddChar(this.mesa);
        telaAddC.setVisible(true);
        this.dispose();

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

    private void listar() {
        for (Chara characters : mesa.getCharacters()) {
            dlm.addElement(characters.getNome());
        }

    }

    private void findChar() {
        String aux = jList_chars.getSelectedValue();
        boolean find = false;
        for (Chara aChar : chars) {
            if (aChar.getNome().equals(aux)) {
                this.achar = aChar;
                find = true;

            }
        }
        if (!find) {
            System.out.println("wtf");
            this.achar.setNome("nop");
        }
    }

    private void showGeral() {
        findChar();
        txta_interface.setText(this.achar.showChar());
    }

    private void showAtributos() {
        findChar();
        txta_interface.setText(this.achar.showAtributos());
    }

    private void showCombate() {
        findChar();
        txta_interface.setText(this.achar.showCombat());
    }

    private void voltar() {
        TelaControleMesa tela = new TelaControleMesa(mesa);
        tela.setVisible(true);
        this.dispose();
    }

    private void editar() {
        findChar();
        if (!this.achar.getNome().equals("nop")) {
            TelaAddChar tela = new TelaAddChar(this.achar);
            tela.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(rootPane, "nao ha personagens ainda");
        }
    }

    private void exluir() {
        //findChar();
        String aux = jList_chars.getSelectedValue();
        if (aux != null) {

            for (Chara char1 : mesa.getCharacters()) {
                if (char1.getNome().equals(aux)) {
                    index = mesa.getCharacters().indexOf(char1);
                    String msg = "Deseja remover o personagem: " + char1.getNome() + "?";

                    int op = JOptionPane.showConfirmDialog(jScrollPane1, msg, "Excluir", JOptionPane.WARNING_MESSAGE);
                    if (op == 0) {
                        // OK: excluir o char
                        JOptionPane.showMessageDialog(jScrollPane1, "personagem Removido com Sucesso!");
                        mesa.getCharacters().remove(index);

                        arquivo.salvarArquivo(mesas);
                        this.listar();
                        index = 0;
                        break;
                    }

                }
            }

            listar();

        } else {
            JOptionPane.showMessageDialog(rootPane, "nao ha personagens ainda", "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }

}
