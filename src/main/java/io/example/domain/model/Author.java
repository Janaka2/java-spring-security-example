package io.example.domain.model;

import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Document(collection = "authors")
@Getter @Setter
public class Author extends ComparableEntity {

  @Id
  private ObjectId id;

  @CreatedBy
  private ObjectId creatorId;
  @LastModifiedBy
  private ObjectId modifierId;

  @CreatedDate
  private LocalDateTime createdAt;
  @LastModifiedDate
  private LocalDateTime modifiedAt;

  private String fullName;
  private String about;
  private String nationality;
  private Set<String> genres = new HashSet<>();

  private Set<ObjectId> bookIds = new HashSet<>();

}
