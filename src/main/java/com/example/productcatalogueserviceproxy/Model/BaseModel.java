package com.example.productcatalogueserviceproxy.Model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public abstract class BaseModel {
   private Long Id;
   private Date createdAt;
   private Date lastUpdatedAt;
   private Status status;
}
