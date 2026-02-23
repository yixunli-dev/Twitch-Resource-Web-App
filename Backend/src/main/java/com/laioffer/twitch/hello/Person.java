package com.laioffer.twitch.hello;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Person(
        String name,
        String company,
        Address homeAddress,
        Book favoriteBook
//        @JsonProperty("home_address") Address homeAddress,
//        @JsonProperty("favorite_book") Book favoriteBook
) {
}
