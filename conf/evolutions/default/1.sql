# --- !Ups

CREATE TABLE Test (
  id           INT NOT NULL,
  name         VARCHAR(45)         NOT NULL,
  PRIMARY KEY (id)
);

# --- !Downs

DROP TABLE Test;

