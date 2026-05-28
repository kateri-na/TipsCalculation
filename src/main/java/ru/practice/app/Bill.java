package ru.practice.app;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Bill {
    private Integer tableNumber;
    private Double amount;
    private Integer guestsCount;
    private ServiceQuality serviceQuality;
}
