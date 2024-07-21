package com.eazybytes.accounts.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class AccountsDto {

  @NotEmpty(message = "accountNumber should not be null or empty")
  @Pattern(regexp = "$|[0-9]{10}", message = "accountNumber must be 10 digits")
  private Long accountNumber;

  @NotEmpty(message = "accountType should not be null or empty")
  private String accountType;

  @NotEmpty(message = "branchAddreess should not be null or empty")
  private String branchAddress;

}
