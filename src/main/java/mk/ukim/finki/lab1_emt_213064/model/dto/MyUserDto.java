package mk.ukim.finki.lab1_emt_213064.model.dto;

import lombok.Data;

@Data
public class MyUserDto {
    private String username;
    private String password;
    private String role;

    public MyUserDto(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }
}
