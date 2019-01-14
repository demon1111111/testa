package com.example.demo.model;

public class AttackCn {
    private Integer id;

    private String name;

    private String abstraction;

    private String status;

    private String alternateTerms;

    private String likelihoodOfAttack;

    private String typicalSeverity;

    private String relatedAttackPatterns;

    private String relatedWeaknesses;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbstraction() {
        return abstraction;
    }

    public void setAbstraction(String abstraction) {
        this.abstraction = abstraction;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAlternateTerms() {
        return alternateTerms;
    }

    public void setAlternateTerms(String alternateTerms) {
        this.alternateTerms = alternateTerms;
    }

    public String getLikelihoodOfAttack() {
        return likelihoodOfAttack;
    }

    public void setLikelihoodOfAttack(String likelihoodOfAttack) {
        this.likelihoodOfAttack = likelihoodOfAttack;
    }

    public String getTypicalSeverity() {
        return typicalSeverity;
    }

    public void setTypicalSeverity(String typicalSeverity) {
        this.typicalSeverity = typicalSeverity;
    }

    public String getRelatedAttackPatterns() {
        return relatedAttackPatterns;
    }

    public void setRelatedAttackPatterns(String relatedAttackPatterns) {
        this.relatedAttackPatterns = relatedAttackPatterns;
    }

    public String getRelatedWeaknesses() {
        return relatedWeaknesses;
    }

    public void setRelatedWeaknesses(String relatedWeaknesses) {
        this.relatedWeaknesses = relatedWeaknesses;
    }
}