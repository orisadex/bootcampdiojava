package br.com.dio;

import br.com.dio.model.gato;

public class primeiroprogramajava {
    public static void main(String[] args) {
        //gato gato = new gato();

        Livro livro01 = new Livro("Dom Quixote",300);
        System.out.println(livro01);

        /*int a = 10;
        int b = 10;

        System.out.println("Hello World! " + (a+b));*/
    }
}

class Livro {
    private String nome;
    private Integer numPaginas;

    public Livro(String nome, Integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}
