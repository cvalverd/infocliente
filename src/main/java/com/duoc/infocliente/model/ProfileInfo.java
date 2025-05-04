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
@Table(name="profile_info")
public class ProfileInfo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "profile_info_seq")
    @SequenceGenerator(name="profile_info_seq",sequenceName = "profile_info_seq",allocationSize = 1,initialValue = 1000)
    private Long id;

    @Column
    private String title;

    @Column
    private String description;

    @Column
    private String profilePicUrl="/img/default_profile.png";

    @Column
    private String posts="0";

    @Column
    private String followers="0";

    @Column
    private String following="0";

}
