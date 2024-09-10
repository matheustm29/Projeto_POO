//Matheus Ferreira Alphonse dos Anjos 2454220
import javax.swing.table.DefaultTableModel;


public class FormRelAnel extends javax.swing.JFrame {
    private Anel a1 = new Anel();
    private BDAnel ga = BDAnel.geraGerAnel();
    private static FormRelAnel relGerPesUnic;
    
    private FormRelAnel() {
        initComponents();
    }
    
    //MÉTODO SINGLETON
    public static FormRelAnel geraRelAnel(){
        if(relGerPesUnic == null){
            relGerPesUnic = new FormRelAnel();
        }
        return relGerPesUnic;
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbAnel2 = new javax.swing.JTable();
        rotRelAnel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        tbAnel2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Valor", "Material", "Aro", "Tipo", "Marca", "Codigo"
            }
        ));
        jScrollPane1.setViewportView(tbAnel2);

        rotRelAnel.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        rotRelAnel.setText("Relatório de Anel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(rotRelAnel)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(rotRelAnel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        popularTbAnel();
    }//GEN-LAST:event_formWindowActivated

    public void popularTbAnel() {
    DefaultTableModel modelo = (DefaultTableModel) tbAnel2.getModel();
    
    int posLin = 0;
    modelo.setRowCount(posLin);
    
    
    for (Anel a : ga.getBdAnel()) {
        modelo.insertRow(posLin, new Object[]{
            a.getValor(),
            a.getMaterial(),
            a.getAro(),
            a.getTipo(),                
            a.getI().getMarca(),
            a.getI().getCod()  
        });
        posLin++;
    }
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel rotRelAnel;
    private javax.swing.JTable tbAnel2;
    // End of variables declaration//GEN-END:variables
}
