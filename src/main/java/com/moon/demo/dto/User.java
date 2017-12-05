package com.moon.demo.dto;

import lombok.*;

import java.util.Objects;


@AllArgsConstructor
@Getter
@Setter
public class User {
    @NonNull
    private final String id;
    @NonNull
    private final String name;

}
