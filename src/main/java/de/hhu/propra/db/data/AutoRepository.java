package de.hhu.propra.db.data;

import de.hhu.propra.db.entities.Auto;
import org.springframework.data.repository.CrudRepository;

public interface AutoRepository extends CrudRepository<Auto, Long> {
}
