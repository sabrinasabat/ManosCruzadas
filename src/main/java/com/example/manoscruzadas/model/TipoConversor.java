package com.example.manoscruzadas.model;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

//REFERENCIA: https://www.baeldung.com/jpa-attribute-converters
@Converter(autoApply = true) //es para siempre que se encuentre el campo del tipo "tipo", aplica automaticamente este conversor
public class TipoConversor implements AttributeConverter<Tipo, String> {

    @Override
    public String convertToDatabaseColumn(Tipo tipo){ //eses nombres son obligatorios, porque vienen de la interfaz "AttributeConverter" del JPA
        if(tipo == null){
            return null;
        }
        return tipo.getValor(); //como ofrece o busca
    }

    @Override
    public Tipo convertToEntityAttribute(String valor){
        if(valor == null){
            return null;
        }
        return Tipo.ddbbTipo(valor); //convierte para enum
    }
}
