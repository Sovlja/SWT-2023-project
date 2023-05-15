package com.inposterProject.inposter.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "groupRequests")
public class GroupRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "approved")
    private boolean approved;

    @Column(name = "created")
    private LocalDateTime createdAt;

    @Column(name = "at")
    private LocalDateTime at;
}
