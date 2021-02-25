package com.task.ratemanagementsystem.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "rate")
public class RateEntity {

	@Id
	@Column(name = "rateid")
	@JsonProperty("rateId")
	private long rateId;

	@Column(name = "rate_desc")
	@JsonProperty("description")
	private String description;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@Column(name = "rate_effective_date", nullable = false)
	private LocalDateTime effectiveDate;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@Column(name = "rate_expiration_date", nullable = false)
	private LocalDateTime expirationDate;

	@Column(name = "amount", nullable = false)
	@JsonProperty("amount")
	private int amount;

	public long getRateId() {
		return rateId;
	}

	public void setRateId(long rateId) {
		this.rateId = rateId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDateTime getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(LocalDateTime effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public LocalDateTime getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(LocalDateTime expirationDate) {
		this.expirationDate = expirationDate;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

}
