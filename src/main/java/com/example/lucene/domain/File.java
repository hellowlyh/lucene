package com.example.lucene.domain;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

/**
 * Greated by Terry on 2019/4/16
 * Time: 14:44
 */
@Entity
@lombok.Setter
@lombok.Getter
public class File {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @Column(nullable = false, length = 20)
    private String filename;

    @Column(nullable = false, length = 20)
    private String address;
}
