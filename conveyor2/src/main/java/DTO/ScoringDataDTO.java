package DTO;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ScoringDataDTO {
    @NotNull(message = "Amount must not be null")
    @DecimalMin(value = "0.0", message = "Amount must be greater than or equal to 0")
    private BigDecimal amount;
    @NotNull(message = "Term must not be null")
    @Min(value = 1, message = "Term must be greater than 0")
    private Integer term;
    @NotBlank(message = "First name must not be blank")
    private String firstName;
    @NotBlank(message = "Last name must not be blank")
    private String lastName;
    private String middleName;
    @NotNull(message = "Gender must not be null")
    private Gender gender;
    @NotNull(message = "Birthdate must not be null")
    @Past(message = "Birthdate must be in the past")
    private LocalDate birthdate;
    @NotBlank(message = "Passport series must not be blank")
    private String passportSeries;
    @NotBlank(message = "Passport number must not be blank")
    private String passportNumber;
    @NotNull(message = "Passport issue date must not be null")
    private LocalDate passportIssueDate;
    @NotBlank(message = "Passport issue branch must not be blank")
    private String passportIssueBranch;
    @NotNull(message = "Marital status must not be null")
    private MaritalStatus maritalStatus;
    @NotNull(message = "Dependent amount must not be null")
    @Min(value = 0, message = "Dependent amount must be greater than or equal to 0")
    private Integer dependentAmount;
    @NotNull(message = "Employment details must not be null")
    private EmploymentDTO employment;
    @NotBlank(message = "Account must not be blank")
    private String account;
    @NotNull(message = "Insurance enabled flag must not be null")
    private Boolean isInsuranceEnabled;
    @NotNull(message = "Salary client flag must not be null")
    private Boolean isSalaryClient;

    // Пустой конструктор
    public ScoringDataDTO() {
    }

    // Конструктор со всеми параметрами
    public ScoringDataDTO(BigDecimal amount, Integer term, String firstName, String lastName,
                          String middleName, Gender gender, LocalDate birthdate,
                          String passportSeries, String passportNumber, LocalDate passportIssueDate,
                          String passportIssueBranch, MaritalStatus maritalStatus, Integer dependentAmount,
                          EmploymentDTO employment, String account, Boolean isInsuranceEnabled,
                          Boolean isSalaryClient) {
        this.amount = amount;
        this.term = term;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.gender = gender;
        this.birthdate = birthdate;
        this.passportSeries = passportSeries;
        this.passportNumber = passportNumber;
        this.passportIssueDate = passportIssueDate;
        this.passportIssueBranch = passportIssueBranch;
        this.maritalStatus = maritalStatus;
        this.dependentAmount = dependentAmount;
        this.employment = employment;
        this.account = account;
        this.isInsuranceEnabled = isInsuranceEnabled;
        this.isSalaryClient = isSalaryClient;
    }

    // Геттеры и сеттеры для всех полей
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
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

    public LocalDate getPassportIssueDate() {
        return passportIssueDate;
    }

    public void setPassportIssueDate(LocalDate passportIssueDate) {
        this.passportIssueDate = passportIssueDate;
    }

    public String getPassportIssueBranch() {
        return passportIssueBranch;
    }

    public void setPassportIssueBranch(String passportIssueBranch) {
        this.passportIssueBranch = passportIssueBranch;
    }

    public MaritalStatus getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(MaritalStatus maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public Integer getDependentAmount() {
        return dependentAmount;
    }

    public void setDependentAmount(Integer dependentAmount) {
        this.dependentAmount = dependentAmount;
    }

    public EmploymentDTO getEmployment() {
        return employment;
    }

    public void setEmployment(EmploymentDTO employment) {
        this.employment = employment;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public Boolean getIsInsuranceEnabled() {
        return isInsuranceEnabled;
    }

    public void setIsInsuranceEnabled(Boolean isInsuranceEnabled) {
        this.isInsuranceEnabled = isInsuranceEnabled;
    }

    public Boolean getIsSalaryClient() {
        return isSalaryClient;
    }

    public void setIsSalaryClient(Boolean isSalaryClient) {
        this.isSalaryClient = isSalaryClient;
    }

    // Перечисление (Enum) для пола (Gender)
    public enum Gender {
        MALE,
        FEMALE,
        OTHER
    }

    // Перечисление (Enum) для семейного положения (MaritalStatus)
    public enum MaritalStatus {
        SINGLE,
        MARRIED,
        DIVORCED,
        WIDOWED
    }
}