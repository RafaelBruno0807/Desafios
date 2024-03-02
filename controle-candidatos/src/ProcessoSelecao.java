import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSelecao {
    public static void main(String[] args) {
        selecaoCandidatos();
    }
    static void selecaoCandidatos() {
    String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
    
    int candidatosSelecionados = 0;
    int candidatosAtual = 0;
    double salarioEmpresa = 2000.0;
    while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
        String candidato = candidatos[candidatosAtual];
        double salarioPretendido = valorPretendido();

        System.out.println("O candidato " + candidato + " Solicitou este valor de salario " + salarioPretendido);

        if (salarioEmpresa >= salarioPretendido) {
            System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
            candidatosSelecionados++;
            
        }
        candidatosAtual++;
    }


    }
    static double valorPretendido() {
         return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioEmpresa = 2000.0;
        if (salarioEmpresa > salarioPretendido) {
            System.out.println("Ligar para candidato");
        }else if (salarioEmpresa == salarioPretendido) {
            System.out.println("Ligar para o candidato com a contra proposta");
        }
        else{
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
    }
    
}