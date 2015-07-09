package models;

import play.db.jpa.JPA;
import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
public class Test {

    @Id
    @Access(AccessType.PROPERTY) // Do not fetch LAZY loaded entities when just accessing the id, see http://stackoverflow.com/q/2593722
    @GeneratedValue
    @Column(unique = true)
    private UUID id;

    public String name;

    public UUID getId() {
        return this.id;
    }

    public void setId(final UUID id) {
        this.id = id;
    }
    public static List<Test> findAll() {
        return JPA.em().createQuery("from Test", Test.class).getResultList();
    }
}
