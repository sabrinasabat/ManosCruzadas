package com.example.manoscruzadas.model;

public enum Tipo {

    //REFERENCIA: https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html
    OFRECE("ofrece"),
    BUSCA("busca");

    private final String valor;

    Tipo(String valor){
        this.valor = valor;
    }

    public String getValor(){
        return valor;
    }

    public static Tipo ddbbTipo(String valor){
        Tipo[] tipos = Tipo.values();
        for(int i=0; i<tipos.length; i++){
            if(tipos[i].getValor().equals(valor)){
                return tipos[i];
            }
        }
        throw new IllegalArgumentException("No existe el tipo: "+ valor);
    }
}
