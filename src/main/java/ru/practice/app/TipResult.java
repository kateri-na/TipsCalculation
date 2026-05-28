package ru.practice.app;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TipResult {
    private Double billAmount;
    private Double tipsAmount;
    private Double total;
}
