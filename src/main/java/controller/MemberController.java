package controller;

import controller.responseDTO.membersDTO;
import model.Member;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import service.MemberService;

import java.util.Collections;
import java.util.List;

@RestController
public class memberController {

    MemberService memberService;

    public memberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/members")
    public membersDTO getAllMembers() {
        List<Member> members = memberService.getAllMembers();
        Collections.shuffle(members);
        return new membersDTO(members);
    }
}
