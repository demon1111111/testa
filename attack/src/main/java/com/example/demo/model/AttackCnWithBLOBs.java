package com.example.demo.model;

public class AttackCnWithBLOBs extends AttackCn {
    private String description;

    private String executionFlow;

    private String prerequisites;

    private String skillsRequired;

    private String resourcesRequired;

    private String indicators;

    private String consequences;

    private String mitigations;

    private String exampleInstances;

    private String taxonomyMappings;

    private String notes;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExecutionFlow() {
        return executionFlow;
    }

    public void setExecutionFlow(String executionFlow) {
        this.executionFlow = executionFlow;
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

    public String getSkillsRequired() {
        return skillsRequired;
    }

    public void setSkillsRequired(String skillsRequired) {
        this.skillsRequired = skillsRequired;
    }

    public String getResourcesRequired() {
        return resourcesRequired;
    }

    public void setResourcesRequired(String resourcesRequired) {
        this.resourcesRequired = resourcesRequired;
    }

    public String getIndicators() {
        return indicators;
    }

    public void setIndicators(String indicators) {
        this.indicators = indicators;
    }

    public String getConsequences() {
        return consequences;
    }

    public void setConsequences(String consequences) {
        this.consequences = consequences;
    }

    public String getMitigations() {
        return mitigations;
    }

    public void setMitigations(String mitigations) {
        this.mitigations = mitigations;
    }

    public String getExampleInstances() {
        return exampleInstances;
    }

    public void setExampleInstances(String exampleInstances) {
        this.exampleInstances = exampleInstances;
    }

    public String getTaxonomyMappings() {
        return taxonomyMappings;
    }

    public void setTaxonomyMappings(String taxonomyMappings) {
        this.taxonomyMappings = taxonomyMappings;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}