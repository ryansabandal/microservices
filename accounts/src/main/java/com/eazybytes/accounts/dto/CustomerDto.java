package com.eazybytes.accounts.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CustomerDto {

  @NotEmpty(message = "name cannot be null or empty")
  @Size(min=5, max=30, message = "Invalid name length (5-30)")
  private String name;

  @NotEmpty(message = "email cannot be null or empty")
  @Email(message = "Invalid email format")
  private String email;

  @Pattern(regexp = "$|[0-9]{10}", message = "mobileNumber must be 10 digits")
  private String mobileNumber;

  private AccountsDto accountsDto;
}
