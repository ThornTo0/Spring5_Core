package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;


class RatediscountPolicyTest {
    RatediscountPolicy ratediscountPolicy = new RatediscountPolicy();

    @Test
    @DisplayName("VIP는 10% 할인이 적용되어야 한다.")

    void vip_o(){
        //given
        Member member = new Member(1L, "memberVIP", Grade.VIP);

        //when
        int discount = ratediscountPolicy.discount(member, 10000);

        //then
        Assertions.assertThat(discount).isEqualTo(1000);
    }

}