//Matheus Ferreira Alphonse dos Anjos 2454220
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class BDAnel {
    private Anel anel;
    private List<Anel> bdAnel;
    private static BDAnel gaUnic;

    private BDAnel() {
        bdAnel = new ArrayList<Anel>();
    }

    //MÉTODO SINGLETON
    public static BDAnel geraGerAnel() {
        if (gaUnic == null) {
            gaUnic = new BDAnel();
        }
        return gaUnic;
    }

    public List<Anel> getBdAnel() {
        return bdAnel;
    }

    public Anel insAnel(Anel anel) {
        for(Anel a : bdAnel){
            if(a.getI().getCod() == anel.getI().getCod()) {
                return null;
            }
        }
        bdAnel.add(anel);
        return anel;
    }
        
    
   public Anel consAnelCod(Anel anel) {
    for (int i = 0; i < bdAnel.size(); i++) {
        if (anel.getI().getCod() == bdAnel.get(i).getI().getCod()) {
            return bdAnel.get(i);
        }
    }
    return null;
}


   public Anel delAnelCod(Anel anel) {
    Anel anelEncontrado = consAnelCod(anel); 
    if (anelEncontrado != null) {
        bdAnel.remove(anelEncontrado); 
        return null; 
    } else {
        return anel; 
    }
}


   public Anel atualizaAnelCod(Anel anel) {
    for (int i = 0; i < bdAnel.size(); i++) {
    
        if (bdAnel.get(i).getI().getCod() == anel.getI().getCod()) {
            anel = bdAnel.get(i);
            
            String aro= JOptionPane.showInputDialog(
                    null,
                    "Informe o NOVO aro",
                    "Atualizar ARO",
                    JOptionPane.QUESTION_MESSAGE
            );
            anel.setAro(Integer.parseInt(aro));
            String tipo = JOptionPane.showInputDialog(
                    null,
                    "Informe o NOVO tipo",
                    "Atualizar TIPO",
                    JOptionPane.QUESTION_MESSAGE
            );
            anel.setTipo(tipo); 
            String marca = JOptionPane.showInputDialog(
                    null,
                    "Informe a NOVA marca",
                    "Atualizar MARCA",
                    JOptionPane.QUESTION_MESSAGE
            );
            anel.getI().setMarca(marca);  
            bdAnel.set(i, anel);
            return bdAnel.get(i); 
        }
    }
    return null;  
    }
     private Anel buscarAnelPorCodigo(int codigo) {
            for (Anel a : bdAnel) { 
                if (a.getI().getCod() == codigo) {
                    return a;
                }
            }
        return null;
    }
}
