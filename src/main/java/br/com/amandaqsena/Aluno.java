package br.com.amandaqsena;

public class Aluno {

    private String nome;
    private int numeroMatricula;

    public Aluno(String nome, int numeroMatricula) {
        if (nome == null) {
            throw new NullPointerException("Nome não pode ser nulo");
        }
        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    @Override
    public String toString() {
        return "[Aluno: " + this.nome + ", matricula: " + this.numeroMatricula + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Aluno outroAluno = (Aluno) obj;
        if (nome == null) {
            if (outroAluno.nome != null)
                return false;
        } else if (!nome.equals(outroAluno.nome))
            return false;
        if (numeroMatricula != outroAluno.numeroMatricula)
            return false;
        return true;
    }
    @Override
        public int hashCode(){
        return this.nome.hashCode();
    }
}
