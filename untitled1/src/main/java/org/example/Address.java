package org.example;

public record Address(
        String street,
        String city,
        States state, //bad design(this whole thing)
        String zip
) {
}
