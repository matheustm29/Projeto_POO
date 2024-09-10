//Matheus Ferreira Alphonse dos Anjos 2454220
import javax.swing.table.DefaultTableModel;

public class FormRelCorrente extends javax.swing.JFrame {
    private Corrente c1 = new Corrente();
    private BDCorrente gc = BDCorrente.geraGerCorrente();
    private static FormRelCorrente relGerPesUnic;
    
    private FormRelCorrente() {
        initComponents();
    }
    
    //MÉTODO SINGLETON
    public static FormRelCorrente geraRelCorrente(){
        if(relGerPesUnic == null){
            relGerPesUnic = new FormRelCorrente();
        }
        return relGerPesUnic;
    }


   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbCorrente2 = new javax.swing.JTable();
        rotRelCorrente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        tbCorrente2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbCorrente2);

        rotRelCorrente.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        rotRelCorrente.setText("Relatório de Corrente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(rotRelCorrente)
                        .addGap(120, 120, 120))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(rotRelCorrente)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        popularTbCorrente();
    }//GEN-LAST:event_formWindowActivated
    
  
    public void popularTbCorrente() {
    DefaultTableModel modelo = (DefaultTableModel) tbCorrente2.getModel();
    
    int posLin = 0;
    modelo.setRowCount(posLin);
    
    
    for (Corrente c : gc.getBdCorrente()) {
        modelo.insertRow(posLin, new Object[]{
            c.getValor(),
            c.getMaterial(),
            c.getComprimento(),
            c.getPingente(),                
            c.getI().getMarca(),
            c.getI().getCod()  
        });
        posLin++;
    }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel rotRelCorrente;
    private javax.swing.JTable tbCorrente2;
    // End of variables declaration//GEN-END:variables
}
