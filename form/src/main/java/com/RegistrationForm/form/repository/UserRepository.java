package com.RegistrationForm.form.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.RegistrationForm.form.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}

