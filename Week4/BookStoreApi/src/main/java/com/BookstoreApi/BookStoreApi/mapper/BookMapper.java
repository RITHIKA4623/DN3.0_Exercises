package com.BookstoreApi.BookStoreApi.mapper;

import com.BookstoreApi.BookStoreApi.dto.BookDTO;
import com.BookstoreApi.BookStoreApi.model.Book;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BookMapper {
    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    BookDTO bookToBookDTO(Book book);

    Book bookDTOToBook(BookDTO bookDTO);
}