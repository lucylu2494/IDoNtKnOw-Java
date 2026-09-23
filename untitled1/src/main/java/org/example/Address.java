package org.example;

public record Address(
        String street,
        String city,
        String state, //bad design(this whole thing)
        String zip
) {
}
