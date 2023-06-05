/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mechanicalregister;

/**
 *
 * @author micae
 */
public class InserirCliente extends javax.swing.JFrame {

    /**
     * Creates new form InserirCliente
     */
    public InserirCliente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rotConsultar = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cxIdade = new javax.swing.JTextField();
        cxRG = new javax.swing.JTextField();
        cxNome = new javax.swing.JTextField();
        cxTelefone = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btInserir = new javax.swing.JButton();
        cxIdProduto = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cxIdServico = new javax.swing.JTextField();
        btVoltar = new javax.swing.JButton();
        cxIdVeiculo = new javax.swing.JTextField();
        cxCPF = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rotConsultar.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        rotConsultar.setForeground(new java.awt.Color(255, 255, 255));
        rotConsultar.setText("INSERIR - CLIENTE");
        getContentPane().add(rotConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("IDADE:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 150, 30));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("NOME:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 150, 30));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CPF:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 150, 30));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ID VEICULO:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 670, 150, -1));
        getContentPane().add(cxIdade, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 410, 30));
        getContentPane().add(cxRG, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, 410, 30));
        getContentPane().add(cxNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 410, 30));
        getContentPane().add(cxTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 470, 410, 30));

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("ID PRODUTO:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 530, 150, 30));

        btInserir.setBackground(new java.awt.Color(93, 40, 221));
        btInserir.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        btInserir.setForeground(new java.awt.Color(255, 255, 255));
        btInserir.setText("INSERIR");
        getContentPane().add(btInserir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 310, 170, 50));
        getContentPane().add(cxIdProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 532, 410, 30));

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("ID SERVIÇO:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 600, 150, 30));
        getContentPane().add(cxIdServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 600, 410, 30));

        btVoltar.setBackground(new java.awt.Color(93, 40, 221));
        btVoltar.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        btVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btVoltar.setText("VOLTAR");
        getContentPane().add(btVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 430, 170, 50));
        getContentPane().add(cxIdVeiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 670, 410, 30));
        getContentPane().add(cxCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, 410, 30));

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("TELEFONE:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 470, 150, 30));

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("RG:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, 150, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo .png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 157, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(InserirCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InserirCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InserirCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InserirCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InserirCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btInserir;
    private javax.swing.JButton btVoltar;
    private javax.swing.JTextField cxCPF;
    private javax.swing.JTextField cxIdProduto;
    private javax.swing.JTextField cxIdServico;
    private javax.swing.JTextField cxIdVeiculo;
    private javax.swing.JTextField cxIdade;
    private javax.swing.JTextField cxNome;
    private javax.swing.JTextField cxRG;
    private javax.swing.JTextField cxTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel rotConsultar;
    // End of variables declaration//GEN-END:variables
}
