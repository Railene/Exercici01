package uea.pagamentos_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import uea.pagamentos_api.models.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}