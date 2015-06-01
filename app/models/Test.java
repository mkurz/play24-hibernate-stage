package models;

import play.db.jpa.JPA;
import javax.persistence.*;
import java.util.List;

@Entity
public class Test {

    @Id
    @GeneratedValue
    public Long id;

    public String name;

    public static List<Test> findAll() {
        return JPA.em().createQuery("from Test", Test.class).getResultList();
    }
}
