package com.login.token_jwt.domain.user;

public record RegisterDTO(String login, String password, UserRole role) {
}
