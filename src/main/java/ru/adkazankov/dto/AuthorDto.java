package ru.adkazankov.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthorDto {

    private Integer id;
    private String name;

    @Override
    public String toString() {
        return name;
    }
}
