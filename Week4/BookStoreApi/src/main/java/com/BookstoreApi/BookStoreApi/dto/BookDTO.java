package com.BookstoreApi.BookStoreApi.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

@Data
public class BookDTO {
    private Long id;
    private String title;
    private String author;
    private double price;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "ISBN ###-###-###")
    private String isbn;
}