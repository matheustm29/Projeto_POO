//Matheus Ferreira Alphonse dos Anjos 2454220
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormCadCorrente extends javax.swing.JFrame {

    private Corrente c1 = new Corrente();
    private BDCorrente gc = BDCorrente.geraGerCorrente();  
    private static FormCadCorrente cadPesUnic;
    
    public FormCadCorrente() {
        initComponents();
    }
    
    //MÉTODO SINGLETON
    public static FormCadCorrente geraGerCorrente(){
        if(cadPesUnic == null){
            cadPesUnic = new FormCadCorrente();
        }
        return cadPesUnic;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rtMarca = new javax.swing.JLabel();
        btLimpar = new javax.swing.JButton();
        cxMarca = new javax.swing.JTextField();
        btListar = new javax.swing.JButton();
        rotCodigo = new javax.swing.JLabel();
        cxCodigo = new javax.swing.JTextField();
        btInserir = new javax.swing.JButton();
        btConsultar = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCorrente = new javax.swing.JTable();
        rotValor = new javax.swing.JLabel();
        cxValor = new javax.swing.JTextField();
        rotMaterial = new javax.swing.JLabel();
        cxMaterial = new javax.swing.JTextField();
        rotComprimento = new javax.swing.JLabel();
        cxComprimento = new javax.swing.JTextField();
        rotPingente = new javax.swing.JLabel();
        cxPingente = new javax.swing.JTextField();
        btSair = new javax.swing.JButton();
        btDesconto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        rtMarca.setText("Marca");

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

        tbCorrente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Valor", "Material", "Comprimento", "Pingente", "Marca", "Codigo"
            }
        ));
        jScrollPane1.setViewportView(tbCorrente);

        rotValor.setText("Valor");

        rotMaterial.setText("Material");

        rotComprimento.setText("Comprimento");

        rotPingente.setText("Pingente");

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(rotPingente, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rotComprimento, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                    .addComponent(rotMaterial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rotValor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rtMarca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rotCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cxCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cxPingente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cxValor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cxMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cxComprimento, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btInserir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btConsultar)
                                .addGap(18, 18, 18)
                                .addComponent(btAlterar)
                                .addGap(18, 18, 18)
                                .addComponent(btExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btDesconto)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btListar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btLimpar)
                        .addGap(18, 18, 18)
                        .addComponent(btSair)))
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
                    .addComponent(rotComprimento)
                    .addComponent(cxComprimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotPingente)
                    .addComponent(cxPingente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtMarca)
                    .addComponent(cxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotCodigo)
                    .addComponent(cxCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btInserir)
                    .addComponent(btConsultar)
                    .addComponent(btAlterar)
                    .addComponent(btExcluir)
                    .addComponent(btDesconto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSair)
                    .addComponent(btLimpar)
                    .addComponent(btListar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListarActionPerformed
        popularTbCorrente();
    }//GEN-LAST:event_btListarActionPerformed

    private void btInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirActionPerformed
        try {
            inserirCorrente();
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
        consCorrenteCod();
    }//GEN-LAST:event_btConsultarActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        altCorrenteCod();
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        excCorrenteCod();
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

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

            for (Corrente corrente : gc.getBdCorrente()) { 
                if (corrente.getI().getCod() == cod) {
                    double desconto = corrente.calcularDesconto();
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
        
    
    public void popularTbCorrente() {
    DefaultTableModel modelo = (DefaultTableModel) tbCorrente.getModel();
    
    
    modelo.setRowCount(0);
    
    for (Corrente c : gc.getBdCorrente()) {
        modelo.addRow(new Object[]{
            c.getValor(),
            c.getMaterial(),
            c.getComprimento(),
            c.getPingente(),                
            c.getI().getMarca(),
            c.getI().getCod()   
        });
    }
}

    public void excCorrenteCod() {
    Corrente c1 = new Corrente();
    c1.getI().setCod(Integer.parseInt(cxCodigo.getText()));

    c1 = gc.delCorrenteCod(c1);
    if (c1 == null) {
        JOptionPane.showMessageDialog(
                null,
                "Corrente excluída com sucesso!",
                "Exclusão de Corrente",
                JOptionPane.INFORMATION_MESSAGE
        );
    } else {
        JOptionPane.showMessageDialog(
                null,
                "Não existe uma corrente com esse código \n Verifique os dados",
                "Exclusão de Corrente",
                JOptionPane.ERROR_MESSAGE
        );
    }
    limpar();
}

    public void altCorrenteCod() {
    Corrente c1 = new Corrente();
    c1.getI().setCod(Integer.parseInt(cxCodigo.getText()));  

    c1 = gc.atualizaCorrenteCod(c1);  
    
    if (c1 != null) {
        
        cxValor.setText(Integer.toString(c1.getValor()));
        cxMaterial.setText(c1.getMaterial());
        cxComprimento.setText(Integer.toString(c1.getComprimento()));
        cxPingente.setText(c1.getPingente());
        cxMarca.setText(c1.getI().getMarca());
        cxCodigo.setText(Integer.toString(c1.getI().getCod()));
        
      
        JOptionPane.showMessageDialog(
            null,
            "Corrente alterada com sucesso! \n Verifique os dados.",
            "Alteração de Corrente",
            JOptionPane.INFORMATION_MESSAGE
        );
    } else {
       
        JOptionPane.showMessageDialog(
            null,
            "Não existe Corrente com este código cadastrado \n Verifique os dados.",
            "Alteração de Corrente",
            JOptionPane.ERROR_MESSAGE
        );
    }
    limpar();  
}

    public void consCorrenteCod() {
    Corrente c1 = new Corrente();
    c1.getI().setCod(Integer.parseInt(cxCodigo.getText()));
    
    c1 = gc.consCorrenteCod(c1);
    if (c1 != null) {
        cxValor.setText(Integer.toString(c1.getValor()));
        cxMaterial.setText(c1.getMaterial());
        cxComprimento.setText(Integer.toString(c1.getComprimento()));
        cxPingente.setText(c1.getPingente());
        cxMarca.setText(c1.getI().getMarca());
        cxCodigo.setText(Integer.toString(c1.getI().getCod()));
        JOptionPane.showMessageDialog(
                null,
                "Corrente encontrada com sucesso \nVerifique os Dados",
                "Pesquisa de Corrente",
                1
        );
    } else {
        JOptionPane.showMessageDialog(
                null,
                "Não existe corrente com este código",
                "Pesquisa de Corrente",
                1
        );
        limpar();
    }
}

    public void inserirCorrente() throws MatException, ValorGrdException {
        c1 = new Corrente();
        c1.setValor(Integer.parseInt(cxValor.getText()));
        c1.setMaterial(cxMaterial.getText());
        c1.setComprimento(Integer.parseInt(cxComprimento.getText()));
        c1.setPingente(cxPingente.getText());
        c1.getI().setMarca(cxMarca.getText());
        c1.getI().setCod(Integer.parseInt(cxCodigo.getText())); 
    
        c1 = gc.insCorrente(c1);
        if (c1 != null) {
            JOptionPane.showMessageDialog(
                    null,
                    "Corrente cadastrada com sucesso!!!",
                    "Cadastro de Corrente",
                    JOptionPane.INFORMATION_MESSAGE
            );
            limpar();
        }else {
            JOptionPane.showMessageDialog(
                    null,
                    "Código do corrente duplicado",
                    "Erro no cadastro de cprremte",
                    JOptionPane.ERROR_MESSAGE
            );
            limpar();
        }
    }

    
    public void limpar(){
        cxValor.setText("");
        cxMaterial.setText("");
        cxComprimento.setText("");
        cxPingente.setText("");
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
    private javax.swing.JTextField cxCodigo;
    private javax.swing.JTextField cxComprimento;
    private javax.swing.JTextField cxMarca;
    private javax.swing.JTextField cxMaterial;
    private javax.swing.JTextField cxPingente;
    private javax.swing.JTextField cxValor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel rotCodigo;
    private javax.swing.JLabel rotComprimento;
    private javax.swing.JLabel rotMaterial;
    private javax.swing.JLabel rotPingente;
    private javax.swing.JLabel rotValor;
    private javax.swing.JLabel rtMarca;
    private javax.swing.JTable tbCorrente;
    // End of variables declaration//GEN-END:variables
}
