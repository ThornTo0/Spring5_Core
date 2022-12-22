package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;
import org.jetbrains.annotations.NotNull;

public class RatediscountPolicy implements DiscountPolicy {

    private int discountPercent = 10;

    @Override
    public int discount(@NotNull Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return price * discountPercent / 100;
        } else {
            return 0;
        }
    }
}
