package com.filipe.cursojava.poo.aula46_interface_herança;

public interface SqlDDL {

    void create(String query);
    void alter(String query);
    void drop(String query);
}
