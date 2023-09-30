public class Professor extends Pessoa {

    private String especializacao;
    private int salario;

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    public void infoProfessor(){
        System.out.println("Nome do professor é: "+ getNome());
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }


}
