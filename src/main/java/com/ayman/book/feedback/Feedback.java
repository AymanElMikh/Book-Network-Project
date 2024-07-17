package com.ayman.book.feedback;

import com.ayman.book.book.Book;
import com.ayman.book.common.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Feedback extends BaseEntity {
    private Double note;
    private String comment;


    @ManyToOne
    @JoinColumn( name= "book_id")
    private Book book;

}