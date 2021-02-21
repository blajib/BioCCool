package jb.blaschka.bioCCool.repository;


import jb.blaschka.bioCCool.model.RoleUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository <RoleUser, Long> {
}
