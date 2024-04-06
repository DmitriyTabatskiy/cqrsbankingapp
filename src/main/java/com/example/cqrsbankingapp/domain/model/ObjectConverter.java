package com.example.cqrsbankingapp.domain.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import lombok.SneakyThrows;

@Converter
public class ObjectConverter implements AttributeConverter<Object, String> {

    @SneakyThrows
    @Override
    public String convertToDatabaseColumn(Object object) {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(object);
    }

    @Override
    public Object convertToEntityAttribute(String string) {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.convertValue(string, Object.class);
    }
}
