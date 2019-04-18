package com.example.lucene.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

/**
 * Greated by Terry on 2019/4/16
 * Time: 14:44
 */
@Entity
@lombok.Getter
@Setter
public class uploadfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @Column(nullable = false, length = 20)
    @ApiModelProperty("文件名称")
    private String filename;

    @Column(nullable = false, length = 20)
    @ApiModelProperty("文件地址")
    private String address;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public String getFilename() {
        return filename;
    }

    public String getAddress() {
        return address;
    }
}
