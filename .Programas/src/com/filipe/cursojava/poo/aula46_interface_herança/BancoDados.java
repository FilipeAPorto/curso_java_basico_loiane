package com.filipe.cursojava.poo.aula46_interface_herança;

public interface BancoDados extends SqlDCL,SqlDML,SqlDDL{

    void abrirConexao();
    void fecharConexao();
}
