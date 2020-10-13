package service;

import dataProvider.MemberListProvider;
import model.Member;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MemberService {
    public List<Member> getAllMembers() {
        return MemberListProvider.provideMembers();
    }
}
