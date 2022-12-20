package lk.ijse.dep9.app.api;

import lk.ijse.dep9.app.dto.UserDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
@CrossOrigin
public class UserController {

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = "application/json")
    public void createUserAccount(@RequestBody UserDTO user){
        System.out.println(user);
    }
    @PatchMapping("/me")
    public void updateUserAccountDetails(){

    }
    @GetMapping
    public void getUserAccountDetails(){

    }
    @DeleteMapping("/me")
    public void deleteUserAccount(){

    }


}