package vn.hoidanit.laptopshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.hoidanit.laptopshop.service.UserService;

//biến cái này thành controller trong MVC
//truyền anotaion nó sẽ truyền cho 1 meta-data(sau này hẵng tìm hiểu)
//Khi code này cần có view
@Controller
public class UserController {
    private UserService userService;

    //đây là dependency injection => tiêm phụ thuộc bên ngoài service
    public UserController(UserService userService) {
        this.userService = userService;
    }

    //đặt là public string tại vì vậy nó
    //sẽ hiểu và nhận được các kiểu tên file khác nhau

    @RequestMapping("/")
    public String getHomePage() {
        String test = this.userService.handleHello();
        return "helloWorld.html";
    }
}

//rest controller khÔng phải mô hình mvc mà là api
//@RestController
//public class UserController {
//    private UserService userService;
//    //đây là dependency injection => tiêm phụ thuộc bên ngoài service
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }
//
//    @GetMapping("/")
//    public String getHomePage(){
//        return this.userService.handleHello();
//    }
//}
