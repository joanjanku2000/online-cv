package com.online.cv.dto;

import java.time.LocalDate;

public record UserDTO(Long id, String username, String name, String lastName, LocalDate birthday) {

}