package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

public class AttackCnExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AttackCnExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("Name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("Name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("Name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("Name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("Name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("Name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("Name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("Name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("Name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("Name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("Name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("Name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("Name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("Name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andAbstractionIsNull() {
            addCriterion("Abstraction is null");
            return (Criteria) this;
        }

        public Criteria andAbstractionIsNotNull() {
            addCriterion("Abstraction is not null");
            return (Criteria) this;
        }

        public Criteria andAbstractionEqualTo(String value) {
            addCriterion("Abstraction =", value, "abstraction");
            return (Criteria) this;
        }

        public Criteria andAbstractionNotEqualTo(String value) {
            addCriterion("Abstraction <>", value, "abstraction");
            return (Criteria) this;
        }

        public Criteria andAbstractionGreaterThan(String value) {
            addCriterion("Abstraction >", value, "abstraction");
            return (Criteria) this;
        }

        public Criteria andAbstractionGreaterThanOrEqualTo(String value) {
            addCriterion("Abstraction >=", value, "abstraction");
            return (Criteria) this;
        }

        public Criteria andAbstractionLessThan(String value) {
            addCriterion("Abstraction <", value, "abstraction");
            return (Criteria) this;
        }

        public Criteria andAbstractionLessThanOrEqualTo(String value) {
            addCriterion("Abstraction <=", value, "abstraction");
            return (Criteria) this;
        }

        public Criteria andAbstractionLike(String value) {
            addCriterion("Abstraction like", value, "abstraction");
            return (Criteria) this;
        }

        public Criteria andAbstractionNotLike(String value) {
            addCriterion("Abstraction not like", value, "abstraction");
            return (Criteria) this;
        }

        public Criteria andAbstractionIn(List<String> values) {
            addCriterion("Abstraction in", values, "abstraction");
            return (Criteria) this;
        }

        public Criteria andAbstractionNotIn(List<String> values) {
            addCriterion("Abstraction not in", values, "abstraction");
            return (Criteria) this;
        }

        public Criteria andAbstractionBetween(String value1, String value2) {
            addCriterion("Abstraction between", value1, value2, "abstraction");
            return (Criteria) this;
        }

        public Criteria andAbstractionNotBetween(String value1, String value2) {
            addCriterion("Abstraction not between", value1, value2, "abstraction");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("Status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("Status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("Status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("Status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("Status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("Status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("Status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("Status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("Status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("Status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("Status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("Status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("Status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("Status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andAlternateTermsIsNull() {
            addCriterion("\"Alternate Terms\" is null");
            return (Criteria) this;
        }

        public Criteria andAlternateTermsIsNotNull() {
            addCriterion("\"Alternate Terms\" is not null");
            return (Criteria) this;
        }

        public Criteria andAlternateTermsEqualTo(String value) {
            addCriterion("\"Alternate Terms\" =", value, "alternateTerms");
            return (Criteria) this;
        }

        public Criteria andAlternateTermsNotEqualTo(String value) {
            addCriterion("\"Alternate Terms\" <>", value, "alternateTerms");
            return (Criteria) this;
        }

        public Criteria andAlternateTermsGreaterThan(String value) {
            addCriterion("\"Alternate Terms\" >", value, "alternateTerms");
            return (Criteria) this;
        }

        public Criteria andAlternateTermsGreaterThanOrEqualTo(String value) {
            addCriterion("\"Alternate Terms\" >=", value, "alternateTerms");
            return (Criteria) this;
        }

        public Criteria andAlternateTermsLessThan(String value) {
            addCriterion("\"Alternate Terms\" <", value, "alternateTerms");
            return (Criteria) this;
        }

        public Criteria andAlternateTermsLessThanOrEqualTo(String value) {
            addCriterion("\"Alternate Terms\" <=", value, "alternateTerms");
            return (Criteria) this;
        }

        public Criteria andAlternateTermsLike(String value) {
            addCriterion("\"Alternate Terms\" like", value, "alternateTerms");
            return (Criteria) this;
        }

        public Criteria andAlternateTermsNotLike(String value) {
            addCriterion("\"Alternate Terms\" not like", value, "alternateTerms");
            return (Criteria) this;
        }

        public Criteria andAlternateTermsIn(List<String> values) {
            addCriterion("\"Alternate Terms\" in", values, "alternateTerms");
            return (Criteria) this;
        }

        public Criteria andAlternateTermsNotIn(List<String> values) {
            addCriterion("\"Alternate Terms\" not in", values, "alternateTerms");
            return (Criteria) this;
        }

        public Criteria andAlternateTermsBetween(String value1, String value2) {
            addCriterion("\"Alternate Terms\" between", value1, value2, "alternateTerms");
            return (Criteria) this;
        }

        public Criteria andAlternateTermsNotBetween(String value1, String value2) {
            addCriterion("\"Alternate Terms\" not between", value1, value2, "alternateTerms");
            return (Criteria) this;
        }

        public Criteria andLikelihoodOfAttackIsNull() {
            addCriterion("\"Likelihood Of Attack\" is null");
            return (Criteria) this;
        }

        public Criteria andLikelihoodOfAttackIsNotNull() {
            addCriterion("\"Likelihood Of Attack\" is not null");
            return (Criteria) this;
        }

        public Criteria andLikelihoodOfAttackEqualTo(String value) {
            addCriterion("\"Likelihood Of Attack\" =", value, "likelihoodOfAttack");
            return (Criteria) this;
        }

        public Criteria andLikelihoodOfAttackNotEqualTo(String value) {
            addCriterion("\"Likelihood Of Attack\" <>", value, "likelihoodOfAttack");
            return (Criteria) this;
        }

        public Criteria andLikelihoodOfAttackGreaterThan(String value) {
            addCriterion("\"Likelihood Of Attack\" >", value, "likelihoodOfAttack");
            return (Criteria) this;
        }

        public Criteria andLikelihoodOfAttackGreaterThanOrEqualTo(String value) {
            addCriterion("\"Likelihood Of Attack\" >=", value, "likelihoodOfAttack");
            return (Criteria) this;
        }

        public Criteria andLikelihoodOfAttackLessThan(String value) {
            addCriterion("\"Likelihood Of Attack\" <", value, "likelihoodOfAttack");
            return (Criteria) this;
        }

        public Criteria andLikelihoodOfAttackLessThanOrEqualTo(String value) {
            addCriterion("\"Likelihood Of Attack\" <=", value, "likelihoodOfAttack");
            return (Criteria) this;
        }

        public Criteria andLikelihoodOfAttackLike(String value) {
            addCriterion("\"Likelihood Of Attack\" like", value, "likelihoodOfAttack");
            return (Criteria) this;
        }

        public Criteria andLikelihoodOfAttackNotLike(String value) {
            addCriterion("\"Likelihood Of Attack\" not like", value, "likelihoodOfAttack");
            return (Criteria) this;
        }

        public Criteria andLikelihoodOfAttackIn(List<String> values) {
            addCriterion("\"Likelihood Of Attack\" in", values, "likelihoodOfAttack");
            return (Criteria) this;
        }

        public Criteria andLikelihoodOfAttackNotIn(List<String> values) {
            addCriterion("\"Likelihood Of Attack\" not in", values, "likelihoodOfAttack");
            return (Criteria) this;
        }

        public Criteria andLikelihoodOfAttackBetween(String value1, String value2) {
            addCriterion("\"Likelihood Of Attack\" between", value1, value2, "likelihoodOfAttack");
            return (Criteria) this;
        }

        public Criteria andLikelihoodOfAttackNotBetween(String value1, String value2) {
            addCriterion("\"Likelihood Of Attack\" not between", value1, value2, "likelihoodOfAttack");
            return (Criteria) this;
        }

        public Criteria andTypicalSeverityIsNull() {
            addCriterion("\"Typical Severity\" is null");
            return (Criteria) this;
        }

        public Criteria andTypicalSeverityIsNotNull() {
            addCriterion("\"Typical Severity\" is not null");
            return (Criteria) this;
        }

        public Criteria andTypicalSeverityEqualTo(String value) {
            addCriterion("\"Typical Severity\" =", value, "typicalSeverity");
            return (Criteria) this;
        }

        public Criteria andTypicalSeverityNotEqualTo(String value) {
            addCriterion("\"Typical Severity\" <>", value, "typicalSeverity");
            return (Criteria) this;
        }

        public Criteria andTypicalSeverityGreaterThan(String value) {
            addCriterion("\"Typical Severity\" >", value, "typicalSeverity");
            return (Criteria) this;
        }

        public Criteria andTypicalSeverityGreaterThanOrEqualTo(String value) {
            addCriterion("\"Typical Severity\" >=", value, "typicalSeverity");
            return (Criteria) this;
        }

        public Criteria andTypicalSeverityLessThan(String value) {
            addCriterion("\"Typical Severity\" <", value, "typicalSeverity");
            return (Criteria) this;
        }

        public Criteria andTypicalSeverityLessThanOrEqualTo(String value) {
            addCriterion("\"Typical Severity\" <=", value, "typicalSeverity");
            return (Criteria) this;
        }

        public Criteria andTypicalSeverityLike(String value) {
            addCriterion("\"Typical Severity\" like", value, "typicalSeverity");
            return (Criteria) this;
        }

        public Criteria andTypicalSeverityNotLike(String value) {
            addCriterion("\"Typical Severity\" not like", value, "typicalSeverity");
            return (Criteria) this;
        }

        public Criteria andTypicalSeverityIn(List<String> values) {
            addCriterion("\"Typical Severity\" in", values, "typicalSeverity");
            return (Criteria) this;
        }

        public Criteria andTypicalSeverityNotIn(List<String> values) {
            addCriterion("\"Typical Severity\" not in", values, "typicalSeverity");
            return (Criteria) this;
        }

        public Criteria andTypicalSeverityBetween(String value1, String value2) {
            addCriterion("\"Typical Severity\" between", value1, value2, "typicalSeverity");
            return (Criteria) this;
        }

        public Criteria andTypicalSeverityNotBetween(String value1, String value2) {
            addCriterion("\"Typical Severity\" not between", value1, value2, "typicalSeverity");
            return (Criteria) this;
        }

        public Criteria andRelatedAttackPatternsIsNull() {
            addCriterion("\"Related Attack Patterns\" is null");
            return (Criteria) this;
        }

        public Criteria andRelatedAttackPatternsIsNotNull() {
            addCriterion("\"Related Attack Patterns\" is not null");
            return (Criteria) this;
        }

        public Criteria andRelatedAttackPatternsEqualTo(String value) {
            addCriterion("\"Related Attack Patterns\" =", value, "relatedAttackPatterns");
            return (Criteria) this;
        }

        public Criteria andRelatedAttackPatternsNotEqualTo(String value) {
            addCriterion("\"Related Attack Patterns\" <>", value, "relatedAttackPatterns");
            return (Criteria) this;
        }

        public Criteria andRelatedAttackPatternsGreaterThan(String value) {
            addCriterion("\"Related Attack Patterns\" >", value, "relatedAttackPatterns");
            return (Criteria) this;
        }

        public Criteria andRelatedAttackPatternsGreaterThanOrEqualTo(String value) {
            addCriterion("\"Related Attack Patterns\" >=", value, "relatedAttackPatterns");
            return (Criteria) this;
        }

        public Criteria andRelatedAttackPatternsLessThan(String value) {
            addCriterion("\"Related Attack Patterns\" <", value, "relatedAttackPatterns");
            return (Criteria) this;
        }

        public Criteria andRelatedAttackPatternsLessThanOrEqualTo(String value) {
            addCriterion("\"Related Attack Patterns\" <=", value, "relatedAttackPatterns");
            return (Criteria) this;
        }

        public Criteria andRelatedAttackPatternsLike(String value) {
            addCriterion("\"Related Attack Patterns\" like", value, "relatedAttackPatterns");
            return (Criteria) this;
        }

        public Criteria andRelatedAttackPatternsNotLike(String value) {
            addCriterion("\"Related Attack Patterns\" not like", value, "relatedAttackPatterns");
            return (Criteria) this;
        }

        public Criteria andRelatedAttackPatternsIn(List<String> values) {
            addCriterion("\"Related Attack Patterns\" in", values, "relatedAttackPatterns");
            return (Criteria) this;
        }

        public Criteria andRelatedAttackPatternsNotIn(List<String> values) {
            addCriterion("\"Related Attack Patterns\" not in", values, "relatedAttackPatterns");
            return (Criteria) this;
        }

        public Criteria andRelatedAttackPatternsBetween(String value1, String value2) {
            addCriterion("\"Related Attack Patterns\" between", value1, value2, "relatedAttackPatterns");
            return (Criteria) this;
        }

        public Criteria andRelatedAttackPatternsNotBetween(String value1, String value2) {
            addCriterion("\"Related Attack Patterns\" not between", value1, value2, "relatedAttackPatterns");
            return (Criteria) this;
        }

        public Criteria andRelatedWeaknessesIsNull() {
            addCriterion("\"Related Weaknesses\" is null");
            return (Criteria) this;
        }

        public Criteria andRelatedWeaknessesIsNotNull() {
            addCriterion("\"Related Weaknesses\" is not null");
            return (Criteria) this;
        }

        public Criteria andRelatedWeaknessesEqualTo(String value) {
            addCriterion("\"Related Weaknesses\" =", value, "relatedWeaknesses");
            return (Criteria) this;
        }

        public Criteria andRelatedWeaknessesNotEqualTo(String value) {
            addCriterion("\"Related Weaknesses\" <>", value, "relatedWeaknesses");
            return (Criteria) this;
        }

        public Criteria andRelatedWeaknessesGreaterThan(String value) {
            addCriterion("\"Related Weaknesses\" >", value, "relatedWeaknesses");
            return (Criteria) this;
        }

        public Criteria andRelatedWeaknessesGreaterThanOrEqualTo(String value) {
            addCriterion("\"Related Weaknesses\" >=", value, "relatedWeaknesses");
            return (Criteria) this;
        }

        public Criteria andRelatedWeaknessesLessThan(String value) {
            addCriterion("\"Related Weaknesses\" <", value, "relatedWeaknesses");
            return (Criteria) this;
        }

        public Criteria andRelatedWeaknessesLessThanOrEqualTo(String value) {
            addCriterion("\"Related Weaknesses\" <=", value, "relatedWeaknesses");
            return (Criteria) this;
        }

        public Criteria andRelatedWeaknessesLike(String value) {
            addCriterion("\"Related Weaknesses\" like", value, "relatedWeaknesses");
            return (Criteria) this;
        }

        public Criteria andRelatedWeaknessesNotLike(String value) {
            addCriterion("\"Related Weaknesses\" not like", value, "relatedWeaknesses");
            return (Criteria) this;
        }

        public Criteria andRelatedWeaknessesIn(List<String> values) {
            addCriterion("\"Related Weaknesses\" in", values, "relatedWeaknesses");
            return (Criteria) this;
        }

        public Criteria andRelatedWeaknessesNotIn(List<String> values) {
            addCriterion("\"Related Weaknesses\" not in", values, "relatedWeaknesses");
            return (Criteria) this;
        }

        public Criteria andRelatedWeaknessesBetween(String value1, String value2) {
            addCriterion("\"Related Weaknesses\" between", value1, value2, "relatedWeaknesses");
            return (Criteria) this;
        }

        public Criteria andRelatedWeaknessesNotBetween(String value1, String value2) {
            addCriterion("\"Related Weaknesses\" not between", value1, value2, "relatedWeaknesses");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}