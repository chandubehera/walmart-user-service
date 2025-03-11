package walmart.user.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import walmart.user.service.dto.UserDTO;
import walmart.user.service.entity.User;
import walmart.user.service.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserDTO> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{username}")
    public UserDTO getUserByUsername(@PathVariable String username) {
        return userService.getUserByUsername(username);
    }

    @PostMapping
    public UserDTO createUser(@RequestBody User user) {
        return userService.createUser(user);
    }
}
