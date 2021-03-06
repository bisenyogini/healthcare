package com.healthcare.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Specialize {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private  Integer code;
    private  String name;
    private  String note;
}
