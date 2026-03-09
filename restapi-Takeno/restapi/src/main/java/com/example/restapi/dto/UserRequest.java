package com.example.restapi.dto;

import java.time.LocalDateTime;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

// Request用DTOクラスの作成
public class UserRequest {
    @NotBlank(message = "名前は必須です。")
    private String name;
    @NotBlank(message = "メールアドレスは必須です。")
    @Email(message = "メールアドレスとして不正です。")
    private String email;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public UserRequest() {
    }

    public UserRequest(@NotBlank(message = "名前は必須です。") String name,
            @NotBlank(message = "メールアドレスは必須です。") @Email(message = "メールアドレスとして不正です。") String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

}
