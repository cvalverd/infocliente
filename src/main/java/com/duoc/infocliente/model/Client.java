package com.duoc.infocliente.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@AllArgsConstructor
@NoArgsConstructor
@Data

@Entity
@Table(name="Client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "client_seq")
    @SequenceGenerator(name="client_seq", sequenceName = "client_seq",allocationSize = 1,initialValue = 1000)
    private Long id;


    @NotNull
    @Column(unique=true)
    @Size(min=3,max=10)
    private String username;

    @NotNull
    @Column(unique=true)
    @Size(min=3,max=10)
    private String name;

    @NotNull
    @Column(unique=true)
    @Pattern(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$")
    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name= "profile_info_id",referencedColumnName = "id")
    private ProfileInfo profileinfo;

}
