//Matheus Ferreira Alphonse dos Anjos 2454220
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormCadAnel extends javax.swing.JFrame {

    private Anel a1 = new Anel();
    private BDAnel ga = BDAnel.geraGerAnel();  
    private static FormCadAnel cadPesUnic;
    
    public FormCadAnel() {
        initComponents();
    }
    
    //MÉTODO SINGLETON
    public static FormCadAnel geraCadAnel(){
        if(cadPesUnic == null){
            cadPesUnic = new FormCadAnel();
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
        rtAro = new javax.swing.JLabel();
        cxAro = new javax.swing.JTextField();
        rotTipo = new javax.swing.JLabel();
        rotMarca = new javax.swing.JLabel();
        cxMarca = new javax.swing.JTextField();
        cxTipo = new javax.swing.JTextField();
        rotCodigo = new javax.swing.JLabel();
        cxCodigo = new javax.swing.JTextField();
        btInserir = new javax.swing.JButton();
        btConsultar = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbAnel = new javax.swing.JTable();
        btSair = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btListar = new javax.swing.JButton();
        btDesconto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        rotValor.setText("Valor");

        rotMaterial.setText("Material");

        rtAro.setText("Aro");

        rotTipo.setText("Tipo");

        rotMarca.setText("Marca");

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

        tbAnel.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbAnel);

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

        btDesconto.setText("Calcular Desconto");
        btDesconto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDescontoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rotCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(rotMarca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(rtAro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(rotMaterial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(rotValor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(rotTipo, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cxValor, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cxMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cxAro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(306, 430, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btInserir)
                        .addGap(18, 18, 18)
                        .addComponent(btConsultar)
                        .addGap(18, 18, 18)
                        .addComponent(btAlterar)
                        .addGap(18, 18, 18)
                        .addComponent(btExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(btDesconto)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btListar)
                .addGap(18, 18, 18)
                .addComponent(btLimpar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btSair)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotValor)
                    .addComponent(cxValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rotMaterial))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rtAro)
                    .addComponent(cxAro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rotTipo))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rotMarca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rotCodigo)
                    .addComponent(cxCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btInserir)
                    .addComponent(btConsultar)
                    .addComponent(btAlterar)
                    .addComponent(btExcluir)
                    .addComponent(btDesconto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSair)
                    .addComponent(btLimpar)
                    .addComponent(btListar))
                .addContainerGap(127, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirActionPerformed
        try {
            inserirAnel();
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

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
       consAnelCod();
    }//GEN-LAST:event_btConsultarActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        altAnelCod();
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        excAnelCod();
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListarActionPerformed
        popularTbAnel();
    }//GEN-LAST:event_btListarActionPerformed

    private void btDescontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDescontoActionPerformed
        calcularDesconto();
    }//GEN-LAST:event_btDescontoActionPerformed
    
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

            for (Anel a : ga.getBdAnel()) { 
                if (a.getI().getCod() == cod) {
                    double desconto = a.calcularDesconto();
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
    public void popularTbAnel() {
    DefaultTableModel modelo = (DefaultTableModel) tbAnel.getModel();
    
    
    modelo.setRowCount(0);
    
    for (Anel a : ga.getBdAnel()) {
        modelo.addRow(new Object[]{
            a.getValor(),
            a.getMaterial(),
            a.getAro(),
            a.getTipo(),                
            a.getI().getMarca(),
            a.getI().getCod()  
        });
    }
    }

    public void excAnelCod() {
    Anel anel = new Anel();
    anel.getI().setCod(Integer.parseInt(cxCodigo.getText()));

    anel = ga.delAnelCod(anel);
    if (anel == null) {
        JOptionPane.showMessageDialog(
                null,
                "Anel excluído com sucesso!",
                "Exclusão de Anel",
                JOptionPane.INFORMATION_MESSAGE
        );
    } else {
        JOptionPane.showMessageDialog(
                null,
                "Não existe um anel com esse código \n Verifique os dados",
                "Exclusão de Anel",
                JOptionPane.ERROR_MESSAGE
        );
    }
    limpar();
}

    public void altAnelCod() {
    Anel anel = new Anel();
    anel.getI().setCod(Integer.parseInt(cxCodigo.getText()));  

    anel = ga.atualizaAnelCod(anel);  
    
    if (anel != null) {
        
        cxValor.setText(Integer.toString(anel.getValor()));
        cxMaterial.setText(anel.getMaterial());
        cxAro.setText(Integer.toString(anel.getAro()));
        cxTipo.setText(anel.getTipo());
        cxMarca.setText(anel.getI().getMarca());
        cxCodigo.setText(Integer.toString(anel.getI().getCod()));
        
      
        JOptionPane.showMessageDialog(
            null,
            "Anel alterado com sucesso! \n Verifique os dados.",
            "Alteração de Anel",
            JOptionPane.INFORMATION_MESSAGE
        );
    } else {
       
        JOptionPane.showMessageDialog(
            null,
            "Não existe anel com este código cadastrado \n Verifique os dados.",
            "Alteração de Anel",
            JOptionPane.ERROR_MESSAGE
        );
    }
    limpar();  
}

    public void consAnelCod() {
    Anel a1 = new Anel();
    a1.getI().setCod(Integer.parseInt(cxCodigo.getText()));
    
    a1 = ga.consAnelCod(a1);
    if (a1 != null) {
        cxValor.setText(Integer.toString(a1.getValor()));
        cxMaterial.setText(a1.getMaterial());
        cxAro.setText(Integer.toString(a1.getAro()));
        cxTipo.setText(a1.getTipo());
        cxMarca.setText(a1.getI().getMarca());
        cxCodigo.setText(Integer.toString(a1.getI().getCod()));
        JOptionPane.showMessageDialog(
                null,
                "Anel encontrado com sucesso \nVerifique os Dados",
                "Pesquisa de Anel",
                1
        );
    } else {
        JOptionPane.showMessageDialog(
                null,
                "Não existe anel com este código",
                "Pesquisa de Anel",
                1
        );
        limpar();
    }
}

    public void inserirAnel() throws MatException, ValorGrdException {
        a1 = new Anel();
        a1.setValor(Integer.parseInt(cxValor.getText()));
        a1.setMaterial(cxMaterial.getText());
        a1.setAro(Integer.parseInt(cxAro.getText()));
        a1.setTipo(cxTipo.getText());
        a1.getI().setMarca(cxMarca.getText());
        a1.getI().setCod(Integer.parseInt(cxCodigo.getText())); 
    
        a1 = ga.insAnel(a1);
        if (a1 != null) {
            JOptionPane.showMessageDialog(
                    null,
                    "Anel cadastrado com sucesso!!!",
                    "Cadastro de Anel",
                    JOptionPane.INFORMATION_MESSAGE
            );
            limpar();
        }else {
            JOptionPane.showMessageDialog(
                    null,
                    "Código do anel duplicado",
                    "Erro no cadastro de anel",
                    JOptionPane.ERROR_MESSAGE
            );
            limpar();
        }
    }

    
    public void limpar(){
        cxValor.setText("");
        cxMaterial.setText("");
        cxAro.setText("");
        cxTipo.setText("");
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
    private javax.swing.JButton btDesconto;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btInserir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btListar;
    private javax.swing.JButton btSair;
    private javax.swing.JTextField cxAro;
    private javax.swing.JTextField cxCodigo;
    private javax.swing.JTextField cxMarca;
    private javax.swing.JTextField cxMaterial;
    private javax.swing.JTextField cxTipo;
    private javax.swing.JTextField cxValor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel rotCodigo;
    private javax.swing.JLabel rotMarca;
    private javax.swing.JLabel rotMaterial;
    private javax.swing.JLabel rotTipo;
    private javax.swing.JLabel rotValor;
    private javax.swing.JLabel rtAro;
    private javax.swing.JTable tbAnel;
    // End of variables declaration//GEN-END:variables
}
