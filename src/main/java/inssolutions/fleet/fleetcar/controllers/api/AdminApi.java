package inssolutions.fleet.fleetcar.controllers.api;

import inssolutions.fleet.fleetcar.entities.dtos.AdminDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("admin")
@CrossOrigin(origins = "*")
public interface AdminApi {
    @PostMapping()
    String save(@RequestBody AdminDto adminDto);
    @GetMapping("/{id}")
    AdminDto adminFindByid(@PathVariable int id);

    @Operation(summary = " this all Admins ")
    @ApiResponses(value={
            @ApiResponse(responseCode = "200",
            description = "fetched all admins from db",
                    content = {@Content(mediaType = "application/json")}
            ),
            @ApiResponse(responseCode = "404",
                    description = "Not Found",
                    content = {@Content}
            ),

    })
    @GetMapping()
    List<AdminDto> findAllList ();
    @PutMapping("/{id}")
    String updateAdmin(@PathVariable int id, @RequestBody AdminDto adminDto);
}
