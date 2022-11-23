package com.delichi.delichibackend.repositories;

import com.delichi.delichibackend.entities.Ceo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ICeoRepository extends JpaRepository<Ceo, Long> {

    Optional<Ceo> findByEmailOrPhoneNumber(String email, Long phoneNumber);

    Optional<Ceo> findCeoByEmail(String email);

}
