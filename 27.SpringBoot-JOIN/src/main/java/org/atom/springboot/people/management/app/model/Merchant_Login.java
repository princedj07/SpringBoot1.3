package org.atom.springboot.people.management.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mgalla_user_logins")
public class Merchant_Login {
	
	@Id
	@Column(name = "user_name")
	private String userName;
	private String merchantName;
	private String merchantId;
	private String mobileNo;
	private String accessToken;
	private String mpos;
	private String errorCode;
    private String status;
    private String message;
    private String merchantEmail;
    private String maxAmount;
    private String minAmount;
    private String podAmount;
    private String merch_code;
    private String userId;
    private String allowTxn;
	private String mposPassword;
    private String posId;
    private String podCheck;
    private String usertype;
    private String userstatus;
    private String longitude;
    private String latitude;
    private String bankFlag;
    private String transactionFlag;
    private String gifFlag;
    private String registrationType;
    private String bankAccountNo;
    private String bankIfsc;
    private String bankAccHolderName;
    
    
    
    
    
    
    
    
    
    
    
  
	public String getBankAccountNo() {
		return bankAccountNo;
	}
	public void setBankAccountNo(String bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}
	public String getBankIfsc() {
		return bankIfsc;
	}
	public void setBankIfsc(String bankIfsc) {
		this.bankIfsc = bankIfsc;
	}
	public String getBankAccHolderName() {
		return bankAccHolderName;
	}
	public void setBankAccHolderName(String bankAccHolderName) {
		this.bankAccHolderName = bankAccHolderName;
	}
	public String getRegistrationType() {
		return registrationType;
	}
	public void setRegistrationType(String registrationType) {
		this.registrationType = registrationType;
	}
	public String getGifFlag() {
		return gifFlag;
	}
	public void setGifFlag(String gifFlag) {
		this.gifFlag = gifFlag;
	}
	public String getBankFlag() {
		return bankFlag;
	}
	public void setBankFlag(String bankFlag) {
		this.bankFlag = bankFlag;
	}
	public String getTransactionFlag() {
		return transactionFlag;
	}
	public void setTransactionFlag(String transactionFlag) {
		this.transactionFlag = transactionFlag;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getAllowTxn() {
		return allowTxn;
	}
	public void setAllowTxn(String allowTxn) {
		this.allowTxn = allowTxn;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

  
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getMposPassword() {
		return mposPassword;
	}
	public void setMposPassword(String mposPassword) {
		this.mposPassword = mposPassword;
	}
	public String getPosId() {
		return posId;
	}
	public void setPosId(String posId) {
		this.posId = posId;
	}
	
    
   
	public String getPodCheck() {
		return podCheck;
	}
	public void setPodCheck(String podCheck) {
		this.podCheck = podCheck;
	}
	public String getPodAmount() {
		return podAmount;
	}
	public void setPodAmount(String podAmount) {
		this.podAmount = podAmount;
	}
	public String getMaxAmount() {
		return maxAmount;
	}
	public void setMaxAmount(String maxAmount) {
		this.maxAmount = maxAmount;
	}
	public String getMinAmount() {
		return minAmount;
	}
	public void setMinAmount(String minAmount) {
		this.minAmount = minAmount;
	}
	public String getMerchantEmail() {
		return merchantEmail;
	}
	public void setMerchantEmail(String merchantEmail) {
		this.merchantEmail = merchantEmail;
	}
	public String getMerchantName() {
		return merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	public String getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getAccessToken() {
		return accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public String getMpos() {
		return mpos;
	}
	public void setMpos(String mpos) {
		this.mpos = mpos;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getMerch_code() {
		return merch_code;
	}
	public void setMerch_code(String merch_code) {
		this.merch_code = merch_code;
	}

	public String getUserstatus() {
		return userstatus;
	}
	public void setUserstatus(String userstatus) {
		this.userstatus = userstatus;
	}
	

	public String getUsertype() {
		return usertype;
	}
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	@Override
	public String toString() {
		return "Merchant_Login [merchantName=" + merchantName + ", merchantId=" + merchantId + ", mobileNo=" + mobileNo
				+ ", accessToken=" + accessToken + ", mpos=" + mpos + ", errorCode=" + errorCode + ", status=" + status
				+ ", message=" + message + ", merchantEmail=" + merchantEmail + ", maxAmount=" + maxAmount
				+ ", minAmount=" + minAmount + ", podAmount=" + podAmount + ", merch_code=" + merch_code + ", userId="
				+ userId + ", allowTxn=" + allowTxn + ", mposPassword=" + mposPassword + ", posId=" + posId
				+ ", userName=" + userName + ", podCheck=" + podCheck + ", usertype=" + usertype + ", userstatus="
				+ userstatus + ", longitude=" + longitude + ", latitude=" + latitude + ", bankFlag=" + bankFlag
				+ ", transactionFlag=" + transactionFlag + ", gifFlag=" + gifFlag + ", registrationType="
				+ registrationType + ", bankAccountNo=" + bankAccountNo + ", bankIfsc=" + bankIfsc
				+ ", bankAccHolderName=" + bankAccHolderName + "]";
	}



}
