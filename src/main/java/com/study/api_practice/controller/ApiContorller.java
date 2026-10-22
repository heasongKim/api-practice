package com.study.api_practice.controller;

import com.study.api_practice.dto.UserRequest;
import com.study.api_practice.dto.UserResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApiContorller {

    //1. GET 요청(Query Parameter)
    // FastAPI: @app.get("/api/hello")
    @GetMapping("/hello")
    public String hello(@RequestParam(defaultValue = "Guest") String name){
        return "Hello, " + name + "!";
    }

    //2. POST 요청 (JSON Request Body -> Record DTO 매핑)
    //FastAPI: @app.poslt("/api/users") def create_user(body: UserRequest):
    @PostMapping("/users")
    public UserResponse createUser(@RequestBody UserRequest request){
        boolean isAdult = request.age() >= 20; // recoardsms getAge() 대신 age()로 꺼냄

        return new UserResponse(
                "성곡적으로 처리되었습니다.",
                request.name(),
                isAdult
        );

    }
}
