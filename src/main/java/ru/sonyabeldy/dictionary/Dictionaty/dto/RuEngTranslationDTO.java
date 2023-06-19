package ru.sonyabeldy.dictionary.Dictionaty.dto;

import jakarta.persistence.Column;

public class RuEngTranslationDTO {
    private String originText;

    private String translatedText;

    private String context;

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

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }
}
