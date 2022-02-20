package com.juniorjavadeveloper.chuckfacts;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("")
@CrossOrigin("*")
public class ChuckNorrisController {

    private final ChuckNorrisFactory chuckNorrisFactory;

    @GetMapping("/fact")
    public ResponseEntity<Response> getOneFact() {
        return ResponseEntity.ok(chuckNorrisFactory.getFact());
    }

    @GetMapping("/facts")
    public ResponseEntity<Response> getOneFacts(
            @RequestParam(name = "size", required = false, defaultValue = "10") int size) {
        return ResponseEntity.ok(chuckNorrisFactory.getFactList(size));
    }

}
