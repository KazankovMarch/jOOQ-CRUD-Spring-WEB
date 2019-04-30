package ru.adkazankov.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import ru.adkazankov.service.AuthorService;

import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FilmDto {

    private Integer id;
    private String name;
    private String author;
    private LocalDate releaseDate;

    public void setReleaseDate(String releaseDate) {
        System.out.println(releaseDate);
        this.releaseDate = LocalDate.parse(releaseDate);
    }
}
