package com.aluracursos.screenmatch.repository;

import com.aluracursos.screenmatch.model.Categria;
import com.aluracursos.screenmatch.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface SerieRepository extends JpaRepository<Serie, Long> {
    Optional findByTituloContainsIgnoreCase(String nombreSerie); // Método para buscar series por título, ignorando mayúsculas y minúsculas

    // traer el top 5 mejores series
    List<Serie> findTop5ByOrderByEvaluacionDesc(); // Método para obtener las 5 mejores series ordenadas por evaluación de forma descendente

    //Buscar series por categoría
    List<Serie> findByGenero(Categria categoria); // Método para buscar series por género

}
