package com.ll.exam;



import com.ll.exam.article.controller.ArticleController;
import org.junit.jupiter.api.Test;
import org.reflections.Reflections;

import javax.swing.text.html.parser.Entity;
import java.util.List;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest {
    @Test
    public void junit_assertThat() {
        int rs = 10 + 20;

        assertThat(rs).isEqualTo(30);
    }

    @Test
    public void ioc__articleController() {
        ArticleController articleController = Container.getArticleController();

        assertThat(articleController).isNotNull();
    }

    @Test
    public void ioc__articleController__Singleton() {
        ArticleController articleController1 = Container.getArticleController();
        ArticleController articleController2 = Container.getArticleController();

        assertThat(articleController2).isEqualTo(articleController1);
    }
    @Test
    public void ioc__dd() {
        List<String> controllerNames = Container.getAllControllerNames();

        controllerNames.contains("home");
        controllerNames.contains("article");
    }
}
