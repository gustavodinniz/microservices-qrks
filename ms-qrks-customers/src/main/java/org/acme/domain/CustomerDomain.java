package org.acme.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "customer")
public class CustomerDomain {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String phone;

    private String email;

    private String address;

    private Long age;
}
