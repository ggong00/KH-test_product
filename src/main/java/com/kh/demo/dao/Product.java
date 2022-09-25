package com.kh.demo.dao;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class Product {
  private Long pid; //  pid	NUMBER(10,0)
  private String pname;   //  PNAME	VARCHAR2(30 BYTE)
  private Long count;  //  count	NUMBER(10,0)
  private Long price;   //  PRICE	NUMBER(10,0)

}
