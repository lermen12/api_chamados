package com.example.help_desk.model;

import com.example.help_desk.enums.RoleStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.Set;
import lombok.Data;

@Entity
@Data
public class Employee {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long idEmployee;
  private String name;
  private String lasname;
  private String email;
  private String password;
  private String companyPosition;
  @Enumerated(EnumType.STRING)
  private RoleStatus roleStatus;
  @JsonManagedReference
  @OneToMany(mappedBy = "employee")
  @JsonIgnore
  private Set<Support> supports;

}
