package CRUDImpl;

import org.springframework.data.jpa.repository.JpaRepository;

import DBT1.Account;

public interface Repositery extends JpaRepository<Account, Integer> {

}
