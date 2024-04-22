package mk.ukim.finki.lab1_emt_213064.service.impl;
/*
import mk.ukim.finki.lab1_emt_213064.model.MyUser;
import mk.ukim.finki.lab1_emt_213064.model.dto.MyUserDto;
import mk.ukim.finki.lab1_emt_213064.model.exceptions.UserNotFoundException;
import mk.ukim.finki.lab1_emt_213064.repository.MyUserRepository;
import mk.ukim.finki.lab1_emt_213064.service.MyUserService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MyUserServiceImpl implements MyUserService {

    private final MyUserRepository myUserRepository;
    private final PasswordEncoder passwordEncoder;

    public MyUserServiceImpl(MyUserRepository myUserRepository, PasswordEncoder passwordEncoder) {
        this.myUserRepository = myUserRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public List<MyUser> findAll() {
        return this.myUserRepository.findAll();
    }

    @Override
    public Optional<MyUser> findById(long id) {
        return this.myUserRepository.findById(id);
    }

    @Override
    public Optional<MyUser> save(MyUserDto myUser) {
        String password = myUser.getPassword();
        password = passwordEncoder.encode(password);
        MyUser myUser1 = new MyUser(myUser.getUsername(), password, myUser.getRole());
        return Optional.of(this.myUserRepository.save(myUser1));
    }

    @Override
    public Optional<MyUser> edit(Long id, MyUserDto user) throws UserNotFoundException {
       MyUser myUser = this.findById(id)
               .orElseThrow(() -> new UserNotFoundException(id));
       myUser.setUsername(user.getUsername());
       myUser.setPassword(user.getPassword());
       myUser.setRole(user.getRole());
       return Optional.of(this.myUserRepository.save(myUser));
    }

    @Override
    public void delete(Long id) {
      this.myUserRepository.deleteById(id);
    }
}*/
