package ru.sonyabeldy.dictionary.Dictionaty.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sonyabeldy.dictionary.Dictionaty.dto.RuEngTranslationDTO;
import ru.sonyabeldy.dictionary.Dictionaty.models.RuEngTranslation;
import ru.sonyabeldy.dictionary.Dictionaty.services.RuEngTranslationService;

@RestController
@RequestMapping("/translations")
public class RuEngTranslationController {


    private final ModelMapper modelMapper;
    private final RuEngTranslationService service;

    @Autowired
    public RuEngTranslationController(ModelMapper modelMapper, RuEngTranslationService service) {
        this.modelMapper = modelMapper;
        this.service = service;
    }

    @PostMapping("/add")
    public ResponseEntity<HttpStatus> create(@RequestBody RuEngTranslationDTO ruEngTranslationDTO) {

        service.save(toRuTranslation(ruEngTranslationDTO));
        return ResponseEntity.ok(HttpStatus.CREATED);
    }

    private RuEngTranslation toRuTranslation(RuEngTranslationDTO ruEngTranslationDTO) {
        return modelMapper.map(ruEngTranslationDTO, RuEngTranslation.class);
    }
}
