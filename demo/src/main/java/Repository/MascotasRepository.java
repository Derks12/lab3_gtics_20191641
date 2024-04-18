package Repository;

import Entity.Mascotas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository


public interface MascotasRepository extends JpaRepository<Mascotas,Integer>{
}
