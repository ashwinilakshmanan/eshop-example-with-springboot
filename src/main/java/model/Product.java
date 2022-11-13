package model;

import lombok.*;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Product {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int quantity;
}
