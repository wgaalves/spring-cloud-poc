package com.musketeers.springpoc.authservice.model;


import com.musketeers.springpoc.authservice.enums.Authorities;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.core.userdetails.UserDetails;
import java.util.HashSet;
import java.util.Set;

@Data
@Document
public class User implements UserDetails {
    @Id
    private String id;

    private String username;

    private String email;

    private String password;

    private Boolean activated;

    private String access_key;

    private String reset_key;

    private Set<Authorities> authorities = new HashSet<>();


    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return this.activated;
    }
}
