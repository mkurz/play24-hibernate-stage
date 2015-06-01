# --- !Ups

CREATE TABLE Test (
  id           BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT,
  name         VARCHAR(45)         NOT NULL,
  PRIMARY KEY (id)
)
  ENGINE = InnoDB;

# --- !Downs

DROP TABLE Test;

