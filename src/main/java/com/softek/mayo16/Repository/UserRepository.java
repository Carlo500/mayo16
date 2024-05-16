package com.softek.mayo16.Repository;

import com.softek.mayo16.Modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UserRepository extends JpaRepository<Usuario,Integer> {
    // Since email is unique, we'll find users by email
    Optional<Usuario> findByEmail(String email);
}