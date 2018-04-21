package com.example.entity.jpa1;

import java.io.Serializable;
import java.sql.*;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Note: auto-generated by jpa-entity-generator
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity(name = "com.example.entity.jpa1.Tag")
@Table(name = "tag")
public class Tag implements Serializable {

  @Id
  @GeneratedValue
  @Column(name = "`id`")
  private Integer id;
  @Column(name = "`tag`")
  private String tag;
  @Column(name = "`created_at`")
  private Timestamp createdAt;
}