package com.duoc.infocliente.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Client {
    private String id;
    private String username;
    private String name;
    private String email;
    private ProfileInfo profileinfo;
}
