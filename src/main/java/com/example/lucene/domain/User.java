package com.example.lucene.domain;





import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * Greated by Terry on 2019/4/16
 * Time: 9:32
 */
@Entity
@lombok.Setter
@lombok.Getter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "用户名不可为空")
    @Column(nullable = false, length = 20)
    @ApiModelProperty("用户名称")
    private  String username; //登录用户名

    @NotBlank(message = "密码不可为空")
    @Column(length = 100)
    @ApiModelProperty("用户密码")
    private String password; //用户密码


    @Column(length = 10)
    @ApiModelProperty("用户角色")
    private String role; //角色控制
}
