//Matheus Ferreira Alphonse dos Anjos 2454220
import javax.swing.table.DefaultTableModel;


 public class FormRelPulseira extends javax.swing.JFrame {
    private Pulseira p1 = new Pulseira();
    private BDPulseira gp = BDPulseira.geraGerPulseira();
    private static FormRelPulseira relGerPesUnic;
    
    private FormRelPulseira() {
        initComponents();
    }
    
    //MÉTODO SINGLETON
    public static FormRelPulseira geraRelPulseira(){
        if(relGerPesUnic == null){
            relGerPesUnic = new FormRelPulseira();
        }
        return relGerPesUnic;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbPulseira2 = new javax.swing.JTable();
        rotRelPulseira = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        tbPulseira2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbPulseira2);

        rotRelPulseira.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        rotRelPulseira.setText("Relatório de Pulseira");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(rotRelPulseira)
                .addContainerGap(107, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(rotRelPulseira)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        popularTbPulseira();
    }//GEN-LAST:event_formWindowActivated
    
    public void popularTbPulseira() {
    DefaultTableModel modelo = (DefaultTableModel) tbPulseira2.getModel();
    
    int posLin = 0;
    modelo.setRowCount(posLin);
    
    
    for (Pulseira p : gp.getBdPulseira()) {
        modelo.insertRow(posLin, new Object[]{
            p.getValor(),
            p.getMaterial(),
            p.getCircunferencia(),
            p.getDesign(),                
            p.getI().getMarca(),
            p.getI().getCod()  
        });
        posLin++;
    }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel rotRelPulseira;
    private javax.swing.JTable tbPulseira2;
    // End of variables declaration//GEN-END:variables
}
