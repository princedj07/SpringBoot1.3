package org.atom.springboot.people.management.app.repository;

import java.util.List;

import org.atom.springboot.people.management.app.model.Merchant_Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface Merchant_LoginRepository extends JpaRepository<Merchant_Login, Integer>{

	//@Query(value = "SELECT imei, device_id, appCode, merchant_AccStatus FROM mgalla_user_logins where user_name=?1 ", nativeQuery = true)
	//@Query(value = "SELECT m.imei, m.device_id, m.appCode, m.merchant_AccStatus, it.invoice_id, it.Amount, it.bill_for FROM mgalla_user_logins as m, invoice_transactions as it where user_name=?1", nativeQuery = true)
	@Query(value = "SELECT m.emailid, d.city FROM mgalla_user_logins as m join mgalla_merchant_details as d on m.user_name = d.user_name where m.user_name =?1 ", nativeQuery = true)
	List<Object[]> getInfoByJoin(String string);

}



