package ru.sonyabeldy.dictionary.Dictionaty.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.sonyabeldy.dictionary.Dictionaty.models.RuEngTranslation;
import ru.sonyabeldy.dictionary.Dictionaty.repositories.RuEngTranslationRepository;

@Service
@Transactional(readOnly = true)
public class RuEngTranslationService {

    private final RuEngTranslationRepository ruEngTranslationRepository;

    @Autowired
    public RuEngTranslationService(RuEngTranslationRepository ruEngTranslationRepository) {
        this.ruEngTranslationRepository = ruEngTranslationRepository;
    }

    @Transactional
    public void save(RuEngTranslation translation) {
        ruEngTranslationRepository.save(translation);
    }
}
