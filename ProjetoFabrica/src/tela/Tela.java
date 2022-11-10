/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;
import carro.Carro;
import carroDAO.CarroDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class Tela extends javax.swing.JFrame {

    /**
     * Creates new form Tela
     */
    public Tela() {
        initComponents();
    }
    
    DefaultTableModel dmt_tabela;
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtb_tabelabanco = new javax.swing.JTable();
        jlb_chassi = new javax.swing.JLabel();
        jlb_ano = new javax.swing.JLabel();
        jlb_modelo = new javax.swing.JLabel();
        jlb_fabricante = new javax.swing.JLabel();
        jlb_potencia = new javax.swing.JLabel();
        jtf_chassi = new javax.swing.JTextField();
        jtf_ano = new javax.swing.JTextField();
        jtf_modelo = new javax.swing.JTextField();
        jtf_fabricante = new javax.swing.JTextField();
        jtf_potencia = new javax.swing.JTextField();
        jbt_inserir = new javax.swing.JButton();
        jbt_atualizar = new javax.swing.JButton();
        jbt_excluir = new javax.swing.JButton();

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtb_tabelabanco.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Chassi", "Ano", "Modelo", "Fabricante", "Potência"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtb_tabelabanco);

        jlb_chassi.setText("Chassi");

        jlb_ano.setText("Ano");

        jlb_modelo.setText("Modelo");

        jlb_fabricante.setText("Fabricante");

        jlb_potencia.setText("Potência");

        jbt_inserir.setText("Inserir");
        jbt_inserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_inserirActionPerformed(evt);
            }
        });

        jbt_atualizar.setText("Atualizar");
        jbt_atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_atualizarActionPerformed(evt);
            }
        });

        jbt_excluir.setText("Excluir");
        jbt_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_excluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlb_chassi, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlb_ano)
                            .addComponent(jlb_modelo)
                            .addComponent(jlb_fabricante)
                            .addComponent(jlb_potencia))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtf_ano)
                            .addComponent(jtf_modelo)
                            .addComponent(jtf_fabricante)
                            .addComponent(jtf_potencia)
                            .addComponent(jtf_chassi, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jbt_inserir, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbt_atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jbt_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_chassi, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_chassi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_ano, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_ano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_fabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_fabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_potencia, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_potencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbt_inserir)
                    .addComponent(jbt_atualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbt_excluir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbt_inserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_inserirActionPerformed
        
        Carro carro =  new Carro(jtf_chassi.getText(), Integer.parseInt(jtf_ano.getText()), jtf_modelo.getText(), jtf_fabricante.getText(), Float.parseFloat(jtf_potencia.getText()));
       
        try {
            CarroDAO carroADD = new CarroDAO();
            
            carroADD.insertCarro(carro);
            
            ArrayList <Carro> lista = carroADD.mostraCarros();
            
            limpar_tela();
            
        } catch (SQLException ex) {
            System.out.println("\n Erro na inserção: "+ex.toString());
        } catch (ClassNotFoundException ex) {
            System.out.println("\n Erro na inserção: "+ex.toString());
        }
        
    }//GEN-LAST:event_jbt_inserirActionPerformed

    private void jbt_atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_atualizarActionPerformed
        
        Carro carro =  new Carro(jtf_chassi.getText(), Integer.parseInt(jtf_ano.getText()), jtf_modelo.getText(), jtf_fabricante.getText(), Float.parseFloat(jtf_potencia.getText()));
       
        try {
            
            CarroDAO carroADD = new CarroDAO();
            
            carroADD.updateCarro(carro);
            
            ArrayList <Carro> lista = carroADD.mostraCarros();
            
            limpar_tela();
            
        } catch (SQLException ex) {
            System.out.println("\n Erro na inserção: "+ex.toString());
        } catch (ClassNotFoundException ex) {
            System.out.println("\n Erro na inserção: "+ex.toString());
        }
        
    }//GEN-LAST:event_jbt_atualizarActionPerformed

    private void jbt_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_excluirActionPerformed
        
        
        String chassi =  jtf_chassi.getText();
       
        try {
            CarroDAO carroADD = new CarroDAO();
            
            carroADD.excluirCarro(chassi);
            
            ArrayList <Carro> lista = carroADD.mostraCarros();
            
            
            limpar_tela();
            
        } catch (SQLException ex) {
            System.out.println("\n Erro na inserção: "+ex.toString());
        } catch (ClassNotFoundException ex) {
            System.out.println("\n Erro na inserção: "+ex.toString());
        }
    }//GEN-LAST:event_jbt_excluirActionPerformed

    private void limpar_tela(){
        
        jtf_chassi.setText("");
        jtf_ano.setText("");
        jtf_fabricante.setText("");
        jtf_modelo.setText("");
        jtf_potencia.setText("");
        
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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbt_atualizar;
    private javax.swing.JButton jbt_excluir;
    private javax.swing.JButton jbt_inserir;
    private javax.swing.JLabel jlb_ano;
    private javax.swing.JLabel jlb_chassi;
    private javax.swing.JLabel jlb_fabricante;
    private javax.swing.JLabel jlb_modelo;
    private javax.swing.JLabel jlb_potencia;
    private javax.swing.JTable jtb_tabelabanco;
    private javax.swing.JTextField jtf_ano;
    private javax.swing.JTextField jtf_chassi;
    private javax.swing.JTextField jtf_fabricante;
    private javax.swing.JTextField jtf_modelo;
    private javax.swing.JTextField jtf_potencia;
    // End of variables declaration//GEN-END:variables
}
