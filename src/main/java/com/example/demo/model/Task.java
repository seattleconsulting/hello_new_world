package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name="task")
public class Task implements Serializable  {

    /**
	* ID
	*/
    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    /**
	* 名前
    */
	@Column(name="name")
	private String name;

	/**
	* 担当者
    */
	@Column(name="tantosha")
	private String tantosha;
}