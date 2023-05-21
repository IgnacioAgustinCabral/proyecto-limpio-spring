package ar.edu.unlam.tallerweb1.mappers;

import ar.edu.unlam.tallerweb1.delivery.DatosLibro;
import ar.edu.unlam.tallerweb1.domain.libros.Libro;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface LibroMapper {

    LibroMapper INSTANCE = Mappers.getMapper(LibroMapper.class);

    //    @Mapping(target = "id", ignore = true)
    Libro datosLibroToLibro(DatosLibro datosLibro);
}