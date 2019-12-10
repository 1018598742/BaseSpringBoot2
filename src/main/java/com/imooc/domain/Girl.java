package com.imooc.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Data
public class Girl {


    @Id
    @GeneratedValue
    private Integer id;

    @NotBlank
    private String cupSize;

    @Min(value = 18,message = "未成年少女禁止入内")
    @NotNull
    private Integer age;

    @NotNull(message = "金额必传")
    private Double money;

}
