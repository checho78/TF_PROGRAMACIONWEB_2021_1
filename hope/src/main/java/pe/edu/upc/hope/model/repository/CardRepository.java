package pe.edu.upc.hope.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.hope.model.entity.Card;

@Repository
public interface CardRepository extends JpaRepository<Card, Integer>{

}
