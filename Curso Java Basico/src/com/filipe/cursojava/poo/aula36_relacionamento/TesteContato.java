package com.filipe.cursojava.poo.aula36_relacionamento;

public class TesteContato {
    public static void main(String[] args) {

        Contato contato = new Contato();

        contato.setNome("Tyrion");
        //contato.setEndereco("kings Landing");
        //contato.setTelefone("11 99999-9999");

        //relacionamento Tem-um Endereço
        Endereco end = new Endereco();

        end.setNumero("Rua Game of Thrones");
        end.setNumero("n/a");
        end.setComplemento("-");
        end.setCidade("Kings Landing");
        end.setEstado("Westeros");
        end.setCep("99999-999");

        contato.setEndereco(end);

        //relacionamento Tem-muitos telefones
        Telefone telefone = new Telefone();

        telefone.setTipo("Celular");
        telefone.setDdd("11");
        telefone.setNumero("99999-9999");

        Telefone telefone2 = new Telefone();

        telefone2.setTipo("Casa");
        telefone2.setDdd("11");
        telefone2.setNumero("88888-8888");

        Telefone[] telefones = new Telefone[2];
        telefones[0] = telefone;
        telefones[1] = telefone2;


        contato.setTelefones(telefones);


        //Teste saída no console
        System.out.println(contato.getNome());


        //Forma de verificação para deixa o codigo mais seguro.
        if (contato != null && contato.getEndereco() != null) {
            System.out.println(contato.getEndereco().getCidade());
        }

        if (contato != null & contato.getTelefones() != null) {
            for ( Telefone t : contato.getTelefones()){
                System.out.println(t.getDdd()+t.getNumero());
            }
        }
    }
}
