package com.devsuperior.dsmeta.entities;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_sales")
@NoArgsConstructor
@Getter
@Setter
public class Sale {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String sellerName;
  private Integer visited;
  private Integer deals;
  private Double amount;
  private LocalDate date;
}
