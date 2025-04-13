package com.example.manoscruzadas.model;

public enum EstadoMatch {
    PENDIENTE("pendiente"),
    ACEPTO("acepto"),
    RECHAZADO("rechazado");

    private final String valor;

    EstadoMatch(String valor){
        this.valor = valor;
    }

    public String getValor(){
        return valor;
    }

    public static EstadoMatch ddbbEstadoMatch(String valor){
        EstadoMatch[] estados = EstadoMatch.values();
        for(int i=0; i<estados.length; i++){
            if(estados[i].getValor().equals(valor)){
                return estados[i];
            }
        }
        throw new IllegalArgumentException("No existe el estado: "+ valor);
    }
}
