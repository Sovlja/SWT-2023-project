package com.inposterProject.inposter.model.dto;

import com.inposterProject.inposter.model.entity.FriendRequest;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

public class FriendRequestDTO {
    private Long id;
    @NotBlank
    private Boolean approved;
    @NotBlank
    private LocalDateTime createdAt;
    @NotBlank
    private LocalDateTime at;

    public FriendRequestDTO (FriendRequest createdFriendRequest) {
        this.id = createdFriendRequest.getId();
        this.approved = createdFriendRequest.getApproved();
        this.createdAt = createdFriendRequest.getCreatedAt();
        this.at = createdFriendRequest.getAt();
    }

    public FriendRequestDTO () {}
}
