package serviceTest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.mock.mockito.MockBean;
import service.MemberService;

public class MemberServiceTest {

    @MockBean
    MemberService memberService;

    @Test
    public void should_return_member_list() {

    }
}
