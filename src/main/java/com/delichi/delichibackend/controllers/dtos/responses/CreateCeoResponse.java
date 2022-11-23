package com.delichi.delichibackend.controllers.dtos.responses;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @Builder
public class CreateCeoResponse {
    private Long id;
    private String name;
    private String firstSurname;
    private String secondSurname;
    private String email;
}
