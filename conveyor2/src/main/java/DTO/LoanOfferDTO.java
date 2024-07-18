package DTO;

import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;

import java.math.BigDecimal;

public class LoanOfferDTO {
    @NotNull(message = "Requested amount must not be null")
    @Positive(message = "Requested amount must be positive")
    private Long applicationId;

    private BigDecimal requestedAmount;
    @NotNull(message = "Total amount must not be null")
    @PositiveOrZero(message = "Total amount must be positive or zero")
    private BigDecimal totalAmount;
    @NotNull(message = "Term must not be null")
    @Positive(message = "Term must be positive")
    private Integer term;
    @NotNull(message = "Monthly payment must not be null")
    @PositiveOrZero(message = "Monthly payment must be positive or zero")
    private BigDecimal monthlyPayment;
    @NotNull(message = "Rate must not be null")
    @PositiveOrZero(message = "Rate must be positive or zero")
    private BigDecimal rate;
    private Boolean isInsuranceEnabled;
    private Boolean isSalaryClient;


    // Пустой конструктор
    public LoanOfferDTO() {
    }

    // Конструктор со всеми параметрами
    public LoanOfferDTO(Long applicationId, BigDecimal requestedAmount, BigDecimal totalAmount,
                        Integer term, BigDecimal monthlyPayment, BigDecimal rate,
                        Boolean isInsuranceEnabled, Boolean isSalaryClient) {
        this.applicationId = applicationId;
        this.requestedAmount = requestedAmount;
        this.totalAmount = totalAmount;
        this.term = term;
        this.monthlyPayment = monthlyPayment;
        this.rate = rate;
        this.isInsuranceEnabled = isInsuranceEnabled;
        this.isSalaryClient = isSalaryClient;
    }


    // Геттеры и сеттеры для всех полей
    public Long getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Long applicationId) {
        this.applicationId = applicationId;
    }

    public BigDecimal getRequestedAmount() {
        return requestedAmount;
    }

    public void setRequestedAmount(BigDecimal requestedAmount) {
        this.requestedAmount = requestedAmount;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Integer getTerm() {
        return term;
    }

    public void setTerm(Integer term) {
        this.term = term;
    }

    public BigDecimal getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(BigDecimal monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public Boolean getIsInsuranceEnabled() {
        return isInsuranceEnabled;
    }

    public void setIsInsuranceEnabled(Boolean insuranceEnabled) {
        isInsuranceEnabled = insuranceEnabled;
    }

    public Boolean getIsSalaryClient() {
        return isSalaryClient;
    }

    public void setIsSalaryClient(Boolean salaryClient) {
        isSalaryClient = salaryClient;
    }
}
