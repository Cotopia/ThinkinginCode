package com.hit.learn.spring.anointerface.biz;

import com.google.common.base.MoreObjects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Acceml on 2016/10/24.
 */
@Service
public class A {
    @Autowired
    private B b;

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("b", b)
                .toString();
    }
}
