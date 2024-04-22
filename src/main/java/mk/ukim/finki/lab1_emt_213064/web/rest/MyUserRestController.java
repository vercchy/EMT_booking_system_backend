package mk.ukim.finki.lab1_emt_213064.web.rest;
/*
import mk.ukim.finki.lab1_emt_213064.model.MyUser;
import mk.ukim.finki.lab1_emt_213064.model.dto.MyUserDto;
import mk.ukim.finki.lab1_emt_213064.model.exceptions.UserNotFoundException;
import mk.ukim.finki.lab1_emt_213064.service.MyUserService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.parameters.P;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/user")
public class MyUserRestController {

    private final MyUserService myUserService;

    public MyUserRestController(MyUserService myUserService) {
        this.myUserService = myUserService;
    }

    @GetMapping
    public List<MyUser> getUsers() {
        return myUserService.findAll();
    }
    @GetMapping("/{id}")
    public ResponseEntity<MyUser> getUserById(@PathVariable Long id)
    {
        return this.myUserService.findById(id)
                .map(user -> ResponseEntity.ok().body(user))
                .orElse(ResponseEntity.badRequest().build());
    }

    @PostMapping("/save")
    public ResponseEntity<MyUser> createUser(@RequestBody MyUserDto myUserDto) {
        return this.myUserService.save(myUserDto)
                .map(user -> ResponseEntity.ok().body(user))
                .orElse(ResponseEntity.badRequest().build());
    }

    @PutMapping("/edit/{id}")
    public ResponseEntity<MyUser> updateUser(@PathVariable Long id,@RequestBody MyUserDto myUserDto) {
        try {
            return this.myUserService.edit(id, myUserDto)
                    .map(user -> ResponseEntity.ok().body(user))
                    .orElse(ResponseEntity.badRequest().build());
        } catch (UserNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteUserById(@PathVariable Long id) {
        this.myUserService.delete(id);
        if(this.myUserService.findById(id).isEmpty())
        {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.badRequest().build();
        }
    }
} */
