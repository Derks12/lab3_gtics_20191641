package Repository;



import Entity.Mascotas;
import Entity.Sedes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository


public interface SedeRepository extends JpaRepository<Sedes, Integer>{
}
