package io.seventytwo.tombola.entity;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PrizeRepository extends JpaRepository<Prize, Integer> {

    List<Prize> findAllByTombolaOrderByCreatedDateDesc(Tombola tombola);

    List<Prize> findAllByTombolaAndNumberOrderByCreatedDateDesc(Tombola tombola, Integer number);

    List<Prize> findAllByTombolaAndNameLikeIgnoreCaseOrderByCreatedDateDesc(Tombola tombola, String name);

    Optional<Prize> findByTombolaAndNumber(Tombola tombola, Integer number);

    long countByTombola(Tombola tombola);
}
