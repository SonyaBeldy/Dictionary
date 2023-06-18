package ru.sonyabeldy.dictionary.Dictionaty.models;

import jakarta.persistence.*;

@Entity
@Table(name = "ru_eng_translation")
public class RuEngTranslation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "origin_text")
    private String originText;

    @Column(name = "translated_text")
    private String translatedText;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOriginText() {
        return originText;
    }

    public void setOriginText(String originText) {
        this.originText = originText;
    }

    public String getTranslatedText() {
        return translatedText;
    }

    public void setTranslatedText(String translatedText) {
        this.translatedText = translatedText;
    }
}
