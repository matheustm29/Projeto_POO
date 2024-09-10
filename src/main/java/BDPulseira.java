//Matheus Ferreira Alphonse dos Anjos 2454220
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class BDPulseira {
    private Pulseira pulseira;
    private List<Pulseira> bdPulseira;
    private static BDPulseira gpUnic;

    private BDPulseira() {
        bdPulseira = new ArrayList<Pulseira>();
    }

    //MÉTODO SINGLETON
    public static BDPulseira geraGerPulseira() {
        if (gpUnic == null) {
            gpUnic = new BDPulseira();
        }
        return gpUnic;
    }

    public List<Pulseira> getBdPulseira() {
        return bdPulseira;
    }

    public Pulseira insPulseira(Pulseira pulseira) {
        for (Pulseira p : bdPulseira) {
            if (p.getI().getCod() == pulseira.getI().getCod()) {
                return null;
            }
        }
        bdPulseira.add(pulseira);
        return pulseira;
    }

    public Pulseira consPulseiraCod(Pulseira pulseira) {
        for (int i = 0; i < bdPulseira.size(); i++) {
            if (pulseira.getI().getCod() == bdPulseira.get(i).getI().getCod()) {
                return bdPulseira.get(i);
            }
        }
        return null;
    }

    public Pulseira delPulseiraCod(Pulseira pulseira) {
        Pulseira pulseiraEncontrada = consPulseiraCod(pulseira);
        if (pulseiraEncontrada != null) {
            bdPulseira.remove(pulseiraEncontrada); 
            return null; 
        } else {
            return pulseira; 
        }
    }

    public Pulseira atualizaPulseiraCod(Pulseira pulseira) {
        for (int i = 0; i < bdPulseira.size(); i++) {

            if (bdPulseira.get(i).getI().getCod() == pulseira.getI().getCod()) {
                pulseira = bdPulseira.get(i);

                String circunferencia = JOptionPane.showInputDialog(
                        null,
                        "Informe a NOVA circunferência",
                        "Atualizar CIRCUNFERÊNCIA",
                        JOptionPane.QUESTION_MESSAGE
                );
                pulseira.setCircunferencia(Integer.parseInt(circunferencia));
                
                String design = JOptionPane.showInputDialog(
                        null,
                        "Informe o NOVO design",
                        "Atualizar DESIGN",
                        JOptionPane.QUESTION_MESSAGE
                );
                pulseira.setDesign(design);
                
                String marca = JOptionPane.showInputDialog(
                        null,
                        "Informe a NOVA marca",
                        "Atualizar MARCA",
                        JOptionPane.QUESTION_MESSAGE
                );
                pulseira.getI().setMarca(marca);

                bdPulseira.set(i, pulseira);
                return bdPulseira.get(i);
            }
        }
        return null;
    }
     private Pulseira buscarPulseiraPorCodigo(int codigo) {
            for (Pulseira p : bdPulseira) { 
                if (p.getI().getCod() == codigo) {
                    return p;
                }
            }
        return null;
    }
}
