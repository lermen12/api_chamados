package com.example.help_desk.model;

import com.example.help_desk.enums.OrderStatus;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.util.Date;
import lombok.Data;

@Entity
@Data
public class Support{

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long idSuport;
  private String title;
  private String comment;
  private Date creationDate;
  private Date finalizedDate;
  @Enumerated(EnumType.STRING)
  private OrderStatus orderStatus;
  @JsonBackReference
  @ManyToOne
  @JoinColumn(name = "employee_id")
  private Employee employee;
}
