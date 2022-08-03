package com.ssafy.api.controller;

import com.ssafy.api.response.RoomInfoRes;
import com.ssafy.api.service.WaitingRoomService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
=======
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
>>>>>>> e5228bd103f10269127ccce8c22752c0934079eb

import java.util.List;

@Api(value = "대기방 API", tags = {"WaitingRooms"})
@RestController
@RequestMapping("api/v1/waitingRooms")
@CrossOrigin("*")
public class WaitingRoomController {
    // 대기방 컨트롤러
    private final WaitingRoomService waitingRoomService;

    @Autowired
    public WaitingRoomController(WaitingRoomService waitingRoomService) {
        this.waitingRoomService = waitingRoomService;
    }
<<<<<<< HEAD
    @GetMapping
    public void test(){
        System.out.println("test");
        waitingRoomService.getAvailableRoomList(1);
=======

    @GetMapping("/{page}")
    @ApiOperation(value = "대기방 목록", notes = "<strong>대기방 화면에서</strong>대기방 리스트를 가져온다.")
    @ApiResponses({
            @ApiResponse(code = 200, message = "성공"),
            @ApiResponse(code = 401, message = "인증 실패"),
            @ApiResponse(code = 500, message = "서버 오류")
    })
    public ResponseEntity<List<RoomInfoRes>> getAvailableRoomList(@PathVariable @ApiParam(value = "현재 방페이지", required = true) int page){
        System.out.println("controller on");
        return ResponseEntity.ok(waitingRoomService.getAvailableRoomList(page));
>>>>>>> e5228bd103f10269127ccce8c22752c0934079eb
    }

//    @GetMapping("/my")
//    public ResponseEntity<Object> getMyRecord()
}
