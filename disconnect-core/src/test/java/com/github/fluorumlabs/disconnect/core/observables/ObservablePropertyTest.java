package com.github.fluorumlabs.disconnect.core.observables;

import com.github.fluorumlabs.disconnect.core.toolchain.DisconnectTestRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.atomic.AtomicInteger;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.assertThat;

/**
 * Created by Artem Godin on 6/23/2020.
 */
@RunWith(DisconnectTestRunner.class)
public class ObservablePropertyTest {
    @Test
    void testPropertySetters() {
        AtomicInteger callCount = new AtomicInteger(0);

        ObservableProperty<InnerBean> bean = ObservableProperty.of(new InnerBean());
        bean.accept(callCount::incrementAndGet);

        assertThat("Observable bean was not created correctly", bean.get(), notNullValue());
        assertThat("Acceptor was not called once", callCount.get(), is(1));
        ObservableProperty<Integer> field = bean.getProperty("field");
        assertThat("Observable field was not retrieved correctly", field, notNullValue());

        field.set(4);
        assertThat("Bean setter was not called", bean.get().getField(), is(4));
        assertThat("Acceptor was not called two times", callCount.get(), is(2));

        InnerBean newBean = new InnerBean();
        newBean.setField(5);
        bean.set(newBean);

        assertThat("Bean changes were not propagated to field", field.get(), is(5));
        assertThat("Acceptor was not called three times", callCount.get(), is(3));
    }

    @Test
    void testBeanValidation() {
        InnerBean innerBean = new InnerBean();
        ObservableProperty<InnerBean> bean = ObservableProperty.of(innerBean);

        assertThat("Bean validation failed with wrong message", bean.validated().getValidationResult().first(), is("must be greater than 0"));
        assertThat("Bean validation failed", bean.validated().getValidationResult().isValid(), is(false));

        bean.get().setField(5);
        bean.refresh();

        assertThat("Bean validation failed with wrong message", bean.validated().getValidationResult().first(), is(""));
        assertThat("Bean validation failed", bean.validated().getValidationResult().isValid(), is(true));
    }

    @Test
    void testBeanFieldValidation() {
        InnerBean innerBean = new InnerBean();
        ObservableProperty<InnerBean> bean = ObservableProperty.of(innerBean);
        ObservableProperty<Integer> field = bean.getProperty("field");

        assertThat("Bean validation failed with wrong message", field.validated().getValidationResult().first(), is("must be greater than 0"));
        assertThat("Bean validation failed", field.validated().getValidationResult().isValid(), is(false));

        bean.get().setField(5);
        bean.refresh();

        assertThat("Bean validation failed with wrong message", field.validated().getValidationResult().first(), is(""));
        assertThat("Bean validation failed", field.validated().getValidationResult().isValid(), is(true));
    }

    @Test
    void testNestedBeanValidation() {
        OuterBean outerBean = new OuterBean();

        ObservableProperty<OuterBean> bean = ObservableProperty.of(outerBean);

        assertThat("Bean validation failed with wrong message", bean.validated().getValidationResult().first(), is("must not be null"));
        assertThat("Bean validation failed", bean.validated().getValidationResult().isValid(), is(false));

        InnerBean innerBean = new InnerBean();
        outerBean.setSubBean(new InnerBean());
        bean.refresh();

        assertThat("Bean validation failed with wrong message", bean.validated().getValidationResult().first(), is("must be greater than 0"));
        assertThat("Bean validation failed", bean.validated().getValidationResult().isValid(), is(false));

        innerBean.setField(5);
        bean.refresh();

        assertThat("Bean validation failed with wrong message", bean.validated().getValidationResult().first(), is("must be greater than 0"));
        assertThat("Bean validation failed", bean.validated().getValidationResult().isValid(), is(false));
    }

    @Test
    void testNestedNullableBeanValidation() {
        OuterBean outerBean = new OuterBean();
        InnerBean validInnerBean = new InnerBean();
        validInnerBean.setField(5);
        outerBean.setSubBean(validInnerBean);

        ObservableProperty<OuterBean> bean = ObservableProperty.of(outerBean);

        assertThat("Bean validation failed with wrong message", bean.validated().getValidationResult().first(), is(""));
        assertThat("Bean validation failed", bean.validated().getValidationResult().isValid(), is(true));

        InnerBean innerBean = new InnerBean();
        outerBean.setOptionalSubBean(innerBean);
        bean.refresh();

        assertThat("Bean validation failed with wrong message", bean.validated().getValidationResult().first(), is("must be greater than 0"));
        assertThat("Bean validation failed", bean.validated().getValidationResult().isValid(), is(false));

        innerBean.setField(5);
        bean.refresh();

        assertThat("Bean validation failed with wrong message", bean.validated().getValidationResult().first(), is(""));
        assertThat("Bean validation failed", bean.validated().getValidationResult().isValid(), is(true));
    }
}