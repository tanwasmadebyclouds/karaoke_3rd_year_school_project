package com.example.roomservice.controller.event;

import lombok.Data;


@Data
public class UpdateRoomEvent {
    private String _id;
    private String name;
    private String accessory;
    private int price;
    private String detail;
    private String img;
}
