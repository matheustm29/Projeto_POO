//Matheus Ferreira Alphonse dos Anjos 2454220
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormCadPulseira extends javax.swing.JFrame {

    private Pulseira p1 = new Pulseira();
    private BDPulseira gp = BDPulseira.geraGerPulseira();  
    private static FormCadPulseira cadPesUnic;
    
    public FormCadPulseira() {
        initComponents();
    }
    
    //MÉTODO SINGLETON
    public static FormCadPulseira geraGerPulseira(){
        if(cadPesUnic == null){
            cadPesUnic = new FormCadPulseira();
        }
        return cadPesUnic;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rotValor = new javax.swing.JLabel();
        cxValor = new javax.swing.JTextField();
        rotMaterial = new javax.swing.JLabel();
        cxMaterial = new javax.swing.JTextField();
        rotCircunferencia = new javax.swing.JLabel();
        cxCircunferencia = new javax.swing.JTextField();
        rotDesign = new javax.swing.JLabel();
        cxDesign = new javax.swing.JTextField();
        rtMarca = new javax.swing.JLabel();
        cxMarca = new javax.swing.JTextField();
        rotCodigo = new javax.swing.JLabel();
        cxCodigo = new javax.swing.JTextField();
        btInserir = new javax.swing.JButton();
        btConsultar = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPulseira = new javax.swing.JTable();
        btSair = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btListar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        rotValor.setText("Valor");

        rotMaterial.setText("Material");

        rotCircunferencia.setText("Circunferencia");

        rotDesign.setText("Design");

        rtMarca.setText("Marca");

        rotCodigo.setText("Codigo");

        btInserir.setText("Inserir");
        btInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirActionPerformed(evt);
            }
        });

        btConsultar.setText("Consultar");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        btAlterar.setText("Alterar");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        tbPulseira.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Valor", "Material", "Circunferencia", "Design", "Marca", "Codigo"
            }
        ));
        jScrollPane1.setViewportView(tbPulseira);

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btListar.setText("Listar");
        btListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListarActionPerformed(evt);
            }
        });

        jButton1.setText("Calcular Desconto");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btListar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btLimpar)
                        .addGap(18, 18, 18)
                        .addComponent(btSair))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rotCircunferencia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cxCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(cxMarca)
                                    .addComponent(cxDesign)
                                    .addComponent(cxCircunferencia)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rotValor)
                                            .addComponent(rotMaterial))
                                        .addGap(37, 37, 37)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cxValor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cxMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(rtMarca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(rotDesign, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(rotCodigo)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btInserir)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btConsultar)
                                        .addGap(18, 18, 18)
                                        .addComponent(btAlterar)
                                        .addGap(18, 18, 18)
                                        .addComponent(btExcluir)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton1))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 108, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotValor)
                    .addComponent(cxValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rotMaterial))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotCircunferencia)
                    .addComponent(cxCircunferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotDesign)
                    .addComponent(cxDesign, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rtMarca)
                    .addComponent(cxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rotCodigo)
                    .addComponent(cxCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btInserir)
                    .addComponent(btConsultar)
                    .addComponent(btAlterar)
                    .addComponent(btExcluir)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSair)
                    .addComponent(btLimpar)
                    .addComponent(btListar))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirActionPerformed
        try {
            inserirPulseira();
        }catch (MatException ex) { 
            JOptionPane.showMessageDialog(
            null,
            "ERRO:" +ex.getMessage(),
            "Erro de Material",
            JOptionPane.ERROR_MESSAGE
        );
        } catch (ValorGrdException ex) {
            JOptionPane.showMessageDialog(
            null,
            "ERRO:"+ex.getMessage(),
            "Erro de Valor",
            JOptionPane.ERROR_MESSAGE
        );
    }   
    }//GEN-LAST:event_btInserirActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        consPulseiraCod();
    }//GEN-LAST:event_btConsultarActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        altPulseiraCod();
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        excPulseiraCod();
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListarActionPerformed
        popularTbPulseira();
    }//GEN-LAST:event_btListarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        calcularDesconto();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    public void calcularDesconto(){
        String codigo = JOptionPane.showInputDialog(
            null,
            "Digite o código da joia para calcular o desconto:",
            "Calcular Desconto",
            JOptionPane.QUESTION_MESSAGE
            );
    
        try {
            int cod = Integer.parseInt(codigo);
            boolean found = false;

            for (Pulseira p : gp.getBdPulseira()) { 
                if (p.getI().getCod() == cod) {
                    double desconto = p.calcularDesconto();
                    JOptionPane.showMessageDialog(
                        null,
                        "Desconto a vista: " + desconto,
                        "Desconto Calculado",
                        JOptionPane.INFORMATION_MESSAGE
                    );
                    found = true;
                    break;
                }
            }

            if (!found) {
                JOptionPane.showMessageDialog(null, "Código de joia não encontrado.", "Erro", JOptionPane.ERROR_MESSAGE);
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Código inválido.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void popularTbPulseira() {
    DefaultTableModel modelo = (DefaultTableModel) tbPulseira.getModel();
    
    
    modelo.setRowCount(0);
    
    for (Pulseira p : gp.getBdPulseira()) {
        modelo.addRow(new Object[]{
            p.getValor(),
            p.getMaterial(),
            p.getCircunferencia(),
            p.getDesign(),                
            p.getI().getMarca(),
            p.getI().getCod()  
        });
    }
    }
    public void excPulseiraCod() {
    Pulseira p1 = new Pulseira();
    p1.getI().setCod(Integer.parseInt(cxCodigo.getText()));

    p1 = gp.delPulseiraCod(p1);
    if (p1 == null) {
        JOptionPane.showMessageDialog(
                null,
                "Pulseira excluída com sucesso!",
                "Exclusão de Pulseira",
                JOptionPane.INFORMATION_MESSAGE
        );
    } else {
        JOptionPane.showMessageDialog(
                null,
                "Não existe uma pulseira com esse código \n Verifique os dados",
                "Exclusão de Pulseira",
                JOptionPane.ERROR_MESSAGE
        );
    }
    limpar();
    }
    
    public void altPulseiraCod() {
    Pulseira p1 = new Pulseira();
    p1.getI().setCod(Integer.parseInt(cxCodigo.getText())); 

    p1 = gp.atualizaPulseiraCod(p1);  
    
    if (p1 != null) {
        
        cxValor.setText(Integer.toString(p1.getValor()));
        cxMaterial.setText(p1.getMaterial());
        cxCircunferencia.setText(Integer.toString(p1.getCircunferencia()));
        cxDesign.setText(p1.getDesign());
        cxMarca.setText(p1.getI().getMarca());
        cxCodigo.setText(Integer.toString(p1.getI().getCod()));
        
      
        JOptionPane.showMessageDialog(
            null,
            "Pulseira alterada com sucesso! \n Verifique os dados.",
            "Alteração de Pulseira",
            JOptionPane.INFORMATION_MESSAGE
        );
    } else {
       
        JOptionPane.showMessageDialog(
            null,
            "Não existe pulseira com este código cadastrado \n Verifique os dados.",
            "Alteração de Pulseira",
            JOptionPane.ERROR_MESSAGE
        );
    }
    limpar();  
    }
    public void consPulseiraCod() {
    Pulseira p1 = new Pulseira();
    p1.getI().setCod(Integer.parseInt(cxCodigo.getText()));
    
    p1 = gp.consPulseiraCod(p1);
    if (p1 != null) {
        cxValor.setText(Integer.toString(p1.getValor()));
        cxMaterial.setText(p1.getMaterial());
        cxCircunferencia.setText(Integer.toString(p1.getCircunferencia()));
        cxDesign.setText(p1.getDesign());
        cxMarca.setText(p1.getI().getMarca());
        cxCodigo.setText(Integer.toString(p1.getI().getCod()));
        JOptionPane.showMessageDialog(
                null,
                "Pulseira encontrada com sucesso \nVerifique os Dados",
                "Pesquisa de Pulseira",
                1
        );
    } else {
        JOptionPane.showMessageDialog(
                null,
                "Não existe pulseira com este código",
                "Pesquisa de Pulseira",
                1
        );
        limpar();
    }
    }
    
    
    public void inserirPulseira() throws MatException, ValorGrdException {
        p1 = new Pulseira();
        p1.setValor(Integer.parseInt(cxValor.getText()));
        p1.setMaterial(cxMaterial.getText());
        p1.setCircunferencia(Integer.parseInt(cxCircunferencia.getText()));
        p1.setDesign(cxDesign.getText());
        p1.getI().setMarca(cxMarca.getText());
        p1.getI().setCod(Integer.parseInt(cxCodigo.getText())); 
    
        p1 = gp.insPulseira(p1);
        if (p1 != null) {
            JOptionPane.showMessageDialog(
                    null,
                    "Pulseira cadastrada com sucesso!!!",
                    "Cadastro de Pulseira",
                    JOptionPane.INFORMATION_MESSAGE
            );
            limpar();
        }else {
            JOptionPane.showMessageDialog(
                    null,
                    "Código da pulseira duplicado",
                    "Erro no cadastro de pulseira",
                    JOptionPane.ERROR_MESSAGE
            );
            limpar();
        }
    }
    public void limpar(){
        cxValor.setText("");
        cxMaterial.setText("");
        cxCircunferencia.setText("");
        cxDesign.setText("");
        cxMarca.setText("");
        cxCodigo.setText("");
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
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btInserir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btListar;
    private javax.swing.JButton btSair;
    private javax.swing.JTextField cxCircunferencia;
    private javax.swing.JTextField cxCodigo;
    private javax.swing.JTextField cxDesign;
    private javax.swing.JTextField cxMarca;
    private javax.swing.JTextField cxMaterial;
    private javax.swing.JTextField cxValor;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel rotCircunferencia;
    private javax.swing.JLabel rotCodigo;
    private javax.swing.JLabel rotDesign;
    private javax.swing.JLabel rotMaterial;
    private javax.swing.JLabel rotValor;
    private javax.swing.JLabel rtMarca;
    private javax.swing.JTable tbPulseira;
    // End of variables declaration//GEN-END:variables
}
