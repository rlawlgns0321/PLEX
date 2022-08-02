package com.ssafy.api.service;

import com.ssafy.api.request.RoomCreatePostReq;
import com.ssafy.db.entity.Room;
import com.ssafy.db.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("roomService")
public class RoomServiceImpl implements RoomService{

    @Autowired
    RoomRepository roomRepository;

    @Override
    @Transactional
    public Room createRoom(RoomCreatePostReq roomInfo, String code) throws NullPointerException {
        Room room = Room.createRoom(roomInfo.getName(), code, roomInfo.getHost(), roomInfo.getRoomSize(), roomInfo.getGameNo(), roomInfo.getIsPrivate());
        System.out.println("service");
        roomRepository.save(room);
        return room;
    }

    @Override
    public Room getRoomByCode(String code){
        // 디비에서 방 정보를 방코드를 이용하여 조회
        return roomRepository.findByCode(code);// 없다면 null이 들어감
    }
}
