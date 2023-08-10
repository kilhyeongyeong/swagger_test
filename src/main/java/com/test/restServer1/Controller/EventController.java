package com.test.restServer1.Controller;

import com.test.restServer1.dto.Business.FindAllByCategoryResponseDTO;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/events")
@Tag(name = "Event", description = "Business Server - About Events")
public class EventController {
    @RequestMapping(method = RequestMethod.GET, value = "")
    public ResponseEntity<FindAllByCategoryResponseDTO> findAllByCategory(String category) {
        FindAllByCategoryResponseDTO findAllByCategoryResponseDTO = FindAllByCategoryResponseDTO
                .builder()
                .title("Hello")
                .startAt(LocalDateTime.now())
                .endAt(LocalDateTime.now())
                .image("uri/uri/uri")
                .build();
        return ResponseEntity.ok().body(findAllByCategoryResponseDTO);
    }
}
