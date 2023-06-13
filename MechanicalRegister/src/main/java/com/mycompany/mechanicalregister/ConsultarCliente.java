/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mechanicalregister;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author brena
 */
public class ConsultarCliente extends javax.swing.JFrame {

    /**
     * Creates new form ConsultarCliente
     */
    public ConsultarCliente() {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(0, 0, 0)); // Define o fundo como preto
        tabCliente.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        tabCliente.getTableHeader().setOpaque(false);
        tabCliente.getTableHeader().setBackground(new Color(93, 40, 221));
        tabCliente.getTableHeader().setForeground(new Color(0, 0, 0));
        tabCliente.setRowHeight(25);
        listarTab();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cxConsultar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabCliente = new javax.swing.JTable();
        btConsultar = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        cxConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxConsultarActionPerformed(evt);
            }
        });

        tabCliente.setBackground(new java.awt.Color(0, 0, 0));
        tabCliente.setForeground(new java.awt.Color(255, 255, 255));
        tabCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NOME", "IDADE", "RG", "CPF", "TELEFONE", "DATA_REGISTRADO"
            }
        ));
        tabCliente.setFocusable(false);
        tabCliente.setGridColor(new java.awt.Color(255, 255, 255));
        tabCliente.setRowHeight(25);
        tabCliente.setSelectionBackground(new java.awt.Color(232, 57, 95));
        tabCliente.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabCliente);

        btConsultar.setBackground(new java.awt.Color(93, 40, 221));
        btConsultar.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        btConsultar.setForeground(new java.awt.Color(255, 255, 255));
        btConsultar.setText("CONSULTAR");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        btVoltar.setBackground(new java.awt.Color(93, 40, 221));
        btVoltar.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        btVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btVoltar.setText("VOLTAR");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CONSULTAR CLIENTE:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addComponent(cxConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                    .addComponent(btVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(cxConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(58, 58, 58)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        dispose();

    }//GEN-LAST:event_btVoltarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        setLocationRelativeTo(null);

    }//GEN-LAST:event_formWindowActivated

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        listarTabUnic();
    }//GEN-LAST:event_btConsultarActionPerformed

    private void cxConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxConsultarActionPerformed

    }//GEN-LAST:event_cxConsultarActionPerformed
    public void voltar() {

        int resp = JOptionPane.showConfirmDialog(
                null,
                "Deseja realmente voltar?",
                "VOLTAR",
                JOptionPane.YES_NO_OPTION
        );
        if (resp == 0) {
            MenuPostgres menu = new MenuPostgres();
            menu.setVisible(true);
            dispose();
        }
    }

    public void listarTab() {
        DefaultTableModel tabModel = (DefaultTableModel) tabCliente.getModel();
        tabModel.setRowCount(0); // Limpa as linhas existentes na tabela

        try (Connection conexao = new Conexao().getConnection()) {
            PreparedStatement inicio = conexao.prepareStatement("BEGIN");
            inicio.execute();
            String query = "SELECT id_cliente, nome_cliente, idade, rg, cpf, telefone, data_de_registro FROM cliente";
            Statement statement = conexao.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                int id = resultSet.getInt("id_cliente");
                String nome = resultSet.getString("nome_cliente");
                int idade = resultSet.getInt("idade");
                int rg = resultSet.getInt("rg");
                int cpf = resultSet.getInt("cpf");
                String telefone = resultSet.getString("telefone");
                Timestamp timestamp = resultSet.getTimestamp("data_de_registro");
                tabModel.addRow(new Object[]{id, nome, idade, rg, cpf, telefone, timestamp});
            }
            PreparedStatement fimC = conexao.prepareStatement("COMMIT");
            fimC.execute();
            PreparedStatement fimR = conexao.prepareStatement("ROLLBACk");
            fimR.execute();
            conexao.close();
        } catch (SQLException e) {
        }
    }

    public void listarTabUnic() {
        DefaultTableModel tabModel = (DefaultTableModel) tabCliente.getModel();
        tabModel.setRowCount(0); // Limpa as linhas existentes na tabela

        try (Connection conexao = new Conexao().getConnection()) {
            PreparedStatement inicio = conexao.prepareStatement("BEGIN");
            inicio.execute();
            String query = String.format("SELECT id_cliente, nome_cliente, idade, rg, cpf, telefone, data_de_registro FROM cliente WHERE id_cliente = %s;", cxConsultar.getText());
            Statement statement = conexao.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                int id = resultSet.getInt("id_cliente");
                String nome = resultSet.getString("nome_cliente");
                int idade = resultSet.getInt("idade");
                int rg = resultSet.getInt("rg");
                int cpf = resultSet.getInt("cpf");
                String telefone = resultSet.getString("telefone");
                Timestamp timestamp = resultSet.getTimestamp("data_de_registro");
                tabModel.addRow(new Object[]{id, nome, idade, rg, cpf, telefone, timestamp});
                PreparedStatement fimC = conexao.prepareStatement("COMMIT");
                fimC.execute();
                PreparedStatement fimR = conexao.prepareStatement("ROLLBACk");
                fimR.execute();
                conexao.close();
            }

        } catch (SQLException e) {
        }
    }

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
            java.util.logging.Logger.getLogger(ConsultarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JTextField cxConsultar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabCliente;
    // End of variables declaration//GEN-END:variables
}
