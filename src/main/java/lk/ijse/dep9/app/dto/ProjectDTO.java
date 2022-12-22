package lk.ijse.dep9.app.dto;


import lk.ijse.dep9.app.util.ValidationGroups;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.sql.rowset.serial.SerialArray;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectDTO implements Serializable {
    @Null(groups = ValidationGroups.Create.class, message = "Project Id can't be specified")
    private Integer id;
    @NotBlank(message = "Project name can't be empty or null")
    @Length(min = 3, message = "Project name should be at least 3 characters long")
    private String name;
}
