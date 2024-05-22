package mpww.helper.controller;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import mpww.helper.domain.gym.model.dto.GymDto;
import mpww.helper.domain.gym.model.service.GymService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Tag(name = "헬스장API", description = "헬스장 정보를 불러오는 API입니다")
@CrossOrigin("*")
@AllArgsConstructor
@RequestMapping("/gymapi")
@RestController
public class GymController {

    private final GymService gymService;

    @GetMapping("/allgyms")
    @Operation(summary = "전체 헬스장 불러오기",description = "등록된 전체 헬스장을 불러옵니다")
    public ResponseEntity<?> selectAll(){
        List<GymDto> gyms = gymService.getAllgyms();

        if(gyms.isEmpty()) return ResponseEntity.badRequest().build();

        return ResponseEntity.ok(gyms);
    }

    @GetMapping("/helper/{name}")
    @Operation(summary = "헬스장 선택하기", description = "선택한 헬스장 커뮤니티로 이동합니다")
    public ResponseEntity<?> selectGym(@PathVariable String name){
       GymDto gym = gymService.selectOneGym(name);

        if(gym == null) return ResponseEntity.badRequest().build();

        return ResponseEntity.ok(gym);
    }



}
