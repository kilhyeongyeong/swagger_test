package com.test.restServer1.dto.Business;

import lombok.*;

import java.time.LocalDateTime;

@Setter @Getter @AllArgsConstructor
@NoArgsConstructor @Builder @ToString
public class FindAllByCategoryResponseDTO {
    String title;
    LocalDateTime startAt;
    LocalDateTime endAt;
    String image;
}
