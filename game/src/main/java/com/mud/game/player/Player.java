package com.mud.game.player;

import java.time.LocalDate;

public class Player {
    private Long id;
    private String username;
    private String email;
    private LocalDate createdAt;
    private Integer level;

    public Player(Long id, String username, String email, LocalDate createdAt, Integer level) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.createdAt = createdAt;
        this.level = level;
    }

    public Player(Long id, String username, String email, Integer level) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.level = level;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", createdAt=" + createdAt +
                ", level=" + level +
                '}';
    }
}
