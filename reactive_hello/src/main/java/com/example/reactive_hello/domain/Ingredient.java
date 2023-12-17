package com.example.reactive_hello.domain;

import org.springframework.data.annotation.Id;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@EqualsAndHashCode(
    exclude =  "id"
)
public class Ingredient {
    @Id
    private Long id;
    private @NonNull String slug;
    private @NonNull String name;
    private @NonNull Type type;

    public enum Type{
        WRAP, PROTEIN, VEGGIES, CHEESE,  SAUSE
    }
}
