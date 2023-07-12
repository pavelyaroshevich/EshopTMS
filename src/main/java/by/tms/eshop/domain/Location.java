package by.tms.eshop.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Location {

    CART(true, false),
    FAVORITE(false, true);

    private final boolean cart;
    private final boolean favorite;
}
