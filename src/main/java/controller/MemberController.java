package controller;

import controller.responseDTO.membersDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import service.MemberService;

@RestController
public class memberController {

    MemberService memberService;

    public memberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/members")
    public membersDTO getAllMembers() {
        return new membersDTO(memberService.getAllMembers());
    }
}
