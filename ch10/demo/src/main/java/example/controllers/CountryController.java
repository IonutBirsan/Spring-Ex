package example.controllers;

import example.model.Country;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    @GetMapping("/france")
    public Country france() {
        Country c = Country.of("France", 67);
        return c;
    }
}