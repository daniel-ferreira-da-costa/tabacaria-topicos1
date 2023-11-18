package unitins.service;

import unitins.dto.UsuarioResponseDTO;

public interface JwtService {

    public String generateJwt(UsuarioResponseDTO dto);
    
}