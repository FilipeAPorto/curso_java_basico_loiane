package aula24.exercicios.ex2_3_4;

public class LivroDeBiblioteca {
    public static void main(String[] args) {

        Livro livroDeBiblioteca = new Livro();

        livroDeBiblioteca.nome = "Verity";
        livroDeBiblioteca.autor = "Colleen Hoover";
        livroDeBiblioteca.genero = "Suspense, Psicológicos mistérios";
        livroDeBiblioteca.qtdPagina = 106;
        livroDeBiblioteca.codigo = 150926;
        livroDeBiblioteca.secao = "G";
        livroDeBiblioteca.prateleira = 6;
        livroDeBiblioteca.prazoDevolucao = 7; //dias


        System.out.println(livroDeBiblioteca.nome);
        System.out.println(livroDeBiblioteca.autor);
        System.out.println(livroDeBiblioteca.genero);
        System.out.println(livroDeBiblioteca.qtdPagina);
        System.out.println(livroDeBiblioteca.codigo);
        System.out.println(livroDeBiblioteca.secao);
        System.out.println(livroDeBiblioteca.prateleira);
        System.out.println(livroDeBiblioteca.prazoDevolucao);


    }
}
