package co.fullstacklabs.cuboid.challenge.service;

import co.fullstacklabs.cuboid.challenge.dto.CuboidDTO;
import org.springframework.http.ResponseEntity;

import java.util.List;

/**
 * @author FullStack Labs
 * @version 1.0
 * @since 2021-10-22
 */
public interface CuboidService {
    CuboidDTO create(CuboidDTO cuboid);

    List<CuboidDTO> getAll();

    ResponseEntity<CuboidDTO> update(CuboidDTO cuboid);

    ResponseEntity<String> delete(Long id);

}
