package com.example.manoscruzadas.model;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class EstadoMatchConversor implements AttributeConverter<EstadoMatch, String> {

    @Override
    public String convertToDatabaseColumn(EstadoMatch estado){
        if(estado==null) {
            return null;
        }
        return estado.getValor();
    }

    @Override
    public EstadoMatch convertToEntityAttribute(String valor){
        if(valor==null){
            return null;
        }
        return EstadoMatch.ddbbEstadoMatch(valor);
    }
}
