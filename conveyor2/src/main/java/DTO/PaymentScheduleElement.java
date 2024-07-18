package DTO;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;
import java.time.LocalDate;

public class PaymentScheduleElement {
    @NotNull(message = "Number must not be null")
    @Positive(message = "Number must be positive")
    private Integer number;
    @NotNull(message = "Date must not be null")
    private LocalDate date;
    @NotNull(message = "Total payment must not be null")
    @DecimalMin(value = "0.0", inclusive = false, message = "Total payment must be greater than 0")
    private BigDecimal totalPayment;
    @NotNull(message = "Interest payment must not be null")
    @DecimalMin(value = "0.0", inclusive = false, message = "Interest payment must be greater than 0")
    private BigDecimal interestPayment;
    @NotNull(message = "Debt payment must not be null")
    @DecimalMin(value = "0.0", inclusive = false, message = "Debt payment must be greater than 0")
    private BigDecimal debtPayment;
    @NotNull(message = "Remaining debt must not be null")
    @DecimalMin(value = "0.0", inclusive = false, message = "Remaining debt must be greater than 0")
    private BigDecimal remainingDebt;

    // Пустой конструктор
    public PaymentScheduleElement() {
    }

    // Конструктор со всеми параметрами
    public PaymentScheduleElement(Integer number, LocalDate date, BigDecimal totalPayment,
                                  BigDecimal interestPayment, BigDecimal debtPayment,
                                  BigDecimal remainingDebt) {
        this.number = number;
        this.date = date;
        this.totalPayment = totalPayment;
        this.interestPayment = interestPayment;
        this.debtPayment = debtPayment;
        this.remainingDebt = remainingDebt;
    }

    // Геттеры и сеттеры для всех полей
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public BigDecimal getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(BigDecimal totalPayment) {
        this.totalPayment = totalPayment;
    }

    public BigDecimal getInterestPayment() {
        return interestPayment;
    }

    public void setInterestPayment(BigDecimal interestPayment) {
        this.interestPayment = interestPayment;
    }

    public BigDecimal getDebtPayment() {
        return debtPayment;
    }

    public void setDebtPayment(BigDecimal debtPayment) {
        this.debtPayment = debtPayment;
    }

    public BigDecimal getRemainingDebt() {
        return remainingDebt;
    }

    public void setRemainingDebt(BigDecimal remainingDebt) {
        this.remainingDebt = remainingDebt;
    }
}