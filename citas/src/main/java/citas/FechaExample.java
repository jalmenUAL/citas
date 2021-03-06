package citas;

import java.util.ArrayList;
import java.util.List;

public class FechaExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table fecha
     *
     * @mbg.generated Fri Nov 16 12:33:10 CET 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table fecha
     *
     * @mbg.generated Fri Nov 16 12:33:10 CET 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table fecha
     *
     * @mbg.generated Fri Nov 16 12:33:10 CET 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fecha
     *
     * @mbg.generated Fri Nov 16 12:33:10 CET 2018
     */
    public FechaExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fecha
     *
     * @mbg.generated Fri Nov 16 12:33:10 CET 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fecha
     *
     * @mbg.generated Fri Nov 16 12:33:10 CET 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fecha
     *
     * @mbg.generated Fri Nov 16 12:33:10 CET 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fecha
     *
     * @mbg.generated Fri Nov 16 12:33:10 CET 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fecha
     *
     * @mbg.generated Fri Nov 16 12:33:10 CET 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fecha
     *
     * @mbg.generated Fri Nov 16 12:33:10 CET 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fecha
     *
     * @mbg.generated Fri Nov 16 12:33:10 CET 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fecha
     *
     * @mbg.generated Fri Nov 16 12:33:10 CET 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fecha
     *
     * @mbg.generated Fri Nov 16 12:33:10 CET 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fecha
     *
     * @mbg.generated Fri Nov 16 12:33:10 CET 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table fecha
     *
     * @mbg.generated Fri Nov 16 12:33:10 CET 2018
     */
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

        public Criteria andDiaIsNull() {
            addCriterion("Dia is null");
            return (Criteria) this;
        }

        public Criteria andDiaIsNotNull() {
            addCriterion("Dia is not null");
            return (Criteria) this;
        }

        public Criteria andDiaEqualTo(Integer value) {
            addCriterion("Dia =", value, "dia");
            return (Criteria) this;
        }

        public Criteria andDiaNotEqualTo(Integer value) {
            addCriterion("Dia <>", value, "dia");
            return (Criteria) this;
        }

        public Criteria andDiaGreaterThan(Integer value) {
            addCriterion("Dia >", value, "dia");
            return (Criteria) this;
        }

        public Criteria andDiaGreaterThanOrEqualTo(Integer value) {
            addCriterion("Dia >=", value, "dia");
            return (Criteria) this;
        }

        public Criteria andDiaLessThan(Integer value) {
            addCriterion("Dia <", value, "dia");
            return (Criteria) this;
        }

        public Criteria andDiaLessThanOrEqualTo(Integer value) {
            addCriterion("Dia <=", value, "dia");
            return (Criteria) this;
        }

        public Criteria andDiaIn(List<Integer> values) {
            addCriterion("Dia in", values, "dia");
            return (Criteria) this;
        }

        public Criteria andDiaNotIn(List<Integer> values) {
            addCriterion("Dia not in", values, "dia");
            return (Criteria) this;
        }

        public Criteria andDiaBetween(Integer value1, Integer value2) {
            addCriterion("Dia between", value1, value2, "dia");
            return (Criteria) this;
        }

        public Criteria andDiaNotBetween(Integer value1, Integer value2) {
            addCriterion("Dia not between", value1, value2, "dia");
            return (Criteria) this;
        }

        public Criteria andMesIsNull() {
            addCriterion("Mes is null");
            return (Criteria) this;
        }

        public Criteria andMesIsNotNull() {
            addCriterion("Mes is not null");
            return (Criteria) this;
        }

        public Criteria andMesEqualTo(Integer value) {
            addCriterion("Mes =", value, "mes");
            return (Criteria) this;
        }

        public Criteria andMesNotEqualTo(Integer value) {
            addCriterion("Mes <>", value, "mes");
            return (Criteria) this;
        }

        public Criteria andMesGreaterThan(Integer value) {
            addCriterion("Mes >", value, "mes");
            return (Criteria) this;
        }

        public Criteria andMesGreaterThanOrEqualTo(Integer value) {
            addCriterion("Mes >=", value, "mes");
            return (Criteria) this;
        }

        public Criteria andMesLessThan(Integer value) {
            addCriterion("Mes <", value, "mes");
            return (Criteria) this;
        }

        public Criteria andMesLessThanOrEqualTo(Integer value) {
            addCriterion("Mes <=", value, "mes");
            return (Criteria) this;
        }

        public Criteria andMesIn(List<Integer> values) {
            addCriterion("Mes in", values, "mes");
            return (Criteria) this;
        }

        public Criteria andMesNotIn(List<Integer> values) {
            addCriterion("Mes not in", values, "mes");
            return (Criteria) this;
        }

        public Criteria andMesBetween(Integer value1, Integer value2) {
            addCriterion("Mes between", value1, value2, "mes");
            return (Criteria) this;
        }

        public Criteria andMesNotBetween(Integer value1, Integer value2) {
            addCriterion("Mes not between", value1, value2, "mes");
            return (Criteria) this;
        }

        public Criteria andAnyoIsNull() {
            addCriterion("Anyo is null");
            return (Criteria) this;
        }

        public Criteria andAnyoIsNotNull() {
            addCriterion("Anyo is not null");
            return (Criteria) this;
        }

        public Criteria andAnyoEqualTo(Integer value) {
            addCriterion("Anyo =", value, "anyo");
            return (Criteria) this;
        }

        public Criteria andAnyoNotEqualTo(Integer value) {
            addCriterion("Anyo <>", value, "anyo");
            return (Criteria) this;
        }

        public Criteria andAnyoGreaterThan(Integer value) {
            addCriterion("Anyo >", value, "anyo");
            return (Criteria) this;
        }

        public Criteria andAnyoGreaterThanOrEqualTo(Integer value) {
            addCriterion("Anyo >=", value, "anyo");
            return (Criteria) this;
        }

        public Criteria andAnyoLessThan(Integer value) {
            addCriterion("Anyo <", value, "anyo");
            return (Criteria) this;
        }

        public Criteria andAnyoLessThanOrEqualTo(Integer value) {
            addCriterion("Anyo <=", value, "anyo");
            return (Criteria) this;
        }

        public Criteria andAnyoIn(List<Integer> values) {
            addCriterion("Anyo in", values, "anyo");
            return (Criteria) this;
        }

        public Criteria andAnyoNotIn(List<Integer> values) {
            addCriterion("Anyo not in", values, "anyo");
            return (Criteria) this;
        }

        public Criteria andAnyoBetween(Integer value1, Integer value2) {
            addCriterion("Anyo between", value1, value2, "anyo");
            return (Criteria) this;
        }

        public Criteria andAnyoNotBetween(Integer value1, Integer value2) {
            addCriterion("Anyo not between", value1, value2, "anyo");
            return (Criteria) this;
        }

        public Criteria andCitaidIsNull() {
            addCriterion("CitaID is null");
            return (Criteria) this;
        }

        public Criteria andCitaidIsNotNull() {
            addCriterion("CitaID is not null");
            return (Criteria) this;
        }

        public Criteria andCitaidEqualTo(Integer value) {
            addCriterion("CitaID =", value, "citaid");
            return (Criteria) this;
        }

        public Criteria andCitaidNotEqualTo(Integer value) {
            addCriterion("CitaID <>", value, "citaid");
            return (Criteria) this;
        }

        public Criteria andCitaidGreaterThan(Integer value) {
            addCriterion("CitaID >", value, "citaid");
            return (Criteria) this;
        }

        public Criteria andCitaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("CitaID >=", value, "citaid");
            return (Criteria) this;
        }

        public Criteria andCitaidLessThan(Integer value) {
            addCriterion("CitaID <", value, "citaid");
            return (Criteria) this;
        }

        public Criteria andCitaidLessThanOrEqualTo(Integer value) {
            addCriterion("CitaID <=", value, "citaid");
            return (Criteria) this;
        }

        public Criteria andCitaidIn(List<Integer> values) {
            addCriterion("CitaID in", values, "citaid");
            return (Criteria) this;
        }

        public Criteria andCitaidNotIn(List<Integer> values) {
            addCriterion("CitaID not in", values, "citaid");
            return (Criteria) this;
        }

        public Criteria andCitaidBetween(Integer value1, Integer value2) {
            addCriterion("CitaID between", value1, value2, "citaid");
            return (Criteria) this;
        }

        public Criteria andCitaidNotBetween(Integer value1, Integer value2) {
            addCriterion("CitaID not between", value1, value2, "citaid");
            return (Criteria) this;
        }

        public Criteria andClienteidIsNull() {
            addCriterion("ClienteID is null");
            return (Criteria) this;
        }

        public Criteria andClienteidIsNotNull() {
            addCriterion("ClienteID is not null");
            return (Criteria) this;
        }

        public Criteria andClienteidEqualTo(Integer value) {
            addCriterion("ClienteID =", value, "clienteid");
            return (Criteria) this;
        }

        public Criteria andClienteidNotEqualTo(Integer value) {
            addCriterion("ClienteID <>", value, "clienteid");
            return (Criteria) this;
        }

        public Criteria andClienteidGreaterThan(Integer value) {
            addCriterion("ClienteID >", value, "clienteid");
            return (Criteria) this;
        }

        public Criteria andClienteidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ClienteID >=", value, "clienteid");
            return (Criteria) this;
        }

        public Criteria andClienteidLessThan(Integer value) {
            addCriterion("ClienteID <", value, "clienteid");
            return (Criteria) this;
        }

        public Criteria andClienteidLessThanOrEqualTo(Integer value) {
            addCriterion("ClienteID <=", value, "clienteid");
            return (Criteria) this;
        }

        public Criteria andClienteidIn(List<Integer> values) {
            addCriterion("ClienteID in", values, "clienteid");
            return (Criteria) this;
        }

        public Criteria andClienteidNotIn(List<Integer> values) {
            addCriterion("ClienteID not in", values, "clienteid");
            return (Criteria) this;
        }

        public Criteria andClienteidBetween(Integer value1, Integer value2) {
            addCriterion("ClienteID between", value1, value2, "clienteid");
            return (Criteria) this;
        }

        public Criteria andClienteidNotBetween(Integer value1, Integer value2) {
            addCriterion("ClienteID not between", value1, value2, "clienteid");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table fecha
     *
     * @mbg.generated do_not_delete_during_merge Fri Nov 16 12:33:10 CET 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table fecha
     *
     * @mbg.generated Fri Nov 16 12:33:10 CET 2018
     */
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