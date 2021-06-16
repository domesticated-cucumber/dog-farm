package com.leverx.shishlo.dogfarm.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
public abstract class Staff implements Worker {

    private final String name;

    private List<Aviary> aviaries;
}
