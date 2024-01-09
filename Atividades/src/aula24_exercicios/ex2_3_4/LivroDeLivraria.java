package aula24_exercicios.ex2_3_4;

public class LivroDeLivraria {
    public static void main(String[] args) {

        Livro livroDeLivraria = new Livro();

        livroDeLivraria.nome = "Assassinato no Expresso Oriente";
        livroDeLivraria.autor = "Agatha Christie";
        livroDeLivraria.genero = "Romance,Mistério,História de detetives,Ficção policial";
        livroDeLivraria.qtdPagina = 240;
        livroDeLivraria.valor = 54.90;


        System.out.println(livroDeLivraria.nome);
        System.out.println(livroDeLivraria.autor);
        System.out.println(livroDeLivraria.genero);
        System.out.println(livroDeLivraria.qtdPagina);
        System.out.println("R$"+livroDeLivraria.valor);
    }
}
