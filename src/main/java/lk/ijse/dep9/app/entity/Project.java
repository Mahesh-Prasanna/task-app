package lk.ijse.dep9.app.entity;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Project implements SuperEntity{
    private int id;
    private String name;
    private User user;
    private Set<Task> taskSet = new HashSet<>();

    public Project(String name, User user) {
        this.name = name;
        this.user = user;
    }

}
