package org.atom.springboot.people.management.app.repository;

import org.atom.springboot.people.management.app.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface PeopleManagementRepository extends JpaRepository<Person, Integer>{

	@Modifying
	@Query(value = "update Person set email=:newEmail where id=:personId")
	void updateEmailById(@Param("personId") int id, @Param("newEmail") String newEmail);


}
