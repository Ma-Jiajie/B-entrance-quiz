package controller;
//TODO GTB: controller包应放置在entrancequiz下面

import controller.responseDTO.membersDTO;
import model.Member;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import service.MemberService;

import java.util.Collections;
import java.util.List;

@RestController
//TODO GTB: 类名首字母应使用大写
public class memberController {

    //TODO GTB: 建议使用private限制对字段的访问
    MemberService memberService;

    public memberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/members")
    public membersDTO getAllMembers() {
        List<Member> members = memberService.getAllMembers();
        //TODO GTB: 需求要求学员列表按照id升序排列
        Collections.shuffle(members);
        return new membersDTO(members);
    }

    @GetMapping("/add")
    //TODO GTB: 应在path中定义path variable, 然后在方法参数中引用
    public void addOneMember(@PathVariable String name) {
        memberService.add(name);
    }
}
