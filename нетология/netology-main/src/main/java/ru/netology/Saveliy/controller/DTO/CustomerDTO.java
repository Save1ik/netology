package ru.netology.Saveliy.controller.DTO;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class CustomerDTO {
    private int id;
    private String name;
}
