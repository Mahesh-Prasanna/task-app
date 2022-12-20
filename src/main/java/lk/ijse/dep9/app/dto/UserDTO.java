package lk.ijse.dep9.app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO implements Serializable {
    @NotBlank(message = "Full name can't be empty or null")
    @Pattern(regexp = "^[A-Za-z ]+$", message = "Invalid Name")
    private String fullName;
    @NotBlank(message = "username can't be empty")
    private String username;
    @NotEmpty
    @Length(min = 3, message = "Password should be atleast 3 charactors")
    private String password;
}
