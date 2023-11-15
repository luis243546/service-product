package com.academy.digitallab.store.product.entity;

import lombok.*;
import jakarta.persistence.*;


@Entity
@Table(name="tbl_categories")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor


public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    
}
