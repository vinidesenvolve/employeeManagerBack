package tech.getarrays.employeeManager.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Employee implements Serializable {
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;

    private String name;

    private String email;

    private String jobTitle;

    private String phone;

    private String imageUrl;

    @Column(nullable = false, updatable = false)
    private String employeeCode;

    @Override
    public String toString(){
        return "Employee{" + 
            "id: " + id + '\'' +
            "name: " + name + '\'' +
            "email: " + email + '\'' +
            "job title: " + jobTitle + '\'' + 
            "phone: " + phone + '\'' +
            "imageUrl: " + imageUrl + '\'' +
            "}";
    }
}
