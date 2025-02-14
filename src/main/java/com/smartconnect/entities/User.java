package com.smartconnect.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    @Id
    private String userId;
    @Column(name = "user_name", nullable = false)
    private String userName;
    @Column(unique = true, nullable = false)
    private String userEmail;
    private String userPassword; 
    @Column(length = 10000)
    private String about;
    private String phoneNumber;
    @Column(length = 10000)
    private String profilePictureLink; 

    private boolean enabled=false;
    private boolean emailVerified=false;
    private boolean phoneNumberVerified=false;

    private Providers provider=Providers.SELF;
    private String providerUserId;

    // @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    // private List<Contact> userContacts = new ArrayList<>();
}
