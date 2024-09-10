//Matheus Ferreira Alphonse dos Anjos 2454220
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class BDCorrente {
    private Corrente corrente;
    private List<Corrente> bdCorrente;
    private static BDCorrente gcUnic;

    private BDCorrente() {
        bdCorrente = new ArrayList<Corrente>();
    }

    //MÉTODO SINGLETON
    public static BDCorrente geraGerCorrente() {
        if (gcUnic == null) {
            gcUnic = new BDCorrente();
        }
        return gcUnic;
    }

    public List<Corrente> getBdCorrente() {
        return bdCorrente;
    }

    public Corrente insCorrente(Corrente corrente) {
        for (Corrente c : bdCorrente) {
            if (c.getI().getCod() == corrente.getI().getCod()) {
                return null;
            }
        }
        bdCorrente.add(corrente);
        return corrente;
    }

    public Corrente consCorrenteCod(Corrente corrente) {
        for (int i = 0; i < bdCorrente.size(); i++) {
            if (corrente.getI().getCod() == bdCorrente.get(i).getI().getCod()) {
                return bdCorrente.get(i);
            }
        }
        return null;
    }

    public Corrente delCorrenteCod(Corrente corrente) {
        Corrente correnteEncontrada = consCorrenteCod(corrente);
        if (correnteEncontrada != null) {
            bdCorrente.remove(correnteEncontrada);
            return null; 
        } else {
            return corrente;
        }
    }

    public Corrente atualizaCorrenteCod(Corrente corrente) {
        for (int i = 0; i < bdCorrente.size(); i++) {

            if (bdCorrente.get(i).getI().getCod() == corrente.getI().getCod()) {
                corrente = bdCorrente.get(i);

                String comprimento = JOptionPane.showInputDialog(
                        null,
                        "Informe o NOVO comprimento",
                        "Atualizar COMPRIMENTO",
                        JOptionPane.QUESTION_MESSAGE
                );
                corrente.setComprimento(Integer.parseInt(comprimento));
                
                String pingente = JOptionPane.showInputDialog(
                        null,
                        "Informe o NOVO pingente",
                        "Atualizar PINGENTE",
                        JOptionPane.QUESTION_MESSAGE
                );
                corrente.setPingente(pingente);
                
                String marca = JOptionPane.showInputDialog(
                        null,
                        "Informe a NOVA marca",
                        "Atualizar MARCA",
                        JOptionPane.QUESTION_MESSAGE
                );
                corrente.getI().setMarca(marca);

                bdCorrente.set(i, corrente);
                return bdCorrente.get(i);
            }
        }
        return null;
    }
        private Corrente buscarCorrentePorCodigo(int codigo) {
            for (Corrente corrente : bdCorrente) { 
                if (corrente.getI().getCod() == codigo) {
                    return corrente;
                }
            }
        return null;
    }
}
