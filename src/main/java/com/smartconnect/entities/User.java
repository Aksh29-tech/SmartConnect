package com.smartconnect.entities;

import jakarta.persistence.*;
// import jakarta.persistence.ElementCollection;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.*;
// import java.util.stream.Collectors;

// import org.springframework.security.core.GrantedAuthority;
// import org.springframework.security.core.authority.SimpleGrantedAuthority;
// import org.springframework.security.core.userdetails.UserDetails;

@Entity(name = "user")
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User{

    @Id
    private String userId;

    @Column(name = "user_name", nullable = false)
    private String name;
    @Column(unique = true, nullable = false)
    private String email;
    @Getter(AccessLevel.NONE)
    private String password;
    @Column(length = 1000)
    private String about;
    @Column(length = 1000)
    private String profilePic;
    private String phoneNumber;

    @Getter(value = AccessLevel.NONE)
    @Builder.Default
    // information
    private boolean enabled = false;

    @Builder.Default
    private boolean emailVerified = false;
    @Builder.Default
    private boolean phoneVerified = false;

    @Enumerated(value = EnumType.STRING)
    // SELF, GOOGLE, FACEBOOK, TWITTER, LINKEDIN, GITHUB
    @Builder.Default
    private Providers provider = Providers.SELF;
    private String providerUserId;

    // add more fields if needed
    @Builder.Default
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private List<Contact> contacts = new ArrayList<>();

    // @ElementCollection(fetch = FetchType.EAGER)
    // private List<String> roleList = new ArrayList<>();

    // private String emailToken;

    // @Override
    // public Collection<? extends GrantedAuthority> getAuthorities() {
    //     // list of roles[USER,ADMIN]
    //     // Collection of SimpGrantedAuthority[roles{ADMIN,USER}]
    //     Collection<SimpleGrantedAuthority> roles = roleList.stream().map(role -> new SimpleGrantedAuthority(role))
    //             .collect(Collectors.toList());
    //     return roles;
    // }

    // // for this project:
    // // email id hai wahi hamare username

    // @Override
    // public String getUsername() {
    //     return this.email;
    // }

    // @Override
    // public boolean isAccountNonExpired() {
    //     return true;
    // }

    // @Override
    // public boolean isAccountNonLocked() {
    //     return true;
    // }

    // @Override
    // public boolean isCredentialsNonExpired() {
    //     return true;
    // }

    // @Override
    // public boolean isEnabled() {
    //     return this.enabled;
    // }

    // @Override
    // public String getPassword() {
    //     return this.password;
    // }

}
