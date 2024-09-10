//Apache NetBeans IDE 22
//Matheus Ferreira Alphonse dos Anjos 2454220

import javax.swing.JOptionPane;


public class Principal extends javax.swing.JFrame {

    
    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rotPrincipal = new javax.swing.JLabel();
        barMenuPrincipal = new javax.swing.JMenuBar();
        mnIniciar = new javax.swing.JMenu();
        mnAnel = new javax.swing.JMenu();
        itMnCadAnel = new javax.swing.JMenuItem();
        itMnRelAnel = new javax.swing.JMenuItem();
        mnCorrente = new javax.swing.JMenu();
        itMnCadCorrente = new javax.swing.JMenuItem();
        itMnRelCorrente = new javax.swing.JMenuItem();
        mnPulseira = new javax.swing.JMenu();
        itMnCadPulseira = new javax.swing.JMenuItem();
        itMnRelPulseira = new javax.swing.JMenuItem();
        mnCancelar = new javax.swing.JMenu();
        itMnSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rotPrincipal.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        rotPrincipal.setText("Sistema para cadastro de Joias");

        mnIniciar.setText("Iniciar");

        mnAnel.setText("Anel");

        itMnCadAnel.setText("Cadastrar Anel...");
        itMnCadAnel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itMnCadAnelActionPerformed(evt);
            }
        });
        mnAnel.add(itMnCadAnel);

        itMnRelAnel.setText("Relatório de Anel");
        itMnRelAnel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itMnRelAnelActionPerformed(evt);
            }
        });
        mnAnel.add(itMnRelAnel);

        mnIniciar.add(mnAnel);

        mnCorrente.setText("Corrente");

        itMnCadCorrente.setText("Cadastrar Corrente...");
        itMnCadCorrente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itMnCadCorrenteActionPerformed(evt);
            }
        });
        mnCorrente.add(itMnCadCorrente);

        itMnRelCorrente.setText("Relatório de Corrente");
        itMnRelCorrente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itMnRelCorrenteActionPerformed(evt);
            }
        });
        mnCorrente.add(itMnRelCorrente);

        mnIniciar.add(mnCorrente);

        mnPulseira.setText("Pulseira");

        itMnCadPulseira.setText("Cadastar Pulseira");
        itMnCadPulseira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itMnCadPulseiraActionPerformed(evt);
            }
        });
        mnPulseira.add(itMnCadPulseira);

        itMnRelPulseira.setText("Relatório de Pulseira");
        itMnRelPulseira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itMnRelPulseiraActionPerformed(evt);
            }
        });
        mnPulseira.add(itMnRelPulseira);

        mnIniciar.add(mnPulseira);

        barMenuPrincipal.add(mnIniciar);

        mnCancelar.setText("Cancelar");

        itMnSair.setText("Sair");
        itMnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itMnSairActionPerformed(evt);
            }
        });
        mnCancelar.add(itMnSair);

        barMenuPrincipal.add(mnCancelar);

        setJMenuBar(barMenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(rotPrincipal)
                .addGap(61, 61, 61))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(rotPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itMnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itMnSairActionPerformed
        sair();
    }//GEN-LAST:event_itMnSairActionPerformed

    private void itMnCadAnelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itMnCadAnelActionPerformed
        abreCadAnel();
    }//GEN-LAST:event_itMnCadAnelActionPerformed

    private void itMnCadCorrenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itMnCadCorrenteActionPerformed
        abreCadCorrente();
    }//GEN-LAST:event_itMnCadCorrenteActionPerformed

    private void itMnCadPulseiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itMnCadPulseiraActionPerformed
        abreCadPulseira();
    }//GEN-LAST:event_itMnCadPulseiraActionPerformed

    private void itMnRelAnelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itMnRelAnelActionPerformed
        abreRelAnel();
    }//GEN-LAST:event_itMnRelAnelActionPerformed

    private void itMnRelCorrenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itMnRelCorrenteActionPerformed
        abreRelCorrente();
    }//GEN-LAST:event_itMnRelCorrenteActionPerformed

    private void itMnRelPulseiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itMnRelPulseiraActionPerformed
        abreRelPulseira();
    }//GEN-LAST:event_itMnRelPulseiraActionPerformed
    
    public void abreRelPulseira(){
        FormRelPulseira.geraRelPulseira().setVisible(true);
    } 
    public void abreRelCorrente(){
        FormRelCorrente.geraRelCorrente().setVisible(true);
    } 
    
    public void abreRelAnel(){
        FormRelAnel.geraRelAnel().setVisible(true);
    }
    
    public void sair(){
        int ret = JOptionPane.showConfirmDialog(
                null,
                "Deseja realmente sair?",
                "Saida",
                JOptionPane.YES_NO_CANCEL_OPTION
        );
        if(ret == 0){
            dispose();
        }
    }
    public void abreCadCorrente(){
        FormCadCorrente.geraGerCorrente().setVisible(true);
    }
    public void abreCadPulseira(){
        FormCadPulseira.geraGerPulseira().setVisible(true);
    }
    public void abreCadAnel(){
        FormCadAnel.geraCadAnel().setVisible(true);
    }
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barMenuPrincipal;
    private javax.swing.JMenuItem itMnCadAnel;
    private javax.swing.JMenuItem itMnCadCorrente;
    private javax.swing.JMenuItem itMnCadPulseira;
    private javax.swing.JMenuItem itMnRelAnel;
    private javax.swing.JMenuItem itMnRelCorrente;
    private javax.swing.JMenuItem itMnRelPulseira;
    private javax.swing.JMenuItem itMnSair;
    private javax.swing.JMenu mnAnel;
    private javax.swing.JMenu mnCancelar;
    private javax.swing.JMenu mnCorrente;
    private javax.swing.JMenu mnIniciar;
    private javax.swing.JMenu mnPulseira;
    private javax.swing.JLabel rotPrincipal;
    // End of variables declaration//GEN-END:variables
}
