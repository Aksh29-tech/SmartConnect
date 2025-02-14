package com.smartconnect.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Contact {
    @Id
    private String contactId;
    private String contactName; 
    private String contactEmail;
    private String contactPhoneNumber;
    private String contactAddress;
    private String contactPicture;
    @Column(length = 10000)
    private String contactDescription;
    private boolean isFavorite=false;
    private String contactWebsiteLink;
    private String contactLinkedinLink;

    // @ManyToOne
    // private User user;
}
