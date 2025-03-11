package walmart.user.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import walmart.user.service.dto.UserDTO;
import walmart.user.service.entity.User;
import walmart.user.service.repository.UserRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<UserDTO> getAllUsers() {
        return userRepository.findAll().stream()
                .map(user -> new UserDTO(user.getUsername(), user.getEmail(), user.getRole()))
                .collect(Collectors.toList());
    }

    public UserDTO getUserByUsername(String username) {
        User user = userRepository.findByUsername(username);
        return new UserDTO(user.getUsername(), user.getEmail(), user.getRole());
    }

    public UserDTO createUser(User user) {
        User savedUser = userRepository.save(user);
        return new UserDTO(savedUser.getUsername(), savedUser.getEmail(), savedUser.getRole());
    }
}

