package com.secretSauce.secretSauce.repos;


import com.secretSauce.secretSauce.models.SiteUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SiteUserRepository extends JpaRepository<SiteUser, Long> {
    public SiteUser getSiteUserByUserName(String userName);
}