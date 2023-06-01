package ar.edu.unlam.tallerweb1.mappers;

import ar.edu.unlam.tallerweb1.delivery.DatosRegistracion;
import ar.edu.unlam.tallerweb1.domain.usuarios.Usuario;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UsuarioMapper {
    UsuarioMapper INSTANCE = Mappers.getMapper(UsuarioMapper.class);

    Usuario datosRegistracionToUsuario(DatosRegistracion datosRegistracion);
}
