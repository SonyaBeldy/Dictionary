package ru.sonyabeldy.dictionary.Dictionaty.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.sonyabeldy.dictionary.Dictionaty.models.RuEngTranslation;

@Repository
public interface RuEngTranslationRepository extends JpaRepository<RuEngTranslation, Integer> {

}
