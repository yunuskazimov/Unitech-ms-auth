package az.unibank.unitechmsauth.dao.repo;

import az.unibank.unitechmsauth.dao.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findByCustomerPin(String customerPin);
}
