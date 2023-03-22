package com.example.consumingrest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public record SportsQuote(String anys, String camps_poliesportius, String espais_d_atletisme, String piscines_a_l_aire_lliure, String piscines_cobertes, String pistes_poliesportives, String pavellons, String pistes_de_tennis, String pistes_de_p_del, String sales_esportives, String pistes_d_esquaix, String frontons, String espais_de_petanca, String altres_espais_esportius, String rees_d_activitat_esportiva, String total_espais_censats, String instal_lacions) {
}