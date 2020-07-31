package org.atom.springboot.people.management.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "invoice_transactions")
public class InvoiceTransaction {

	@Id
	@Column(name = "invoice_id")
	private String invoice_id;
	private String primaryid;
	private String paynetz_txn_id;
	private String merchant_id;
	private String merch_code;
	private String loyaltyPts;
	private String 	invoice_status;
	private String invoice_gen_date;
	private String id;
	private String 	discriminator;
	private String customer_name;
	private String 	cust_mob_email;
	public String getPrimaryid() {
		return primaryid;
	}
	public String getPaynetz_txn_id() {
		return paynetz_txn_id;
	}
	public String getMerchant_id() {
		return merchant_id;
	}
	public String getMerch_code() {
		return merch_code;
	}
	public String getLoyaltyPts() {
		return loyaltyPts;
	}
	public String getInvoice_status() {
		return invoice_status;
	}
	public String getInvoice_id() {
		return invoice_id;
	}
	public String getInvoice_gen_date() {
		return invoice_gen_date;
	}
	public String getId() {
		return id;
	}
	public String getDiscriminator() {
		return discriminator;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public String getCust_mob_email() {
		return cust_mob_email;
	}
	public void setPrimaryid(String primaryid) {
		this.primaryid = primaryid;
	}
	public void setPaynetz_txn_id(String paynetz_txn_id) {
		this.paynetz_txn_id = paynetz_txn_id;
	}
	public void setMerchant_id(String merchant_id) {
		this.merchant_id = merchant_id;
	}
	public void setMerch_code(String merch_code) {
		this.merch_code = merch_code;
	}
	public void setLoyaltyPts(String loyaltyPts) {
		this.loyaltyPts = loyaltyPts;
	}
	public void setInvoice_status(String invoice_status) {
		this.invoice_status = invoice_status;
	}
	public void setInvoice_id(String invoice_id) {
		this.invoice_id = invoice_id;
	}
	public void setInvoice_gen_date(String invoice_gen_date) {
		this.invoice_gen_date = invoice_gen_date;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setDiscriminator(String discriminator) {
		this.discriminator = discriminator;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public void setCust_mob_email(String cust_mob_email) {
		this.cust_mob_email = cust_mob_email;
	}
	@Override
	public String toString() {
		return "InvoiceTransaction [primaryid=" + primaryid + ", paynetz_txn_id=" + paynetz_txn_id + ", merchant_id="
				+ merchant_id + ", merch_code=" + merch_code + ", loyaltyPts=" + loyaltyPts + ", invoice_status="
				+ invoice_status + ", invoice_id=" + invoice_id + ", invoice_gen_date=" + invoice_gen_date + ", id="
				+ id + ", discriminator=" + discriminator + ", customer_name=" + customer_name + ", cust_mob_email="
				+ cust_mob_email + "]";
	}
	
	
	
}
