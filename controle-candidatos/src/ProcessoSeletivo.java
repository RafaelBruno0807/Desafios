public class ProcessoSeletivo {
    public static void main(String[] args) {
        analisarCandidato(1900.0);
        analisarCandidato(2000.0);
        analisarCandidato(2300.0);
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