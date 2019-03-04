package DBT1;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="Accont Data")
public class Account {
@Id
@NotNull(message="you should add a nunber of id")
@Column(name="Id")
	private int id;
@NotNull(message="enter your name")
@Column(name="customername")
	private String customername;
@NotNull(message="Account Balance must not be null")
@Column(name="Account Balance")
	private long Balance;
@NotNull(message="account type must not be null")
@Column(name="Account Type")
	private String AccountType;
@NotNull(message="choose your date of birth")
@Column(name="Date of Birth")
	private Date dateofBirth;
@NotNull(message="enter a correct security code")
@Column(name="Security code")
	private String SecurityCode;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public long getBalance() {
		return Balance;
	}
	public void setBalance(long balance) {
		Balance = balance;
	}
	public String getAccountType() {
		return AccountType;
	}
	public void setAccountType(String accountType) {
		AccountType = accountType;
	}
	public Date getDateofBirth() {
		return dateofBirth;
	}
	public void setDateofBirth(Date dateofBirth) {
		this.dateofBirth = dateofBirth;
	}
	public String getSecurityCode() {
		return SecurityCode;
	}
	public void setSecurityCode(String securityCode) {
		SecurityCode = securityCode;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", customername=" + customername + ", Balance=" + Balance + ""
	+ ", AccountType="
	+ AccountType + ", dateofBirth=" + dateofBirth + ", SecurityCode=" + SecurityCode + "]";
	}
	
	
}
