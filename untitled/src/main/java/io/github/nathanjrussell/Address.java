package io.github.nathanjrussell;

public record Address(
        String street,
        String city,
        States state,
        String zip
) {
}
