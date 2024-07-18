package DTO;

import DTO.NotNull;
import jakarta.validation.constraints.*;

import java.math.BigDecimal;
import java.time.LocalDate;

public class LoanApplicationRequestDTO {
    @NotNull(message = "Amount must not be null")
    @DecimalMin(value = "0.01", message = "Amount must be greater than 0")
    private BigDecimal amount;
    @NotNull(message = "Term must not be null")
    @Min(value = 1, message = "Term must be greater than 0")
    private Integer term;
    @NotBlank(message = "First name must not be blank")
    private String firstName;
    @NotBlank(message = "Last name must not be blank")
    private String lastName;
    private String middleName;
    @Email(message = "Email should be valid")
    private String email;
    @Past(message = "Birthdate must be in the past")
    private LocalDate birthdate;
    @NotBlank(message = "Passport series must not be blank")
    private String passportSeries;
    @NotBlank(message = "Passport series must not be blank")
    private String passportNumber;

    public LoanApplicationRequestDTO(BigDecimal amount, Integer term, String firstName, String lastName,
                                     String middleName, String email, LocalDate birthdate,
                                     String passportSeries, String passportNumber) {
        this.amount = amount;
        this.term = term;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.email = email;
        this.birthdate = birthdate;
        this.passportSeries = passportSeries;
        this.passportNumber = passportNumber;

    }
    public LoanApplicationRequestDTO(){};
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Integer getTerm() {
        return term;
    }

    public void setTerm(Integer term) {
        this.term = term;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public String getPassportSeries() {
        return passportSeries;
    }

    public void setPassportSeries(String passportSeries) {
        this.passportSeries = passportSeries;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }
}
